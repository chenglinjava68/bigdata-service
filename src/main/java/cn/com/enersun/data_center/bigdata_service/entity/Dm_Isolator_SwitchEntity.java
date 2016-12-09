package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: Dm_Isolator_Switch.java 
* @Package cn.com.enersun.data_center.bigdata_service.entity 
* @Description: TODO(隔离开关技术参数信息) 
* @author enersun_lhb  
* @date 2016年10月28日 上午12:56:07 
* @version V1.0   
*/
public class Dm_Isolator_SwitchEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1137997600413932902L;

	public Dm_Isolator_SwitchEntity() {
	}

	private String province_code;
	private String id;
	private String bureau_code;
	private String customer_name;
	private String line_no;
	private String tower_no ;
	private String distribution_trans;
	private String rated_ther_stable_current;
	private String rated_ther_stable_time ;
	private String rated_move_stable_current;
	private String min_withvol_opposite;
	private String min_withvol_fracture;
	private String insulation_cree_distance ;
	private String line_name;
	private String ther_stable_time;
	private String motor_voltage_operation;
	private String voltage_operation ;
	private String operation_type ;
	private String motor_voltage;
	private String control_voltage;
	private String bil_withstand_vol_fracture;
	private String bil_withstand_vol_ground ;
	private String linkage_knife;
	private String rated_ther_stable_time_current;
	private String power_frequ_uimp;
	private String opearte_strike_uimp ;
	private String opearte_type ;
	private String contact_type ;
	private String bottle_creepage_space_ratio ;
	private String pedestal_aperture_pitch;
	private String thermal_arrest ;
	private String rated_current;
	private String rated_voltage;
	private String power_voltage_rated ;
	private String thunder_strike_voltage_rated;
	private String close_open_time;
	private String peak_current ;
	private String ground_type;
	private String trun_on_space;
	private String contacts_resist_voltage;
	private String ground_resist_voltage;
	private String creepage_space_ratio;
	private String thermal_arrest_time ;
	private String support_insulator_manufac;
	private String insulator_horiz_pull;
	private String weight;
	private String turn_angle;
	private String form;
	private String insulator_material;
	private String knife_type;
	private String customer_no;

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
	public String getRated_ther_stable_current() {
		return rated_ther_stable_current;
	}
	public void setRated_ther_stable_current(String rated_ther_stable_current) {
		this.rated_ther_stable_current = rated_ther_stable_current;
	}
	public String getRated_ther_stable_time() {
		return rated_ther_stable_time;
	}
	public void setRated_ther_stable_time(String rated_ther_stable_time) {
		this.rated_ther_stable_time = rated_ther_stable_time;
	}
	public String getRated_move_stable_current() {
		return rated_move_stable_current;
	}
	public void setRated_move_stable_current(String rated_move_stable_current) {
		this.rated_move_stable_current = rated_move_stable_current;
	}
	public String getMin_withvol_opposite() {
		return min_withvol_opposite;
	}
	public void setMin_withvol_opposite(String min_withvol_opposite) {
		this.min_withvol_opposite = min_withvol_opposite;
	}
	public String getMin_withvol_fracture() {
		return min_withvol_fracture;
	}
	public void setMin_withvol_fracture(String min_withvol_fracture) {
		this.min_withvol_fracture = min_withvol_fracture;
	}
	public String getInsulation_cree_distance() {
		return insulation_cree_distance;
	}
	public void setInsulation_cree_distance(String insulation_cree_distance) {
		this.insulation_cree_distance = insulation_cree_distance;
	}
	public String getLine_name() {
		return line_name;
	}
	public void setLine_name(String line_name) {
		this.line_name = line_name;
	}
	public String getTher_stable_time() {
		return ther_stable_time;
	}
	public void setTher_stable_time(String ther_stable_time) {
		this.ther_stable_time = ther_stable_time;
	}
	public String getMotor_voltage_operation() {
		return motor_voltage_operation;
	}
	public void setMotor_voltage_operation(String motor_voltage_operation) {
		this.motor_voltage_operation = motor_voltage_operation;
	}
	public String getVoltage_operation() {
		return voltage_operation;
	}
	public void setVoltage_operation(String voltage_operation) {
		this.voltage_operation = voltage_operation;
	}
	public String getOperation_type() {
		return operation_type;
	}
	public void setOperation_type(String operation_type) {
		this.operation_type = operation_type;
	}
	public String getMotor_voltage() {
		return motor_voltage;
	}
	public void setMotor_voltage(String motor_voltage) {
		this.motor_voltage = motor_voltage;
	}
	public String getControl_voltage() {
		return control_voltage;
	}
	public void setControl_voltage(String control_voltage) {
		this.control_voltage = control_voltage;
	}
	public String getBil_withstand_vol_fracture() {
		return bil_withstand_vol_fracture;
	}
	public void setBil_withstand_vol_fracture(String bil_withstand_vol_fracture) {
		this.bil_withstand_vol_fracture = bil_withstand_vol_fracture;
	}
	public String getBil_withstand_vol_ground() {
		return bil_withstand_vol_ground;
	}
	public void setBil_withstand_vol_ground(String bil_withstand_vol_ground) {
		this.bil_withstand_vol_ground = bil_withstand_vol_ground;
	}
	public String getLinkage_knife() {
		return linkage_knife;
	}
	public void setLinkage_knife(String linkage_knife) {
		this.linkage_knife = linkage_knife;
	}
	public String getRated_ther_stable_time_current() {
		return rated_ther_stable_time_current;
	}
	public void setRated_ther_stable_time_current(String rated_ther_stable_time_current) {
		this.rated_ther_stable_time_current = rated_ther_stable_time_current;
	}
	public String getPower_frequ_uimp() {
		return power_frequ_uimp;
	}
	public void setPower_frequ_uimp(String power_frequ_uimp) {
		this.power_frequ_uimp = power_frequ_uimp;
	}
	public String getOpearte_strike_uimp() {
		return opearte_strike_uimp;
	}
	public void setOpearte_strike_uimp(String opearte_strike_uimp) {
		this.opearte_strike_uimp = opearte_strike_uimp;
	}
	public String getOpearte_type() {
		return opearte_type;
	}
	public void setOpearte_type(String opearte_type) {
		this.opearte_type = opearte_type;
	}
	public String getContact_type() {
		return contact_type;
	}
	public void setContact_type(String contact_type) {
		this.contact_type = contact_type;
	}
	public String getBottle_creepage_space_ratio() {
		return bottle_creepage_space_ratio;
	}
	public void setBottle_creepage_space_ratio(String bottle_creepage_space_ratio) {
		this.bottle_creepage_space_ratio = bottle_creepage_space_ratio;
	}
	public String getPedestal_aperture_pitch() {
		return pedestal_aperture_pitch;
	}
	public void setPedestal_aperture_pitch(String pedestal_aperture_pitch) {
		this.pedestal_aperture_pitch = pedestal_aperture_pitch;
	}
	public String getThermal_arrest() {
		return thermal_arrest;
	}
	public void setThermal_arrest(String thermal_arrest) {
		this.thermal_arrest = thermal_arrest;
	}
	public String getRated_current() {
		return rated_current;
	}
	public void setRated_current(String rated_current) {
		this.rated_current = rated_current;
	}
	public String getRated_voltage() {
		return rated_voltage;
	}
	public void setRated_voltage(String rated_voltage) {
		this.rated_voltage = rated_voltage;
	}
	public String getPower_voltage_rated() {
		return power_voltage_rated;
	}
	public void setPower_voltage_rated(String power_voltage_rated) {
		this.power_voltage_rated = power_voltage_rated;
	}
	public String getThunder_strike_voltage_rated() {
		return thunder_strike_voltage_rated;
	}
	public void setThunder_strike_voltage_rated(String thunder_strike_voltage_rated) {
		this.thunder_strike_voltage_rated = thunder_strike_voltage_rated;
	}
	public String getClose_open_time() {
		return close_open_time;
	}
	public void setClose_open_time(String close_open_time) {
		this.close_open_time = close_open_time;
	}
	public String getPeak_current() {
		return peak_current;
	}
	public void setPeak_current(String peak_current) {
		this.peak_current = peak_current;
	}
	public String getGround_type() {
		return ground_type;
	}
	public void setGround_type(String ground_type) {
		this.ground_type = ground_type;
	}
	public String getTrun_on_space() {
		return trun_on_space;
	}
	public void setTrun_on_space(String trun_on_space) {
		this.trun_on_space = trun_on_space;
	}
	public String getContacts_resist_voltage() {
		return contacts_resist_voltage;
	}
	public void setContacts_resist_voltage(String contacts_resist_voltage) {
		this.contacts_resist_voltage = contacts_resist_voltage;
	}
	public String getGround_resist_voltage() {
		return ground_resist_voltage;
	}
	public void setGround_resist_voltage(String ground_resist_voltage) {
		this.ground_resist_voltage = ground_resist_voltage;
	}
	public String getCreepage_space_ratio() {
		return creepage_space_ratio;
	}
	public void setCreepage_space_ratio(String creepage_space_ratio) {
		this.creepage_space_ratio = creepage_space_ratio;
	}
	public String getThermal_arrest_time() {
		return thermal_arrest_time;
	}
	public void setThermal_arrest_time(String thermal_arrest_time) {
		this.thermal_arrest_time = thermal_arrest_time;
	}
	public String getSupport_insulator_manufac() {
		return support_insulator_manufac;
	}
	public void setSupport_insulator_manufac(String support_insulator_manufac) {
		this.support_insulator_manufac = support_insulator_manufac;
	}
	public String getInsulator_horiz_pull() {
		return insulator_horiz_pull;
	}
	public void setInsulator_horiz_pull(String insulator_horiz_pull) {
		this.insulator_horiz_pull = insulator_horiz_pull;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getTurn_angle() {
		return turn_angle;
	}
	public void setTurn_angle(String turn_angle) {
		this.turn_angle = turn_angle;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getInsulator_material() {
		return insulator_material;
	}
	public void setInsulator_material(String insulator_material) {
		this.insulator_material = insulator_material;
	}
	public String getKnife_type() {
		return knife_type;
	}
	public void setKnife_type(String knife_type) {
		this.knife_type = knife_type;
	}
	public String getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(String customer_no) {
		this.customer_no = customer_no;
	}
	@Override
	public String toString() {
		return "Dm_Isolator_Switch [province_code=" + province_code + ", id=" + id + ", bureau_code=" + bureau_code
				+ "]";
	}
	
	
	
}
