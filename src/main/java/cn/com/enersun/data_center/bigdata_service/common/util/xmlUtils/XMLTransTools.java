package cn.com.enersun.data_center.bigdata_service.common.util.xmlUtils;

import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: XMLTransTools.java 
* @Package cn.com.enersun.data_center.bigdata_service.common.util.xmlUtils 
* @Description: TODO(XML 和 map 、list 之间的转换) 
* @author enersun_lhb  
* @date 2016年9月26日 下午1:46:09 
* @version V1.0   
*/
public class XMLTransTools {
	 
	
	/**

     * 类转xml方法.

     * @param data List<?>

     * @return String

     * @throws

     */

    public static String objectToxml(List<?> list) {

        Document document = DocumentHelper.createDocument();

        Element root  = document.addElement("objects");

        listToxml(list,root);

        return docToString(document);

    }

    /**

     * xml转为String.

     * @param document

     * @return

     * @throws

     */
	private static String docToString(Document document) {
		  String s = ""; 

	        try { 

	            // 使用输出流来进行转化 

	            ByteArrayOutputStream out = new ByteArrayOutputStream(); 

	            // 使用UTF-8编码 

	            OutputFormat format = new OutputFormat("", true, "UTF-8"); 

	            XMLWriter writer = new XMLWriter(out, format); 

	            writer.write(document); 

	            s = out.toString("UTF-8"); 

	        } catch (Exception ex) { 

	            ex.printStackTrace(); 

	        } 

	        return s; 

	}

	  /**

     * List2XML,目前支持List<List> List<Map> List<Map<String,List>>等只有

     * List Map 组合的数据进行转换.

     * @param list

     * @param element

     * @return

     * @throws

     */
	private static Element  listToxml(List<?> list, Element element) {

		int i = 0;

        for (Object o : list) {

            Element nodeElement = element.addElement("object");

            if (o instanceof Map) {

                @SuppressWarnings("unchecked")
				Map<String,String> m = (Map<String, String>) o;

                for (Iterator<Map.Entry<String, String>> iterator = m.entrySet().iterator(); iterator.hasNext();) {

                	Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();

                    Element keyElement = nodeElement.addElement(entry.getKey().toString().toLowerCase());
                    keyElement.setText(entry.getValue().toString());
                }

            } else if (o instanceof List) {
            	Element listElement = nodeElement.addElement("list");
                listToxml((List<?>)o,listElement);

            }
            i++;
            System.out.println("list count "+i);
        }

        return element;

	}

}
