package cn.com.enersun.data_center.bigdata_service.serviceImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.alibaba.fastjson.JSON;

import cn.com.enersun.data_center.bigdata_service.MicroService;
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
public class MicroServiceImp implements MicroService {	

    private static final Logger LOG =LoggerFactory.getLogger(MicroServiceImp.class);

	@Resource(name="microServiceOrderDao")
	private  MicroServiceOrderDao microServiceOrderDao;
	
	@Resource(name="basicServiceDao")
	private  BasicServiceDao basicServiceDao;
	
    @Value("${versionMicroService}")
	private String versionMicroService;
	 
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
		LOG.info("microServiceOrderDao.queryServiceOrder start!");
		List<ServiceParameterEntity> result = microServiceOrderDao.queryServiceOrder();
		LOG.info("microServiceOrderDao.queryServiceOrder end!");
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
		String result = "";
		if(serviceId != null &&  !"".equals(serviceId) &&  !"".equals(keyCode) && keyCode != null){
			ServiceParameterEntity serviceParameter = microServiceOrderDao.queryDetailServiceStr(serviceId,keyCode);
			int OutType = serviceParameter.getOutType();
			String sql  = serviceParameter.getSqlStatement();
		
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
				result = JSON.toJSONString("0");
			}
	        return result;
	       }
		result = JSON.toJSONString("0");
		return result;
	}
	
	/**
	 * 
	  * @Description 传入微服务编号、相应的授权码值和参数值 ，获取相应的格式的数据(XML/JSON/Excel(返回文件地址))
	  * @param obj   条件参数HashMap(serviceId  服务编号,keyCode    授权码。。。。。)按照顺序记录
	  * @return 返回不同格式的数据(XML/JSON)、excel文件返回下载地址
	 */
	public String detailServiceByParams(String serviceId, String keyCode,Object... obj) {
		String result = "";
		Map<String, Object> params = new  HashMap<String, Object>();  
		if (obj != null) {  
             for (int i = 0; i < obj.length; i++) {  
            	 params.put(String.valueOf(i + 1), obj[i]);  
             }  
         }  
		if(serviceId != null &&  !"".equals(serviceId) &&  !"".equals(keyCode) && keyCode != null){
			ServiceParameterEntity serviceParameter = microServiceOrderDao.queryDetailServiceStr(serviceId,keyCode);
			int OutType = serviceParameter.getOutType();
			String sql  = serviceParameter.getSqlStatement();
			if ("1004".equals(serviceId)){
				List<DmDeviceEntity> list = basicServiceDao.queryMainAssetInfoByOrgAndSite(sql,params);
				result = transObjectByOutType(list, OutType,FieldConstant.DM_DEVICE_ATTR);
				// JSON转换  
				
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
				result = JSON.toJSONString("0");
			}
	        return result;
	       }
		result = JSON.toJSONString("0");
		return result;
	}
	
	private String transObjectByOutType(List<?> list ,int OutType, Map<String ,String> ObjectAtrrMap){
		String result = "";
		switch(OutType)
		{
		case 1:
			result = XMLTransTools.objectToxml(list);
			 break;
		case 2:
			String listresult = JSON.toJSONString(list).toString();
			// String转换  JSONArray
			JSONArray jsonArray  = new JSONArray(listresult);
			JSONArray jsonresult = JSONTransKeyTools.transArray(jsonArray, ObjectAtrrMap);
			result = jsonresult.toString();
			 break;
		case 3:
			System.out.println("Excel Not building finished !");
			 break;
		}
		
		return result;
		
	}


}
