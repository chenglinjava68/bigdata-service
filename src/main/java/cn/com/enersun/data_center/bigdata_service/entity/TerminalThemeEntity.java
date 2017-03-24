package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: TerminalThemeEntity.java 
* @Package cn.com.enersun.data_center.bigdata_service.entity 
* @Description: TODO(终端主题对象实体类) 
* @author enersun_lhb  
* @date 2017年3月20日 下午5:03:49 
* @version V1.0   
*/
public class TerminalThemeEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String orgid;//组织机构
	private String terminal_name;//终端名称
	private String tb_id;//终端ID
	private  String lon;//经度
	private  String lat;//纬度
	private String theme_id;//主题ID
	private String topic_id;//主题类型id
	private String topic_name;//主题类型描述
	private String attribute_id;//主题属性id
	private String attribute_name;//主题属性名称
	
	public TerminalThemeEntity(String orgid, String terminal_name, String tb_id, String lon, String lat,
			String theme_id, String topic_id, String topic_name, String attribute_id, String attribute_name) {
		super();
		this.orgid = orgid;
		this.terminal_name = terminal_name;
		this.tb_id = tb_id;
		this.lon = lon;
		this.lat = lat;
		this.theme_id = theme_id;
		this.topic_id = topic_id;
		this.topic_name = topic_name;
		this.attribute_id = attribute_id;
		this.attribute_name = attribute_name;
	}

	public TerminalThemeEntity() {
		super();
	}

	public String getOrgid() {
		return orgid;
	}

	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}

	public String getTerminal_name() {
		return terminal_name;
	}

	public void setTerminal_name(String terminal_name) {
		this.terminal_name = terminal_name;
	}

	public String getTb_id() {
		return tb_id;
	}

	public void setTb_id(String tb_id) {
		this.tb_id = tb_id;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getTheme_id() {
		return theme_id;
	}

	public void setTheme_id(String theme_id) {
		this.theme_id = theme_id;
	}

	public String getTopic_id() {
		return topic_id;
	}

	public void setTopic_id(String topic_id) {
		this.topic_id = topic_id;
	}

	public String getTopic_name() {
		return topic_name;
	}

	public void setTopic_name(String topic_name) {
		this.topic_name = topic_name;
	}

	public String getAttribute_id() {
		return attribute_id;
	}

	public void setAttribute_id(String attribute_id) {
		this.attribute_id = attribute_id;
	}

	public String getAttribute_name() {
		return attribute_name;
	}

	public void setAttribute_name(String attribute_name) {
		this.attribute_name = attribute_name;
	}

	@Override
	public String toString() {
		return "TerminalThemeEntity [orgid=" + orgid + ", terminal_name=" + terminal_name + ", tb_id=" + tb_id
				+ ", theme_id=" + theme_id + ", topic_id=" + topic_id + ", topic_name=" + topic_name + ", attribute_id="
				+ attribute_id + ", attribute_name=" + attribute_name + "]";
	}
	
	
	
}
