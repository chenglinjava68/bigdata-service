package cn.com.enersun.data_center.bigdata_service.common.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: DataFormatUtils.java 
* @Package cn.com.enersun.data_center.bigdata_service.common.util 
* @Description: TODO(数据格式化工具类) 
* @author enersun_lhb  
* @date 2016年6月22日 下午6:14:36 
* @version V1.0   
*/
public class DataFormatUtils {
	
	 /**
     * 
    * map转换json.
    * <br>详细说明
    * @param map 集合
    * @return
    * @return String json字符串
    * @throws
    * @author lhb
     */
    public static String mapToJson(Map<String, String> map) {
        Set<String> keys = map.keySet();
        String key = "";
        String value = "";
        StringBuffer jsonBuffer = new StringBuffer();
        jsonBuffer.append("{");
        for (Iterator<String> it = keys.iterator(); it.hasNext();) {
            key = (String) it.next();
            value = map.get(key);
            jsonBuffer.append(key + ":" +"\""+ value+"\"");
            if (it.hasNext()) {
                jsonBuffer.append(",");
            }
        }
        jsonBuffer.append("}");
        return jsonBuffer.toString();
    }

}
