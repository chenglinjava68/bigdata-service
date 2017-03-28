package cn.com.enersun.data_center.bigdata_service.dao;


import java.util.List;

import org.springframework.stereotype.Component;

import cn.com.enersun.data_center.bigdata_service.entity.AssetInfoEntity;
import cn.com.enersun.data_center.bigdata_service.entity.AttributeBaseEntity;
import cn.com.enersun.data_center.bigdata_service.entity.DeviceDetailInfoEntity;
import cn.com.enersun.data_center.bigdata_service.entity.TerminalEntity;
import cn.com.enersun.data_center.bigdata_service.entity.ThemeInfoEntity;
import cn.com.enersun.data_center.bigdata_service.entity.ThemeTypeAttributeInfoEntity;
import cn.com.enersun.data_center.bigdata_service.entity.TopicTypeEntity;


/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: MonitorServiceDao.java 
* @Package cn.com.enersun.data_center.bigdata_service.dao 
* @Description: TODO(监测模块服务dao) 
* @author enersun_lhb  
* @date 2016年6月26日 下午3:57:45 
* @version V1.0   
*/

@Component
public interface MonitorServiceDao  {
	
	/**
	 * 
	* @Title: queryThemeInfoToList 
	* @Description: TODO(根据电网台账获取主题实例列表) 
	* @param  assetId
	* @param    设定文件 
	* @return List<Theme>    返回类型 
	* @throws
	 */
	List<AssetInfoEntity> queryThemeByAssetId (String assetId1,String assetId2 ,String assetId3);

	/**
	 * 
	* @Title: queryAssetInfoByAssetId 
	* @Description: TODO(根据ID查询设备部件线路杆塔信息) 
	* @param @param assetId
	* @param @param assetId2
	* @param @param assetId3
	* @param @return    设定文件 
	* @return DeviceDetailInfoEntity    返回类型 
	* @throws
	 */
	DeviceDetailInfoEntity queryAssetInfoByAssetId(String assetId, String assetId2, String assetId3);
	
	
	/**
	 * 
	* @Title: queryTerminalInfoToList 
	* @Description: TODO(根据电网台账获取终端台账) 
	* @param @param assetId
	* @param @return    设定文件 
	* @return List<ServiceParameter>    返回类型 
	* @throws
	 */
	List<TerminalEntity> queryTerminalByAssetId(String assetId); 

	
	/**
	 * 
	* @Title: queryThemeOfTypeInfo 
	* @Description: TODO(根据主题实例ID获取主题分类) 
	* @param @param themeId
	* @param @return    设定文件 
	* @return ThemeTypeAttributeInfoEntity    返回类型 
	* @throws
	 */
	ThemeTypeAttributeInfoEntity queryThemeOfTypeInfo(String themeId);

	
	/**
	 * 
	* @Title: queryTypeById 
	* @Description: TODO(根据主题分类ID获取主题分类信息) 
	* @param @param topicId
	* @param @return    设定文件 
	* @return List<>    返回类型 
	* @throws
	 */
	 List<TopicTypeEntity> queryTypeById(String topicId);

	/**
	 * 
	* @Title: queryAttibuteByTypeId 
	* @Description: TODO(根据主题分类ID获取主题属性信息) 
	* @param @param topicId
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<AttributeBaseEntity> queryAttibuteByTypeId(String topicId);

	/**
	 * 
	* @Title: queryThemeCountByType 
	* @Description: TODO(查询某种类型主题实例数量 ) 
	* @param @param topicId
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws
	 */
	int queryThemeCountByType(String topicId);

	/**
	 * 
	* @Title: queryTerminalCountByType 
	* @Description: TODO(查询某种类型终端台账数量) 
	* @param @param ownerTypeId
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws
	 */
	int queryTerminalCountByType(String ownerTypeId);
	/**
	 * 
	* @Title: queryThemeIdTopicIdByAssetId 
	* @Description: TODO(主题实例主题属性列表) 
	* @param @param assetId
	* @param @return    设定文件 
	* @return List<String>    返回类型 
	* @throws
	 */
	List<String> queryThemeIdTopicIdByAssetId(String assetId);
	
	/**
	 * 
	* @Title: queryThemeIdByAssetId 
	* @Description: TODO(主题实例列表) 
	* @param @param assetId
	* @param @return    设定文件 
	* @return List<String>    返回类型 
	* @throws
	 */
	List<String> queryThemeIdByAssetId(String assetId);

	/**
	 * 
	* @Title: queryAttributeIdByTypeId 
	* @Description: TODO(主题属性list) 
	* @param @param topicList 主题分类list
	* @param @return    设定文件 
	* @return List<String>    返回类型 
	* @throws
	 */
	List<String> queryAttributeIdByTypeId(String topicId);

	
	/**
	 * 
	* @Title: ThemeAttributeByThemeIdForList 
	* @Description: TODO(通过主题实例获取主题属性列表) 
	* @param @param themeId
	* @param @return    设定文件 
	* @return List<AttributeBase>    返回类型 
	* @throws
	 */
	List<AttributeBaseEntity> queryThemeAttributeByThemeId(String themeId);

	/**
	 * 
	* @Title: queryThemeAndTopicAttrInfo 
	* @Description: TODO(通过设备id获取主题实例主题分类主题属性信息) 
	* @param @param assetId
	* @param @return    设定文件 
	* @return List<ThemeInfoEntity>    返回类型 
	* @throws
	 */
	List<ThemeInfoEntity> queryThemeAndTopicAttrInfo(String assetId);

	
}
