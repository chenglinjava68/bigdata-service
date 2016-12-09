package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: Monitor.java 
* @Package com.enersun.data_center.bigdata_service.common.model 
* @Description: TODO(监测数据对象) 
* @author enersun_lhb   
* @date 2016年6月8日 上午10:27:24 
* @version V1.0   
*/

public class MonitorEntity implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/
	private static final long serialVersionUID = 4706030193643988362L;
	
    private  String id ;//themeId;
    private  String value;//监测值
	private  String attrId;//监测属性ID
    private  String time;//监测时间 如:20150607112550
    
	public MonitorEntity() {
	}

    
	public MonitorEntity(String id, String value, String attrId, String time) {
		super();
		this.id = id;
		this.value = value;
		this.attrId = attrId;
		this.time = time;
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getAttrId() {
		return attrId;
	}
	
	public void setAttrId(String attrId) {
		this.attrId = attrId;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Monitor [id=" + id + ", value=" + value + ", attrId=" + attrId + ", time=" + time + "]";
	}

    
}
