package cn.com.enersun.data_center.bigdata_service.entity;


/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: IceRealtimeEntity.java 
* @Package cn.com.enersun.data_center.bigdata_service.entity 
* @Description: TODO(实施覆冰信息) 
* @author enersun_lhb  
* @date 2016年7月18日 下午3:27:54 
* @version V1.0   
*/
public class IceRealtimeEntity implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5281068513948101792L;

	private String flags;//名称
	private String bs_id;//终端ID
	private String owner;//组织
	private String update_time;//时间
	private String temperature;//温度
	private String humidity;//湿度
	private String pull;//拉力
	private String ice;//覆冰厚度
	private String ice_ratio;//覆冰比值
	
	
	public IceRealtimeEntity() {
	}


	public String getFlags() {
		return flags;
	}


	public void setFlags(String flags) {
		this.flags = flags;
	}


	public String getBs_id() {
		return bs_id;
	}


	public void setBs_id(String bs_id) {
		this.bs_id = bs_id;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public String getUpdate_time() {
		return update_time;
	}


	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}


	public String getTemperature() {
		return temperature;
	}


	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}


	public String getHumidity() {
		return humidity;
	}


	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}


	public String getPull() {
		return pull;
	}


	public void setPull(String pull) {
		this.pull = pull;
	}


	public String getIce() {
		return ice;
	}


	public void setIce(String ice) {
		this.ice = ice;
	}


	public String getIce_ratio() {
		return ice_ratio;
	}


	public void setIce_ratio(String ice_ratio) {
		this.ice_ratio = ice_ratio;
	}


	@Override
	public String toString() {
		return "IceRealtimeEntity [flags=" + flags + ", bs_id=" + bs_id + ", owner=" + owner + ", update_time="
				+ update_time + "]";
	}

	
	
	
}
