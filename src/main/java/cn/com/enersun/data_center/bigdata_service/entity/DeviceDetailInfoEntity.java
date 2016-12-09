package cn.com.enersun.data_center.bigdata_service.entity;

/**
 * 
 * @创建人 lhb
 * @创建时间 2016年10月31日
 * @描述 资产信息-设备表
 */
public class DeviceDetailInfoEntity implements java.io.Serializable{
 
	private static final long serialVersionUID = -4696981679254216360L;
	private String id;//设备编码
	private String asset_name;//设备名称
	private String bureau_code;//供电局编码
	private String plant_transfer_date;//投运日期
	private String classify_id;//设备类别ID
	private String asset_state; //资产状态(名称)
	private String base_voltage_id; //电压等级(名称)
	private String power_grid_flag;//电网类型(名称)
	
	public DeviceDetailInfoEntity()
	{
		
	}
	
	public DeviceDetailInfoEntity(String asset_name) {
		this.asset_name = asset_name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAsset_name() {
		return asset_name;
	}

	public void setAsset_name(String asset_name) {
		this.asset_name = asset_name;
	}

	public String getBureau_code() {
		return bureau_code;
	}

	public void setBureau_code(String bureau_code) {
		this.bureau_code = bureau_code;
	}

	public String getPlant_transfer_date() {
		return plant_transfer_date;
	}

	public void setPlant_transfer_date(String plant_transfer_date) {
		this.plant_transfer_date = plant_transfer_date;
	}

	public String getClassify_id() {
		return classify_id;
	}

	public void setClassify_id(String classify_id) {
		this.classify_id = classify_id;
	}

	public String getAsset_state() {
		return asset_state;
	}

	public void setAsset_state(String asset_state) {
		this.asset_state = asset_state;
	}

	public String getBase_voltage_id() {
		return base_voltage_id;
	}

	public void setBase_voltage_id(String base_voltage_id) {
		this.base_voltage_id = base_voltage_id;
	}

	public String getPower_grid_flag() {
		return power_grid_flag;
	}

	public void setPower_grid_flag(String power_grid_flag) {
		this.power_grid_flag = power_grid_flag;
	}

	@Override
	public String toString() {
		return "DeviceDetailInfo [assetName=" + asset_name + "]";
	}


}
