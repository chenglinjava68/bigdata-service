package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: Line.java 
* @Package cn.com.enersun.data_center.bigdata_service.entity 
* @Description: TODO(输电线路台账信息) 
* @author enersun_lhb  
* @date 2016年10月28日 上午12:40:00 
* @version V1.0   
*/
public class LineEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2123702063847757411L;
	private  String  province_code;
	private  String  id;
	private  String  bureau_code;
	private  String  fl_name;
	private  String  base_voltage_id;
	private  String  line_department;
	private  String  phase_sequence;
	private  String  ground_clearance;
	private  String  conn_code_load;
	private  String  phases;
	private  String  split_type;
	private  String  issecondary;
	private  String  is_branch;
	private  String  rated_amps;
	private  String  line_alias;
	private  String  rating_capacity;
	private  String  rating_electricity;
	private  String  economy_capacity;
	private  String  overhead_line_length;
	private  String  enter_substation;
	private  String  out_substation;
	private  String  designed_company;
	private  String  builder_company;
	private  String  line_type;
	private  String  cable_line_length;
	private  String  line_function;
	private  String  enter_substation_id;
	private  String  out_substation_id;
	private  String  out_substation_type;
	private  String  pole_count;
	private  String  start_pole_no;
	private  String  end_pole_no;
	private  String  dominion_area_name;
	private  String  dispatch_juridiction_company;
	private  String  juridiction_company;
	private  String  demarcation_point;
	private  String  tsubstation;
	private  String  tpole_no;
	private  String  tpoint_count;
	private  String  pole_line_length;
	private  String  earth_line_length;
	private  String  tline_length;
	private  String  pole_totalcount;
	private  String  tension_tower_totalcount;
	private  String  straight_tower_totalcount;
	private  String  wire_model;
	private  String  split_count;
	private  String  ground_model;
	private  String  overhead_ground;
	private  String  opgw;
	private  String  coastal_altitude;
	private  String  seismic_intensity;
	private  String  max_wind_speed;
	private  String  ice_thickness;
	private  String  ice_length;
	private  String  area_level;
	private  String  area_length;
	private  String  special_sections;
	private  String  insulator_type;
	private  String  line_department_id;
	private  String  same_tower_erection;
	private  String  area_feature;
	private  String  line_feature;
	private  String  build_company;
	private  String  supervision_company;
	private  String  max_allowable_ampacity;
	private  String  safe_current_twenty;
	private  String  safe_current_forty;
	private  String  max_power_radius;
	private  String  max_current_twenty_five;
	private  String  max_current_thirty;
	private  String  max_current_thirty_five;
	private  String  max_current_forty ;
	private  String  groundknife_dispatchcode;
	private  String  upknife_dispatchcode;
	private  String  downknife_dispatchcode;
	private  String  wiring_mode;
	private  String  ct_ratio ;
	private  String  is_dedicatedline;
	private  String  marketing_number;
	private  String  is_ring;
	private  String  is_allload_transfer;
	private  String  main_transformer;
	private  String  bus_line ;
	private  String  juridiction_line_length;
	private  String  plant_transfer_origdate;
	private  String  change_record;
	private  String  data_from;
	
	
	public LineEntity() {

	}
	
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
	public String getFl_name() {
		return fl_name;
	}
	public void setFl_name(String fl_name) {
		this.fl_name = fl_name;
	}
	public String getBase_voltage_id() {
		return base_voltage_id;
	}
	public void setBase_voltage_id(String base_voltage_id) {
		this.base_voltage_id = base_voltage_id;
	}
	public String getLine_department() {
		return line_department;
	}
	public void setLine_department(String line_department) {
		this.line_department = line_department;
	}
	public String getPhase_sequence() {
		return phase_sequence;
	}
	public void setPhase_sequence(String phase_sequence) {
		this.phase_sequence = phase_sequence;
	}
	public String getGround_clearance() {
		return ground_clearance;
	}
	public void setGround_clearance(String ground_clearance) {
		this.ground_clearance = ground_clearance;
	}
	public String getConn_code_load() {
		return conn_code_load;
	}
	public void setConn_code_load(String conn_code_load) {
		this.conn_code_load = conn_code_load;
	}
	public String getPhases() {
		return phases;
	}
	public void setPhases(String phases) {
		this.phases = phases;
	}
	public String getSplit_type() {
		return split_type;
	}
	public void setSplit_type(String split_type) {
		this.split_type = split_type;
	}
	public String getIssecondary() {
		return issecondary;
	}
	public void setIssecondary(String issecondary) {
		this.issecondary = issecondary;
	}
	public String getIs_branch() {
		return is_branch;
	}
	public void setIs_branch(String is_branch) {
		this.is_branch = is_branch;
	}
	public String getRated_amps() {
		return rated_amps;
	}
	public void setRated_amps(String rated_amps) {
		this.rated_amps = rated_amps;
	}
	public String getLine_alias() {
		return line_alias;
	}
	public void setLine_alias(String line_alias) {
		this.line_alias = line_alias;
	}
	public String getRating_capacity() {
		return rating_capacity;
	}
	public void setRating_capacity(String rating_capacity) {
		this.rating_capacity = rating_capacity;
	}
	public String getRating_electricity() {
		return rating_electricity;
	}
	public void setRating_electricity(String rating_electricity) {
		this.rating_electricity = rating_electricity;
	}
	public String getEconomy_capacity() {
		return economy_capacity;
	}
	public void setEconomy_capacity(String economy_capacity) {
		this.economy_capacity = economy_capacity;
	}
	public String getOverhead_line_length() {
		return overhead_line_length;
	}
	public void setOverhead_line_length(String overhead_line_length) {
		this.overhead_line_length = overhead_line_length;
	}
	public String getEnter_substation() {
		return enter_substation;
	}
	public void setEnter_substation(String enter_substation) {
		this.enter_substation = enter_substation;
	}
	public String getOut_substation() {
		return out_substation;
	}
	public void setOut_substation(String out_substation) {
		this.out_substation = out_substation;
	}
	public String getDesigned_company() {
		return designed_company;
	}
	public void setDesigned_company(String designed_company) {
		this.designed_company = designed_company;
	}
	public String getBuilder_company() {
		return builder_company;
	}
	public void setBuilder_company(String builder_company) {
		this.builder_company = builder_company;
	}
	public String getLine_type() {
		return line_type;
	}
	public void setLine_type(String line_type) {
		this.line_type = line_type;
	}
	public String getCable_line_length() {
		return cable_line_length;
	}
	public void setCable_line_length(String cable_line_length) {
		this.cable_line_length = cable_line_length;
	}
	public String getLine_function() {
		return line_function;
	}
	public void setLine_function(String line_function) {
		this.line_function = line_function;
	}
	public String getEnter_substation_id() {
		return enter_substation_id;
	}
	public void setEnter_substation_id(String enter_substation_id) {
		this.enter_substation_id = enter_substation_id;
	}
	public String getOut_substation_id() {
		return out_substation_id;
	}
	public void setOut_substation_id(String out_substation_id) {
		this.out_substation_id = out_substation_id;
	}
	public String getOut_substation_type() {
		return out_substation_type;
	}
	public void setOut_substation_type(String out_substation_type) {
		this.out_substation_type = out_substation_type;
	}
	public String getPole_count() {
		return pole_count;
	}
	public void setPole_count(String pole_count) {
		this.pole_count = pole_count;
	}
	public String getStart_pole_no() {
		return start_pole_no;
	}
	public void setStart_pole_no(String start_pole_no) {
		this.start_pole_no = start_pole_no;
	}
	public String getEnd_pole_no() {
		return end_pole_no;
	}
	public void setEnd_pole_no(String end_pole_no) {
		this.end_pole_no = end_pole_no;
	}
	public String getDominion_area_name() {
		return dominion_area_name;
	}
	public void setDominion_area_name(String dominion_area_name) {
		this.dominion_area_name = dominion_area_name;
	}
	public String getDispatch_juridiction_company() {
		return dispatch_juridiction_company;
	}
	public void setDispatch_juridiction_company(String dispatch_juridiction_company) {
		this.dispatch_juridiction_company = dispatch_juridiction_company;
	}
	public String getJuridiction_company() {
		return juridiction_company;
	}
	public void setJuridiction_company(String juridiction_company) {
		this.juridiction_company = juridiction_company;
	}
	public String getDemarcation_point() {
		return demarcation_point;
	}
	public void setDemarcation_point(String demarcation_point) {
		this.demarcation_point = demarcation_point;
	}
	public String getTsubstation() {
		return tsubstation;
	}
	public void setTsubstation(String tsubstation) {
		this.tsubstation = tsubstation;
	}
	public String getTpole_no() {
		return tpole_no;
	}
	public void setTpole_no(String tpole_no) {
		this.tpole_no = tpole_no;
	}
	public String getTpoint_count() {
		return tpoint_count;
	}
	public void setTpoint_count(String tpoint_count) {
		this.tpoint_count = tpoint_count;
	}
	public String getPole_line_length() {
		return pole_line_length;
	}
	public void setPole_line_length(String pole_line_length) {
		this.pole_line_length = pole_line_length;
	}
	public String getEarth_line_length() {
		return earth_line_length;
	}
	public void setEarth_line_length(String earth_line_length) {
		this.earth_line_length = earth_line_length;
	}
	public String getTline_length() {
		return tline_length;
	}
	public void setTline_length(String tline_length) {
		this.tline_length = tline_length;
	}
	public String getPole_totalcount() {
		return pole_totalcount;
	}
	public void setPole_totalcount(String pole_totalcount) {
		this.pole_totalcount = pole_totalcount;
	}
	public String getTension_tower_totalcount() {
		return tension_tower_totalcount;
	}
	public void setTension_tower_totalcount(String tension_tower_totalcount) {
		this.tension_tower_totalcount = tension_tower_totalcount;
	}
	public String getStraight_tower_totalcount() {
		return straight_tower_totalcount;
	}
	public void setStraight_tower_totalcount(String straight_tower_totalcount) {
		this.straight_tower_totalcount = straight_tower_totalcount;
	}
	public String getWire_model() {
		return wire_model;
	}
	public void setWire_model(String wire_model) {
		this.wire_model = wire_model;
	}
	public String getSplit_count() {
		return split_count;
	}
	public void setSplit_count(String split_count) {
		this.split_count = split_count;
	}
	public String getGround_model() {
		return ground_model;
	}
	public void setGround_model(String ground_model) {
		this.ground_model = ground_model;
	}
	public String getOverhead_ground() {
		return overhead_ground;
	}
	public void setOverhead_ground(String overhead_ground) {
		this.overhead_ground = overhead_ground;
	}
	public String getOpgw() {
		return opgw;
	}
	public void setOpgw(String opgw) {
		this.opgw = opgw;
	}
	public String getCoastal_altitude() {
		return coastal_altitude;
	}
	public void setCoastal_altitude(String coastal_altitude) {
		this.coastal_altitude = coastal_altitude;
	}
	public String getSeismic_intensity() {
		return seismic_intensity;
	}
	public void setSeismic_intensity(String seismic_intensity) {
		this.seismic_intensity = seismic_intensity;
	}
	public String getMax_wind_speed() {
		return max_wind_speed;
	}
	public void setMax_wind_speed(String max_wind_speed) {
		this.max_wind_speed = max_wind_speed;
	}
	public String getIce_thickness() {
		return ice_thickness;
	}
	public void setIce_thickness(String ice_thickness) {
		this.ice_thickness = ice_thickness;
	}
	public String getIce_length() {
		return ice_length;
	}
	public void setIce_length(String ice_length) {
		this.ice_length = ice_length;
	}
	public String getArea_level() {
		return area_level;
	}
	public void setArea_level(String area_level) {
		this.area_level = area_level;
	}
	public String getArea_length() {
		return area_length;
	}
	public void setArea_length(String area_length) {
		this.area_length = area_length;
	}
	public String getSpecial_sections() {
		return special_sections;
	}
	public void setSpecial_sections(String special_sections) {
		this.special_sections = special_sections;
	}
	public String getInsulator_type() {
		return insulator_type;
	}
	public void setInsulator_type(String insulator_type) {
		this.insulator_type = insulator_type;
	}
	public String getLine_department_id() {
		return line_department_id;
	}
	public void setLine_department_id(String line_department_id) {
		this.line_department_id = line_department_id;
	}
	public String getSame_tower_erection() {
		return same_tower_erection;
	}
	public void setSame_tower_erection(String same_tower_erection) {
		this.same_tower_erection = same_tower_erection;
	}
	public String getArea_feature() {
		return area_feature;
	}
	public void setArea_feature(String area_feature) {
		this.area_feature = area_feature;
	}
	public String getLine_feature() {
		return line_feature;
	}
	public void setLine_feature(String line_feature) {
		this.line_feature = line_feature;
	}
	public String getBuild_company() {
		return build_company;
	}
	public void setBuild_company(String build_company) {
		this.build_company = build_company;
	}
	public String getSupervision_company() {
		return supervision_company;
	}
	public void setSupervision_company(String supervision_company) {
		this.supervision_company = supervision_company;
	}
	public String getMax_allowable_ampacity() {
		return max_allowable_ampacity;
	}
	public void setMax_allowable_ampacity(String max_allowable_ampacity) {
		this.max_allowable_ampacity = max_allowable_ampacity;
	}
	public String getSafe_current_twenty() {
		return safe_current_twenty;
	}
	public void setSafe_current_twenty(String safe_current_twenty) {
		this.safe_current_twenty = safe_current_twenty;
	}
	public String getSafe_current_forty() {
		return safe_current_forty;
	}
	public void setSafe_current_forty(String safe_current_forty) {
		this.safe_current_forty = safe_current_forty;
	}
	public String getMax_power_radius() {
		return max_power_radius;
	}
	public void setMax_power_radius(String max_power_radius) {
		this.max_power_radius = max_power_radius;
	}
	public String getMax_current_twenty_five() {
		return max_current_twenty_five;
	}
	public void setMax_current_twenty_five(String max_current_twenty_five) {
		this.max_current_twenty_five = max_current_twenty_five;
	}
	public String getMax_current_thirty() {
		return max_current_thirty;
	}
	public void setMax_current_thirty(String max_current_thirty) {
		this.max_current_thirty = max_current_thirty;
	}
	public String getMax_current_thirty_five() {
		return max_current_thirty_five;
	}
	public void setMax_current_thirty_five(String max_current_thirty_five) {
		this.max_current_thirty_five = max_current_thirty_five;
	}
	public String getMax_current_forty() {
		return max_current_forty;
	}
	public void setMax_current_forty(String max_current_forty) {
		this.max_current_forty = max_current_forty;
	}
	public String getGroundknife_dispatchcode() {
		return groundknife_dispatchcode;
	}
	public void setGroundknife_dispatchcode(String groundknife_dispatchcode) {
		this.groundknife_dispatchcode = groundknife_dispatchcode;
	}
	public String getUpknife_dispatchcode() {
		return upknife_dispatchcode;
	}
	public void setUpknife_dispatchcode(String upknife_dispatchcode) {
		this.upknife_dispatchcode = upknife_dispatchcode;
	}
	public String getDownknife_dispatchcode() {
		return downknife_dispatchcode;
	}
	public void setDownknife_dispatchcode(String downknife_dispatchcode) {
		this.downknife_dispatchcode = downknife_dispatchcode;
	}
	public String getWiring_mode() {
		return wiring_mode;
	}
	public void setWiring_mode(String wiring_mode) {
		this.wiring_mode = wiring_mode;
	}
	public String getCt_ratio() {
		return ct_ratio;
	}
	public void setCt_ratio(String ct_ratio) {
		this.ct_ratio = ct_ratio;
	}
	public String getIs_dedicatedline() {
		return is_dedicatedline;
	}
	public void setIs_dedicatedline(String is_dedicatedline) {
		this.is_dedicatedline = is_dedicatedline;
	}
	public String getMarketing_number() {
		return marketing_number;
	}
	public void setMarketing_number(String marketing_number) {
		this.marketing_number = marketing_number;
	}
	public String getIs_ring() {
		return is_ring;
	}
	public void setIs_ring(String is_ring) {
		this.is_ring = is_ring;
	}
	public String getIs_allload_transfer() {
		return is_allload_transfer;
	}
	public void setIs_allload_transfer(String is_allload_transfer) {
		this.is_allload_transfer = is_allload_transfer;
	}
	public String getMain_transformer() {
		return main_transformer;
	}
	public void setMain_transformer(String main_transformer) {
		this.main_transformer = main_transformer;
	}
	public String getBus_line() {
		return bus_line;
	}
	public void setBus_line(String bus_line) {
		this.bus_line = bus_line;
	}
	public String getJuridiction_line_length() {
		return juridiction_line_length;
	}
	public void setJuridiction_line_length(String juridiction_line_length) {
		this.juridiction_line_length = juridiction_line_length;
	}
	public String getPlant_transfer_origdate() {
		return plant_transfer_origdate;
	}
	public void setPlant_transfer_origdate(String plant_transfer_origdate) {
		this.plant_transfer_origdate = plant_transfer_origdate;
	}
	public String getChange_record() {
		return change_record;
	}
	public void setChange_record(String change_record) {
		this.change_record = change_record;
	}
	public String getData_from() {
		return data_from;
	}
	public void setData_from(String data_from) {
		this.data_from = data_from;
	}
	
	@Override
	public String toString() {
		return "Line [province_code=" + province_code + ", id=" + id + ", bureau_code=" + bureau_code + ", fl_name="
				+ fl_name + ", base_voltage_id=" + base_voltage_id + "]";
	}
	
	
	
}
