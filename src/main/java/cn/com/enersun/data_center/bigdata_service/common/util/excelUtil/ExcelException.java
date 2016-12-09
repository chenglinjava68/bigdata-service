package cn.com.enersun.data_center.bigdata_service.common.util.excelUtil;
/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: ExcelException.java 
* @Package cn.com.enersun.data_center.bigdata_service.common.util 
* @Description: TODO(用一句话描述该文件做什么) 
* @author enersun_lhb  
* @date 2016年6月28日 上午11:07:47 
* @version V1.0   
*/
public class ExcelException extends Exception {  
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExcelException() {  
        // TODO Auto-generated constructor stub  
    }  
  
    public ExcelException(String message) {  
        super(message);  
        // TODO Auto-generated constructor stub  
    }  
  
    public ExcelException(Throwable cause) {  
        super(cause);  
        // TODO Auto-generated constructor stub  
    }  
  
    public ExcelException(String message, Throwable cause) {  
        super(message, cause);  
        // TODO Auto-generated constructor stub  
    }  
}