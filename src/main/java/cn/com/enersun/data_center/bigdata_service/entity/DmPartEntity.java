package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;


/**
 * The persistent class for the DM_PARTS database table.
 * 
 */
public class DmPartEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String province_code;

	private String id;

	private String bureau_code;

	private String site_name;

	private String parts_code;
	
	private String parts_name;
	
	private String device_id;
	
	private String device_name;

	private String classify_id;

	private String plant_transfer_date;

	private String asset_state;

	private String vendor_id;

	private String vendor;
	
	private String device_model_id;

	private String device_model;
	
	private String units;

	private String manufacturer_id;

	private String manufacturer;

	private String leave_factory_no;

	private String leave_factory_date;

	private String amount;

	private String base_voltage_id;

	private String data_source;

	private String is_assambly;

	private String is_virtual_device;

	private String old_alias_name;

	private String old_classify_full_path;

	private String power_grid_flag;
	
	private String remark;

	
	public DmPartEntity(){}


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


	public String getParts_code() {
		return parts_code;
	}


	public void setParts_code(String parts_code) {
		this.parts_code = parts_code;
	}


	public String getParts_name() {
		return parts_name;
	}


	public void setParts_name(String parts_name) {
		this.parts_name = parts_name;
	}


	public String getDevice_id() {
		return device_id;
	}


	public void setDevice_id(String device_id) {
		this.device_id = device_id;
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


	public String getUnits() {
		return units;
	}


	public void setUnits(String units) {
		this.units = units;
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


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
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


	public String getIs_assambly() {
		return is_assambly;
	}


	public void setIs_assambly(String is_assambly) {
		this.is_assambly = is_assambly;
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


	@Override
	public String toString() {
		return "DmPart [province_code=" + province_code + ", id=" + id + ", bureau_code=" + bureau_code + ", site_name="
				+ site_name + ", parts_code=" + parts_code + ", parts_name=" + parts_name + ", device_name="
				+ device_name + ", classify_id=" + classify_id + "]";
	}
	
	
}