package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: Tower.java 
* @Package cn.com.enersun.data_center.bigdata_service.entity 
* @Description: TODO(杆塔台账信息) 
* @author enersun_lhb  
* @date 2016年10月28日 上午12:41:40 
* @version V1.0   
*/
public class TowerEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5762660369432681542L;

	public TowerEntity() {
	}

	private String province_code ;
	private String id ;
	private String bureau_code;
	private String fl_name;
	private String base_voltage_id;
	private String sort_no;
	private String longitude;
	private String latitude;
	private String ice_thickness ;
	private String wind_zone;
	private String pollution_level;
	private String coastal_altitude;
	private String responsible_person;
	private String use_span;
	private String rotation_degree;
	private String design_polluted_area;
	private String highest_water_level;
	private String water_level;
	private String seismic_fortification_intensit;
	private String antifouling_config_level;
	private String horizontal_span;
	private String vertical_span ;
	private String fifty_wind_speed;
	private String thirty_wind_speed;
	private String design_wind_speed;
	private String thunderstorm_days;
	private String lightning_risk_level;
	private String ground_flash_rating;
	private String ice_prevention_measure;
	private String lightning_protection;
	private String ice_distribution_level;
	private String data_from;

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
	public String getSort_no() {
		return sort_no;
	}
	public void setSort_no(String sort_no) {
		this.sort_no = sort_no;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getIce_thickness() {
		return ice_thickness;
	}
	public void setIce_thickness(String ice_thickness) {
		this.ice_thickness = ice_thickness;
	}
	public String getWind_zone() {
		return wind_zone;
	}
	public void setWind_zone(String wind_zone) {
		this.wind_zone = wind_zone;
	}
	public String getPollution_level() {
		return pollution_level;
	}
	public void setPollution_level(String pollution_level) {
		this.pollution_level = pollution_level;
	}
	public String getCoastal_altitude() {
		return coastal_altitude;
	}
	public void setCoastal_altitude(String coastal_altitude) {
		this.coastal_altitude = coastal_altitude;
	}
	public String getResponsible_person() {
		return responsible_person;
	}
	public void setResponsible_person(String responsible_person) {
		this.responsible_person = responsible_person;
	}
	public String getUse_span() {
		return use_span;
	}
	public void setUse_span(String use_span) {
		this.use_span = use_span;
	}
	public String getRotation_degree() {
		return rotation_degree;
	}
	public void setRotation_degree(String rotation_degree) {
		this.rotation_degree = rotation_degree;
	}
	public String getDesign_polluted_area() {
		return design_polluted_area;
	}
	public void setDesign_polluted_area(String design_polluted_area) {
		this.design_polluted_area = design_polluted_area;
	}
	public String getHighest_water_level() {
		return highest_water_level;
	}
	public void setHighest_water_level(String highest_water_level) {
		this.highest_water_level = highest_water_level;
	}
	public String getWater_level() {
		return water_level;
	}
	public void setWater_level(String water_level) {
		this.water_level = water_level;
	}
	public String getSeismic_fortification_intensit() {
		return seismic_fortification_intensit;
	}
	public void setSeismic_fortification_intensit(String seismic_fortification_intensit) {
		this.seismic_fortification_intensit = seismic_fortification_intensit;
	}
	public String getAntifouling_config_level() {
		return antifouling_config_level;
	}
	public void setAntifouling_config_level(String antifouling_config_level) {
		this.antifouling_config_level = antifouling_config_level;
	}
	public String getHorizontal_span() {
		return horizontal_span;
	}
	public void setHorizontal_span(String horizontal_span) {
		this.horizontal_span = horizontal_span;
	}
	public String getVertical_span() {
		return vertical_span;
	}
	public void setVertical_span(String vertical_span) {
		this.vertical_span = vertical_span;
	}
	public String getFifty_wind_speed() {
		return fifty_wind_speed;
	}
	public void setFifty_wind_speed(String fifty_wind_speed) {
		this.fifty_wind_speed = fifty_wind_speed;
	}
	public String getThirty_wind_speed() {
		return thirty_wind_speed;
	}
	public void setThirty_wind_speed(String thirty_wind_speed) {
		this.thirty_wind_speed = thirty_wind_speed;
	}
	public String getDesign_wind_speed() {
		return design_wind_speed;
	}
	public void setDesign_wind_speed(String design_wind_speed) {
		this.design_wind_speed = design_wind_speed;
	}
	public String getThunderstorm_days() {
		return thunderstorm_days;
	}
	public void setThunderstorm_days(String thunderstorm_days) {
		this.thunderstorm_days = thunderstorm_days;
	}
	public String getLightning_risk_level() {
		return lightning_risk_level;
	}
	public void setLightning_risk_level(String lightning_risk_level) {
		this.lightning_risk_level = lightning_risk_level;
	}
	public String getGround_flash_rating() {
		return ground_flash_rating;
	}
	public void setGround_flash_rating(String ground_flash_rating) {
		this.ground_flash_rating = ground_flash_rating;
	}
	public String getIce_prevention_measure() {
		return ice_prevention_measure;
	}
	public void setIce_prevention_measure(String ice_prevention_measure) {
		this.ice_prevention_measure = ice_prevention_measure;
	}
	public String getLightning_protection() {
		return lightning_protection;
	}
	public void setLightning_protection(String lightning_protection) {
		this.lightning_protection = lightning_protection;
	}
	public String getIce_distribution_level() {
		return ice_distribution_level;
	}
	public void setIce_distribution_level(String ice_distribution_level) {
		this.ice_distribution_level = ice_distribution_level;
	}
	public String getData_from() {
		return data_from;
	}
	public void setData_from(String data_from) {
		this.data_from = data_from;
	}
	
	@Override
	public String toString() {
		return "Tower [province_code=" + province_code + ", id=" + id + ", bureau_code=" + bureau_code + ", fl_name="
				+ fl_name + ", base_voltage_id=" + base_voltage_id + "]";
	}
	
	
	
}
