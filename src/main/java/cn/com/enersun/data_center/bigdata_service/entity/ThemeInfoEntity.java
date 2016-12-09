package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;
import java.util.List;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: ThemeInfo.java 
* @Package cn.com.enersun.data_center.facade.dto 
* @Description: TODO(主题信息) 
* @author enersun_lhb  
* @date 2016年7月18日 下午3:27:05 
* @version V1.0   
*/
public class ThemeInfoEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5559632430522191496L;
	
	private  String id;//主题实例ID
	private  String themeName;//主题实例名称
	private  String topicId;//主题分类Id
	//private  AssetInfo assetInfo;//设备实例
	private  TopicTypeEntity topicType;//主题类型
	private  List<AttributeAndMonitorInfoEntity> attributeAndMonitorInfoList;//主题属性
	
	
	public ThemeInfoEntity() {
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getThemeName() {
		return themeName;
	}


	public void setThemeName(String themeName) {
		this.themeName = themeName;
	}


	public String getTopicId() {
		return topicId;
	}


	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}


	public TopicTypeEntity getTopicType() {
		return topicType;
	}


	public void setTopicType(TopicTypeEntity topicType) {
		this.topicType = topicType;
	}


	public List<AttributeAndMonitorInfoEntity> getAttributeAndMonitorInfoList() {
		return attributeAndMonitorInfoList;
	}


	public void setAttributeAndMonitorInfoList(List<AttributeAndMonitorInfoEntity> attributeAndMonitorInfoList) {
		this.attributeAndMonitorInfoList = attributeAndMonitorInfoList;
	}





	
	
}
