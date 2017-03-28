package cn.com.enersun.data_center.bigdata_service.serviceImp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;

import cn.com.enersun.data_center.bigdata_service.MicroService;
import cn.com.enersun.data_center.bigdata_service.common.util.StringUtils;
import cn.com.enersun.data_center.bigdata_service.common.util.excelUtil.ExcelException;
import cn.com.enersun.data_center.bigdata_service.common.util.excelUtil.ExcelJXLUitl;
import cn.com.enersun.data_center.bigdata_service.common.util.jsonUtils.JSONTransKeyTools;
import cn.com.enersun.data_center.bigdata_service.common.util.xmlUtils.XMLTransTools;
import cn.com.enersun.data_center.bigdata_service.constant.FieldConstant;
import cn.com.enersun.data_center.bigdata_service.dao.BasicServiceDao;
import cn.com.enersun.data_center.bigdata_service.dao.MicroServiceOrderDao;
import cn.com.enersun.data_center.bigdata_service.entity.DefectEntity;
import cn.com.enersun.data_center.bigdata_service.entity.DmDeviceEntity;
import cn.com.enersun.data_center.bigdata_service.entity.DmPartEntity;
import cn.com.enersun.data_center.bigdata_service.entity.Dm_BreakerEntity;
import cn.com.enersun.data_center.bigdata_service.entity.Dm_Current_TransformerEntity;
import cn.com.enersun.data_center.bigdata_service.entity.Dm_FuseEntity;
import cn.com.enersun.data_center.bigdata_service.entity.Dm_Isolator_SwitchEntity;
import cn.com.enersun.data_center.bigdata_service.entity.Dm_Poten_TransformerEntity;
import cn.com.enersun.data_center.bigdata_service.entity.Dm_TransformerEntity;
import cn.com.enersun.data_center.bigdata_service.entity.LineEntity;
import cn.com.enersun.data_center.bigdata_service.entity.OrganizationEntity;
import cn.com.enersun.data_center.bigdata_service.entity.ServiceParameterEntity;
import cn.com.enersun.data_center.bigdata_service.entity.SubstationEntity;
import cn.com.enersun.data_center.bigdata_service.entity.TowerEntity;


/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: MicroServiceImp.java 
* @Package com.enersun.data_center.bigdata_service.serviceImp 
* @Description: TODO(用一句话描述该文件做什么) 
* @author enersun_lhb   
* @date 2016年6月13日 下午4:32:50 
* @version V1.0   
*/
@Service
public class MicroServiceImp implements MicroService {	

    private static final Logger LOG =LoggerFactory.getLogger(MicroServiceImp.class);

//	@Resource(name="microServiceOrderDao")
    @Autowired
	private  MicroServiceOrderDao microServiceOrderDao;
	
	@Autowired
	private  BasicServiceDao basicServiceDao;
	
    @Value("${versionMicroService}")
	private String versionMicroService;
	 
//    @Autowired  
//    private  HttpServletRequest request;     
	 /**
	  * 
	  * @Description : 服务版本号
	  * @return
	  */
	 public String version() {
		 return versionMicroService;
	}
	 
	 
	/**
	 * @Description：获取微服务台账清单
	 * @param 
	 * @return json格式
	 */
	public String devServiceOrder() {
		List<String> empty=new ArrayList<String>();
		empty.add("0");
//		LOG.info("microServiceOrderDao.queryServiceOrder start!");
		List<ServiceParameterEntity> result = microServiceOrderDao.queryServiceOrder();
//		LOG.info("microServiceOrderDao.queryServiceOrder end!");
	    if(result.isEmpty()){
	    	return JSON.toJSONString(empty);
	    }
	    return JSON.toJSONString(result);
	
	}


	
	/**
	 * @Description 服务授权-传入服务编号获取授权码
	 * @param serviceId  服务编号
	 * @return keyCode 授权码
	 */
	public String serviceAuthority(String serviceId) {
		if(serviceId != null &&  !"".equals(serviceId)){
	        return  microServiceOrderDao.queryServiceAuthorityById(serviceId);
	       }
		return JSON.toJSONString(0);
	}

	/**
	 * 
	  * @Description 传入微服务编号和相应的授权码值 ，获取相应的格式的数据(XML/JSON/Excel(返回文件地址))
	  * @param serviceId  服务编号
	  * @param keyCode    授权码
	  * @return 返回不同格式的数据(XML/JSON)、excel文件返回下载地址
	 */
	public String detailServiceStr(String serviceId, String keyCode) {
		String result = "0";
		if(serviceId != null &&  !"".equals(serviceId) &&  !"".equals(keyCode) && keyCode != null){
			ServiceParameterEntity serviceParameter = microServiceOrderDao.queryDetailServiceStr(serviceId,keyCode);
			int OutType = serviceParameter.getOutType();
			String sql  = serviceParameter.getSqlStatement();
			if(sql.isEmpty()) return JSON.toJSONString("0");
			if ("1002".equals(serviceId)){
				List<DefectEntity> list = basicServiceDao.queryDefectsInfo(sql);
				result = transObjectByOutType(list, OutType,FieldConstant.DEFECT_ATTR);
			}else if ("1003".equals(serviceId)){
				List<OrganizationEntity> list = basicServiceDao.queryOrganizationInfo(sql);
				result = transObjectByOutType(list, OutType,FieldConstant.ORGNIZATION_ATTR);
			}else if ("1006".equals(serviceId)){
				List<SubstationEntity> list = basicServiceDao.querySubstationInfoByOrg(sql);
				result = transObjectByOutType(list, OutType,FieldConstant.SUBSTATION_ATTR);
			}else if ("1007".equals(serviceId)){
				List<DmDeviceEntity> list = basicServiceDao.queryAssetInfoBySql(sql);
				result = transObjectByOutType(list, OutType,FieldConstant.DM_DEVICE_ATTR);
			}else if ("1008".equals(serviceId)){
				List<DmPartEntity> list = basicServiceDao.queryPartsInfoBySql(sql);
				result = transObjectByOutType(list, OutType,FieldConstant.DM_PARTS_ATTR);
			}else{
				List<Map<String,String>> maplist = basicServiceDao.queryInfoBySql(sql);
				result = JSON.toJSONString(maplist).toString();
			}
	        return result;
	       }
		result = JSON.toJSONString("参数不能为空！请重新输入");
		return result;
	}
	
	/**
	 * 
	  * @Description 传入微服务编号、相应的授权码值和参数值 ，获取相应的格式的数据(XML/JSON/Excel(返回文件地址))
	  * @param (serviceId  服务编号,keyCode    授权码。。。。。)按照顺序记录
	  * @param JSON 参数条件  如：{"0":"05012222","1":"大理局","2":"4",...} 冒号前面是参数序号 冒号后为参数值
	  * @return 返回不同格式的数据(XML/JSON)、excel文件返回下载地址
	 */
	public String detailServiceByParams(String serviceId, String keyCode,String jsonParams) {
		String result = "0";
		if(serviceId != null &&  !"".equals(serviceId) &&  !"".equals(keyCode) && keyCode != null
				&&  !"".equals(jsonParams) && jsonParams != null){
			// json转换map 
			Map<String, String> params = JSONTransKeyTools.JsonParse(jsonParams); 
			ServiceParameterEntity serviceParameter = microServiceOrderDao.queryDetailServiceStr(serviceId,keyCode);
			int OutType = serviceParameter.getOutType();
			String sql  = serviceParameter.getSqlStatement();
			if(sql.isEmpty()) return JSON.toJSONString("0");
			if ("1004".equals(serviceId)){
				List<DmDeviceEntity> list = basicServiceDao.queryMainAssetInfoByOrgAndSite(sql,params);
				// JSON转换  
				result = transObjectByOutType(list, OutType,FieldConstant.DM_DEVICE_ATTR);
				
			}else if ("1005".equals(serviceId)){
				List<DmPartEntity> list = basicServiceDao.queryPartsInfoByOrgAndSite(sql ,params);
				result = transObjectByOutType(list, OutType,FieldConstant.DM_PARTS_ATTR);
			}else if ("1009".equals(serviceId)){
				List<DmDeviceEntity> list = basicServiceDao.queryMainAssetInfoByAssetId(sql,params);
				result = transObjectByOutType(list, OutType,FieldConstant.DM_DEVICE_ATTR);
			}else if ("1010".equals(serviceId)){
				List<DmPartEntity> list = basicServiceDao.queryPartsInfoByPartId(sql,params);
				result = transObjectByOutType(list, OutType,FieldConstant.DM_PARTS_ATTR);
			}else if ("1011".equals(serviceId)){
				List<DmDeviceEntity> list = basicServiceDao.queryMainAssetInfoByClassfiyId(sql,params);
				result = transObjectByOutType(list, OutType,FieldConstant.DM_DEVICE_ATTR);
			}else if ("1012".equals(serviceId)){
				List<LineEntity> list = basicServiceDao.queryLineInfoByOrgcode(sql, params);
				result = transObjectByOutType(list, OutType,FieldConstant.DM_LINES_ATTR);
			}else if ("1013".equals(serviceId)){
				List<TowerEntity> list = basicServiceDao.queryTowerInfoByOrgcode(sql, params);
				result = transObjectByOutType(list, OutType,FieldConstant.DM_TOWER_ATTR);
			}else if ("1014".equals(serviceId)){
				List<Dm_TransformerEntity> list = basicServiceDao.queryTransformerInfoByParameters(sql, params);
				result = transObjectByOutType(list, OutType,FieldConstant.DM_TRANSFORMER_ATTR);
			}else if ("1015".equals(serviceId)){
				List<Dm_Current_TransformerEntity> list = basicServiceDao.queryCurrentTransformerByParameters(sql, params);
				result = transObjectByOutType(list, OutType,FieldConstant.DM_CURRENT_TRANSFORMER_ATTR);
			}else if ("1016".equals(serviceId)){
				List<Dm_Poten_TransformerEntity> list = basicServiceDao.queryPotenTransformerByParameters(sql, params);
				result = transObjectByOutType(list, OutType,FieldConstant.DM_POTEN_TRANSFORMER_ATTR);
			}else if ("1017".equals(serviceId)){
				List<Dm_BreakerEntity> list = basicServiceDao.queryBreakerByParameters(sql, params);
				result = transObjectByOutType(list, OutType,FieldConstant.DM_ISOLATOR_SWITCH_ATTR);
			}else if ("1018".equals(serviceId)){
				List<Dm_Isolator_SwitchEntity> list = basicServiceDao.queryIsolatorSwitchByParameters(sql, params);
				result = transObjectByOutType(list, OutType,FieldConstant.DM_BREAKER_ATTR);
			}else if ("1019".equals(serviceId)){
				List<Dm_FuseEntity> list = basicServiceDao.queryFuseByParameters(sql, params);
				result = transObjectByOutType(list, OutType,FieldConstant.DM_FUSE_ATTR);
			
			}else{
				List<Map<String,String>> maplist = basicServiceDao.queryInfoBySql(sql);
				result = JSON.toJSONString(maplist).toString();
			}
	        return result;
	       }
		result = JSON.toJSONString("参数不能为空！请重新输入");
		return result;
	}
	
	private String transObjectByOutType(List<?> list ,int OutType, Map<String ,String> ObjectAtrrMap){
		String result = "0";
		String listResult;
		JSONArray jsonArray;
		
		switch(OutType)
		{
		case 1:
			 List<Map<String,String>> ObjectList =new ArrayList<Map<String,String>>(); 
			 listResult = JSON.toJSONString(list).toString();
			 // String转换  JSONArray   
			 jsonArray  = new JSONArray(listResult);
			 int n  = jsonArray.length();
			 for(int i=0 ;i<n;i++){
				 JSONObject jsonObj= (JSONObject) jsonArray.get(i);
				 @SuppressWarnings("unchecked")
				Iterator<String> nameItr = jsonObj.keys();
				 String name;
				 Map<String, String> outMap = new HashMap<String, String>();
				 while (nameItr.hasNext()) {
					 name = nameItr.next();
					 outMap.put(name, jsonObj.getString(name));
				 }
				 ObjectList.add(outMap);
			 }
			 result =XMLTransTools.objectToxml(ObjectList);
			 break;
		case 2:
			listResult = JSON.toJSONString(list).toString();
			// String转换  JSONArray
			jsonArray  = new JSONArray(listResult);
			JSONArray jsonresult = JSONTransKeyTools.transArray(jsonArray, ObjectAtrrMap);
			result = jsonresult.toString();
			 break;
		case 3:
			String projectName ="bigdata-service";
		    // System.out.println("Excel Not building finished !");
			String rootPath = System.getProperty("user.dir").replace("bin", "webapps");
			System.out.println(rootPath+File.separator+"excelOut.xls");
			rootPath+=File.separator+projectName; 
			File file2 = new File(rootPath+File.separator+"excelOut.xls"); 
			System.out.println(rootPath+File.separator+"excelOut.xls");
			OutputStream out;
			try {
				out = new FileOutputStream(file2);
				LinkedHashMap<String,String> lmap = new LinkedHashMap<String,String>(ObjectAtrrMap);
				ExcelJXLUitl.listToExcel(list, lmap, "sheet", 65535, out);
				out.flush(); 
				//关闭输出流对象 
				out.close(); 
				result = rootPath+File.separator+"excelOut.xls";
			} catch (FileNotFoundException e) {
				result=JSON.toJSONString("0");
				String msg = StringUtils.getExceptionMsg(e);
			    LOG.error(msg, e);
			} catch (ExcelException e) {
				result=JSON.toJSONString("0");
				String msg = StringUtils.getExceptionMsg(e);
			    LOG.error(msg, e);
			} catch (IOException e) {
				result=JSON.toJSONString("0");
				String msg = StringUtils.getExceptionMsg(e);
			    LOG.error(msg, e);
			}
			 break;
		}
		
		return result;
		
	}


}
