package cn.com.enersun.data_center.bigdata_service.serviceImp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.map.CaseInsensitiveMap;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;

import com.alibaba.fastjson.JSON;

import cn.com.enersun.data_center.bigdata_service.MicroParameterService;
import cn.com.enersun.data_center.bigdata_service.common.util.jsonUtils.JSONTransKeyTools;
import cn.com.enersun.data_center.bigdata_service.constant.BaseParamFieldConstant;
import cn.com.enersun.data_center.bigdata_service.dao.BasicServiceDao;
import cn.com.enersun.data_center.bigdata_service.dao.MicroParameterServiceDao;
import cn.com.enersun.data_center.bigdata_service.dao.MicroServiceOrderDao;
import cn.com.enersun.data_center.bigdata_service.entity.*;




/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: MicroParameterServiceImp.java 
* @Package cn.com.enersun.data_center.bigdata_service 
* @Description: TODO(数据中心微台账服务总线实现) 
* @author enersun_lhb   
* @date 2017年3月17日 下午13:26:06 
* @version V1.0   
*/

public class MicroParameterServiceImp implements MicroParameterService {
  
	
	@Value("${versionMicroParameterService}")
	private String versionMicroParameterService;	
	
	@Resource(name="microServiceOrderDao")
	private  MicroServiceOrderDao microServiceOrderDao;
	
	@Resource(name="basicServiceDao")
	private  BasicServiceDao basicServiceDao;
	
	@Resource(name="microParameterServiceDao")
	private  MicroParameterServiceDao microParameterServiceDao;
	
	/**
	 * 
	 * @Description : 服务版本号
	 * @return
	 */
	public String version() {
		return versionMicroParameterService;
	}
	
	/**
	 * 
	  * @Description 传入微服务编号和相应的授权码值 ，获取相应的格式的数据(JSON)
	  * @param serviceId  服务编号
	  * @param keyCode    授权码
	  * @return 返回不同格式的数据(JSON)
	 */
	public String detailServiceStr(String serviceId,String keyCode) {
		String result = "0";
		if(serviceId != null &&  !"".equals(serviceId) &&  !"".equals(keyCode) && keyCode != null){
			ServiceParameterEntity serviceParameter = microServiceOrderDao.queryDetailServiceStr(serviceId,keyCode);
			String sql  = serviceParameter.getSqlStatement();
			if(sql.isEmpty()) return JSON.toJSONString("0");
			if ("1022".equals(serviceId)){
				List<IceRealtimeEntity> list = microParameterServiceDao.queryIceRealtimeInfo(sql);
				result = transObjectByOutType(list,BaseParamFieldConstant.ICE_REALTIME_ATTR);
				// JSON转换  
			}else if ("1023".equals(serviceId)){
				List<Map<String,String>> maplist = microParameterServiceDao.queryWildFileRemoteInfoByYear(sql);
				result = transObjectByListmap(maplist,BaseParamFieldConstant.WILDFIRE_REMOTE_ATTR);
				// JSON转换  
			}else{
				List<Map<String,String>> maplist = microParameterServiceDao.queryInfoBySql(sql);
				result = transToJson(maplist);
			}
	        return result;
	       }
		result = JSON.toJSONString("参数不能为空！请重新输入");
		return result;
	}
	
	
	/**
	 * 
	  * @Description 传入微服务编号、相应的授权码值和参数值 ，获取相应的格式的数据(JSON)
	  * @param serviceId  服务编号
	  * @param keyCode    授权码
	  * @param String 传入参数 用json格式传入多个参数
	  * @return 返回不同格式的数据(JSON)
	 */
	
	public String detailServiceByParam(String serviceId, String keyCode,String jsonParams) {
		String result = "0";
		if(serviceId != null &&  !"".equals(serviceId) &&  !"".equals(keyCode) && keyCode != null
				&&  !"".equals(jsonParams) && jsonParams != null){
			ServiceParameterEntity serviceParameter = microServiceOrderDao.queryDetailServiceStr(serviceId,keyCode);
			String sql  = serviceParameter.getSqlStatement();
			if (sql.isEmpty())
				return JSON.toJSONString("0");
			// String转换 JSONObject
			Map<String, String> map = JsonParse(jsonParams);
			for (int i = 0; i < map.size(); i++) {
				String param = map.get(String.valueOf(i));
				if (param.indexOf("delete") > 0 || param.indexOf("inter") > 0)
					param = "0";
				param = param.replaceAll(",", "','");
				sql = sql.replace("(" + i + ")", "('" + param + "')");
			}

		if ("1020".equals(serviceId)){
			List<TerminalThemeEntity> list = microParameterServiceDao.queryTerminalThemeInfo(sql);
			result = transObjectByOutType(list,BaseParamFieldConstant.THEME_TERMINAL_ATTR);
			// JSON转换  
		}else if ("1021".equals(serviceId)){
			Map<String,String> towermap = microParameterServiceDao.queryTowerInfoById(sql);
			result = transObjectByOutType(towermap,BaseParamFieldConstant.TOWER_ASSET_ATTR);
			// JSON转换  
		}else{
			List<Map<String,String>> maplist = microParameterServiceDao.queryInfoBySql(sql);
			result = transToJson(maplist);
		}
        return result;
       }
	result = JSON.toJSONString("参数不能为空！请重新输入");
	return result;

  }

//	/**
//	 * 
//	  * @Description 传入微服务编号、相应的授权码值和参数值 ，获取相应的格式的数据(JSON)
//	  * @param String[]... params 传入参数
//	  * @return 返回不同格式的数据(JSON)
//	 */
//	
//	public String detailServiceByParams(String serviceId, String keyCode,String[]... params) {
//		
//		String result = "";
//		if(serviceId != null &&  !"".equals(serviceId) &&  !"".equals(keyCode) && keyCode != null){
//			ServiceParameterEntity serviceParameter = microServiceOrderDao.queryDetailServiceStr(serviceId,keyCode);
//			String sql  = serviceParameter.getSqlStatement();
//			if(sql.isEmpty()) return JSON.toJSONString("0");
//			if (params != null) {  
//				for (int i = 0; i < params.length; i++) {  
//					String value=""; 
//					String[] param =  params[i];
//					int l = param.length;
//					for(int j=0 ;j<l;j++){
//						if(j==l-1){
//							value+=  param[j].toString();
//						}else{
//							value+=  param[j].toString()+",";
//						}
//					}
//					sql=sql.replace("("+i+")","("+value+")");
//				}  
//			} 
//			
//			if ("1020".equals(serviceId)){
//				List<TerminalThemeEntity> list = microParameterServiceDao.queryTerminalThemeInfo(sql);
//				result = transObjectByOutType(list,BaseParamFieldConstant.THEME_TERMINAL_ATTR);
//				// JSON转换  
//			}else if ("1021".equals(serviceId)){
//				Map<String,String> towermap = microParameterServiceDao.queryTowerInfoById(sql);
//				result = transObjectByOutType(towermap,BaseParamFieldConstant.TOWER_ASSET_ATTR);
//				// JSON转换  
//			}else{
//				result = JSON.toJSONString("0");
//			}
//	        return result;
//	       }
//		result = JSON.toJSONString("0");
//		return result;
//	}
	
	private String transObjectByOutType(List<?> list, Map<String, String> ObjectAtrrMap) {
		String result = "0";
		if(list.isEmpty()) return result;
		String StrResult = JSON.toJSONString(list).toString();
		// String转换 JSONArray
		JSONArray jsonArray = new JSONArray(StrResult);
		JSONArray jsonresult = JSONTransKeyTools.transArray(jsonArray, ObjectAtrrMap);
		result = jsonresult.toString();
		return result;
	}

	private String transObjectByOutType(Map<String ,String > map, Map<String, String> ObjectAtrrMap) {
		String result = "0";
		if(map.isEmpty()) return result;
		@SuppressWarnings("unchecked")
		Map<String ,String> newObjectAttrMap = new CaseInsensitiveMap(ObjectAtrrMap); 
		String StrResult = JSON.toJSONString(map).toString();
		// String转换 JSONObject
		JSONObject jsonObject= new JSONObject(StrResult);
		JSONObject jsonresult = JSONTransKeyTools.transJsonObjectKeyReplace(jsonObject, newObjectAttrMap);
		result = jsonresult.toString();
		return result;
	}

	
	private String transObjectByListmap(List<Map<String, String>> maplist, Map<String, String> wildfireRemoteAttr) {
		String result = "0";
		if(maplist.isEmpty()) return result;
		@SuppressWarnings("unchecked")
		Map<String ,String> newObjectAttrMap = new CaseInsensitiveMap(wildfireRemoteAttr); 
		result =transObjectByOutType(maplist,newObjectAttrMap);
		return result;
	}
	
	private Map<String,String> JsonParse(String jsonParams){
		
		 Map<String,String> map = new HashMap<String,String>();
		 JSONObject jsonObj = new JSONObject(jsonParams);
		 map = JSONTransKeyTools.transJsonObjectMap(jsonObj);
		return map;
	}
	
	/**
	 * 
	* @Title: transToJson 
	* @Description: TODO(list 转为json) 
	* @param @param list
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	private String transToJson(List<Map<String,String>> list) {
		String result = "0";
		if(list.isEmpty()) return result;
		String StrResult = JSON.toJSONString(list).toString();
		result = StrResult;
		return StrResult;
		
	}
}
