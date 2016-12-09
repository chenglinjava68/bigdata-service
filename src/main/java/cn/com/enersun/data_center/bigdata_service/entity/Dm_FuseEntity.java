package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: Dm_fuse.java 
* @Package cn.com.enersun.data_center.bigdata_service.entity 
* @Description: TODO(熔断器技术参数信息) 
* @author enersun_lhb  
* @date 2016年10月28日 上午12:58:23 
* @version V1.0   
*/
public class Dm_FuseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4722100797496279702L;

	public Dm_FuseEntity() {
	}

	private String province_code;
	private String id;
	private String bureau_code;
	private String fuse_current_rated;
	private String voltage_current;
	private String ground_power_voltage;
	private String rated_breaking_current ;
	private String contacts_resist_voltage;
	private String fuse_pr_current;
	private String contacts_power_voltage ;
	private String clearance_creepage_distance ;
	private String rated_breaking_capacity;
	private String ground_resist_voltage;
	private String rated_current;
	private String customer_no;
	private String customer_name;
	private String line_no;
	private String tower_no ;
	private String distribution_trans;
	private String line_name;

	public String getProvince_code() {
		return province_code;
	}
	public void setProvince_code(String province_code) {
		this.province_code = province_code;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBureau_code() {
		return bureau_code;
	}
	public void setBureau_code(String bureau_code) {
		this.bureau_code = bureau_code;
	}
	public String getFuse_current_rated() {
		return fuse_current_rated;
	}
	public void setFuse_current_rated(String fuse_current_rated) {
		this.fuse_current_rated = fuse_current_rated;
	}
	public String getVoltage_current() {
		return voltage_current;
	}
	public void setVoltage_current(String voltage_current) {
		this.voltage_current = voltage_current;
	}
	public String getGround_power_voltage() {
		return ground_power_voltage;
	}
	public void setGround_power_voltage(String ground_power_voltage) {
		this.ground_power_voltage = ground_power_voltage;
	}
	public String getRated_breaking_current() {
		return rated_breaking_current;
	}
	public void setRated_breaking_current(String rated_breaking_current) {
		this.rated_breaking_current = rated_breaking_current;
	}
	public String getContacts_resist_voltage() {
		return contacts_resist_voltage;
	}
	public void setContacts_resist_voltage(String contacts_resist_voltage) {
		this.contacts_resist_voltage = contacts_resist_voltage;
	}
	public String getFuse_pr_current() {
		return fuse_pr_current;
	}
	public void setFuse_pr_current(String fuse_pr_current) {
		this.fuse_pr_current = fuse_pr_current;
	}
	public String getContacts_power_voltage() {
		return contacts_power_voltage;
	}
	public void setContacts_power_voltage(String contacts_power_voltage) {
		this.contacts_power_voltage = contacts_power_voltage;
	}
	public String getClearance_creepage_distance() {
		return clearance_creepage_distance;
	}
	public void setClearance_creepage_distance(String clearance_creepage_distance) {
		this.clearance_creepage_distance = clearance_creepage_distance;
	}
	public String getRated_breaking_capacity() {
		return rated_breaking_capacity;
	}
	public void setRated_breaking_capacity(String rated_breaking_capacity) {
		this.rated_breaking_capacity = rated_breaking_capacity;
	}
	public String getGround_resist_voltage() {
		return ground_resist_voltage;
	}
	public void setGround_resist_voltage(String ground_resist_voltage) {
		this.ground_resist_voltage = ground_resist_voltage;
	}
	public String getRated_current() {
		return rated_current;
	}
	public void setRated_current(String rated_current) {
		this.rated_current = rated_current;
	}
	public String getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(String customer_no) {
		this.customer_no = customer_no;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getLine_no() {
		return line_no;
	}
	public void setLine_no(String line_no) {
		this.line_no = line_no;
	}
	public String getTower_no() {
		return tower_no;
	}
	public void setTower_no(String tower_no) {
		this.tower_no = tower_no;
	}
	public String getDistribution_trans() {
		return distribution_trans;
	}
	public void setDistribution_trans(String distribution_trans) {
		this.distribution_trans = distribution_trans;
	}
	public String getLine_name() {
		return line_name;
	}
	public void setLine_name(String line_name) {
		this.line_name = line_name;
	}
	@Override
	public String toString() {
		return "Dm_fuse [province_code=" + province_code + ", id=" + id + ", bureau_code=" + bureau_code + "]";
	}
	
	
}
