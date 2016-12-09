package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: ThemeAttribute.java 
* @Package com.enersun.data_center.bigdata_service.common.model 
* @Description: TODO(主题属性对象) 
* @author enersun_lhb   
* @date 2016年6月8日 上午10:30:06 
* @version V1.0   
*/

@Entity
@Table(name="ATTRIBUTE_BASE_LIB")
public class AttributeBaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	
	@Column(name="ATTRIBUTE_NAME")
	private String attributeName;

	@Column(name="DATA_TYPE")
	private String dataType;
	
	@Column(name="UNIT")
	private String unit;

	public AttributeBaseEntity() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAttributeName() {
		return this.attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}