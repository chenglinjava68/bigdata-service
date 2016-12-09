package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;
import java.util.List;



/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: AttributeAndMonitorInfo.java 
* @Package cn.com.enersun.data_center.facade.dto
* @Description: TODO(主题属性对象) 
* @author enersun_lhb   
* @date 2016年6月8日 上午10:30:06 
* @version V1.0   
*/

public class AttributeAndMonitorInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;//属性ID
	
	private String attributeName;//属性描述

	private String dataType;//数据类型
	
	private String unit;//单位
    
	private  List<MonitorEntity> monitorDetailList;//获取的监测数据,一个属性值对应多条监测值
	
	
	public AttributeAndMonitorInfoEntity() {
	}

	
	public AttributeAndMonitorInfoEntity(List<MonitorEntity> monitorDetailList) {
		super();
		this.monitorDetailList = monitorDetailList;
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

	public List<MonitorEntity> getMonitorDetailList() {
		return monitorDetailList;
	}

	public void setMonitorDetailList(List<MonitorEntity> monitorDetailList) {
		this.monitorDetailList = monitorDetailList;
	}

	
}