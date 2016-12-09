package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (c) 2016 Founder Ltd. All Rights Reserved. Company:昆明能讯科技
 * 
 * @Title: ThemeAttributeInfo.java
 * @Package cn.com.enersun.data_center.facade.dto
 * @Description: TODO(主题分类属性关联信息)
 * @author enersun_lhb
 * @date 2016年7月18日 下午3:28:32
 * @version V1.0
 */
public class ThemeTypeAttributeInfoEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6163916661031048155L;

	private String id;
	private String topicId;
	private String themeName;
	private TopicTypeEntity topicType;
	private List<AttributeBaseEntity> attributeBase;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public String getThemeName() {
		return themeName;
	}

	public void setThemeName(String themeName) {
		this.themeName = themeName;
	}

	public TopicTypeEntity getTopicType() {
		return topicType;
	}

	public void setTopicType(TopicTypeEntity topicType) {
		this.topicType = topicType;
	}

	public List<AttributeBaseEntity> getAttributeBase() {
		return attributeBase;
	}

	public void setAttributeBase(List<AttributeBaseEntity> attributeBase) {
		this.attributeBase = attributeBase;
	}

	@Override
	public String toString() {
		return "ThemeTypeAttributeInfo [id=" + id + ", topicId=" + topicId + ", themeName=" + themeName + ", topicType="
				+ topicType + ", attributeBase=" + attributeBase + "]";
	}

}
