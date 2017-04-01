package cn.com.enersun.data_center.bigdata_service.serviceImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;

import cn.com.enersun.data_center.bigdata_service.MonitorService;
import cn.com.enersun.data_center.bigdata_service.common.util.StringUtils;
import cn.com.enersun.data_center.bigdata_service.dao.MonitorServiceDao;
import cn.com.enersun.data_center.bigdata_service.entity.AssetInfoEntity;
import cn.com.enersun.data_center.bigdata_service.entity.AttributeAndMonitorInfoEntity;
import cn.com.enersun.data_center.bigdata_service.entity.AttributeBaseEntity;
import cn.com.enersun.data_center.bigdata_service.entity.DeviceDetailInfoEntity;
import cn.com.enersun.data_center.bigdata_service.entity.TerminalEntity;
import cn.com.enersun.data_center.bigdata_service.entity.ThemeInfoEntity;
import cn.com.enersun.data_center.bigdata_service.entity.ThemeTypeAttributeInfoEntity;
import cn.com.enersun.data_center.bigdata_service.entity.TopicTypeEntity;
import cn.com.enersun.data_center.facade.dto.asset.AssetInfo;
import cn.com.enersun.data_center.facade.dto.asset.DeviceDetailInfo;
import cn.com.enersun.data_center.facade.dto.monitor.AttributeDataObject;
import cn.com.enersun.data_center.facade.dto.monitor.DevAndMonitorObject;
import cn.com.enersun.data_center.facade.dto.monitor.Monitor;
import cn.com.enersun.data_center.facade.dto.monitor.TerminalMonitorDataObject;
import cn.com.enersun.data_center.facade.dto.terminal.Terminal;
import cn.com.enersun.data_center.facade.dto.theme.AttributeAndMonitorInfo;
import cn.com.enersun.data_center.facade.dto.theme.AttributeBase;
import cn.com.enersun.data_center.facade.dto.theme.ThemeInfo;
import cn.com.enersun.data_center.facade.dto.theme.ThemeTypeAttributeInfo;
import cn.com.enersun.data_center.facade.dto.theme.TopicType;
import cn.com.enersun.hbase.ThemeParamValueClient;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: MonitorServiceImp.java 
* @Package cn.com.enersun.data_center.bigdata_service.serviceImp 
* @Description: TODO(监测服务模块) 
* @author enersun_lhb  
* @date 2016年6月24日 上午11:02:19 
* @version V1.0   
*/
@Service
public class MonitorServiceImp implements MonitorService{
	private static final Logger LOG =LoggerFactory.getLogger(MonitorServiceImp.class);
	
//	private final String HBASE_TABLE_NAME = "THEME_PARAM_VALUE";
    private ThemeParamValueClient themeParamValueClient;
	
	@Autowired
	private MonitorServiceDao monitorServiceDao;
	
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
	 * 
	* @Title: ThemeInfoToList 
	* @Description: TODO(通过电网台账ID获取主题实例列表) 
	* @param @param assetId 台账ID
	* @param @return    设定文件 list
	* @return List<Theme>    返回类型 
	* @throws
	*/	
	public List<AssetInfo> themeInfoToList(String assetId) {
		List<AssetInfoEntity> list = new ArrayList<AssetInfoEntity>();
		if(assetId != null &&  !"".equals(assetId)){
			list =  monitorServiceDao.queryThemeByAssetId(assetId,assetId,assetId);
			List<AssetInfo> result=new ArrayList<AssetInfo>();
			AssetInfo obj=null;
			for(AssetInfoEntity tmp:list)
			{
				obj=new AssetInfo();
				BeanUtils.copyProperties(tmp,obj);
				result.add(obj);
			}
			return result;
	      }
		AssetInfo assetInfo = new AssetInfo();
		assetInfo.setId("0");
		List<AssetInfo> empty = new ArrayList<AssetInfo>();
		empty.add(assetInfo);
		return empty;

	}
  
	/**
	 * 
	* @Title: ThemeAttributeByThemeIdForList 
	* @Description: TODO(通过主题实例获取主题属性列表) 
	* @param @param themeId
	* @param @return    设定文件 
	* @return List<AttributeBase>    返回类型 
	* @throws
	 */
	public List<AttributeBase> themeAttributeByThemeIdForList(String themeId) {
		List<AttributeBaseEntity> list = new ArrayList<AttributeBaseEntity>();
		if(themeId != null &&  !"".equals(themeId)){
	       list = monitorServiceDao.queryThemeAttributeByThemeId(themeId);
	       List<AttributeBase> result=new ArrayList<AttributeBase>();
	       AttributeBase obj=null;
			for(AttributeBaseEntity tmp:list)
			{
				obj=new AttributeBase();
				BeanUtils.copyProperties(tmp,obj);
				result.add(obj);
			}
			return result;
	      }
		AttributeBase attribte = new AttributeBase();
		attribte.setId("0");
		List<AttributeBase> empty = new ArrayList<AttributeBase>();
		empty.add(attribte);
		return empty;

	}
	
	/**
	 * 
	* @Title: ThemeInfoToOutType 
	* @Description: TODO(根据电网台账获取主题台账) 
	* @param @param assetId
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	public String themeInfoToOutType(String assetId,String outType) {
		String rs ="";
		if(assetId != null &&  !"".equals(assetId)){
			List<AssetInfoEntity> result =  monitorServiceDao.queryThemeByAssetId(assetId,assetId,assetId);
			if("2".equals(outType) || "".equals(outType)|| outType == null){
				if(result.isEmpty()){
					List<String> empty=new ArrayList<String>();
					empty.add("0");
					return JSON.toJSONString(empty);
				}
				return JSON.toJSONString(result);
			}
		}
	   return rs;
	}

	/**
	 * 
	* @Title: queryTerminalInfoToList 
	* @Description: TODO(根据电网台账获取终端台账) 
	* @param @param assetId
	* @param @return    设定文件 
	* @return List<Terminal>    返回类型 
	* @throws
	 */
	@Override
	public List<Terminal> terminalAssetInfo(String assetId) {
		List<TerminalEntity> list = new ArrayList<TerminalEntity>();
		if(assetId != null &&  !"".equals(assetId)){
			list = monitorServiceDao.queryTerminalByAssetId(assetId);
			 List<Terminal> result=new ArrayList<Terminal>();
			 Terminal obj=null;
				for(TerminalEntity tmp:list)
				{
					obj=new Terminal();
					BeanUtils.copyProperties(tmp,obj);
					result.add(obj);
				}
				return result;
	      }
		Terminal terminal = new Terminal();
		terminal.setId("0");
		List<Terminal> empty = new ArrayList<Terminal>();
		empty.add(terminal);
		return empty;
	}

	/**
	 * 
	* @Title: TerminalInfoToOutType 
	* @Description: TODO(根据电网台账获取终端台账) 
	* @param @param assetId
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	public String terminalInfoToOutType(String assetId,String outType) {
		String rs ="";
		if(assetId != null &&  !"".equals(assetId)){
			List<TerminalEntity> result = monitorServiceDao.queryTerminalByAssetId(assetId);
			if("2".equals(outType) || "".equals(outType)|| outType == null){
				if(result.isEmpty()){
					List<String> empty=new ArrayList<String>();
					empty.add("0");
					return JSON.toJSONString(empty);
				}
				return JSON.toJSONString(result);
			}
		}
	   return rs;
	}

   
	/**
	 * 根据主题实例ID获取主题分类
	 */
	public ThemeTypeAttributeInfo themeOfAttrAndType(String themeId) {
		ThemeTypeAttributeInfoEntity  themeTypeAttributeInfoEntity;
		if(themeId != null &&  !"".equals(themeId)){
			themeTypeAttributeInfoEntity = monitorServiceDao.queryThemeOfTypeInfo(themeId);
			ThemeTypeAttributeInfo themeTypeAttributeObj =new ThemeTypeAttributeInfo();
			BeanUtils.copyProperties(themeTypeAttributeInfoEntity,themeTypeAttributeObj);
			return themeTypeAttributeObj;
	      }
		ThemeTypeAttributeInfo emptyInfo = new ThemeTypeAttributeInfo();
		emptyInfo.setId("0");
		return emptyInfo;
	}



	@Override
	public List<TopicType> typeById(String topicId) {
		List<TopicTypeEntity> list = new ArrayList<TopicTypeEntity>();
		if(topicId != null &&  !"".equals(topicId)){
			list = monitorServiceDao.queryTypeById(topicId);
			 List<TopicType> result=new ArrayList<TopicType>();
			 TopicType obj=null;
				for(TopicTypeEntity tmp:list)
				{
					obj=new TopicType();
					BeanUtils.copyProperties(tmp,obj);
					result.add(obj);
				}
				return result;
	      }
		List<TopicType> empty = new ArrayList<TopicType>();
		TopicType topicType = new TopicType();
		topicType.setId("0");
		empty.add(topicType);
		return empty;
	}



	@Override
	public List<AttributeBase> attibuteByTypeId(String topicId) {
		List<AttributeBaseEntity>list = new ArrayList<AttributeBaseEntity>();
		if(topicId != null &&  !"".equals(topicId)){
	       list = monitorServiceDao.queryAttibuteByTypeId(topicId);
	       List<AttributeBase> result=new ArrayList<AttributeBase>();
	       AttributeBase obj=null;
				for(AttributeBaseEntity tmp:list)
				{
					obj=new AttributeBase();
					BeanUtils.copyProperties(tmp,obj);
					result.add(obj);
				}
				return result;
	      }
		List<AttributeBase> empty = new ArrayList<AttributeBase>();
		AttributeBase attributeBase = new AttributeBase();
		attributeBase.setId("0");
		empty.add(attributeBase);
		return empty;
	}



	@Override
	public int themeCountByTypeId(String topicId) {
		if(topicId != null &&  !"".equals(topicId)){
	        return  monitorServiceDao.queryThemeCountByType(topicId);
	      }
		return 0;
	}



	@Override
	public int terminalCountByOwnerTypeId(String ownerTypeId) {
		if(ownerTypeId != null &&  !"".equals(ownerTypeId)){
	        return  monitorServiceDao.queryTerminalCountByType(ownerTypeId);
	      }
		return 0;
	}


	  /**
     * 
    * @Title: MonitorMapByAssetId 
    * @Description: TODO(通过设备编码查询，limitrow行的监测数据) 
    * @param @param assetId
    * @param @param limitrow
    * @param @return    设定文件 
    * @return List<Map<String,String>>    返回类型 
    * @throws
     */
	@Override
	public List<Map<String,String>> monitorListByAssetId(String assetId,long limitrow) {
		Map<String,String> emptymap = new HashMap<String, String>();
		List<Map<String,String>> emptyList= new ArrayList<Map<String,String>>();
		emptymap.put("0","0");
		emptyList.add(emptymap);
		if(assetId != null &&  !"".equals(assetId)){
			themeParamValueClient = new ThemeParamValueClient();
			//查询获取主题实例ID+主题属性ID ，list集合
			List<String> themeAndTopicList = monitorServiceDao.queryThemeIdTopicIdByAssetId(assetId);
			List<String> attrList =  new ArrayList<String>();
	        Map<String, String> valuesMap = new HashMap<String, String>();
			List<Map<String,String>> valueList= new ArrayList<Map<String,String>>();
			String key = null;
			String topic_Id= null;
			String theme_Id = null;
			for(int j=0;j<themeAndTopicList.size();j++){
				key = themeAndTopicList.get(j);
				topic_Id = key.substring(key.length()-5,key.length());
				theme_Id = key.substring(1,20);
				attrList = monitorServiceDao.queryAttributeIdByTypeId(topic_Id);
				for(int i=0;i<attrList.size();i++){
					key = new StringBuilder(theme_Id).append(attrList.get(i)).toString();
					try {
						valuesMap = themeParamValueClient.getLastValuesByPrefix(key,limitrow);
						if(valuesMap.isEmpty()) continue;
						//有序的TreeMap 代替HashMap 
						Map<String, String> sortedMap = new TreeMap<String, String>(valuesMap);
						valueList.add(sortedMap);
					} catch (Exception e) {
						String msg = StringUtils.getExceptionMsg(e);
					    LOG.error(msg, e);
					}
				}
			}
			if(valueList.isEmpty()) return emptyList;
	        return  valueList;
	      }
		
		return emptyList;
	}

	public String monitorListByAssetIdToJson(String assetId,long limitrow) {
		List<Map<String,String>> list = monitorListByAssetId(assetId,limitrow);
		String result = JSON.toJSONString(list,true);
		return result ;
	}
	
	/**
	 * 
	* @Title: MonitorMapByAssetIdAndAttrid 
	* @Description: TODO(通过设备编码和某一个属性编码查询，limitrow行的监测数据) 
	* @param @param assetId
	* @param @param attrId
	* @param @param limitrow
	* @param @return    设定文件 
	* @return List<Map<String,String>>    返回类型 
	* @throws
	 */
	@Override
	public List<Map<String,String>> monitorListByAssetIdAndAttrid(String assetId, String attrId ,long limitrow) {
		Map<String,String> emptymap = new HashMap<String, String>();
		List<Map<String,String>> emptyList= new ArrayList<Map<String,String>>();
		emptymap.put("0","0");
		emptyList.add(emptymap);
		if(assetId != null &&  !"".equals(assetId) && attrId != null &&  !"".equals(attrId)){
			themeParamValueClient = new ThemeParamValueClient();
			//查询获取主题实例ID，list集合
			List<String> themeIdList = monitorServiceDao.queryThemeIdByAssetId(assetId);	
	        Map<String, String> valuesMap = new HashMap<String, String>();
			List<Map<String,String>> valueList= new ArrayList<Map<String,String>>();
			String key = null;
			for(int i=0;i<themeIdList.size();i++){
					key = new StringBuilder(themeIdList.get(i)).append(attrId).toString();
					try {
						valuesMap = themeParamValueClient.getLastValuesByPrefix(key,limitrow);
						if(valuesMap.isEmpty()) continue;
						//有序的TreeMap 代替HashMap 
						Map<String, String> sortedMap = new TreeMap<String, String>(valuesMap);
						valueList.add(sortedMap);
					} catch (Exception e) {
						String msg = StringUtils.getExceptionMsg(e);
					    LOG.error(msg, e);
					}
			}
			if(valueList.isEmpty()) return emptyList;
	        return  valueList;
	      }
		
		return emptyList;
	}

	public String monitorListByAssetIdAndAttridToJson(String assetId, String attrId ,long limitrow) {
		List<Map<String,String>> list = monitorListByAssetIdAndAttrid(assetId,attrId,limitrow);
		String result = JSON.toJSONString(list,true);
		return result ;
	}

	/**
	 * 
	* @Title: MonitorMapByDateTime 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param assetId "10000000000001683378"
	* @param @param attrId   "10099"
	* @param @param dateTime 如"20160407074800"
	* @param @return    设定文件 
	* @return List<Map<String,String>>   返回类型 
	* @throws
	 */
	public List<Map<String,String>> monitorListByDateTime(String assetId, String attrId, String dateTime,long limitrow) {
		Map<String,String> emptymap = new HashMap<String, String>();
		List<Map<String,String>> emptyList= new ArrayList<Map<String,String>>();
		emptymap.put("0","0");
		emptyList.add(emptymap);
		if(assetId != null &&  !"".equals(assetId) && attrId != null &&  !"".equals(attrId)
				 && dateTime != null &&  !"".equals(dateTime)){
			themeParamValueClient = new ThemeParamValueClient();
			//查询获取主题实例ID，list集合
			List<String> themeIdList = monitorServiceDao.queryThemeIdByAssetId(assetId);	
		    Map<String, String> valuesMap = new HashMap<String, String>();
			List<Map<String,String>> valueList= new ArrayList<Map<String,String>>();
			String key = null;
			for(int i=0;i<themeIdList.size();i++){
					//"100000000000016833781009920160407074800"
					key = new StringBuilder(themeIdList.get(i)).append(attrId).append(dateTime).toString();
					try {
						valuesMap = themeParamValueClient.getLastValuesByPrefix(key,limitrow);
						if(valuesMap.isEmpty()) continue;
						//有序的TreeMap 代替HashMap 
						Map<String, String> sortedMap = new TreeMap<String, String>(valuesMap);
						valueList.add(sortedMap);
					} catch (Exception e) {
						String msg = StringUtils.getExceptionMsg(e);
					    LOG.error(msg, e);
					}
			}
			if(valueList.isEmpty()) return emptyList;
	        return  valueList;
	      }
		
		return emptyList;
	}

	public String monitorListByDateTimeToJson(String assetId, String attrId, String dateTime,long limitrow) {
		List<Map<String,String>> list = monitorListByDateTime(assetId,attrId,dateTime,limitrow);
		String result = JSON.toJSONString(list,true);
		return result ;
	}


	/**
	 * 
	* @Title: MonitorMapByCriteria 
	* @Description: TODO(gen) 
	* @param @param assetId  "10000000000001683378"
	* @param @param attrId   "10099"
	* @param @param startTime 如"20160407"
	* @param @param endTime  如"20160408"
	* @param @return    设定文件 
	* @return List<Map<String,String>>    返回类型 
	* @throws
	 */
	public List<Map<String,String>> monitorListByCriterias(String assetId, String attrId, String startTime, String endTime,long limitrow) {
		Map<String,String> emptymap = new HashMap<String, String>();
		List<Map<String,String>> emptyList= new ArrayList<Map<String,String>>();
		emptymap.put("0","0");
		emptyList.add(emptymap);
		if(assetId != null &&  !"".equals(assetId) && assetId != null &&  !"".equals(assetId)
				 && startTime != null &&  !"".equals(startTime)  && endTime != null &&  !"".equals(endTime)){
			themeParamValueClient = new ThemeParamValueClient();
			List<String> themeIdList = monitorServiceDao.queryThemeIdByAssetId(assetId);	
			Map<String, String> valuesMap = new HashMap<String, String>();
			List<Map<String,String>> valueList= new ArrayList<Map<String,String>>();
			String key = null;
			String startkey = null;
			String endkey = null;
			for(int i=0;i<themeIdList.size();i++){
				    key = themeIdList.get(i);
				    //"100000000000016833781009920160407074800"
					startkey = new StringBuilder(key).append(attrId).append(startTime).toString();
					//"100000000000016833781009920160408074800"
				    endkey = new StringBuilder(key).append(attrId).append(endTime).toString();
					try {
						valuesMap = themeParamValueClient.getLastValuesByKey(startkey,endkey,limitrow);
						if(valuesMap.isEmpty()) continue;
						//有序的TreeMap 代替HashMap 
						Map<String, String> sortedMap = new TreeMap<String, String>(valuesMap);
						valueList.add(sortedMap);
					} catch (Exception e) {
						String msg = StringUtils.getExceptionMsg(e);
					    LOG.error(msg, e);
					}
			}
			if(valueList.isEmpty()) return emptyList;
	        return  valueList;
	      }
		
		return emptyList;
	}
	
	
	public String monitorListByCriteriasToJson(String assetId, String attrId, String startTime, String endTime,long limitrow) {
		List<Map<String,String>> list = monitorListByCriterias(assetId,attrId,startTime,endTime,limitrow);
		String result = JSON.toJSONString(list,true);
		return result ;
	}

	/**
	 * 
	* @Title: MonitorListByCriteria 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param themeId
	* @param @param attrId
	* @param @param time 某个日期 "20160407"
	* @param @return    设定文件 
	* @return List<Map<String,String>>    返回类型 
	* @throws
	 */
	public List<Map<String,String>> monitorListByCriteria(String themeId, String attrId,String time ,long limitrow) {
		Map<String,String> emptymap = new HashMap<String, String>();
		List<Map<String,String>> emptyList= new ArrayList<Map<String,String>>();
		emptymap.put("1","0");
		emptymap.put("2","0");
		emptymap.put("3","0");
		emptyList.add(emptymap);
		if(themeId != null &&  !"".equals(themeId) && attrId != null &&  !"".equals(attrId)
				 && time != null &&  !"".equals(time)){
			themeParamValueClient = new ThemeParamValueClient();
			List<Map<String,String>> valueList= new ArrayList<Map<String,String>>();
			//"100000000000016833781009920160407"
			String key = new StringBuilder(themeId).append(attrId).append(time).toString();
			try {
				Map<String, String> valuesMap = themeParamValueClient.getLastValuesByPrefix(key,limitrow);
				//有序的TreeMap 代替HashMap 
				Map<String, String> sortedMap = new TreeMap<String, String>(valuesMap);
				valueList.add(sortedMap);
			} catch (Exception e) {
				String msg = StringUtils.getExceptionMsg(e);
			    LOG.error(msg, e);
			}
	        return  valueList;
	      }
		
		return emptyList;
	}

	public String monitorListByCriteriaToJson(String themeId, String attrId,String time ,long limitrow) {
		List<Map<String,String>> list = monitorListByCriteria(themeId,attrId,time,limitrow);
		String result = JSON.toJSONString(list,true);
		return result ;
	}
	
    
	/**
	 * 
	* @Title: monitorLastValueByPrekey 
	* @Description: TODO(通过key前缀获取最新一条监测结果) 
	* @param @param themeId
	* @param @param attrId
	* @param @param time 注意：时间可以是YYYY/yyyyMM/yyyyMMDD/ 或者时分秒 都可以 但不可以为空
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	public String monitorLastValueByPrekey(String themeId, String attrId,String time){
		if(themeId != null &&  !"".equals(themeId) && attrId != null &&  !"".equals(attrId)
				 && time != null &&  !"".equals(time)){
			String rowkey = new StringBuilder(themeId).append(attrId).append(time).toString();
			String monitorValue = "0";
			try {
				monitorValue = themeParamValueClient.getLastValueByPrefix(rowkey);
				
			} catch (Exception e) {
				String msg = StringUtils.getExceptionMsg(e);
			    LOG.error(msg, e);
			}
			return monitorValue;
		}
		return "0";
	}
	
	/**
	 * 
	* @Title: devAndMonitorDecByAssetId 
	* @Description: TODO(通过设备ID和监测结果限制条数，获取设备终端主题监测结果一系列数据信息) 
	* @param @param assetId
	* @param @param limitrow
	* @param @return    设定文件 
	* @return DevAndMonitorObject    返回类型 
	* @throws
	 */
	public DevAndMonitorObject devAndMonitorDecByAssetId(String assetId,long limitrow){
		DevAndMonitorObject devAndMonitorObject = null;
		if(assetId != null &&  !"".equals(assetId)){
			if(limitrow >10000 &&  !"".equals(limitrow)){
				DevAndMonitorObject limitBeyond = new DevAndMonitorObject( new DeviceDetailInfo("查询行数大于10000，请重新输入!"), null, null);
				return limitBeyond;
				}
			 DeviceDetailInfoEntity deviceDetailInfoEntity =  monitorServiceDao.queryAssetInfoByAssetId(assetId,assetId,assetId);
			 DeviceDetailInfo deviceDetailInfo = null;
			 if(deviceDetailInfoEntity != null){
				 deviceDetailInfo = new DeviceDetailInfo();
				 BeanUtils.copyProperties(deviceDetailInfoEntity,deviceDetailInfo);
			 }
			
			List<Terminal> terminalInfoList = terminalAssetInfo(assetId);
			List<ThemeInfo> themeInfoList = themeAndTopicAttrInfo(assetId,limitrow);
			devAndMonitorObject = new DevAndMonitorObject(deviceDetailInfo,terminalInfoList,themeInfoList);
			return devAndMonitorObject;
	      }
		DevAndMonitorObject emptyDevObject = new DevAndMonitorObject();
		emptyDevObject.setDevDetail(null);
		return emptyDevObject;
		
	};
	
	/**
	 * 
	* @Title: themeAndTopicAttrInfo 
	* @Description: TODO(根据assetId和监测数据行数，获取主题实例属性以及属性下的监测值) 
	* @param @param assetId
	* @param @param limitrow
	* @param @return    设定文件 
	* @return List<ThemeInfo>    返回类型 
	* @throws
	 */
	public List<ThemeInfo> themeAndTopicAttrInfo(String assetId,long limitrow){
		List<ThemeInfoEntity> themeInfoEntityList = new ArrayList<ThemeInfoEntity>();
		themeInfoEntityList = monitorServiceDao.queryThemeAndTopicAttrInfo(assetId);
		List<ThemeInfo> ThemeInfoList = new ArrayList<ThemeInfo>();
		TopicType topicType = null;
		List<AttributeAndMonitorInfo> attributeAndMonitorList = null;
		themeParamValueClient = new ThemeParamValueClient();
		for(ThemeInfoEntity tmp:themeInfoEntityList)
		{   
			topicType = new TopicType();
			String themeId = tmp.getId();
			String themeName= tmp.getThemeName();
			String topicId = tmp.getTopicId();
			BeanUtils.copyProperties(tmp.getTopicType(),topicType);
			attributeAndMonitorList = new ArrayList<AttributeAndMonitorInfo>();
			List<AttributeAndMonitorInfoEntity> attributeAndMonitorInfoEntityList = tmp.getAttributeAndMonitorInfoList();
			AttributeAndMonitorInfo obj=null;
			for(AttributeAndMonitorInfoEntity attributeAndMonitorInfoEntity:attributeAndMonitorInfoEntityList)
			{
					obj=new AttributeAndMonitorInfo();
					BeanUtils.copyProperties(attributeAndMonitorInfoEntity,obj);
					attributeAndMonitorList.add(obj);
				}
			List<Monitor> monitorDetailList= null;
			List<AttributeAndMonitorInfo> newAttributeAndMonitorList = new ArrayList<AttributeAndMonitorInfo>();
			String rowkey = null;
			Map<String, String> valuesMap = new HashMap<String, String>();
			for(int i = 0, size = attributeAndMonitorList.size(); i < size; i++) {
				monitorDetailList = new ArrayList<Monitor>();
				String attrId =attributeAndMonitorList.get(i).getId();
				String dataType =attributeAndMonitorList.get(i).getDataType();
				String attributeName =attributeAndMonitorList.get(i).getAttributeName();
				String unit =attributeAndMonitorList.get(i).getUnit();
				rowkey = new StringBuilder(themeId).append(attrId).toString(); 
				try {
					valuesMap = themeParamValueClient.getLastValuesByPrefix(rowkey,limitrow);
					Monitor monitor = null;
					if(valuesMap.isEmpty()) continue;
					Map<String, String> sortedMap = new TreeMap<String, String>(valuesMap);
					Iterator<String> ir=sortedMap.keySet().iterator();//获取hashMap的键值，并进行遍历
					while(ir.hasNext()){
						String key= ir.next();
						monitor = new Monitor();
						String time = key.substring(key.length()-14);
						monitor.setId(themeId);
						monitor.setAttrId(attrId);
						monitor.setTime(time);
					    monitor.setValue(sortedMap.get(key));
						monitorDetailList.add(monitor);
					}
//					 for (Map.Entry<String, String> entry : valuesMap.entrySet()) {
//						 monitor = new Monitor();
//						 String key = entry.getKey();
//						 String time = key.substring(key.length()-14);
//						 monitor.setId(themeId);
//						 monitor.setAttrId(attrId);
//						 monitor.setTime(time);
//						 monitor.setValue(entry.getValue());
//						 monitorDetailList.add(monitor);
//					}
					 newAttributeAndMonitorList.add(new AttributeAndMonitorInfo(attrId,attributeName,dataType,unit,monitorDetailList));
				} catch (Exception e) {
					String msg = StringUtils.getExceptionMsg(e);
				    LOG.error(msg, e);
				}
			}
			ThemeInfo newthemeInfo = new ThemeInfo(themeId,themeName,topicId,topicType,newAttributeAndMonitorList); 
			ThemeInfoList.add(newthemeInfo);
		}
		return ThemeInfoList;
	}
	
	
	/**
	 * 
	* @Title: MonitorValueByRowKey 
	* @Description: TODO(通过具体的rowkey 查询监测值) 
	* @param @param themeId
	* @param @param attrId
	* @param @param time 某个日期 "20160407122003"
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	public String monitorValueByRowKey(String themeId, String attrId,String time ) {
        String 	emptyValue = "0";
		if(themeId != null &&  !"".equals(themeId) && attrId != null &&  !"".equals(attrId)
				 && time != null &&  !"".equals(time)){
			themeParamValueClient = new ThemeParamValueClient();
			//"100000000000016833781009920160407"
			String key = new StringBuilder(themeId).append(attrId).append(time).toString();
			String rersult = "";
			try {
				rersult = themeParamValueClient.getValueByKey(key);
			} catch (Exception e) {
				String msg = StringUtils.getExceptionMsg(e);
			    LOG.error(msg, e);
			}
			return rersult;
	      }
		
		return emptyValue;
	}
	
	
	/**
	 * 
	* @Title: MonitorValueByThemeAttrIdToJson 
	* @Description: TODO(通过themeId+attrId 组成的rowkey前端 ,查询最新一条监测值) 
	* @param @param themeId
	* @param @param attrId
	* @param @return    设定文件 
	* @return json    返回类型 
	* 
	 */
	public String MonitorValueByThemeAttrIdToJson(String themeId, String attrId) {
        String 	emptyValue = "0";
		if(themeId != null &&  !"".equals(themeId) && attrId != null &&  !"".equals(attrId)){
			themeParamValueClient = new ThemeParamValueClient();
			//"1000000000000168337810099"
			Map<String, String> valuesMap = new HashMap<String, String>();
			String rowkey = new StringBuilder(themeId).append(attrId).toString();
			String rersult = "";
			try {
				valuesMap = themeParamValueClient.getLastValuesByPrefix(rowkey,1);
				rersult = JSON.toJSONString(valuesMap,true);
			} catch (Exception e) {
				String msg = StringUtils.getExceptionMsg(e);
			    LOG.error(msg, e);
			}
			return rersult;
	      }
		
		return emptyValue;
	}
	
	/**
	 * 
	 *@描述 通过主题ID，获取主题实例监测数据最新一条记录
	 *@param themeID
	 *@return
	 *@throws Exception
	 *@创建人 lhb
	 *@创建时间 2016年11月11日
	 *@修改人和其它信息
	 */
	public TerminalMonitorDataObject fetchMonitorDataObject(String themeID){
		if(themeID != null &&  !"".equals(themeID)){
			ThemeTypeAttributeInfoEntity themeTypeAttributeInfoEntity = monitorServiceDao.queryThemeOfTypeInfo(themeID);
			TerminalMonitorDataObject tObject = new TerminalMonitorDataObject();
			List<AttributeBaseEntity> attributeBaseList = themeTypeAttributeInfoEntity.getAttributeBase();
			String attrId ="";
			String attrName ="";
			String rowkey ="";
			Map<String, String> valuesMap = new HashMap<String, String>();
			themeParamValueClient = new ThemeParamValueClient();
			List<AttributeDataObject> lastAttrData = new ArrayList<AttributeDataObject>();
			AttributeDataObject attributeDataObject = null;
			for(AttributeBaseEntity tmp:attributeBaseList)
			{
				attrId = tmp.getId();
				attrName = tmp.getAttributeName();
				rowkey = new StringBuilder(themeID).append(attrId).toString();
					try {
						valuesMap = themeParamValueClient.getLastValuesByPrefix(rowkey,1);
						if(valuesMap.isEmpty()) continue;
						//有序的TreeMap 代替HashMap 
						Map<String, String> sortedMap = new TreeMap<String, String>(valuesMap);
						Iterator<String> ir=sortedMap.keySet().iterator();//获取hashMap的键值，并进行遍历
						while(ir.hasNext()){
							String key= ir.next();
							attributeDataObject = new AttributeDataObject();
							String time = key.substring(key.length()-14);
							attributeDataObject.setAttributeName(attrName);
							attributeDataObject.setAttrID(attrId);
							attributeDataObject.setStrDate(time);
							attributeDataObject.setStrValue(sortedMap.get(key));
						}
						
//						for (Map.Entry<String, String> entry : valuesMap.entrySet()) {
//							attributeDataObject = new AttributeDataObject();
//							String key = entry.getKey();
//							String time = key.substring(key.length()-14);
//							attributeDataObject.setAttributeName(attrName);
//							attributeDataObject.setAttrID(attrId);
//							attributeDataObject.setStrDate(time);
//							attributeDataObject.setStrValue(entry.getValue());
//						}
						lastAttrData.add(attributeDataObject);
					} catch (Exception e) {
						String msg = StringUtils.getExceptionMsg(e);
					    LOG.error(msg, e);
					}
			}
			BeanUtils.copyProperties(themeTypeAttributeInfoEntity,tObject);//可以取代上面三行
			tObject.setLastAttrData(lastAttrData);
			tObject.setTypeName(themeTypeAttributeInfoEntity.getTopicType().getTypeName());
			return tObject;
	      }
		TerminalMonitorDataObject emptyObject = new TerminalMonitorDataObject();
		emptyObject.setId("0");
		return emptyObject;
	}

	
}
