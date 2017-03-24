package cn.com.enersun.data_center.bigdata_service.entity;

import java.util.List;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: AssetInfoEntity.java 
* @Package cn.com.enersun.data_center.bigdata_service.entity 
* @Description: TODO(设备台账信息) 
* @author enersun_lhb  
* @date 2016年7月18日 下午3:27:54 
* @version V1.0   
*/
public class AssetInfoEntity implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5281068513948101792L;

	private String id;
	private String assetName;
	private String bureau_code;
	private String plant_transfer_date;
	private String classify_id;
	private String asset_state;
	private String base_voltage_id;
	private String power_grid_flag;
	private String themeId;//主题实例ID
	private List<ThemeEntity> theme; //一对多 一个设备对应主题实例
	
	public AssetInfoEntity() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
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

	public String getThemeId() {
		return themeId;
	}

	public void setThemeId(String themeId) {
		this.themeId = themeId;
	}

	public List<ThemeEntity> getTheme() {
		return theme;
	}

	public void setTheme(List<ThemeEntity> theme) {
		this.theme = theme;
	}
	
}
