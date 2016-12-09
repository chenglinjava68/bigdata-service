package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: Dm_Transformer.java 
* @Package cn.com.enersun.data_center.bigdata_service.entity 
* @Description: TODO(变压器技术参数信息) 
* @author enersun_lhb  
* @date 2016年10月28日 上午12:50:36 
* @version V1.0   
*/
public class Dm_TransformerEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6038526141027573170L;

	public Dm_TransformerEntity() {
	}

	private String province_code;
	private String id ;
	private String bureau_code;
	private String type ;
	private String hign_low_impe_vl_max;
	private String hign_low_impe_vl_rated;
	private String hign_low_impe_vl_min;
	private String hign_mid_impe_vl_max;
	private String hign_mid_impe_vl_rated;
	private String hign_mid_impe_vl_min;
	private String mid_low_impedance_vl;
	private String no_load_wastage ;
	private String no_load_current ;
	private String zero_seq_impedance;
	private String mid_vol_rated_little_scc;
	private String low_vol_rated_little_scc;
	private String oil_weight ;
	private String oil_mark ;
	private String traffic_weight;
	private String upper_oil_box_weight;
	private String machine_weight;
	private String total_weight ;
	private String oil_manufacturer;
	private String oil_temp_alarm_value;
	private String winding_temp_alarm_value;
	private String rated_voltage;
	private String adjust_type;
	private String rated_voltage_ratio ;
	private String cooling_mode ;
	private String high_vol_rated_capacity ;
	private String high_vol_rated_current;
	private String mid_vol_rated_capacity;
	private String mid_vol_rated_current ;
	private String low_vol_rated_capacity;
	private String low_vol_rated_current ;
	private String tie_line_group;
	private String insulation_level;
	private String standard_code;
	private String hight_low_load_wastage;
	private String hight_mid_load_wastage;
	private String mid_low_load_wastage;
	private String phases ;
	private String dyrcp;
	private String widing_count ;
	private String iron_core_mode;
	private String winding_material;
	private String insulation_corrosion_level;
	private String oil_box_airproof_mode ;
	private String yawp_value ;
	private String envelop_mode ;
	private String installation_type ;
	private String tap_position ;
	private String tap_area ;
	private String hign_vol_rated_little_scc ;
	private String customer_no;
	private String customer_name;
	private String transformer_no;
	private String line_no;
	private String line_name;
	private String latitude ;
	private String longitude;
	private String buried_dimensions ;
	private String nature_of_ele_consumed;
	private String residential_capacity;
	private String commercial_capacity ;
	private String industrial_capacity ;
	private String non_industrial_capacity ;
	private String farmland_capacity ;
	private String bulk_gas ;
	private String rated_pressure;
	private String rated_capacity;
	private String load_loss;
	private String high_voltage_box_gas;
	private String cooling_system_gas;
	private String equipment_type;
	private String is_standby_phase;
	private String oltc_gas ;
	private String neutral_groun_mode;
	private String impedance_voltage ;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getHign_low_impe_vl_max() {
		return hign_low_impe_vl_max;
	}
	public void setHign_low_impe_vl_max(String hign_low_impe_vl_max) {
		this.hign_low_impe_vl_max = hign_low_impe_vl_max;
	}
	public String getHign_low_impe_vl_rated() {
		return hign_low_impe_vl_rated;
	}
	public void setHign_low_impe_vl_rated(String hign_low_impe_vl_rated) {
		this.hign_low_impe_vl_rated = hign_low_impe_vl_rated;
	}
	public String getHign_low_impe_vl_min() {
		return hign_low_impe_vl_min;
	}
	public void setHign_low_impe_vl_min(String hign_low_impe_vl_min) {
		this.hign_low_impe_vl_min = hign_low_impe_vl_min;
	}
	public String getHign_mid_impe_vl_max() {
		return hign_mid_impe_vl_max;
	}
	public void setHign_mid_impe_vl_max(String hign_mid_impe_vl_max) {
		this.hign_mid_impe_vl_max = hign_mid_impe_vl_max;
	}
	public String getHign_mid_impe_vl_rated() {
		return hign_mid_impe_vl_rated;
	}
	public void setHign_mid_impe_vl_rated(String hign_mid_impe_vl_rated) {
		this.hign_mid_impe_vl_rated = hign_mid_impe_vl_rated;
	}
	public String getHign_mid_impe_vl_min() {
		return hign_mid_impe_vl_min;
	}
	public void setHign_mid_impe_vl_min(String hign_mid_impe_vl_min) {
		this.hign_mid_impe_vl_min = hign_mid_impe_vl_min;
	}
	public String getMid_low_impedance_vl() {
		return mid_low_impedance_vl;
	}
	public void setMid_low_impedance_vl(String mid_low_impedance_vl) {
		this.mid_low_impedance_vl = mid_low_impedance_vl;
	}
	public String getNo_load_wastage() {
		return no_load_wastage;
	}
	public void setNo_load_wastage(String no_load_wastage) {
		this.no_load_wastage = no_load_wastage;
	}
	public String getNo_load_current() {
		return no_load_current;
	}
	public void setNo_load_current(String no_load_current) {
		this.no_load_current = no_load_current;
	}
	public String getZero_seq_impedance() {
		return zero_seq_impedance;
	}
	public void setZero_seq_impedance(String zero_seq_impedance) {
		this.zero_seq_impedance = zero_seq_impedance;
	}
	public String getMid_vol_rated_little_scc() {
		return mid_vol_rated_little_scc;
	}
	public void setMid_vol_rated_little_scc(String mid_vol_rated_little_scc) {
		this.mid_vol_rated_little_scc = mid_vol_rated_little_scc;
	}
	public String getLow_vol_rated_little_scc() {
		return low_vol_rated_little_scc;
	}
	public void setLow_vol_rated_little_scc(String low_vol_rated_little_scc) {
		this.low_vol_rated_little_scc = low_vol_rated_little_scc;
	}
	public String getOil_weight() {
		return oil_weight;
	}
	public void setOil_weight(String oil_weight) {
		this.oil_weight = oil_weight;
	}
	public String getOil_mark() {
		return oil_mark;
	}
	public void setOil_mark(String oil_mark) {
		this.oil_mark = oil_mark;
	}
	public String getTraffic_weight() {
		return traffic_weight;
	}
	public void setTraffic_weight(String traffic_weight) {
		this.traffic_weight = traffic_weight;
	}
	public String getUpper_oil_box_weight() {
		return upper_oil_box_weight;
	}
	public void setUpper_oil_box_weight(String upper_oil_box_weight) {
		this.upper_oil_box_weight = upper_oil_box_weight;
	}
	public String getMachine_weight() {
		return machine_weight;
	}
	public void setMachine_weight(String machine_weight) {
		this.machine_weight = machine_weight;
	}
	public String getTotal_weight() {
		return total_weight;
	}
	public void setTotal_weight(String total_weight) {
		this.total_weight = total_weight;
	}
	public String getOil_manufacturer() {
		return oil_manufacturer;
	}
	public void setOil_manufacturer(String oil_manufacturer) {
		this.oil_manufacturer = oil_manufacturer;
	}
	public String getOil_temp_alarm_value() {
		return oil_temp_alarm_value;
	}
	public void setOil_temp_alarm_value(String oil_temp_alarm_value) {
		this.oil_temp_alarm_value = oil_temp_alarm_value;
	}
	public String getWinding_temp_alarm_value() {
		return winding_temp_alarm_value;
	}
	public void setWinding_temp_alarm_value(String winding_temp_alarm_value) {
		this.winding_temp_alarm_value = winding_temp_alarm_value;
	}
	public String getRated_voltage() {
		return rated_voltage;
	}
	public void setRated_voltage(String rated_voltage) {
		this.rated_voltage = rated_voltage;
	}
	public String getAdjust_type() {
		return adjust_type;
	}
	public void setAdjust_type(String adjust_type) {
		this.adjust_type = adjust_type;
	}
	public String getRated_voltage_ratio() {
		return rated_voltage_ratio;
	}
	public void setRated_voltage_ratio(String rated_voltage_ratio) {
		this.rated_voltage_ratio = rated_voltage_ratio;
	}
	public String getCooling_mode() {
		return cooling_mode;
	}
	public void setCooling_mode(String cooling_mode) {
		this.cooling_mode = cooling_mode;
	}
	public String getHigh_vol_rated_capacity() {
		return high_vol_rated_capacity;
	}
	public void setHigh_vol_rated_capacity(String high_vol_rated_capacity) {
		this.high_vol_rated_capacity = high_vol_rated_capacity;
	}
	public String getHigh_vol_rated_current() {
		return high_vol_rated_current;
	}
	public void setHigh_vol_rated_current(String high_vol_rated_current) {
		this.high_vol_rated_current = high_vol_rated_current;
	}
	public String getMid_vol_rated_capacity() {
		return mid_vol_rated_capacity;
	}
	public void setMid_vol_rated_capacity(String mid_vol_rated_capacity) {
		this.mid_vol_rated_capacity = mid_vol_rated_capacity;
	}
	public String getMid_vol_rated_current() {
		return mid_vol_rated_current;
	}
	public void setMid_vol_rated_current(String mid_vol_rated_current) {
		this.mid_vol_rated_current = mid_vol_rated_current;
	}
	public String getLow_vol_rated_capacity() {
		return low_vol_rated_capacity;
	}
	public void setLow_vol_rated_capacity(String low_vol_rated_capacity) {
		this.low_vol_rated_capacity = low_vol_rated_capacity;
	}
	public String getLow_vol_rated_current() {
		return low_vol_rated_current;
	}
	public void setLow_vol_rated_current(String low_vol_rated_current) {
		this.low_vol_rated_current = low_vol_rated_current;
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
	public String getStandard_code() {
		return standard_code;
	}
	public void setStandard_code(String standard_code) {
		this.standard_code = standard_code;
	}
	public String getHight_low_load_wastage() {
		return hight_low_load_wastage;
	}
	public void setHight_low_load_wastage(String hight_low_load_wastage) {
		this.hight_low_load_wastage = hight_low_load_wastage;
	}
	public String getHight_mid_load_wastage() {
		return hight_mid_load_wastage;
	}
	public void setHight_mid_load_wastage(String hight_mid_load_wastage) {
		this.hight_mid_load_wastage = hight_mid_load_wastage;
	}
	public String getMid_low_load_wastage() {
		return mid_low_load_wastage;
	}
	public void setMid_low_load_wastage(String mid_low_load_wastage) {
		this.mid_low_load_wastage = mid_low_load_wastage;
	}
	public String getPhases() {
		return phases;
	}
	public void setPhases(String phases) {
		this.phases = phases;
	}
	public String getDyrcp() {
		return dyrcp;
	}
	public void setDyrcp(String dyrcp) {
		this.dyrcp = dyrcp;
	}
	public String getWiding_count() {
		return widing_count;
	}
	public void setWiding_count(String widing_count) {
		this.widing_count = widing_count;
	}
	public String getIron_core_mode() {
		return iron_core_mode;
	}
	public void setIron_core_mode(String iron_core_mode) {
		this.iron_core_mode = iron_core_mode;
	}
	public String getWinding_material() {
		return winding_material;
	}
	public void setWinding_material(String winding_material) {
		this.winding_material = winding_material;
	}
	public String getInsulation_corrosion_level() {
		return insulation_corrosion_level;
	}
	public void setInsulation_corrosion_level(String insulation_corrosion_level) {
		this.insulation_corrosion_level = insulation_corrosion_level;
	}
	public String getOil_box_airproof_mode() {
		return oil_box_airproof_mode;
	}
	public void setOil_box_airproof_mode(String oil_box_airproof_mode) {
		this.oil_box_airproof_mode = oil_box_airproof_mode;
	}
	public String getYawp_value() {
		return yawp_value;
	}
	public void setYawp_value(String yawp_value) {
		this.yawp_value = yawp_value;
	}
	public String getEnvelop_mode() {
		return envelop_mode;
	}
	public void setEnvelop_mode(String envelop_mode) {
		this.envelop_mode = envelop_mode;
	}
	public String getInstallation_type() {
		return installation_type;
	}
	public void setInstallation_type(String installation_type) {
		this.installation_type = installation_type;
	}
	public String getTap_position() {
		return tap_position;
	}
	public void setTap_position(String tap_position) {
		this.tap_position = tap_position;
	}
	public String getTap_area() {
		return tap_area;
	}
	public void setTap_area(String tap_area) {
		this.tap_area = tap_area;
	}
	public String getHign_vol_rated_little_scc() {
		return hign_vol_rated_little_scc;
	}
	public void setHign_vol_rated_little_scc(String hign_vol_rated_little_scc) {
		this.hign_vol_rated_little_scc = hign_vol_rated_little_scc;
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
	public String getTransformer_no() {
		return transformer_no;
	}
	public void setTransformer_no(String transformer_no) {
		this.transformer_no = transformer_no;
	}
	public String getLine_no() {
		return line_no;
	}
	public void setLine_no(String line_no) {
		this.line_no = line_no;
	}
	public String getLine_name() {
		return line_name;
	}
	public void setLine_name(String line_name) {
		this.line_name = line_name;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getBuried_dimensions() {
		return buried_dimensions;
	}
	public void setBuried_dimensions(String buried_dimensions) {
		this.buried_dimensions = buried_dimensions;
	}
	public String getNature_of_ele_consumed() {
		return nature_of_ele_consumed;
	}
	public void setNature_of_ele_consumed(String nature_of_ele_consumed) {
		this.nature_of_ele_consumed = nature_of_ele_consumed;
	}
	public String getResidential_capacity() {
		return residential_capacity;
	}
	public void setResidential_capacity(String residential_capacity) {
		this.residential_capacity = residential_capacity;
	}
	public String getCommercial_capacity() {
		return commercial_capacity;
	}
	public void setCommercial_capacity(String commercial_capacity) {
		this.commercial_capacity = commercial_capacity;
	}
	public String getIndustrial_capacity() {
		return industrial_capacity;
	}
	public void setIndustrial_capacity(String industrial_capacity) {
		this.industrial_capacity = industrial_capacity;
	}
	public String getNon_industrial_capacity() {
		return non_industrial_capacity;
	}
	public void setNon_industrial_capacity(String non_industrial_capacity) {
		this.non_industrial_capacity = non_industrial_capacity;
	}
	public String getFarmland_capacity() {
		return farmland_capacity;
	}
	public void setFarmland_capacity(String farmland_capacity) {
		this.farmland_capacity = farmland_capacity;
	}
	public String getBulk_gas() {
		return bulk_gas;
	}
	public void setBulk_gas(String bulk_gas) {
		this.bulk_gas = bulk_gas;
	}
	public String getRated_pressure() {
		return rated_pressure;
	}
	public void setRated_pressure(String rated_pressure) {
		this.rated_pressure = rated_pressure;
	}
	public String getRated_capacity() {
		return rated_capacity;
	}
	public void setRated_capacity(String rated_capacity) {
		this.rated_capacity = rated_capacity;
	}
	public String getLoad_loss() {
		return load_loss;
	}
	public void setLoad_loss(String load_loss) {
		this.load_loss = load_loss;
	}
	public String getHigh_voltage_box_gas() {
		return high_voltage_box_gas;
	}
	public void setHigh_voltage_box_gas(String high_voltage_box_gas) {
		this.high_voltage_box_gas = high_voltage_box_gas;
	}
	public String getCooling_system_gas() {
		return cooling_system_gas;
	}
	public void setCooling_system_gas(String cooling_system_gas) {
		this.cooling_system_gas = cooling_system_gas;
	}
	public String getEquipment_type() {
		return equipment_type;
	}
	public void setEquipment_type(String equipment_type) {
		this.equipment_type = equipment_type;
	}
	public String getIs_standby_phase() {
		return is_standby_phase;
	}
	public void setIs_standby_phase(String is_standby_phase) {
		this.is_standby_phase = is_standby_phase;
	}
	public String getOltc_gas() {
		return oltc_gas;
	}
	public void setOltc_gas(String oltc_gas) {
		this.oltc_gas = oltc_gas;
	}
	public String getNeutral_groun_mode() {
		return neutral_groun_mode;
	}
	public void setNeutral_groun_mode(String neutral_groun_mode) {
		this.neutral_groun_mode = neutral_groun_mode;
	}
	public String getImpedance_voltage() {
		return impedance_voltage;
	}
	public void setImpedance_voltage(String impedance_voltage) {
		this.impedance_voltage = impedance_voltage;
	}
	public String getData_from() {
		return data_from;
	}
	public void setData_from(String data_from) {
		this.data_from = data_from;
	}
	@Override
	public String toString() {
		return "Dm_Transformer [province_code=" + province_code + ", id=" + id + ", bureau_code=" + bureau_code
				+ ", type=" + type + "]";
	}
	
	
	
}
