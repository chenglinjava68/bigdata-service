package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: Substation.java 
* @Package cn.com.enersun.data_center.bigdata_service.entity 
* @Description: TODO(变电站实体模型) 
* @author enersun_lhb  
* @date 2016年9月18日 上午10:02:05 
* @version V1.0   
*/
public class SubstationEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -810452879002512758L;
	
	private String id;
	private String province_code;
	private String bureau_code;
	private String site_name;
	private String plant_transfer_date;
	private String retire_date;
	private String running_state;
	private String status_date;
	private String dirtiness_area_level;
	private String dominion_mode;
	private String power_grid_flag;
	private String remark;
	private String fl_name;
	private String classify_id;
	private String parent_id;
	private String fl_type;
	private String full_path;
	private String base_voltage_id;
	private String dispatch_level;
	private String dispatch_dep;
	private String owner_station_oid;
	private String running_code;
	private String cloud_to_ground_falsh;
	private String thunder_risk_grade;
	private String ice_classification;
	private String flood_hundred_year;
	private String flood_highedt;
	private String site_design;
	private String output_count;
	private String input_count;
	private String transformer_capacity;
	private String transformer_number;
	private String type;
	private String sub_type;
	private String center_substation_id;
	private String center_substation_name;
	private String address;
	private String designed_company;
	private String builder_company;
	private String proprietor_company_oname;
	private String proprietor_company_oid;
	private String control_type;
	private String owner_area;
	private String duty_type;
	private String electrical_instal_company;
	private String connection_mode;
	private String outlet_count_500kv;
	private String outlet_count_220kv;
	private String outlet_count_110kv;
	private String outlet_count_35kv;
	private String outlet_count_20kv;
	private String outlet_count_10kv;
	private String capacitor_compensate_capacity;
	private String reactor_rc;
	private String communications_overlay;
	private String coastal_altitude;
	private String seismic_intensity;
	private String capacity_constitute;
	private String marketing_number;
	private String bus_section;
	private String interval_nums;
	private String runmanage_dep_id;
	private String is_ring;
	private String power_line;
	private String alternate_line;
	private String wind_spped_thirty_year;
	private String wind_spped_fifty_year;
	
	public SubstationEntity(){}
	
	public SubstationEntity(String id, String province_code, String bureau_code, String site_name) {
		super();
		this.id = id;
		this.province_code = province_code;
		this.bureau_code = bureau_code;
		this.site_name = site_name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProvince_code() {
		return province_code;
	}

	public void setProvince_code(String province_code) {
		this.province_code = province_code;
	}

	public String getBureau_code() {
		return bureau_code;
	}

	public void setBureau_code(String bureau_code) {
		this.bureau_code = bureau_code;
	}

	public String getSite_name() {
		return site_name;
	}

	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}

	public String getPlant_transfer_date() {
		return plant_transfer_date;
	}

	public void setPlant_transfer_date(String plant_transfer_date) {
		this.plant_transfer_date = plant_transfer_date;
	}

	public String getRetire_date() {
		return retire_date;
	}

	public void setRetire_date(String retire_date) {
		this.retire_date = retire_date;
	}

	public String getRunning_state() {
		return running_state;
	}

	public void setRunning_state(String running_state) {
		this.running_state = running_state;
	}

	public String getStatus_date() {
		return status_date;
	}

	public void setStatus_date(String status_date) {
		this.status_date = status_date;
	}

	public String getDirtiness_area_level() {
		return dirtiness_area_level;
	}

	public void setDirtiness_area_level(String dirtiness_area_level) {
		this.dirtiness_area_level = dirtiness_area_level;
	}

	public String getDominion_mode() {
		return dominion_mode;
	}

	public void setDominion_mode(String dominion_mode) {
		this.dominion_mode = dominion_mode;
	}

	public String getPower_grid_flag() {
		return power_grid_flag;
	}

	public void setPower_grid_flag(String power_grid_flag) {
		this.power_grid_flag = power_grid_flag;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFl_name() {
		return fl_name;
	}

	public void setFl_name(String fl_name) {
		this.fl_name = fl_name;
	}

	public String getClassify_id() {
		return classify_id;
	}

	public void setClassify_id(String classify_id) {
		this.classify_id = classify_id;
	}

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public String getFl_type() {
		return fl_type;
	}

	public void setFl_type(String fl_type) {
		this.fl_type = fl_type;
	}

	public String getFull_path() {
		return full_path;
	}

	public void setFull_path(String full_path) {
		this.full_path = full_path;
	}

	public String getBase_voltage_id() {
		return base_voltage_id;
	}

	public void setBase_voltage_id(String base_voltage_id) {
		this.base_voltage_id = base_voltage_id;
	}

	public String getDispatch_level() {
		return dispatch_level;
	}

	public void setDispatch_level(String dispatch_level) {
		this.dispatch_level = dispatch_level;
	}

	public String getDispatch_dep() {
		return dispatch_dep;
	}

	public void setDispatch_dep(String dispatch_dep) {
		this.dispatch_dep = dispatch_dep;
	}

	public String getOwner_station_oid() {
		return owner_station_oid;
	}

	public void setOwner_station_oid(String owner_station_oid) {
		this.owner_station_oid = owner_station_oid;
	}

	public String getRunning_code() {
		return running_code;
	}

	public void setRunning_code(String running_code) {
		this.running_code = running_code;
	}

	public String getCloud_to_ground_falsh() {
		return cloud_to_ground_falsh;
	}

	public void setCloud_to_ground_falsh(String cloud_to_ground_falsh) {
		this.cloud_to_ground_falsh = cloud_to_ground_falsh;
	}

	public String getThunder_risk_grade() {
		return thunder_risk_grade;
	}

	public void setThunder_risk_grade(String thunder_risk_grade) {
		this.thunder_risk_grade = thunder_risk_grade;
	}

	public String getIce_classification() {
		return ice_classification;
	}

	public void setIce_classification(String ice_classification) {
		this.ice_classification = ice_classification;
	}

	public String getFlood_hundred_year() {
		return flood_hundred_year;
	}

	public void setFlood_hundred_year(String flood_hundred_year) {
		this.flood_hundred_year = flood_hundred_year;
	}

	public String getFlood_highedt() {
		return flood_highedt;
	}

	public void setFlood_highedt(String flood_highedt) {
		this.flood_highedt = flood_highedt;
	}

	public String getSite_design() {
		return site_design;
	}

	public void setSite_design(String site_design) {
		this.site_design = site_design;
	}

	public String getOutput_count() {
		return output_count;
	}

	public void setOutput_count(String output_count) {
		this.output_count = output_count;
	}

	public String getInput_count() {
		return input_count;
	}

	public void setInput_count(String input_count) {
		this.input_count = input_count;
	}

	public String getTransformer_capacity() {
		return transformer_capacity;
	}

	public void setTransformer_capacity(String transformer_capacity) {
		this.transformer_capacity = transformer_capacity;
	}

	public String getTransformer_number() {
		return transformer_number;
	}

	public void setTransformer_number(String transformer_number) {
		this.transformer_number = transformer_number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSub_type() {
		return sub_type;
	}

	public void setSub_type(String sub_type) {
		this.sub_type = sub_type;
	}

	public String getCenter_substation_id() {
		return center_substation_id;
	}

	public void setCenter_substation_id(String center_substation_id) {
		this.center_substation_id = center_substation_id;
	}

	public String getCenter_substation_name() {
		return center_substation_name;
	}

	public void setCenter_substation_name(String center_substation_name) {
		this.center_substation_name = center_substation_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getProprietor_company_oname() {
		return proprietor_company_oname;
	}

	public void setProprietor_company_oname(String proprietor_company_oname) {
		this.proprietor_company_oname = proprietor_company_oname;
	}

	public String getProprietor_company_oid() {
		return proprietor_company_oid;
	}

	public void setProprietor_company_oid(String proprietor_company_oid) {
		this.proprietor_company_oid = proprietor_company_oid;
	}

	public String getControl_type() {
		return control_type;
	}

	public void setControl_type(String control_type) {
		this.control_type = control_type;
	}

	public String getOwner_area() {
		return owner_area;
	}

	public void setOwner_area(String owner_area) {
		this.owner_area = owner_area;
	}

	public String getDuty_type() {
		return duty_type;
	}

	public void setDuty_type(String duty_type) {
		this.duty_type = duty_type;
	}

	public String getElectrical_instal_company() {
		return electrical_instal_company;
	}

	public void setElectrical_instal_company(String electrical_instal_company) {
		this.electrical_instal_company = electrical_instal_company;
	}

	public String getConnection_mode() {
		return connection_mode;
	}

	public void setConnection_mode(String connection_mode) {
		this.connection_mode = connection_mode;
	}

	public String getOutlet_count_500kv() {
		return outlet_count_500kv;
	}

	public void setOutlet_count_500kv(String outlet_count_500kv) {
		this.outlet_count_500kv = outlet_count_500kv;
	}

	public String getOutlet_count_220kv() {
		return outlet_count_220kv;
	}

	public void setOutlet_count_220kv(String outlet_count_220kv) {
		this.outlet_count_220kv = outlet_count_220kv;
	}

	public String getOutlet_count_110kv() {
		return outlet_count_110kv;
	}

	public void setOutlet_count_110kv(String outlet_count_110kv) {
		this.outlet_count_110kv = outlet_count_110kv;
	}

	public String getOutlet_count_35kv() {
		return outlet_count_35kv;
	}

	public void setOutlet_count_35kv(String outlet_count_35kv) {
		this.outlet_count_35kv = outlet_count_35kv;
	}

	public String getOutlet_count_20kv() {
		return outlet_count_20kv;
	}

	public void setOutlet_count_20kv(String outlet_count_20kv) {
		this.outlet_count_20kv = outlet_count_20kv;
	}

	public String getOutlet_count_10kv() {
		return outlet_count_10kv;
	}

	public void setOutlet_count_10kv(String outlet_count_10kv) {
		this.outlet_count_10kv = outlet_count_10kv;
	}

	public String getCapacitor_compensate_capacity() {
		return capacitor_compensate_capacity;
	}

	public void setCapacitor_compensate_capacity(String capacitor_compensate_capacity) {
		this.capacitor_compensate_capacity = capacitor_compensate_capacity;
	}

	public String getReactor_rc() {
		return reactor_rc;
	}

	public void setReactor_rc(String reactor_rc) {
		this.reactor_rc = reactor_rc;
	}

	public String getCommunications_overlay() {
		return communications_overlay;
	}

	public void setCommunications_overlay(String communications_overlay) {
		this.communications_overlay = communications_overlay;
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

	public String getCapacity_constitute() {
		return capacity_constitute;
	}

	public void setCapacity_constitute(String capacity_constitute) {
		this.capacity_constitute = capacity_constitute;
	}

	public String getMarketing_number() {
		return marketing_number;
	}

	public void setMarketing_number(String marketing_number) {
		this.marketing_number = marketing_number;
	}

	public String getBus_section() {
		return bus_section;
	}

	public void setBus_section(String bus_section) {
		this.bus_section = bus_section;
	}

	public String getInterval_nums() {
		return interval_nums;
	}

	public void setInterval_nums(String interval_nums) {
		this.interval_nums = interval_nums;
	}

	public String getRunmanage_dep_id() {
		return runmanage_dep_id;
	}

	public void setRunmanage_dep_id(String runmanage_dep_id) {
		this.runmanage_dep_id = runmanage_dep_id;
	}

	public String getIs_ring() {
		return is_ring;
	}

	public void setIs_ring(String is_ring) {
		this.is_ring = is_ring;
	}

	public String getPower_line() {
		return power_line;
	}

	public void setPower_line(String power_line) {
		this.power_line = power_line;
	}

	public String getAlternate_line() {
		return alternate_line;
	}

	public void setAlternate_line(String alternate_line) {
		this.alternate_line = alternate_line;
	}

	public String getWind_spped_thirty_year() {
		return wind_spped_thirty_year;
	}

	public void setWind_spped_thirty_year(String wind_spped_thirty_year) {
		this.wind_spped_thirty_year = wind_spped_thirty_year;
	}

	public String getWind_spped_fifty_year() {
		return wind_spped_fifty_year;
	}

	public void setWind_spped_fifty_year(String wind_spped_fifty_year) {
		this.wind_spped_fifty_year = wind_spped_fifty_year;
	}

	@Override
	public String toString() {
		return "Substation [id=" + id + ", province_code=" + province_code + ", bureau_code=" + bureau_code
				+ ", site_name=" + site_name + ", plant_transfer_date=" + plant_transfer_date + ", retire_date="
				+ retire_date + ", running_state=" + running_state + ", status_date=" + status_date
				+ ", dirtiness_area_level=" + dirtiness_area_level + ", dominion_mode=" + dominion_mode
				+ ", power_grid_flag=" + power_grid_flag + ", fl_name=" + fl_name + "]";
	}
	
	
}
