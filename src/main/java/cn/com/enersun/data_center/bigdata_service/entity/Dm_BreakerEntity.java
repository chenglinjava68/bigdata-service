package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: Dm_Breaker.java 
* @Package cn.com.enersun.data_center.bigdata_service.entity 
* @Description: TODO(断路器技术参数信息) 
* @author enersun_lhb  
* @date 2016年10月28日 上午12:57:19 
* @version V1.0   
*/
public class Dm_BreakerEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7050200051052761369L;

	public Dm_BreakerEntity() {
	}

	private String province_code;
	private String id;
	private String bureau_code;
	private String poles_number ;
	private String gas_pressure_gauge;
	private String bounce;
	private String fracture_number;
	private String rated_current;
	private String rated_withstand_voltage;
	private String inphase_switch_on_no_term;
	private String interphase_sep_brake_no_term;
	private String year_leak_rate_sf6;
	private String frequency_rated;
	private String electrical_life;
	private String machine_life ;
	private String gas_clausura_pressure_sf6;
	private String interphase_switch_on_no_term;
	private String operate_type ;
	private String operate_rated_type;
	private String operate_part_type ;
	private String rated_short_circuit_capacity;
	private String short_time_tolerance_cur ;
	private String contour_dimension ;
	private String weight;
	private String oil_weight;
	private String rated_insulation_voltage ;
	private String power_voltage_rated ;
	private String gas_pressure_rated_sf6 ;
	private String gas_manufacturer_sf6;
	private String weight_sf6;
	private String bottle_creepage_space_ratio ;
	private String short_circuit_time;
	private String rated_short_time_withstand;
	private String rated_short_circuit_breaking;
	private String step_out_drop_out_cur_rated ;
	private String line_chang_dropout_cur_rated;
	private String first_phase_drop_out_ratio;
	private String vacuum_tube_model ;
	private String mech_life_current_rated;
	private String rated_ultimate_short;
	private String peak_rated;
	private String short_out_conn_current_rated;
	private String triphase_shut_open_same_term;
	private String rated_voltage;
	private String gas_altering_press_sf6 ;
	private String overtravel;
	private String stepout_drop_out_time_rated ;
	private String separating_brake_speed_avg;
	private String open_close_voltage;
	private String thermal_arrest_time ;
	private String factory_cumulative_breaking_sh;
	private String factory_breaking_short_circuit;
	private String shortout_open_close_cur_rated ;
	private String switch_on_time ;
	private String contact_switch_on_jump ;
	private String resistance_circurt_main;
	private String auto_shut_no_current_time;
	private String control_voltage;
	private String open_close_cap_rated;
	private String separating_brake_time_innate;
	private String withstand_voltage ;
	private String bil_withstand_vol_rated;
	private String heater_voltage ;
	private String total_travel ;
	private String shutdrop_all_drop_out_times ;
	private String opearte_order_rated ;
	private String arcing_medium;
	private String secondary_loop_voltage ;
	private String closing_time ;
	private String opening_time ;
	private String breaking_time;
	private String interrupting_time ;
	private String install_type ;
	private String fuse_location;
	private String inphase_sep_brake_no_term;
	private String customer_number;
	private String device_model ;
	private String reclosing_operation_sequence;
	private String operating_location;
	private String type_style;
	private String customer_name;
	private String creepage_distance ;
	private String line_number;
	private String distribution_transformer ;
	private String tower ;
	private String three_station;
	private String with_protection;
	private String with_ftu ;
	private String use_environment;
	private String form;
	private String contact_open_space;
	private String oil_buffer_effect_stroke ;
	private String close_speed_avg;

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
	public String getPoles_number() {
		return poles_number;
	}
	public void setPoles_number(String poles_number) {
		this.poles_number = poles_number;
	}
	public String getGas_pressure_gauge() {
		return gas_pressure_gauge;
	}
	public void setGas_pressure_gauge(String gas_pressure_gauge) {
		this.gas_pressure_gauge = gas_pressure_gauge;
	}
	public String getBounce() {
		return bounce;
	}
	public void setBounce(String bounce) {
		this.bounce = bounce;
	}
	public String getFracture_number() {
		return fracture_number;
	}
	public void setFracture_number(String fracture_number) {
		this.fracture_number = fracture_number;
	}
	public String getRated_current() {
		return rated_current;
	}
	public void setRated_current(String rated_current) {
		this.rated_current = rated_current;
	}
	public String getRated_withstand_voltage() {
		return rated_withstand_voltage;
	}
	public void setRated_withstand_voltage(String rated_withstand_voltage) {
		this.rated_withstand_voltage = rated_withstand_voltage;
	}
	public String getInphase_switch_on_no_term() {
		return inphase_switch_on_no_term;
	}
	public void setInphase_switch_on_no_term(String inphase_switch_on_no_term) {
		this.inphase_switch_on_no_term = inphase_switch_on_no_term;
	}
	public String getInterphase_sep_brake_no_term() {
		return interphase_sep_brake_no_term;
	}
	public void setInterphase_sep_brake_no_term(String interphase_sep_brake_no_term) {
		this.interphase_sep_brake_no_term = interphase_sep_brake_no_term;
	}
	public String getYear_leak_rate_sf6() {
		return year_leak_rate_sf6;
	}
	public void setYear_leak_rate_sf6(String year_leak_rate_sf6) {
		this.year_leak_rate_sf6 = year_leak_rate_sf6;
	}
	public String getFrequency_rated() {
		return frequency_rated;
	}
	public void setFrequency_rated(String frequency_rated) {
		this.frequency_rated = frequency_rated;
	}
	public String getElectrical_life() {
		return electrical_life;
	}
	public void setElectrical_life(String electrical_life) {
		this.electrical_life = electrical_life;
	}
	public String getMachine_life() {
		return machine_life;
	}
	public void setMachine_life(String machine_life) {
		this.machine_life = machine_life;
	}
	public String getGas_clausura_pressure_sf6() {
		return gas_clausura_pressure_sf6;
	}
	public void setGas_clausura_pressure_sf6(String gas_clausura_pressure_sf6) {
		this.gas_clausura_pressure_sf6 = gas_clausura_pressure_sf6;
	}
	public String getInterphase_switch_on_no_term() {
		return interphase_switch_on_no_term;
	}
	public void setInterphase_switch_on_no_term(String interphase_switch_on_no_term) {
		this.interphase_switch_on_no_term = interphase_switch_on_no_term;
	}
	public String getOperate_type() {
		return operate_type;
	}
	public void setOperate_type(String operate_type) {
		this.operate_type = operate_type;
	}
	public String getOperate_rated_type() {
		return operate_rated_type;
	}
	public void setOperate_rated_type(String operate_rated_type) {
		this.operate_rated_type = operate_rated_type;
	}
	public String getOperate_part_type() {
		return operate_part_type;
	}
	public void setOperate_part_type(String operate_part_type) {
		this.operate_part_type = operate_part_type;
	}
	public String getRated_short_circuit_capacity() {
		return rated_short_circuit_capacity;
	}
	public void setRated_short_circuit_capacity(String rated_short_circuit_capacity) {
		this.rated_short_circuit_capacity = rated_short_circuit_capacity;
	}
	public String getShort_time_tolerance_cur() {
		return short_time_tolerance_cur;
	}
	public void setShort_time_tolerance_cur(String short_time_tolerance_cur) {
		this.short_time_tolerance_cur = short_time_tolerance_cur;
	}
	public String getContour_dimension() {
		return contour_dimension;
	}
	public void setContour_dimension(String contour_dimension) {
		this.contour_dimension = contour_dimension;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getOil_weight() {
		return oil_weight;
	}
	public void setOil_weight(String oil_weight) {
		this.oil_weight = oil_weight;
	}
	public String getRated_insulation_voltage() {
		return rated_insulation_voltage;
	}
	public void setRated_insulation_voltage(String rated_insulation_voltage) {
		this.rated_insulation_voltage = rated_insulation_voltage;
	}
	public String getPower_voltage_rated() {
		return power_voltage_rated;
	}
	public void setPower_voltage_rated(String power_voltage_rated) {
		this.power_voltage_rated = power_voltage_rated;
	}
	public String getGas_pressure_rated_sf6() {
		return gas_pressure_rated_sf6;
	}
	public void setGas_pressure_rated_sf6(String gas_pressure_rated_sf6) {
		this.gas_pressure_rated_sf6 = gas_pressure_rated_sf6;
	}
	public String getGas_manufacturer_sf6() {
		return gas_manufacturer_sf6;
	}
	public void setGas_manufacturer_sf6(String gas_manufacturer_sf6) {
		this.gas_manufacturer_sf6 = gas_manufacturer_sf6;
	}
	public String getWeight_sf6() {
		return weight_sf6;
	}
	public void setWeight_sf6(String weight_sf6) {
		this.weight_sf6 = weight_sf6;
	}
	public String getBottle_creepage_space_ratio() {
		return bottle_creepage_space_ratio;
	}
	public void setBottle_creepage_space_ratio(String bottle_creepage_space_ratio) {
		this.bottle_creepage_space_ratio = bottle_creepage_space_ratio;
	}
	public String getShort_circuit_time() {
		return short_circuit_time;
	}
	public void setShort_circuit_time(String short_circuit_time) {
		this.short_circuit_time = short_circuit_time;
	}
	public String getRated_short_time_withstand() {
		return rated_short_time_withstand;
	}
	public void setRated_short_time_withstand(String rated_short_time_withstand) {
		this.rated_short_time_withstand = rated_short_time_withstand;
	}
	public String getRated_short_circuit_breaking() {
		return rated_short_circuit_breaking;
	}
	public void setRated_short_circuit_breaking(String rated_short_circuit_breaking) {
		this.rated_short_circuit_breaking = rated_short_circuit_breaking;
	}
	public String getStep_out_drop_out_cur_rated() {
		return step_out_drop_out_cur_rated;
	}
	public void setStep_out_drop_out_cur_rated(String step_out_drop_out_cur_rated) {
		this.step_out_drop_out_cur_rated = step_out_drop_out_cur_rated;
	}
	public String getLine_chang_dropout_cur_rated() {
		return line_chang_dropout_cur_rated;
	}
	public void setLine_chang_dropout_cur_rated(String line_chang_dropout_cur_rated) {
		this.line_chang_dropout_cur_rated = line_chang_dropout_cur_rated;
	}
	public String getFirst_phase_drop_out_ratio() {
		return first_phase_drop_out_ratio;
	}
	public void setFirst_phase_drop_out_ratio(String first_phase_drop_out_ratio) {
		this.first_phase_drop_out_ratio = first_phase_drop_out_ratio;
	}
	public String getVacuum_tube_model() {
		return vacuum_tube_model;
	}
	public void setVacuum_tube_model(String vacuum_tube_model) {
		this.vacuum_tube_model = vacuum_tube_model;
	}
	public String getMech_life_current_rated() {
		return mech_life_current_rated;
	}
	public void setMech_life_current_rated(String mech_life_current_rated) {
		this.mech_life_current_rated = mech_life_current_rated;
	}
	public String getRated_ultimate_short() {
		return rated_ultimate_short;
	}
	public void setRated_ultimate_short(String rated_ultimate_short) {
		this.rated_ultimate_short = rated_ultimate_short;
	}
	public String getPeak_rated() {
		return peak_rated;
	}
	public void setPeak_rated(String peak_rated) {
		this.peak_rated = peak_rated;
	}
	public String getShort_out_conn_current_rated() {
		return short_out_conn_current_rated;
	}
	public void setShort_out_conn_current_rated(String short_out_conn_current_rated) {
		this.short_out_conn_current_rated = short_out_conn_current_rated;
	}
	public String getTriphase_shut_open_same_term() {
		return triphase_shut_open_same_term;
	}
	public void setTriphase_shut_open_same_term(String triphase_shut_open_same_term) {
		this.triphase_shut_open_same_term = triphase_shut_open_same_term;
	}
	public String getRated_voltage() {
		return rated_voltage;
	}
	public void setRated_voltage(String rated_voltage) {
		this.rated_voltage = rated_voltage;
	}
	public String getGas_altering_press_sf6() {
		return gas_altering_press_sf6;
	}
	public void setGas_altering_press_sf6(String gas_altering_press_sf6) {
		this.gas_altering_press_sf6 = gas_altering_press_sf6;
	}
	public String getOvertravel() {
		return overtravel;
	}
	public void setOvertravel(String overtravel) {
		this.overtravel = overtravel;
	}
	public String getStepout_drop_out_time_rated() {
		return stepout_drop_out_time_rated;
	}
	public void setStepout_drop_out_time_rated(String stepout_drop_out_time_rated) {
		this.stepout_drop_out_time_rated = stepout_drop_out_time_rated;
	}
	public String getSeparating_brake_speed_avg() {
		return separating_brake_speed_avg;
	}
	public void setSeparating_brake_speed_avg(String separating_brake_speed_avg) {
		this.separating_brake_speed_avg = separating_brake_speed_avg;
	}
	public String getOpen_close_voltage() {
		return open_close_voltage;
	}
	public void setOpen_close_voltage(String open_close_voltage) {
		this.open_close_voltage = open_close_voltage;
	}
	public String getThermal_arrest_time() {
		return thermal_arrest_time;
	}
	public void setThermal_arrest_time(String thermal_arrest_time) {
		this.thermal_arrest_time = thermal_arrest_time;
	}
	public String getFactory_cumulative_breaking_sh() {
		return factory_cumulative_breaking_sh;
	}
	public void setFactory_cumulative_breaking_sh(String factory_cumulative_breaking_sh) {
		this.factory_cumulative_breaking_sh = factory_cumulative_breaking_sh;
	}
	public String getFactory_breaking_short_circuit() {
		return factory_breaking_short_circuit;
	}
	public void setFactory_breaking_short_circuit(String factory_breaking_short_circuit) {
		this.factory_breaking_short_circuit = factory_breaking_short_circuit;
	}
	public String getShortout_open_close_cur_rated() {
		return shortout_open_close_cur_rated;
	}
	public void setShortout_open_close_cur_rated(String shortout_open_close_cur_rated) {
		this.shortout_open_close_cur_rated = shortout_open_close_cur_rated;
	}
	public String getSwitch_on_time() {
		return switch_on_time;
	}
	public void setSwitch_on_time(String switch_on_time) {
		this.switch_on_time = switch_on_time;
	}
	public String getContact_switch_on_jump() {
		return contact_switch_on_jump;
	}
	public void setContact_switch_on_jump(String contact_switch_on_jump) {
		this.contact_switch_on_jump = contact_switch_on_jump;
	}
	public String getResistance_circurt_main() {
		return resistance_circurt_main;
	}
	public void setResistance_circurt_main(String resistance_circurt_main) {
		this.resistance_circurt_main = resistance_circurt_main;
	}
	public String getAuto_shut_no_current_time() {
		return auto_shut_no_current_time;
	}
	public void setAuto_shut_no_current_time(String auto_shut_no_current_time) {
		this.auto_shut_no_current_time = auto_shut_no_current_time;
	}
	public String getControl_voltage() {
		return control_voltage;
	}
	public void setControl_voltage(String control_voltage) {
		this.control_voltage = control_voltage;
	}
	public String getOpen_close_cap_rated() {
		return open_close_cap_rated;
	}
	public void setOpen_close_cap_rated(String open_close_cap_rated) {
		this.open_close_cap_rated = open_close_cap_rated;
	}
	public String getSeparating_brake_time_innate() {
		return separating_brake_time_innate;
	}
	public void setSeparating_brake_time_innate(String separating_brake_time_innate) {
		this.separating_brake_time_innate = separating_brake_time_innate;
	}
	public String getWithstand_voltage() {
		return withstand_voltage;
	}
	public void setWithstand_voltage(String withstand_voltage) {
		this.withstand_voltage = withstand_voltage;
	}
	public String getBil_withstand_vol_rated() {
		return bil_withstand_vol_rated;
	}
	public void setBil_withstand_vol_rated(String bil_withstand_vol_rated) {
		this.bil_withstand_vol_rated = bil_withstand_vol_rated;
	}
	public String getHeater_voltage() {
		return heater_voltage;
	}
	public void setHeater_voltage(String heater_voltage) {
		this.heater_voltage = heater_voltage;
	}
	public String getTotal_travel() {
		return total_travel;
	}
	public void setTotal_travel(String total_travel) {
		this.total_travel = total_travel;
	}
	public String getShutdrop_all_drop_out_times() {
		return shutdrop_all_drop_out_times;
	}
	public void setShutdrop_all_drop_out_times(String shutdrop_all_drop_out_times) {
		this.shutdrop_all_drop_out_times = shutdrop_all_drop_out_times;
	}
	public String getOpearte_order_rated() {
		return opearte_order_rated;
	}
	public void setOpearte_order_rated(String opearte_order_rated) {
		this.opearte_order_rated = opearte_order_rated;
	}
	public String getArcing_medium() {
		return arcing_medium;
	}
	public void setArcing_medium(String arcing_medium) {
		this.arcing_medium = arcing_medium;
	}
	public String getSecondary_loop_voltage() {
		return secondary_loop_voltage;
	}
	public void setSecondary_loop_voltage(String secondary_loop_voltage) {
		this.secondary_loop_voltage = secondary_loop_voltage;
	}
	public String getClosing_time() {
		return closing_time;
	}
	public void setClosing_time(String closing_time) {
		this.closing_time = closing_time;
	}
	public String getOpening_time() {
		return opening_time;
	}
	public void setOpening_time(String opening_time) {
		this.opening_time = opening_time;
	}
	public String getBreaking_time() {
		return breaking_time;
	}
	public void setBreaking_time(String breaking_time) {
		this.breaking_time = breaking_time;
	}
	public String getInterrupting_time() {
		return interrupting_time;
	}
	public void setInterrupting_time(String interrupting_time) {
		this.interrupting_time = interrupting_time;
	}
	public String getInstall_type() {
		return install_type;
	}
	public void setInstall_type(String install_type) {
		this.install_type = install_type;
	}
	public String getFuse_location() {
		return fuse_location;
	}
	public void setFuse_location(String fuse_location) {
		this.fuse_location = fuse_location;
	}
	public String getInphase_sep_brake_no_term() {
		return inphase_sep_brake_no_term;
	}
	public void setInphase_sep_brake_no_term(String inphase_sep_brake_no_term) {
		this.inphase_sep_brake_no_term = inphase_sep_brake_no_term;
	}
	public String getCustomer_number() {
		return customer_number;
	}
	public void setCustomer_number(String customer_number) {
		this.customer_number = customer_number;
	}
	public String getDevice_model() {
		return device_model;
	}
	public void setDevice_model(String device_model) {
		this.device_model = device_model;
	}
	public String getReclosing_operation_sequence() {
		return reclosing_operation_sequence;
	}
	public void setReclosing_operation_sequence(String reclosing_operation_sequence) {
		this.reclosing_operation_sequence = reclosing_operation_sequence;
	}
	public String getOperating_location() {
		return operating_location;
	}
	public void setOperating_location(String operating_location) {
		this.operating_location = operating_location;
	}
	public String getType_style() {
		return type_style;
	}
	public void setType_style(String type_style) {
		this.type_style = type_style;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCreepage_distance() {
		return creepage_distance;
	}
	public void setCreepage_distance(String creepage_distance) {
		this.creepage_distance = creepage_distance;
	}
	public String getLine_number() {
		return line_number;
	}
	public void setLine_number(String line_number) {
		this.line_number = line_number;
	}
	public String getDistribution_transformer() {
		return distribution_transformer;
	}
	public void setDistribution_transformer(String distribution_transformer) {
		this.distribution_transformer = distribution_transformer;
	}
	public String getTower() {
		return tower;
	}
	public void setTower(String tower) {
		this.tower = tower;
	}
	public String getThree_station() {
		return three_station;
	}
	public void setThree_station(String three_station) {
		this.three_station = three_station;
	}
	public String getWith_protection() {
		return with_protection;
	}
	public void setWith_protection(String with_protection) {
		this.with_protection = with_protection;
	}
	public String getWith_ftu() {
		return with_ftu;
	}
	public void setWith_ftu(String with_ftu) {
		this.with_ftu = with_ftu;
	}
	public String getUse_environment() {
		return use_environment;
	}
	public void setUse_environment(String use_environment) {
		this.use_environment = use_environment;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getContact_open_space() {
		return contact_open_space;
	}
	public void setContact_open_space(String contact_open_space) {
		this.contact_open_space = contact_open_space;
	}
	public String getOil_buffer_effect_stroke() {
		return oil_buffer_effect_stroke;
	}
	public void setOil_buffer_effect_stroke(String oil_buffer_effect_stroke) {
		this.oil_buffer_effect_stroke = oil_buffer_effect_stroke;
	}
	public String getClose_speed_avg() {
		return close_speed_avg;
	}
	public void setClose_speed_avg(String close_speed_avg) {
		this.close_speed_avg = close_speed_avg;
	}
	@Override
	public String toString() {
		return "Dm_Breaker [province_code=" + province_code + ", id=" + id + ", bureau_code=" + bureau_code + "]";
	}
	
	
}
