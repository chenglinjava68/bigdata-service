package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;
/**
 * 
* @ClassName: DmDevice 
* @Description: TODO(设备台账) 
* @author enersun_lhb 
* @date 2016年6月8日 下午1:55:42 
*
 */

public class DmDeviceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String province_code;

	private String id;

	private String bureau_code;

	private String site_name;

	private String device_code;

	private String device_name;

	private String classify_id;

	private String plant_transfer_date;

	private String asset_state;

	private String vendor_id;

	private String vendor;

	private String manufacturer_id;

	private String manufacturer;

	private String latest_manufacturer;

	private String device_model_id;

	private String device_model;

	private String leave_factory_no;

	private String leave_factory_date;

	private String use_life;

	private String proprietor_company_oid;

	private String proprietor_company_oname;

	private String proprietor_owner;

	private String status_date;

	private String installation_location;

	private String capital_assets_code;

	private String measurement_unit;

	private String vindicator_unit_oid;

	private String vindicator_unit_oname;

	private String dispatch_level;

	private String is_capital_assets;

	private String amount;

	private String warranty_period;

	private String license_plate_number;

	private String running_code;

	private String longitude;

	private String latitude;

	private String altitude;

	private String topography;

	private String bureau_units_oid;

	private String runmanage_oid;

	private String vindicate_oid;

	private String base_voltage_id;

	private String data_source;

	private String is_share_device;

	private String is_assambly;

	private String is_label;

	private String retire_date;

	private String is_virtual_device;

	private String old_alias_name;

	private String old_classify_full_path;

	private String county_code;

	private String owner_station_oid;

	private String power_grid_flag;

	private String asset_device_id;


	public DmDeviceEntity() {
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


	public String getSite_name() {
		return site_name;
	}


	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}


	public String getDevice_code() {
		return device_code;
	}


	public void setDevice_code(String device_code) {
		this.device_code = device_code;
	}


	public String getDevice_name() {
		return device_name;
	}


	public void setDevice_name(String device_name) {
		this.device_name = device_name;
	}


	public String getClassify_id() {
		return classify_id;
	}


	public void setClassify_id(String classify_id) {
		this.classify_id = classify_id;
	}


	public String getPlant_transfer_date() {
		return plant_transfer_date;
	}


	public void setPlant_transfer_date(String plant_transfer_date) {
		this.plant_transfer_date = plant_transfer_date;
	}


	public String getAsset_state() {
		return asset_state;
	}


	public void setAsset_state(String asset_state) {
		this.asset_state = asset_state;
	}


	public String getVendor_id() {
		return vendor_id;
	}


	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}


	public String getVendor() {
		return vendor;
	}


	public void setVendor(String vendor) {
		this.vendor = vendor;
	}


	public String getManufacturer_id() {
		return manufacturer_id;
	}


	public void setManufacturer_id(String manufacturer_id) {
		this.manufacturer_id = manufacturer_id;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public String getLatest_manufacturer() {
		return latest_manufacturer;
	}


	public void setLatest_manufacturer(String latest_manufacturer) {
		this.latest_manufacturer = latest_manufacturer;
	}


	public String getDevice_model_id() {
		return device_model_id;
	}


	public void setDevice_model_id(String device_model_id) {
		this.device_model_id = device_model_id;
	}


	public String getDevice_model() {
		return device_model;
	}


	public void setDevice_model(String device_model) {
		this.device_model = device_model;
	}


	public String getLeave_factory_no() {
		return leave_factory_no;
	}


	public void setLeave_factory_no(String leave_factory_no) {
		this.leave_factory_no = leave_factory_no;
	}


	public String getLeave_factory_date() {
		return leave_factory_date;
	}


	public void setLeave_factory_date(String leave_factory_date) {
		this.leave_factory_date = leave_factory_date;
	}


	public String getUse_life() {
		return use_life;
	}


	public void setUse_life(String use_life) {
		this.use_life = use_life;
	}


	public String getProprietor_company_oid() {
		return proprietor_company_oid;
	}


	public void setProprietor_company_oid(String proprietor_company_oid) {
		this.proprietor_company_oid = proprietor_company_oid;
	}


	public String getProprietor_company_oname() {
		return proprietor_company_oname;
	}


	public void setProprietor_company_oname(String proprietor_company_oname) {
		this.proprietor_company_oname = proprietor_company_oname;
	}


	public String getProprietor_owner() {
		return proprietor_owner;
	}


	public void setProprietor_owner(String proprietor_owner) {
		this.proprietor_owner = proprietor_owner;
	}


	public String getStatus_date() {
		return status_date;
	}


	public void setStatus_date(String status_date) {
		this.status_date = status_date;
	}


	public String getInstallation_location() {
		return installation_location;
	}


	public void setInstallation_location(String installation_location) {
		this.installation_location = installation_location;
	}


	public String getCapital_assets_code() {
		return capital_assets_code;
	}


	public void setCapital_assets_code(String capital_assets_code) {
		this.capital_assets_code = capital_assets_code;
	}


	public String getMeasurement_unit() {
		return measurement_unit;
	}


	public void setMeasurement_unit(String measurement_unit) {
		this.measurement_unit = measurement_unit;
	}


	public String getVindicator_unit_oid() {
		return vindicator_unit_oid;
	}


	public void setVindicator_unit_oid(String vindicator_unit_oid) {
		this.vindicator_unit_oid = vindicator_unit_oid;
	}


	public String getVindicator_unit_oname() {
		return vindicator_unit_oname;
	}


	public void setVindicator_unit_oname(String vindicator_unit_oname) {
		this.vindicator_unit_oname = vindicator_unit_oname;
	}


	public String getDispatch_level() {
		return dispatch_level;
	}


	public void setDispatch_level(String dispatch_level) {
		this.dispatch_level = dispatch_level;
	}


	public String getIs_capital_assets() {
		return is_capital_assets;
	}


	public void setIs_capital_assets(String is_capital_assets) {
		this.is_capital_assets = is_capital_assets;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	public String getWarranty_period() {
		return warranty_period;
	}


	public void setWarranty_period(String warranty_period) {
		this.warranty_period = warranty_period;
	}


	public String getLicense_plate_number() {
		return license_plate_number;
	}


	public void setLicense_plate_number(String license_plate_number) {
		this.license_plate_number = license_plate_number;
	}


	public String getRunning_code() {
		return running_code;
	}


	public void setRunning_code(String running_code) {
		this.running_code = running_code;
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


	public String getAltitude() {
		return altitude;
	}


	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}


	public String getTopography() {
		return topography;
	}


	public void setTopography(String topography) {
		this.topography = topography;
	}


	public String getBureau_units_oid() {
		return bureau_units_oid;
	}


	public void setBureau_units_oid(String bureau_units_oid) {
		this.bureau_units_oid = bureau_units_oid;
	}


	public String getRunmanage_oid() {
		return runmanage_oid;
	}


	public void setRunmanage_oid(String runmanage_oid) {
		this.runmanage_oid = runmanage_oid;
	}


	public String getVindicate_oid() {
		return vindicate_oid;
	}


	public void setVindicate_oid(String vindicate_oid) {
		this.vindicate_oid = vindicate_oid;
	}


	public String getBase_voltage_id() {
		return base_voltage_id;
	}


	public void setBase_voltage_id(String base_voltage_id) {
		this.base_voltage_id = base_voltage_id;
	}


	public String getData_source() {
		return data_source;
	}


	public void setData_source(String data_source) {
		this.data_source = data_source;
	}


	public String getIs_share_device() {
		return is_share_device;
	}


	public void setIs_share_device(String is_share_device) {
		this.is_share_device = is_share_device;
	}


	public String getIs_assambly() {
		return is_assambly;
	}


	public void setIs_assambly(String is_assambly) {
		this.is_assambly = is_assambly;
	}


	public String getIs_label() {
		return is_label;
	}


	public void setIs_label(String is_label) {
		this.is_label = is_label;
	}


	public String getRetire_date() {
		return retire_date;
	}


	public void setRetire_date(String retire_date) {
		this.retire_date = retire_date;
	}


	public String getIs_virtual_device() {
		return is_virtual_device;
	}


	public void setIs_virtual_device(String is_virtual_device) {
		this.is_virtual_device = is_virtual_device;
	}


	public String getOld_alias_name() {
		return old_alias_name;
	}


	public void setOld_alias_name(String old_alias_name) {
		this.old_alias_name = old_alias_name;
	}


	public String getOld_classify_full_path() {
		return old_classify_full_path;
	}


	public void setOld_classify_full_path(String old_classify_full_path) {
		this.old_classify_full_path = old_classify_full_path;
	}


	public String getCounty_code() {
		return county_code;
	}


	public void setCounty_code(String county_code) {
		this.county_code = county_code;
	}


	public String getOwner_station_oid() {
		return owner_station_oid;
	}


	public void setOwner_station_oid(String owner_station_oid) {
		this.owner_station_oid = owner_station_oid;
	}


	public String getPower_grid_flag() {
		return power_grid_flag;
	}


	public void setPower_grid_flag(String power_grid_flag) {
		this.power_grid_flag = power_grid_flag;
	}


	public String getAsset_device_id() {
		return asset_device_id;
	}


	public void setAsset_device_id(String asset_device_id) {
		this.asset_device_id = asset_device_id;
	}


	@Override
	public String toString() {
		return "DmDevice [province_code=" + province_code + ", id=" + id + ", bureau_code=" + bureau_code
				+ ", site_name=" + site_name + ", device_name=" + device_name + ", classify_id=" + classify_id + "]";
	}

	
	
}