package cn.com.enersun.data_center.bigdata_service.constant;

import java.util.HashMap;
import java.util.Map;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: FieldConstant.java 
* @Package cn.com.enersun.data_center.bigdata_service.constant 
* @Description: TODO(查询表字段中英文映射) 
* @author enersun_lhb  
* @date 2016年9月26日 下午2:58:57 
* @version V1.0   
*/
public class FieldConstant {

	public final static Map<String, String> ORGNIZATION_ATTR = new HashMap<String, String>() {
	    /**
		 * 组织机构信息
		 */
		private static final long serialVersionUID = 9013026328807413634L;

		{
	    	put("org_name", "组织名称");
	    	put("org_code", "组织编码");
	    	put("name_full_path", "组织全路径");
	    	put("short_spell", "简拼");
	    	put("sort_no", "排列序号");
	    }
	};
	
	public final static Map<String, String> SUBSTATION_ATTR = new HashMap<String, String>() {

		private static final long serialVersionUID = 8550443920133048049L;

		/**
		 * 厂站信息
		 */
		{
	    	put("id", "业务ID");
	    	put("province_code", "省编码");
	    	put("bureau_code", "局编码");
	    	put("site_name", "地点名称");
	    	put("plant_transfer_date", "投运日期");
	    	put("retire_date", "退役日期");
	    	put("running_state", "功能位置当前状态");
	    	put("status_date", "进入状态时间");
	    	put("dirtiness_area_level", "污区等级");
	    	put("dominion_mode", "管辖方式");
	    	put("power_grid_flag", "电网类型");
	    	put("remark", "备注");
	    	put("fl_name", "功能位置名称");
	    	put("classify_id", "类别");
	    	put("parent_id", "上级功能位置");
	    	put("fl_type", "功能位置类型");
	    	put("full_path", "全路径");
	    	put("base_voltage_id", "电压等级");
	    	put("dispatch_level", "调度级别");
	    	put("dispatch_dep", "调度机构");
	    	put("owner_station_oid", "所属供电部门");
	    	put("running_code", "运行编号");
	    	put("cloud_to_ground_falsh", "地闪密度等级");
	    	put("thunder_risk_grade", "雷害风险等级序号");
	    	put("ice_classification", "冰区级别");
	    	put("flood_hundred_year", "百年一遇洪水水位");
	    	put("flood_highedt", "历史最高内涝水位");
	    	put("site_design", "场地设计高程");
	    	put("output_count", "出线数");
	    	put("input_count", "进线数");
	    	put("transformer_capacity", "主变压器总容量");
	    	put("transformer_capacity", "变压器数量");
	    	put("type", "变电站类别");
	    	put("sub_type", "变电站类型");
	    	put("center_substation_id", "中心站ID");
	    	put("center_substation_name", "中心站名称");
	    	put("address", "地址");
	    	put("designed_company", "设计单位名称");
	    	put("builder_company", "施工单位");
	    	put("proprietor_company_oname", "产权单位");
	    	put("proprietor_company_oid", "产权单位ID");
	    	put("control_type", "控制方式");
	    	put("owner_area", "所属区域");
	    	put("duty_type", "值守方式");
	    	put("electrical_instal_company", "电气安装单位");
	    	put("connection_mode", "主接线方式");
	    	put("outlet_count_500kv", "500KV出线总回路");
	    	put("outlet_count_220kv", "220KV出线总回路");
	    	put("outlet_count_110kv", "110KV出线总回路");
	    	put("outlet_count_35kv", "35KV出线总回路");
	    	put("outlet_count_20kv", "20KV出线总回路");
	    	put("outlet_count_10kv", "10KV出线总回路");
	    	put("capacitor_compensate_capacity", "电容器无功补偿容量");
	    	put("reactor_rc", "电抗器无功补偿容量");
	    	put("communications_overlay", "通信覆盖情况");
	    	put("coastal_altitude", "海拔高度");
	    	put("seismic_intensity", "地震烈度");
	    	put("capacity_constitute", "容量构成");
	    	put("marketing_number", "电力营销系统编号");
	    	put("bus_section", "母线分段");
	    	put("interval_nums", "中压馈线间隔数量");
	    	put("runmanage_dep_id", "运行管理部门");
	    	put("is_ring", "是否环网");
	    	put("power_line", "供电线路");
	    	put("alternate_line", "备用线路");
	    	put("wind_spped_thirty_year", "30年一遇设计风速");
	    	put("wind_spped_fifty_year", "50年一遇设计风速");
	    }
	};
	
	public final static Map<String, String> DEFECT_ATTR = new HashMap<String, String>() {

		/**
		 * 缺陷字段映射
		 */
		private static final long serialVersionUID = -489516090418755452L;
		{
		put("id", "业务ID");
		put("orgname", "供电局");
		put("sitename", "变电站");
		put("defectlevel", "缺陷等级");
		put("specialitytype", "类别");
		put("devicename", "设备名称");
		put("partsname", "部件名称");
		put("functionlocationname", "设备类别");
		put("voltagelevel", "功能位置");
		put("findtime", "电压等级");
		put("defectphenomenon", "发现时间");
		put("defectdesc", "缺陷表象");
		put("defecttypename", "缺陷描述");
		put("createdate", "报告时间");
		put("oughtdealtime", "应消缺时间");
		put("overtime", "是否超期");
		put("oughttime", "剩余消缺时间");
		put("dealtime", "消缺时间");
		put("dealdesc", "处理意见");
		put("vendorname", "生产厂家");
		put("modelname", "设备型号");
		put("defectcause", "缺陷原因");
		put("defectposition", "缺陷部位");
		put("solutiondesc", "解决方案");
		put("flowstate", "消缺状态");
		put("state", "处理状态");
		put("devicereleasedate", "生产日期");
		put("devicerundate", "投运日期");
		}
	};
	
	public final static Map<String, String> DM_DEVICE_ATTR = new HashMap<String, String>() {

		/**
		 * 
		 */
		private static final long serialVersionUID = 4282268718358426943L;

		/**
		 * 设备基本信息字段映射
		 */
		{
		put("province_code", "省编码");
		put("id", "业务ID");
		put("bureau_code", "局编码");
		put("site_name", "地点");
		put("device_code", "设备编码");
		put("device_name", "设备名称");
		put("classify_id", "设备类别");
		put("plant_transfer_date", "投运日期");
		put("asset_state", "资产状态");
		put("vendor_id", "供应商ID");
		put("vendor", "供应商");
		put("manufacturer_id", "厂家ID");
		put("manufacturer", "厂家名称");
		put("latest_manufacturer", "厂家现用名");
		put("device_model_id", "设备型号ID");
		put("device_model", "设备型号");
		put("leave_factory_no", "出厂编号");
		put("leave_factory_date", "出厂日期");
		put("use_life", "使用寿命");
		put("proprietor_company_oid", "产权单位ID");
		put("proprietor_company_oname", "产权单位名称");
		put("proprietor_owner", "公用专用");
		put("status_date", "进入当前状态日期");
		put("installation_location", "安装地点");
		put("capital_assets_code", "资产编码");
		put("measurement_unit", "计量单位");
		put("vindicator_unit_oid", "维护单位ID");
		put("vindicator_unit_oname", "维护单位名称");
		put("dispatch_level", "调管单位");
		put("is_capital_assets", "是否资产级设备");
		put("amount", "数量");
		put("warranty_period", "原厂保修期");
		put("license_plate_number", "车牌号码");
		put("running_code", "运行编号");
		put("longitude", "经度");
		put("latitude", "纬度");
		put("altitude", "海拔高度");
		put("topography", "地形地貌");
		put("bureau_units_oid", "设备运维单位ID");
		put("runmanage_oid", "设备运维部门ID");
		put("vindicate_oid", "运维班组ID");
		put("base_voltage_id", "电压等级");
		put("data_source", "数据来源");
		put("is_share_device", "是否共享设备");
		put("is_assambly", "是否为组件");
		put("is_label", "是否贴标");
		put("retire_date", "退役日期");
		put("is_virtual_device", "是否是虚拟设备");
		put("old_alias_name", "旧类别编码");
		put("old_classify_full_path", "旧类别全路径");
		put("county_code", "区县局编码");
		put("owner_station_oid", "所属供电部门");
		put("power_grid_flag", "电网类型");
		put("asset_device_id", "所属资产设备ID");
		}
	};
	
	
	public final static Map<String, String> DM_PARTS_ATTR = new HashMap<String, String>() {


		private static final long serialVersionUID = 8513299302467526030L;

		/**
		 * 部件基本信息字段映射
		 */
		{
		put("province_code", "省编码");
		put("id", "业务ID");
		put("bureau_code", "局编码");
		put("site_name", "地点");
		put("parts_code", "部件编码");
		put("parts_name", "部件名称");
		put("classify_id", "部件类别");
		put("device_id", "所属设备ID");
		put("device_name", "所属设备名称");
		put("base_voltage_id", "电压等级");
		put("leave_factory_no", "出厂编号");
		put("leave_factory_date", "出厂年月");
		put("plant_transfer_date", "投运日期");
		put("asset_state", "资产状态");
		put("amount", "数量");
		put("units", "计量单位");
		put("latest_manufacturer", "厂家现用名");
		put("manufacturer_id", "厂家ID");
		put("manufacturer", "厂家名称");
		put("device_model_id", "型号ID");
		put("device_model", "型号名称");
		put("vendor_id", "供应商ID");
		put("vendor", "供应商");
		put("is_assambly", "是否逻辑组件");
		put("data_source", "数据来源");
		put("old_alias_name", "旧类别编码");
		put("old_classify_full_path", "旧类别全路径");
		put("power_grid_flag", "电网类型");
		put("remark", "备注");
		}
	};
	
	
	public final static Map<String, String> DM_LINES_ATTR = new HashMap<String, String>() {
		private static final long serialVersionUID = 8513299302467526030L;
		/**
		 * 线路基本信息字段映射
		 */
		{
		put("province_code", "省编码");
		put("id", "业务ID");
		put("bureau_code", "局编码");
		put("fl_name", "线路名称");
		put("base_voltage_id", "电压等级");
		put("line_department", "所属部门");
		put("phase_sequence", "相序");
		put("ground_clearance", "离地高度");
		put("conn_code_load", "导线排列方式");
		put("phases", "相位");
		put("split_type", "分裂形式");
		put("issecondary", "是否转供线路");
		put("is_branch", "是否是支线");
		put("rated_amps", "额定电流(A)");
		put("line_alias", "别名");
		put("rating_capacity", "额定输送容量(MVA)");
		put("rating_electricity", "额定输送电流(A)");
		put("economy_capacity", "经济输送容量(MVA)");
		put("overhead_line_length", "架空长度");
		put("enter_substation", "进线站");
		put("out_substation", "出线站");
		put("designed_company", "设计单位");
		put("builder_company", "施工单位");
		put("line_type", "线路类型");
		put("cable_line_length", "电缆长度");
		put("line_function", "线路功能");
		put("enter_substation_id", "进线站ID");
		put("out_substation_id", "出线站ID");
		put("out_substation_type", "出线站类型");
		put("pole_count", "杆塔数量");
		put("start_pole_no", "起始杆塔号");
		put("end_pole_no", "终止杆塔号");
		put("dominion_area_name", "代管县区(DominionArea)");
		put("dispatch_juridiction_company", "调度管辖单位");
		put("juridiction_company", "运行维护单位名称");
		put("demarcation_point", "分界点");
		put("tsubstation", "T接变电站");
		put("tpole_no", "T接杆塔号");
		put("tpoint_count", "T接点个数");
		put("pole_line_length", "同塔线路长度");
		put("earth_line_length", "入地线路长度");
		put("tline_length", "T接线路长度");
		put("pole_totalcount", "杆塔总基数");
		put("tension_tower_totalcount", "耐张塔总基数");
		put("straight_tower_totalcount", "直线塔基数");
		put("wire_model", "导线型号");
		put("split_count", "分裂数");
		put("ground_model", "地线型号");
		put("overhead_ground", "架空地线");
		put("opgw", "OPGW");
		put("coastal_altitude", "海拔高度");
		put("seismic_intensity", "地震烈度");
		put("max_wind_speed", "最大设计风速");
		put("ice_thickness", "冰区分布(厚度)");
		put("ice_length", "冰区分布(长度)");
		put("area_level", "污区分布(污级)");
		put("area_length", "污区分布(长度)");
		put("special_sections", "需关注特殊区段");
		put("insulator_type", "绝缘子类型");
		put("line_department_id", "所属部门ID");
		put("same_tower_erection", "同杆架设情况");
		put("area_feature", "地区特征值域");
		put("line_feature", "线路性质值域");
		put("build_company", "建设单位");
		put("supervision_company", "监理单位");
		put("max_allowable_ampacity", "最大允许载流量(单位：A)");
		put("safe_current_twenty", "20℃安全电流(单位：A)");
		put("safe_current_forty", "40℃安全电流(单位：A)");
		put("max_power_radius", "最长供电半径(单位：米)");
		put("max_current_twenty_five", "最大允许电流(25℃)");
		put("max_current_thirty", "最大允许电流(30℃)");
		put("max_current_thirty_five", "最大允许电流(35℃)");
		put("max_current_forty", "最大允许电流(40℃)");
		put("groundknife_dispatchcode", "地刀调度编号");
		put("upknife_dispatchcode", "上刀调度编号");
		put("downknife_dispatchcode", "下刀调度编号");
		put("wiring_mode", "接线模式");
		put("ct_ratio", "保护CT变比");
		put("is_dedicatedline", "是否专线");
		put("marketing_number", "电力营销系统编号");
		put("is_ring", "是否环网");
		put("is_allload_transfer", "是否负荷能全部转移");
		put("main_transformer", "所在供电主变");
		put("bus_line", "所在运行母线");
		put("juridiction_line_length", "管辖线路长度(单位：米)");
		put("plant_transfer_origdate", "最早投产日期");
		put("change_record", "设备改线记录");
		put("data_from", "数据来源");
	
		}
	};
	
	public final static Map<String, String> DM_TOWER_ATTR = new HashMap<String, String>() {

		private static final long serialVersionUID = 3058258987294456032L;

		/**
		 * 杆塔基本信息字段映射
		 */
		{
		put("province_code", "省编码");
		put("id", "业务ID");
		put("bureau_code", "局编码");
		put("fl_name", "杆塔名称");
		put("base_voltage_id", "电压等级");
		put("sort_no", "排序");
		put("longitude", "经度");
		put("latitude", "纬度");
		put("ice_thickness", "设计覆冰厚度");
		put("wind_zone", "所处风区分布图等级");
		put("pollution_level", "所处分布图污区等级");
		put("coastal_altitude", "海拔高度");
		put("responsible_person", "设备责任人");
		put("use_span", "使用档距");
		put("rotation_degree", "转角度数");
		put("design_polluted_area", "设计污区等级");
		put("highest_water_level", "历史最高内涝水位");
		put("water_level", "1%概率洪水水位");
		put("seismic_fortification_intensit", "抗震设防烈度");
		put("antifouling_config_level", "防污配置等级");
		put("horizontal_span", "水平档距");
		put("vertical_span", "垂直档距");
		put("fifty_wind_speed", "50年一遇设计风速");
		put("thirty_wind_speed", "30年一遇设计风速");
		put("design_wind_speed", "设计风速");
		put("thunderstorm_days", "设计雷暴日数");
		put("lightning_risk_level", "雷害风险等级");
		put("ground_flash_rating", "地闪密度等级");
		put("ice_prevention_measure", "防冰措施");
		put("lightning_protection", "防雷措施");
		put("ice_distribution_level", "所处冰区分布图等级");
		put("data_from", "数据来源");
		}
	};
	
	public final static Map<String, String> DM_TRANSFORMER_ATTR = new HashMap<String, String>() {
		private static final long serialVersionUID = 3202113931920652936L;
		/**
		 * 主配网变压器的技术参数信息字段映射
		 */
		{
		put("province_code", "省编码");
		put("id", "业务ID");
		put("bureau_code", "局编码");
		put("type", "变压器类型");
		put("hign_low_impe_vl_max", "杆塔高压－低压阻抗电压(最大档位)");
		put("hign_low_impe_vl_rated", "高压－低压阻抗电压(额定档位)等级");
		put("hign_low_impe_vl_min", "高压－低压阻抗电压(最小档位)");
		put("hign_mid_impe_vl_max", "高压－中压阻抗电压(最大档位)");
		put("hign_mid_impe_vl_rated", "高压－中压阻抗电压(额定档位)");
		put("hign_mid_impe_vl_min", "高压－中压阻抗电压(最小档位)");
		put("mid_low_impedance_vl", "中压－低压阻抗电压");
		put("no_load_wastage", "空载损耗");
		put("no_load_current", "空载电流");
		put("zero_seq_impedance", "零序阻抗");
		put("mid_vol_rated_little_scc", "中压侧额定短时耐受短路电流");
		put("low_vol_rated_little_scc", "低压侧额定短时耐受短路电流");
		put("oil_weight", "油重气重");
		put("oil_mark", "油号");
		put("traffic_weight", "运输重");
		put("upper_oil_box_weight", "上节油箱吊重");
		put("machine_weight", "器身吊重");
		put("total_weight", "总重量");
		put("oil_manufacturer", "变压器油(或SF6)厂家");
		put("oil_temp_alarm_value", "油温报警值");
		put("winding_temp_alarm_value", "绕组温报警值");
		put("rated_voltage", "额定电压");
		put("adjust_type", "调压方式");
		put("rated_voltage_ratio", "额定电压比及电压级差");
		put("cooling_mode", "冷却方式");
		put("high_vol_rated_capacity", "高压额定容量");
		put("high_vol_rated_current", "高压额定电流");
		put("mid_vol_rated_capacity", "中压额定容量");
		put("mid_vol_rated_current", "中压额定电流");
		put("low_vol_rated_capacity", "低压额定容量");
		put("low_vol_rated_current", "低压额定电流");
		put("tie_line_group", "结线组别");
		put("insulation_level", "绝缘水平");
		put("standard_code", "标准代号");
		put("hight_low_load_wastage", "高压－低压负载损耗");
		put("hight_mid_load_wastage", "高压－中压负载损耗");
		put("mid_low_load_wastage", "中压－低压负载损耗");
		put("phases", "相数");
		put("dyrcp", "产品代号");
		put("widing_count", "绕组数");
		put("iron_core_mode", "铁芯型式");
		put("winding_material", "绕组导线材质");
		put("insulation_corrosion_level", "绝缘耐热等级");
		put("oil_box_airproof_mode", "油箱密封型式");
		put("yawp_value", "噪声值");
		put("envelop_mode", "包封方式");
		put("installation_type", "安装方式");
		put("tap_position", "运行分接档位");
		put("tap_area", "分接范围");
		put("hign_vol_rated_little_scc", "高压侧额定短时耐受短路电流");
		put("customer_no", "客户编号");
		put("customer_name", "客户名称");
		put("transformer_no", "变压器编号");
		put("line_no", "所属线路编号");
		put("line_name", "线路名称");
		put("latitude", "纬度");
		put("longitude", "经度");
		put("buried_dimensions", "地埋变外形尺寸");
		put("nature_of_ele_consumed", "用电性质");
		put("residential_capacity", "居民照明用户报装容量");
		put("commercial_capacity", "商业用户报装容量");
		put("industrial_capacity", "工业用户报装容量");
		put("non_industrial_capacity", "非工业用户报装容量");
		put("farmland_capacity", "农田排灌报装容量");
		put("bulk_gas", "本体气重");
		put("rated_pressure", "额定气压");
		put("rated_capacity", ".额定容量");
		put("load_loss", "负载损耗");
		put("high_voltage_box_gas", "高压电缆箱气重");
		put("cooling_system_gas", "冷却系统气重");
		put("equipment_type", "设备型式");
		put("is_standby_phase", "是否备用相");
		put("oltc_gas", "有载调压开关气重");
		put("neutral_groun_mode", "中性点接地方式");
		put("impedance_voltage", "阻抗电压");
		put("data_from", "数据来源");
		}
	};
	
	public final static Map<String, String> DM_CURRENT_TRANSFORMER_ATTR = new HashMap<String, String>() {
		private static final long serialVersionUID = 3232669820123926596L;
		/**
		 * 主配网电流互感器的技术参数信息字段映射
		 */
		{
		put("province_code", "省编码");
		put("id", "业务ID");
		put("bureau_code", "局编码");
		put("capacitance", "电容量");
		put("rated_current_ratio", "额定电流比");
		put("rated_voltage", "额定电压");
		put("dyna_stability_current_rated", "额定峰值耐受电流");
		put("two_winding", "二次绕组准确级及二次绕组额定容量_额定电流比");
		put("first_current_ratio", "额定一次电流");
		put("second_capacity_rated", "二次额定容量");
		put("insulation_level", "绝缘水平");
		put("form", "型式");
		put("accuracy_class", "准确级次");
		put("totle_weight", "总重");
		put("rated_air_pressure_sf6", "SF6额定气压");
		put("protected_accuracy_rating", "保护级准确度");
		put("alerting_pressure", "报警气压");
		put("change_current_ratio", "变流比");
		put("standard_code", "标准代号");
		put("collector_count", "采集器数量");
		put("measured_accurately", "测量级准确度");
		put("current_ratio", "电流比");
		put("dynamic_stability_current", "动稳定电流");
		put("short_time_current_rated", "短时电流额定值");
		put("symshortoutcur_acclimit", "对称短路电流准确限值系数");
		put("sym_shortout_cur_ratio", "额定对称短路电流系数");
		put("rated_work_voltage", "额定工作电压");
		put("rated_insulation_level", "额定绝缘水平");
		put("serial_thermocurrent_rated", "额定连续热电流");
		put("rated_first_cur_statedvalue", "额定一次电流标准值");
		put("rated_fir_insula_level", "额定一次绝缘水平");
		put("creepage_space_ratio", "爬电比距");
		put("expander_model", "膨胀器型式");
		put("frequency_range", "频率范围");
		put("gas_weight", "气重");
		put("thermal_arrest_current", "热稳定电流");
		put("thermal_arrest_time", "热稳定时间");
		put("design_serial_number", "设计序列号");
		put("clearance_cpage_dis_filthy", "外绝缘的爬电比距和污秽");
		put("primary_cir_time_constant", "一次回路时间常数");
		put("utility_system", "应用系统");
		put("oil_mark", "油号");
		put("oil_weight", "油重");
		put("nicety_level", "准确级");
		put("accuracy", "准确度");
		put("ratio", "变比");
		put("rated_st_withstand_current", "额定短时耐受电流");
		put("short_thermal_cur_rated", "额定短时热电流");
		put("two_winding_number", "二次绕组数量");
		put("metering_no", "计量点编号");
		put("insulating_medium", "绝缘介质");
		put("customer_name", "客户名称	");
		put("customer_no", "客户编号");
		put("capacity", "容量");
		}
	};
	
	public final static Map<String, String> DM_POTEN_TRANSFORMER_ATTR = new HashMap<String, String>() {
		private static final long serialVersionUID = 6817094864735488125L;
		/**
		 * 主配网电压互感器的技术参数信息字段映射
		 */
		{
		put("province_code", "省编码");
		put("id", "业务ID");
		put("bureau_code", "局编码");
		put("standard_mark", "标准代号");
		put("collector_count", "采集器数量");
		put("measured_accurately", "测量级准确度");
		put("each_capacitor_capacitance", "单节电容器电容量");
		put("symshortoutcur_acclimit", "对称短路电流准确限值系数");
		put("rated_current", "额定电流");
		put("rated_capacity", "额定电容量");
		put("rated_vol_factor_standvalue", "额定电压因数标准值");
		put("dyna_stability_current_rated", "动稳定电流");
		put("short_thermal_cur_rated", "额定短时热电流");
		put("sym_shortout_cur_ratio", "额定对称短路电流系数");
		put("insulation_level_rated", "额定绝缘水平");
		put("first_rated_voltage", "额定一次电压");
		put("first_vol_statedvalue_rated", "额定一次电压标准值");
		put("second_rated_voltage", "二次绕组额定电压准确级及容量");
		put("tie_line_group", "结线组别");
		put("insulation_level", "绝缘水平");
		put("clearance_creepage_distance", "爬电比距");
		put("frequency_range", "频率范围");
		put("gas_weight", "气重");
		put("design_serial_number", "设计序列号");
		put("clearance_cpage_dis_filthy", "外绝缘的爬电比距和污秽");
		put("form", "型式");
		put("primary_cir_time_constant", "一次回路时间常数");
		put("utility_system", "应用系统");
		put("oil_weight", "油重");
		put("totle_weight", "总重");
		put("pressure_rated_sf6", "SF6额定气压");
		put("alerting_pressure", "报警气压");
		put("nicety_level", "准确级");
		put("thermal_arrest_current", "热稳定电流");
		put("accuracy", "准确度");
		put("voltage_ratio", "电压比");
		put("sf6_alarm_pressure", "SF6报警气压");
		put("rated_voltage", "额定电压");
		put("customer_no", "客户编号");
		put("customer_name", "客户名称");
		put("measurement_point_no", "计量点编号");
		put("external_creepage_distance", "外绝缘爬电距离");
		put("is_bayonet_ct", "是否卡口CT");
		put("weight", "体重");
		put("rated_peak_withstand_current", "额定峰值耐受电流");
		put("two_winding_number", "二次绕组数量");
		put("capacity", "容量");
		}
	};
	
	public final static Map<String, String> DM_ISOLATOR_SWITCH_ATTR = new HashMap<String, String>() {
		private static final long serialVersionUID = -3288788544154346337L;

		/**
		 * 主配网隔离开关的技术参数信息字段映射
		 */
		{
		put("province_code", "省编码");
		put("id", "业务ID");
		put("bureau_code", "局编码");
		put("customer_name", "客户名称	");
		put("line_no", "所属线路编号");
		put("tower_no", "所属杆塔");
		put("distribution_trans", "所属配变");
		put("rated_ther_stable_current", "额定热稳定电流");
		put("rated_ther_stable_time", "额定热稳定时间");
		put("rated_move_stable_current", "额定动稳定电流");
		put("min_withvol_opposite", "1min工频耐压(相对地)");
		put("min_withvol_fracture", "1min工频耐压(断口)");
		put("insulation_cree_distance", "外绝缘爬电距离");
		put("line_name", "所属线路");
		put("ther_stable_time", "热稳定时间");
		put("motor_voltage_operation", "操作电机电压");
		put("voltage_operation", "操作控制电压");
		put("operation_type", "操作型式");
		put("motor_voltage", "电机电压");
		put("control_voltage", "控制电压");
		put("bil_withstand_vol_fracture", "雷电冲击耐压(断口)");
		put("bil_withstand_vol_ground", "雷电冲击耐压(相对地)");
		put("linkage_knife", "联动地刀");
		put("rated_ther_stable_time_current", "热稳定电流时间");
		put("power_frequ_uimp", "1min工频耐受电压");
		put("opearte_strike_uimp", "操作冲击耐受电压");
		put("opearte_type", "操作方式");
		put("contact_type", "触头类别");
		put("bottle_creepage_space_ratio", "瓷瓶爬电比距(隔离开关)");
		put("pedestal_aperture_pitch", "底座孔径*孔距");
		put("thermal_arrest", "额定一次绝缘水平");
		put("rated_current", "爬电比距");
		put("rated_voltage", "膨胀器型式");
		put("power_voltage_rated", "频率范围");
		put("thunder_strike_voltage_rated", "气重");
		put("close_open_time", "热稳定电流");
		put("peak_current", "热稳定时间");
		put("ground_type", "设计序列号");
		put("trun_on_space", "外绝缘的爬电比距和污秽");
		put("contacts_resist_voltage", "一次回路时间常数");
		put("ground_resist_voltage", "应用系统");
		put("creepage_space_ratio", "油号");
		put("thermal_arrest_time", "油重");
		put("support_insulator_manufac", "准确级");
		put("insulator_horiz_pull", "准确度");
		put("weight", "变比");
		put("turn_angle", "额定短时耐受电流");
		put("form", "额定短时热电流");
		put("insulator_material", "二次绕组数量");
		put("knife_type", "计量点编号");
		put("customer_no", "客户编号");
		}
	};
	
	public final static Map<String, String> DM_BREAKER_ATTR = new HashMap<String, String>() {
		private static final long serialVersionUID = -4361505180044958177L;

		/**
		 * 主配网断路器的技术参数信息字段映射
		 */
		{
		put("province_code", "省编码");
		put("id", "业务ID");
		put("bureau_code", "局编码");
		put("poles_number", "极数");
		put("gas_pressure_gauge", "SF6气体压力表");
		put("bounce", "合闸弹跳");
		put("fracture_number", "断口数量");
		put("rated_current", "额定电流");
		put("rated_withstand_voltage", "额定工频1min耐压");
		put("inphase_switch_on_no_term", "同相合闸不同期");
		put("interphase_sep_brake_no_term", "相间分闸不同期");
		put("year_leak_rate_sf6", "SF6年漏气率");
		put("frequency_rated", "额定频率");
		put("electrical_life", "电寿命");
		put("machine_life", "机械寿命");
		put("gas_clausura_pressure_sf6", "SF6气体闭锁压力");
		put("interphase_switch_on_no_term", "相间合闸不同期");
		put("operate_type", "操作方式");
		put("operate_rated_type", "操作电源类型");
		put("operate_part_type", "操作机构方式");
		put("rated_short_circuit_capacity", "额定短路接通能力电流");
		put("short_time_tolerance_cur", "短时耐受电流");
		put("contour_dimension", "外形尺寸(长×宽×高)");
		put("weight", "重量");
		put("oil_weight", "油重(气重)");
		put("rated_insulation_voltage", "额定绝缘电压");
		put("power_voltage_rated", "额定工频耐压");
		put("gas_pressure_rated_sf6", "SF6气体额定压力");
		put("gas_manufacturer_sf6", "SF6气体生产厂家");
		put("weight_sf6", "SF6重量");
		put("bottle_creepage_space_ratio", "瓷瓶爬电比距");
		put("short_circuit_time", "额定短路持续时间");
		put("rated_short_time_withstand", "额定短时耐受电流");
		put("rated_short_circuit_breaking", "额定短路开断电流");
		put("step_out_drop_out_cur_rated", "额定失步开断电流");
		put("line_chang_dropout_cur_rated", "额定线路充电开断电流");
		put("first_phase_drop_out_ratio", "首相开断系数");
		put("vacuum_tube_model", "真空泡型式");
		put("mech_life_current_rated", "额定电流下机械寿命");
		put("rated_ultimate_short", "额定极限短路分断电流");
		put("peak_rated", "额定峰值耐受电流");
		put("short_out_conn_current_rated", "额定短路关合电流(峰值)");
		put("triphase_shut_open_same_term", "三相触头分合闸同期性");
		put("rated_voltage", "额定电压");
		put("gas_altering_press_sf6", "SF6气体报警压力");
		put("overtravel", "超行程");
		put("stepout_drop_out_time_rated", "额定失步开断时间");
		put("separating_brake_speed_avg", "平均分闸速度");
		put("open_close_voltage", "分合闸电压");
		put("thermal_arrest_time", "热稳定时间");
		put("factory_cumulative_breaking_sh", "厂家规定累计开断短路电流值");
		put("factory_breaking_short_circuit", "厂家规定开断短路电流值");
		put("shortout_open_close_cur_rated", "额定开断短路电流");
		put("switch_on_time", "合闸时间");
		put("contact_switch_on_jump", "触头合闸弹跳时间");
		put("resistance_circurt_main", "主回路电阻");
		put("auto_shut_no_current_time", "自动重合闸无电流时间");
		put("control_voltage", "控制电压");
		put("open_close_cap_rated", "额定开断容量");
		put("separating_brake_time_innate", "固有分闸时间");
		put("withstand_voltage", "额定冲击耐受电压");
		put("bil_withstand_vol_rated", "雷电冲击耐受电压");
		put("heater_voltage", "加热器电压");
		put("total_travel", "总行程");
		put("shutdrop_all_drop_out_times", "额定短路电流时累计开断次数");
		put("opearte_order_rated", "额定操作顺序");
		put("arcing_medium", "灭弧介质");
		put("secondary_loop_voltage", "二次回路1min工频耐压");
		put("closing_time", "合闸时间");
		put("opening_time", "分闸时间");
		put("breaking_time", "分断时间");
		put("interrupting_time", "全开断时间");
		put("install_type", "安装方式");
		put("fuse_location", "配用熔断器位置");
		put("inphase_sep_brake_no_term", "同相分闸不同期");
		put("customer_number", "客户编号");
		put("device_model", "设备型式");
		put("reclosing_operation_sequence", "重合闸操作顺序");
		put("operating_location", "运行地点");
		put("type_style", "类型");
		put("customer_name", "客户名称");
		put("creepage_distance", "外绝缘爬电距离");
		put("line_number", "所属线路编号");
		put("distribution_transformer", "所属配变");
		put("tower", "所属杆塔");
		put("three_station", "是否三工位");
		put("with_protection", "是否带继电保护");
		put("with_ftu", "是否带FTU");
		put("use_environment", "使用环境");
		put("form", "型式");
		put("contact_open_space", "触头开距");
		put("oil_buffer_effect_stroke", "油缓冲作用行程");
		put("close_speed_avg", "平均合闸速度");
		}
	};
	
	public final static Map<String, String> DM_FUSE_ATTR = new HashMap<String, String>() {
		private static final long serialVersionUID = 744804822457519841L;

		/**
		 * 主配网熔断器的技术参数信息字段映射
		 */
		{
		put("province_code", "省编码");
		put("id", "业务ID");
		put("bureau_code", "局编码");
		put("fuse_current_rated", "熔丝额定电流");
		put("voltage_current", "额定电压");
		put("ground_power_voltage", "1min工频耐压(相对地)");
		put("rated_breaking_current", "额定短路开断电流");
		put("contacts_resist_voltage", "雷电冲击耐压(断口)");
		put("fuse_pr_current", "熔断器底座额定电流");
		put("contacts_power_voltage", "1min工频耐压(断口)");
		put("clearance_creepage_distance", "外绝缘爬电距离");
		put("rated_breaking_capacity", "额定短路开断容量");
		put("ground_resist_voltage", "雷电冲击耐压(相对地)");
		put("rated_current", "额定电流");
		put("customer_no", "客户编号");
		put("customer_name", "客户名称");
		put("line_no", "所属线路编号");
		put("tower_no", "所属杆塔");
		put("distribution_trans", "所属配变");
		put("line_name", "所属线路");
		}
	};
}
