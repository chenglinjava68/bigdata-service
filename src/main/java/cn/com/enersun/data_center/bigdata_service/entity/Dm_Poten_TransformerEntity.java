package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: Dm_Poten_Transformer.java 
* @Package cn.com.enersun.data_center.bigdata_service.entity 
* @Description: TODO(电压互感器的技术参数信息) 
* @author enersun_lhb  
* @date 2016年10月28日 上午12:54:06 
* @version V1.0   
*/
public class Dm_Poten_TransformerEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8946837763872591870L;

	public Dm_Poten_TransformerEntity() {
	}

	private String province_code;
	private String id;
	private String bureau_code;
	private String capacitance;
	private String rated_current_ratio ;
	private String rated_voltage;
	private String dyna_stability_current_rated;
	private String two_winding;
	private String first_current_ratio ;
	private String second_capacity_rated;
	private String insulation_level;
	private String form;
	private String accuracy_class ;
	private String totle_weight ;
	private String rated_air_pressure_sf6 ;
	private String protected_accuracy_rating;
	private String alerting_pressure ;
	private String change_current_ratio;
	private String standard_code;
	private String collector_count;
	private String measured_accurately ;
	private String current_ratio;
	private String dynamic_stability_current;
	private String short_time_current_rated ;
	private String symshortoutcur_acclimit;
	private String sym_shortout_cur_ratio ;
	private String rated_work_voltage;
	private String rated_insulation_level ;
	private String serial_thermocurrent_rated;
	private String rated_first_cur_statedvalue ;
	private String rated_fir_insula_level ;
	private String creepage_space_ratio;
	private String expander_model ;
	private String frequency_range;
	private String gas_weight;
	private String thermal_arrest_current ;
	private String thermal_arrest_time ;
	private String design_serial_number;
	private String clearance_cpage_dis_filthy;
	private String primary_cir_time_constant;
	private String utility_system ;
	private String oil_mark ;
	private String oil_weight;
	private String nicety_level ;
	private String accuracy ;
	private String ratio ;
	private String rated_st_withstand_current;
	private String short_thermal_cur_rated;
	private String two_winding_number;
	private String metering_no;
	private String insulating_medium ;
	private String customer_name;
	private String customer_no;
	private String capacity ;

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
	public String getCapacitance() {
		return capacitance;
	}
	public void setCapacitance(String capacitance) {
		this.capacitance = capacitance;
	}
	public String getRated_current_ratio() {
		return rated_current_ratio;
	}
	public void setRated_current_ratio(String rated_current_ratio) {
		this.rated_current_ratio = rated_current_ratio;
	}
	public String getRated_voltage() {
		return rated_voltage;
	}
	public void setRated_voltage(String rated_voltage) {
		this.rated_voltage = rated_voltage;
	}
	public String getDyna_stability_current_rated() {
		return dyna_stability_current_rated;
	}
	public void setDyna_stability_current_rated(String dyna_stability_current_rated) {
		this.dyna_stability_current_rated = dyna_stability_current_rated;
	}
	public String getTwo_winding() {
		return two_winding;
	}
	public void setTwo_winding(String two_winding) {
		this.two_winding = two_winding;
	}
	public String getFirst_current_ratio() {
		return first_current_ratio;
	}
	public void setFirst_current_ratio(String first_current_ratio) {
		this.first_current_ratio = first_current_ratio;
	}
	public String getSecond_capacity_rated() {
		return second_capacity_rated;
	}
	public void setSecond_capacity_rated(String second_capacity_rated) {
		this.second_capacity_rated = second_capacity_rated;
	}
	public String getInsulation_level() {
		return insulation_level;
	}
	public void setInsulation_level(String insulation_level) {
		this.insulation_level = insulation_level;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getAccuracy_class() {
		return accuracy_class;
	}
	public void setAccuracy_class(String accuracy_class) {
		this.accuracy_class = accuracy_class;
	}
	public String getTotle_weight() {
		return totle_weight;
	}
	public void setTotle_weight(String totle_weight) {
		this.totle_weight = totle_weight;
	}
	public String getRated_air_pressure_sf6() {
		return rated_air_pressure_sf6;
	}
	public void setRated_air_pressure_sf6(String rated_air_pressure_sf6) {
		this.rated_air_pressure_sf6 = rated_air_pressure_sf6;
	}
	public String getProtected_accuracy_rating() {
		return protected_accuracy_rating;
	}
	public void setProtected_accuracy_rating(String protected_accuracy_rating) {
		this.protected_accuracy_rating = protected_accuracy_rating;
	}
	public String getAlerting_pressure() {
		return alerting_pressure;
	}
	public void setAlerting_pressure(String alerting_pressure) {
		this.alerting_pressure = alerting_pressure;
	}
	public String getChange_current_ratio() {
		return change_current_ratio;
	}
	public void setChange_current_ratio(String change_current_ratio) {
		this.change_current_ratio = change_current_ratio;
	}
	public String getStandard_code() {
		return standard_code;
	}
	public void setStandard_code(String standard_code) {
		this.standard_code = standard_code;
	}
	public String getCollector_count() {
		return collector_count;
	}
	public void setCollector_count(String collector_count) {
		this.collector_count = collector_count;
	}
	public String getMeasured_accurately() {
		return measured_accurately;
	}
	public void setMeasured_accurately(String measured_accurately) {
		this.measured_accurately = measured_accurately;
	}
	public String getCurrent_ratio() {
		return current_ratio;
	}
	public void setCurrent_ratio(String current_ratio) {
		this.current_ratio = current_ratio;
	}
	public String getDynamic_stability_current() {
		return dynamic_stability_current;
	}
	public void setDynamic_stability_current(String dynamic_stability_current) {
		this.dynamic_stability_current = dynamic_stability_current;
	}
	public String getShort_time_current_rated() {
		return short_time_current_rated;
	}
	public void setShort_time_current_rated(String short_time_current_rated) {
		this.short_time_current_rated = short_time_current_rated;
	}
	public String getSymshortoutcur_acclimit() {
		return symshortoutcur_acclimit;
	}
	public void setSymshortoutcur_acclimit(String symshortoutcur_acclimit) {
		this.symshortoutcur_acclimit = symshortoutcur_acclimit;
	}
	public String getSym_shortout_cur_ratio() {
		return sym_shortout_cur_ratio;
	}
	public void setSym_shortout_cur_ratio(String sym_shortout_cur_ratio) {
		this.sym_shortout_cur_ratio = sym_shortout_cur_ratio;
	}
	public String getRated_work_voltage() {
		return rated_work_voltage;
	}
	public void setRated_work_voltage(String rated_work_voltage) {
		this.rated_work_voltage = rated_work_voltage;
	}
	public String getRated_insulation_level() {
		return rated_insulation_level;
	}
	public void setRated_insulation_level(String rated_insulation_level) {
		this.rated_insulation_level = rated_insulation_level;
	}
	public String getSerial_thermocurrent_rated() {
		return serial_thermocurrent_rated;
	}
	public void setSerial_thermocurrent_rated(String serial_thermocurrent_rated) {
		this.serial_thermocurrent_rated = serial_thermocurrent_rated;
	}
	public String getRated_first_cur_statedvalue() {
		return rated_first_cur_statedvalue;
	}
	public void setRated_first_cur_statedvalue(String rated_first_cur_statedvalue) {
		this.rated_first_cur_statedvalue = rated_first_cur_statedvalue;
	}
	public String getRated_fir_insula_level() {
		return rated_fir_insula_level;
	}
	public void setRated_fir_insula_level(String rated_fir_insula_level) {
		this.rated_fir_insula_level = rated_fir_insula_level;
	}
	public String getCreepage_space_ratio() {
		return creepage_space_ratio;
	}
	public void setCreepage_space_ratio(String creepage_space_ratio) {
		this.creepage_space_ratio = creepage_space_ratio;
	}
	public String getExpander_model() {
		return expander_model;
	}
	public void setExpander_model(String expander_model) {
		this.expander_model = expander_model;
	}
	public String getFrequency_range() {
		return frequency_range;
	}
	public void setFrequency_range(String frequency_range) {
		this.frequency_range = frequency_range;
	}
	public String getGas_weight() {
		return gas_weight;
	}
	public void setGas_weight(String gas_weight) {
		this.gas_weight = gas_weight;
	}
	public String getThermal_arrest_current() {
		return thermal_arrest_current;
	}
	public void setThermal_arrest_current(String thermal_arrest_current) {
		this.thermal_arrest_current = thermal_arrest_current;
	}
	public String getThermal_arrest_time() {
		return thermal_arrest_time;
	}
	public void setThermal_arrest_time(String thermal_arrest_time) {
		this.thermal_arrest_time = thermal_arrest_time;
	}
	public String getDesign_serial_number() {
		return design_serial_number;
	}
	public void setDesign_serial_number(String design_serial_number) {
		this.design_serial_number = design_serial_number;
	}
	public String getClearance_cpage_dis_filthy() {
		return clearance_cpage_dis_filthy;
	}
	public void setClearance_cpage_dis_filthy(String clearance_cpage_dis_filthy) {
		this.clearance_cpage_dis_filthy = clearance_cpage_dis_filthy;
	}
	public String getPrimary_cir_time_constant() {
		return primary_cir_time_constant;
	}
	public void setPrimary_cir_time_constant(String primary_cir_time_constant) {
		this.primary_cir_time_constant = primary_cir_time_constant;
	}
	public String getUtility_system() {
		return utility_system;
	}
	public void setUtility_system(String utility_system) {
		this.utility_system = utility_system;
	}
	public String getOil_mark() {
		return oil_mark;
	}
	public void setOil_mark(String oil_mark) {
		this.oil_mark = oil_mark;
	}
	public String getOil_weight() {
		return oil_weight;
	}
	public void setOil_weight(String oil_weight) {
		this.oil_weight = oil_weight;
	}
	public String getNicety_level() {
		return nicety_level;
	}
	public void setNicety_level(String nicety_level) {
		this.nicety_level = nicety_level;
	}
	public String getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}
	public String getRatio() {
		return ratio;
	}
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}
	public String getRated_st_withstand_current() {
		return rated_st_withstand_current;
	}
	public void setRated_st_withstand_current(String rated_st_withstand_current) {
		this.rated_st_withstand_current = rated_st_withstand_current;
	}
	public String getShort_thermal_cur_rated() {
		return short_thermal_cur_rated;
	}
	public void setShort_thermal_cur_rated(String short_thermal_cur_rated) {
		this.short_thermal_cur_rated = short_thermal_cur_rated;
	}
	public String getTwo_winding_number() {
		return two_winding_number;
	}
	public void setTwo_winding_number(String two_winding_number) {
		this.two_winding_number = two_winding_number;
	}
	public String getMetering_no() {
		return metering_no;
	}
	public void setMetering_no(String metering_no) {
		this.metering_no = metering_no;
	}
	public String getInsulating_medium() {
		return insulating_medium;
	}
	public void setInsulating_medium(String insulating_medium) {
		this.insulating_medium = insulating_medium;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(String customer_no) {
		this.customer_no = customer_no;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Dm_Poten_Transformer [province_code=" + province_code + ", id=" + id + ", bureau_code=" + bureau_code
				+ "]";
	}
	
	
}
