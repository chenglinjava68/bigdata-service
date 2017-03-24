package cn.com.enersun.data_center.bigdata_service.constant;

import java.util.HashMap;
import java.util.Map;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: BaseParamFieldConstant.java 
* @Package cn.com.enersun.data_center.bigdata_service.constant 
* @Description: TODO(基础表字段中英文映射) 
* @author enersun_lhb  
* @date 2017年3月21日 下午2:58:57 
* @version V1.0   
*/
public class BaseParamFieldConstant {
	
	public final static Map<String, String> THEME_TERMINAL_ATTR = new HashMap<String, String>() {

		/**
		 * 缺陷字段映射
		 */
		private static final long serialVersionUID = -489516090418755452L;
		{
		put("orgid", "组织机构");
		put("terminal_name", "终端名称");
		put("tb_id", "终端ID");
		put("lon", "经度");
		put("lat", "纬度");
		put("theme_id", "主题ID");
		put("topic_id", "主题类型id");
		put("topic_name", "主题类型描述");
		put("attribute_id", "主题属性id");
		put("attribute_name", "主题属性名称");
		}
	};
	
	public final static Map<String, String> TOWER_ASSET_ATTR = new HashMap<String, String>() {

		/**
		 * 杆塔设备字段映射
		 */
	
		private static final long serialVersionUID = 5863660196863974985L;

		{
		put("bureau_code", "组织机构");
		put("fl_name", "杆塔号名称");
		put("base_voltage_id", "电压等级");
		put("device_name", "杆塔类型");
		put("material", "材质");
		put("lon", "经度");
		put("lat", "纬度");
		put("suspension_loop", "悬挂回路");
		put("lateral_root_open", "侧面根开");
		put("landform", "地形");
		put("altitude_difference", "高差");
		put("bear_totlee_weight", "横担总重量");
		put("nominal_height", "呼称高");
		put("loop_mode", "回路型式");
		put("base_mode", "基础型式");
		put("crossing", "交叉跨越");
		put("full_height", "全高");
		put("special_area_belong", "所属特殊区域");
		put("tower_mode", "型式");
		put("positive_root_open", "正面根开");
		put("design_ice_thickness", "设计覆冰厚度");
		put("earthing_type", "接地型式");
		put("ground_resistance", "接地设计电阻值");
		put("altitude", "海拔");
		put("tower_weight", "杆塔总重量");
		put("lightning_protection", "防雷措施");
		put("protection_angle", "保护角");
		}
	};
	
	public final static Map<String, String> ICE_REALTIME_ATTR = new HashMap<String, String>() {

		private static final long serialVersionUID = 1651271971507202070L;

		/**
		 * 覆冰实时监测字段映射
		 */
		{
		put("flags", "终端名称");
		put("bs_id", "终端编码");
		put("lon", "经度");
		put("lat", "纬度");
		put("owner", "组织");
		put("update_time", "时间");
		put("temperature", "温度");
		put("humidity", "湿度");
		put("pull", "拉力");
		put("ice", "覆冰厚度");
		put("ice_ratio", "覆冰比值");
		}
	};
	
	public final static Map<String, String> WILDFIRE_REMOTE_ATTR = new HashMap<String, String>() {

		private static final long serialVersionUID = 7528729261593763551L;

		/**
		 * 山火卫星遥测字段映射
		 */
		{
		    put("id", "ID");
			put("type", "数据类型");
			put("lon", "经度");
			put("lat", "纬度");
			put("accept_time", "时间");
			put("place_name", "地点");
			put("description", "描述");
			put("radius", "半径m");
			put("speed", "火线蔓延速度");
		}
	};
}
