package cn.com.enersun.data_center.bigdata_service.common.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Clob;
import java.sql.SQLException;
import java.util.Random;

import org.apache.log4j.Logger;

/**
 * 字符串处理类
 * @author 
 *
 */
public class StringUtils {
	
	private static Logger logger = Logger.getLogger(StringUtils.class);
	
	/**
	 * 判断字符串是否是整数
	 * @param number
	 * @return
	 */
	public static boolean isInteger(String number) {
		boolean isNumber = false;
		if (StringUtils.isNotEmpty(number)) {
			isNumber = number.matches("^([1-9]\\d*)|(0)$");
		}
		return isNumber;
	}
	/**
	 * 判断字符串不为空
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		boolean isNotEmpty=false;
		if(str!=null && !str.trim().equals("") && !str.trim().equalsIgnoreCase("NULL")){
			isNotEmpty=true;
		}
		return isNotEmpty;
	}
	/**
	 * 判断字符串为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		return !isNotEmpty(str);
	}
	/**
	 * 将数组转成SQL认识的字符串     123,432,2312     id in('123','432','2312')
	 * @param ids
	 * @return
	 */
	public static String fromArrayToStr(String[] ids) {
		StringBuffer str=new StringBuffer();
		for(int i=0;i<ids.length;i++){
			str.append("'"+ids[i]+"',");
		}
		if(ids.length>0){
			str.deleteCharAt(str.length()-1);
		}
		return str.toString();
	}
	
	/**
	 * 字符串解码
	 * @param str 编码后的字符串
	 * @return
	 */
	public static String decode(String str){
		String res="";
		try {
			if(str!=null && !"".equals(str)){
				res=URLDecoder.decode(str, "UTF-8");
			}
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getMessage());
		}
		return res;
	}
	
	/**
	 * 字符串编码
	 * @param str 需要编码的字符串
	 * @return
	 */
	public static String encode(String str){
		String res="";
		try {
			if(str!=null && !"".equals(str)){
				res=URLEncoder.encode(str, "UTF-8");
			}
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getMessage());
		}
		return res;
	}
	
	/**
	 * 获得随机数
	 * @return
	 */
	public static String getRandomNum(){
		Random ran = new Random();
		StringBuffer strb = new StringBuffer();
		int num1 = 0;
		for (int i = 0; i < 20 / 8; i++) {// 这里是产生9位的64/8=8次，
			while (true) {
				num1 = ran.nextInt(99999999);
				if (num1 > 10000000) {
					strb.append(num1);
					break;
				}
			}
		}
		return strb.toString();
	}
	
	/**
	 * Clob类型数据转换成String
	 * @param clob
	 * @return
	 */
	public static String clobToString(Clob clob) {
		String reString = "";
		StringBuffer sb = new StringBuffer();
		Reader is = null;
		try {
			is = clob.getCharacterStream();
		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("发生错误： " + e.getMessage());
		}
		// 得到流
		BufferedReader br = new BufferedReader(is);
		String s = null;
		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			logger.error("发生错误： " + e.getMessage());
		}
		while (s != null) {
			// 执行循环将字符串全部取出付值给StringBuffer由StringBuffer转成STRING
			sb.append(s);
			try {
				s = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				logger.error("发生错误： " + e.getMessage());
			}
		}
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
				logger.error("发生错误： " + e.getMessage());
			}
		}
		reString = sb.toString();
		return reString;
	}
	
	/**获取异常信息**/
	public static String getExceptionMsg(Exception e){
		StringBuffer emsg = new StringBuffer();
		if(e!=null){
			StackTraceElement[] st = e.getStackTrace();
			for (StackTraceElement stackTraceElement : st) {
				String exclass = stackTraceElement.getClassName();
				String method = stackTraceElement.getMethodName();
				emsg.append("[类:" + exclass + "]调用"+ method + "时在第" + stackTraceElement.getLineNumber()
				+ "行代码处发生异常!异常类型:" + e.toString()+"\r\n");
			}
		}
		return emsg.toString();
	}


}
