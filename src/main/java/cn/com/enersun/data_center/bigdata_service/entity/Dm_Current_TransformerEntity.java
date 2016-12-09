package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: Dm_Current_Transformer.java 
* @Package cn.com.enersun.data_center.bigdata_service.entity 
* @Description: TODO(电流互感器技术参数信息) 
* @author enersun_lhb  
* @date 2016年10月28日 上午12:52:36 
* @version V1.0   
*/
public class Dm_Current_TransformerEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2102795956628378967L;

	public Dm_Current_TransformerEntity() {
	}

	private String province_code;
	private String id;
	private String bureau_code;
	private String standard_mark;
	private String collector_count;
	private String measured_accurately ;
	private String each_capacitor_capacitance;
	private String symshortoutcur_acclimit;
	private String rated_current;
	private String rated_capacity ;
	private String rated_vol_factor_standvalue ;
	private String dyna_stability_current_rated;
	private String short_thermal_cur_rated;
	private String sym_shortout_cur_ratio ;
	private String insulation_level_rated ;
	private String first_rated_voltage ;
	private String first_vol_statedvalue_rated ;
	private String second_rated_voltage;
	private String tie_line_group ;
	private String insulation_level;
	private String clearance_creepage_distance ;
	private String frequency_range;
	private String gas_weight;
	private String design_serial_number;
	private String clearance_cpage_dis_filthy;
	private String form;
	private String primary_cir_time_constant;
	private String utility_system ;
	private String oil_weight;
	private String totle_weight ;
	private String pressure_rated_sf6;
	private String alerting_pressure ;
	private String nicety_level ;
	private String thermal_arrest_current ;
	private String accuracy ;
	private String voltage_ratio;
	private String sf6_alarm_pressure;
	private String rated_voltage;
	private String customer_no;
	private String customer_name;
	private String measurement_point_no;
	private String external_creepage_distance;
	private String is_bayonet_ct;
	private String weight;
	private String rated_peak_withstand_current;
	private String two_winding_number;
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
	public String getStandard_mark() {
		return standard_mark;
	}
	public void setStandard_mark(String standard_mark) {
		this.standard_mark = standard_mark;
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
	public String getEach_capacitor_capacitance() {
		return each_capacitor_capacitance;
	}
	public void setEach_capacitor_capacitance(String each_capacitor_capacitance) {
		this.each_capacitor_capacitance = each_capacitor_capacitance;
	}
	public String getSymshortoutcur_acclimit() {
		return symshortoutcur_acclimit;
	}
	public void setSymshortoutcur_acclimit(String symshortoutcur_acclimit) {
		this.symshortoutcur_acclimit = symshortoutcur_acclimit;
	}
	public String getRated_current() {
		return rated_current;
	}
	public void setRated_current(String rated_current) {
		this.rated_current = rated_current;
	}
	public String getRated_capacity() {
		return rated_capacity;
	}
	public void setRated_capacity(String rated_capacity) {
		this.rated_capacity = rated_capacity;
	}
	public String getRated_vol_factor_standvalue() {
		return rated_vol_factor_standvalue;
	}
	public void setRated_vol_factor_standvalue(String rated_vol_factor_standvalue) {
		this.rated_vol_factor_standvalue = rated_vol_factor_standvalue;
	}
	public String getDyna_stability_current_rated() {
		return dyna_stability_current_rated;
	}
	public void setDyna_stability_current_rated(String dyna_stability_current_rated) {
		this.dyna_stability_current_rated = dyna_stability_current_rated;
	}
	public String getShort_thermal_cur_rated() {
		return short_thermal_cur_rated;
	}
	public void setShort_thermal_cur_rated(String short_thermal_cur_rated) {
		this.short_thermal_cur_rated = short_thermal_cur_rated;
	}
	public String getSym_shortout_cur_ratio() {
		return sym_shortout_cur_ratio;
	}
	public void setSym_shortout_cur_ratio(String sym_shortout_cur_ratio) {
		this.sym_shortout_cur_ratio = sym_shortout_cur_ratio;
	}
	public String getInsulation_level_rated() {
		return insulation_level_rated;
	}
	public void setInsulation_level_rated(String insulation_level_rated) {
		this.insulation_level_rated = insulation_level_rated;
	}
	public String getFirst_rated_voltage() {
		return first_rated_voltage;
	}
	public void setFirst_rated_voltage(String first_rated_voltage) {
		this.first_rated_voltage = first_rated_voltage;
	}
	public String getFirst_vol_statedvalue_rated() {
		return first_vol_statedvalue_rated;
	}
	public void setFirst_vol_statedvalue_rated(String first_vol_statedvalue_rated) {
		this.first_vol_statedvalue_rated = first_vol_statedvalue_rated;
	}
	public String getSecond_rated_voltage() {
		return second_rated_voltage;
	}
	public void setSecond_rated_voltage(String second_rated_voltage) {
		this.second_rated_voltage = second_rated_voltage;
	}
	public String getTie_line_group() {
		return tie_line_group;
	}
	public void setTie_line_group(String tie_line_group) {
		this.tie_line_group = tie_line_group;
	}
	public String getInsulation_level() {
		return insulation_level;
	}
	public void setInsulation_level(String insulation_level) {
		this.insulation_level = insulation_level;
	}
	public String getClearance_creepage_distance() {
		return clearance_creepage_distance;
	}
	public void setClearance_creepage_distance(String clearance_creepage_distance) {
		this.clearance_creepage_distance = clearance_creepage_distance;
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
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
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
	public String getOil_weight() {
		return oil_weight;
	}
	public void setOil_weight(String oil_weight) {
		this.oil_weight = oil_weight;
	}
	public String getTotle_weight() {
		return totle_weight;
	}
	public void setTotle_weight(String totle_weight) {
		this.totle_weight = totle_weight;
	}
	public String getPressure_rated_sf6() {
		return pressure_rated_sf6;
	}
	public void setPressure_rated_sf6(String pressure_rated_sf6) {
		this.pressure_rated_sf6 = pressure_rated_sf6;
	}
	public String getAlerting_pressure() {
		return alerting_pressure;
	}
	public void setAlerting_pressure(String alerting_pressure) {
		this.alerting_pressure = alerting_pressure;
	}
	public String getNicety_level() {
		return nicety_level;
	}
	public void setNicety_level(String nicety_level) {
		this.nicety_level = nicety_level;
	}
	public String getThermal_arrest_current() {
		return thermal_arrest_current;
	}
	public void setThermal_arrest_current(String thermal_arrest_current) {
		this.thermal_arrest_current = thermal_arrest_current;
	}
	public String getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}
	public String getVoltage_ratio() {
		return voltage_ratio;
	}
	public void setVoltage_ratio(String voltage_ratio) {
		this.voltage_ratio = voltage_ratio;
	}
	public String getSf6_alarm_pressure() {
		return sf6_alarm_pressure;
	}
	public void setSf6_alarm_pressure(String sf6_alarm_pressure) {
		this.sf6_alarm_pressure = sf6_alarm_pressure;
	}
	public String getRated_voltage() {
		return rated_voltage;
	}
	public void setRated_voltage(String rated_voltage) {
		this.rated_voltage = rated_voltage;
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
	public String getMeasurement_point_no() {
		return measurement_point_no;
	}
	public void setMeasurement_point_no(String measurement_point_no) {
		this.measurement_point_no = measurement_point_no;
	}
	public String getExternal_creepage_distance() {
		return external_creepage_distance;
	}
	public void setExternal_creepage_distance(String external_creepage_distance) {
		this.external_creepage_distance = external_creepage_distance;
	}
	public String getIs_bayonet_ct() {
		return is_bayonet_ct;
	}
	public void setIs_bayonet_ct(String is_bayonet_ct) {
		this.is_bayonet_ct = is_bayonet_ct;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getRated_peak_withstand_current() {
		return rated_peak_withstand_current;
	}
	public void setRated_peak_withstand_current(String rated_peak_withstand_current) {
		this.rated_peak_withstand_current = rated_peak_withstand_current;
	}
	public String getTwo_winding_number() {
		return two_winding_number;
	}
	public void setTwo_winding_number(String two_winding_number) {
		this.two_winding_number = two_winding_number;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Dm_Current_Transformer [province_code=" + province_code + ", id=" + id + ", bureau_code=" + bureau_code
				+ "]";
	}
	
	
	
}
