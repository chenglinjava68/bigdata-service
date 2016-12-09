package cn.com.enersun.data_center.bigdata_service.constant;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: CommonConstant.java 
* @Package com.enersun.data_center.bigdata_service.common.constant 
* @Description: TODO(common模块的一些常量或者不在库中字典定义) 
* @author enersun_lhb   
* @date 2016年6月13日 上午11:51:31 
* @version V1.0   
*/

public class CommonConstant {

	// 模块code
	public  class ModuleCode {
		
		public ModuleCode(){}
		
		public static final String DEVINFO = "devInfo";// 设备台账信息模块的code

		public static final String DEFECTINFO = "defectInfo";// 设备缺陷模块的code
		
		public static final String TERMINALINFO = "terminalInfo";// 装置模块code
		
		public static final String THEMEINFO = "themeInfo";// 主题实例模块code
		
		public static final String MONITORINFO = "monitorInfo";// 监测数据模块code

		public static final String MICROSERVICE = "microService";// 微服务台账模块code
	}

	//装置模块使用的一些常量定义
	public class terminalMode {
       public terminalMode(){
    	   
       }
		public class StatusDic{

			public static final String LX = "0";//离线
			
			public static final String ZX = "1";//在线
		}
	}
	
	public enum ConstantDevDefect {
		//缺陷等级
		URGENT(1),//紧急
		MAJOR(2),//重大
		COMMONLY(3),//一般
		OTHER(4);//其他
		 // 定义私有变量

        private int nCode;
       // 构造函数，枚举类型只能为私有

        private ConstantDevDefect(int _nCode) {

            this.nCode = _nCode;
        }

        @Override
        public String toString() {

            return String.valueOf(this.nCode);

        }
	}
		//缺陷列表类型
		public final class DefectListType{
			public static final String FIND_YESTERDAY = "01";//昨日新发现缺陷数
			public static final String FIND_THISWEEK = "02";//本周新发现缺陷数
			public static final String OVERTIME_THISWEEK = "03";//本周超期未消除缺陷数
			public static final String FIND_THISMONTH = "04";//本月新发现缺陷数
			public static final String OVERTIME_THISMONTH = "05";//本月超期未消除缺陷数
			public static final String FIND_THISYEAR = "06";//本年新发现缺陷数
			public static final String OVERTIME_THISYEAR = "07";//本年新发现缺陷数
		}

	}

