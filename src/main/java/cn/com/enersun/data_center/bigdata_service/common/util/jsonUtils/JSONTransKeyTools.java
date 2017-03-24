package cn.com.enersun.data_center.bigdata_service.common.util.jsonUtils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: JSONTransKeyTools.java 
* @Package cn.com.enersun.data_center.bigdata_service.common.util.jsonUtils 
* @Description: TODO(JSON key和value值替换) 
* @author enersun_lhb  
* @date 2016年9月26日 下午1:46:09 
* @version V1.0   
*/
public class JSONTransKeyTools {
	

	//将JSONObject转化为Map<Int,String>
	 public static Map<String,String> transJsonObjectMap(JSONObject o1){
	        Map<String,String> outMap = new HashMap<String,String>();
	        @SuppressWarnings("unchecked")
			Iterator<String> nameItr = o1.keys();
			String name ;
			while (nameItr.hasNext()) {
				name = nameItr.next();
				outMap.put(name, o1.getString(name));
			}
			return outMap;
	    }
	 

	//递归将所有key值换成小写
	 public static JSONObject transJsonKeyToLowerCose(JSONObject o1){
	        JSONObject o2=new JSONObject();
	         @SuppressWarnings("rawtypes")
			Iterator it = o1.keys();
	            while (it.hasNext()) {
	                String key = (String) it.next();
	                Object object = o1.get(key);
	                if(object.getClass().toString().endsWith("String")){
	                    o2.accumulate(key.toLowerCase(), object);
	                }else if(object.getClass().toString().endsWith("JSONObject")){
	                    o2.accumulate(key.toLowerCase(), JSONTransKeyTools.transJsonKeyToLowerCose((JSONObject)object));
	                }else if(object.getClass().toString().endsWith("JSONArray")){
	                    o2.accumulate(key.toLowerCase(), JSONTransKeyTools.transArray(o1.getJSONArray(key)));
	                }
	            }
	            return o2;
	    }
	 
	public static JSONArray transArray(JSONArray o1) {
		JSONArray o2 = new JSONArray();
		for (int i = 0; i < o1.length(); i++) {
			Object jArray = o1.getJSONObject(i);
			if (jArray.getClass().toString().endsWith("JSONObject")) {
				o2.put(JSONTransKeyTools.transJsonKeyToLowerCose((JSONObject) jArray));
			} else if (jArray.getClass().toString().endsWith("JSONArray")) {
				o2.put(JSONTransKeyTools.transArray((JSONArray) jArray));
			}
		}
		return o2;
	}

	//递归将所有key值替换
		 public static JSONObject transJsonObjectKeyReplace(JSONObject o1, Map<String ,String> attrNameMap){
			 JSONObject o2=new JSONObject();
	         @SuppressWarnings("rawtypes")
			Iterator it = o1.keys();
	            while (it.hasNext()) {
	                String key = (String) it.next();
	                String newkey = replaceKey(key, attrNameMap);
	                Object object = o1.get(key);
	                if(object.getClass().toString().endsWith("String")){
	                    o2.accumulate(newkey, object);
	                }else if(object.getClass().toString().endsWith("JSONObject")){
	                    o2.accumulate(newkey, JSONTransKeyTools.transJsonObjectKeyReplace((JSONObject)object,attrNameMap));
	                }else if(object.getClass().toString().endsWith("JSONArray")){
	                    o2.accumulate(newkey, JSONTransKeyTools.transArray(o1.getJSONArray(key)));
	                }
	            }
	            return o2;
			 
		 }
		 
		 
			public static JSONArray transArray(JSONArray o1 , Map<String ,String> attrNameMap ) {
				JSONArray o2 = new JSONArray();
				for (int i = 0; i < o1.length(); i++) {
					Object jArray = o1.getJSONObject(i);
					if (jArray.getClass().toString().endsWith("JSONObject")) {
						o2.put(JSONTransKeyTools.transJsonObjectKeyReplace((JSONObject) jArray,attrNameMap));
					} else if (jArray.getClass().toString().endsWith("JSONArray")) {
						o2.put(JSONTransKeyTools.transArray((JSONArray) jArray));
					}
				}
				return o2;
			}
			
			public static String replaceKey(String key,Map<String ,String> attrNameMap){
				StringBuilder newkey = new StringBuilder();
				String value = attrNameMap.get(key);
				newkey.append(key);
				newkey.append(":");
				newkey.append(value);
				return newkey.toString();  
			}
			
			
			
}
