package cn.com.enersun.data_center.bigdata_service.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * 
 * @创建人 :chenjie
 * @创建时间：2015年11月25日 @描述：日期公用类
 */
public class DateTimeUtil {

	public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";

	public static final String DEFAULT_CN_DATE_FORMAT = "yyyy年MM月dd日";

	public static final String DEFAULT_DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

	public static final String DEFAULT_POIT_DATE_FORMAT = "yyyy.MM.dd";

	@SuppressWarnings("unused")
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(DEFAULT_DATE_FORMAT);

	@SuppressWarnings("unused")
	private static final SimpleDateFormat DATETIME_FORMAT = new SimpleDateFormat(DEFAULT_DATETIME_FORMAT);

	/**
	 * @Title: parseStrToDate @Description: TODO(根据格式将字符串转换为日期) @param @param
	 * dateStr @param @param formatStr @param @return 设定文件 @return Date
	 * 返回类型 @throws
	 */
	public static Date parseStrToDate(String dateStr, String formatStr) {

		SimpleDateFormat dateFormat = new SimpleDateFormat(formatStr);
		Date date = null;
		try {
			date = dateFormat.parse(dateStr);
		} catch (ParseException ex) {
			date = null;
		}
		dateFormat = null;
		return date;
	}

	/**
	 * @Title: formatDateToStr @Description: TODO(日期转换为字符串) @param @param
	 * date @param @param formatStr @param @return 设定文件 @return String
	 * 返回类型 @throws
	 */
	public static String formatDateToStr(Date date, String formatStr) {
		if (date == null || formatStr == null || formatStr.isEmpty()) {
			return null;
		}
		SimpleDateFormat format = new SimpleDateFormat(formatStr);
		String dateStr = format.format(date);
		format = null;
		return dateStr;
	}

	/**
	 * @Title: getNow @Description: TODO(获取系统当前时间) @param @return 设定文件 @return
	 * Date 返回类型 @throws
	 */
	public static Date getNow() {
		Calendar now = Calendar.getInstance();
		return now.getTime();
	}

	/**
	 * 
	 * 描述：把字符串的时间转换为Date对象
	 * 
	 * @param strDate
	 * @return
	 * @throws Exception
	 *             最后修改时间：2015年4月14日 作者：chenjie
	 */
	public static Date parseDateFromString(String strDate) throws Exception {
		try {
			if (strDate == null || strDate.isEmpty()) {
				throw new RuntimeException("时间值字符串为空！");
			}
			strDate = strDate.trim();
			if (strDate.contains("/"))
				strDate = strDate.replaceAll("/", "-");
			String formatStr = "";
			// 如果format为空，根据strDate来判断format格式
			// yyyy-MM-dd HH:mm:ss
			switch (strDate.length()) {
			case 4: {
				formatStr = "yyyy";
				break;
			}
			case 5: {
				if (strDate.substring(2, 3).equals("-")) {
					formatStr = "MM-dd";
				} else if (strDate.substring(2, 3).equals(":")) {
					formatStr = "HH:mm";
				} else {
					throw new RuntimeException("时间格式不正确！值：" + strDate);
				}
			}
				break;
			case 7: {
				formatStr = "yyyy-MM";
			}
				break;
			case 10: {
				formatStr = "yyyy-MM-dd";
			}
				break;
			case 13: {
				formatStr = "yyyy-MM-dd HH";
			}
				break;
			case 16: {
				formatStr = "yyyy-MM-dd HH:mm";
			}
				break;
			case 17: {
				formatStr = "yyyy-M-d HH:mm:ss";
			}
				break;
			case 18: {
				if (strDate.charAt(6) == '-')
					formatStr = "yyyy-M-dd HH:mm:ss";
				else
					formatStr = "yyyy-MM-d HH:mm:ss";
			}
				break;
			case 19: {
				formatStr = "yyyy-MM-dd HH:mm:ss";
			}
				break;
			default:
				throw new RuntimeException("时间格式不正确！值：" + strDate);
			}
			// 如果format不为空，直接使用
			SimpleDateFormat format = new SimpleDateFormat(formatStr);
			return format.parse(strDate);
		} catch (Exception e) {
			RuntimeException ex = new RuntimeException(e.getMessage() + "-->" + "根据字符串解析时间异常！参数值：");
			ex.setStackTrace(e.getStackTrace());
			throw ex;
		}
	}

	/**
	 * 
	 * 描述：获取若干天之前或之后的时间
	 * 
	 * @param date
	 * @param days
	 * @return
	 * @throws Exception
	 *             最后修改时间：2015年5月7日 作者：chenjie
	 */
	public static Date fetchTheDateAfter(Date date, int days) throws Exception {
		try {
			Calendar cld = Calendar.getInstance();
			cld.setTime(date);
			cld.add(Calendar.DATE, days);
			return cld.getTime();
		} catch (Exception e) {
			throw new RuntimeException("获取日期的前一天失败！");
		}
	}

	/**
	 * 获得月份日期
	 * 
	 * @param date
	 * @return
	 */
	public static String getLastDate(Date date, String formatStr) {
		SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
		// 获取上个月
		return sdf.format(getLastDateP(date));
	}

	private static Date getLastDateP(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, -1);
		return cal.getTime();
	}

	/**
	 * 
	 *@描述： 获取某个日期的若干天之后，为负则是如果天之前
	 *@返回值：Date
	 *@param date
	 *@param days
	 *@return
	 *@创建人：chenjie
	 *@创建时间：2016年3月1日
	 *@修改人等信息：
	 */
	public static Date fetchDateByday(Date date,int days)
	{
		    Calendar c=Calendar.getInstance();
	        c.setTime(date);
	        c.set(Calendar.DATE, c.get(Calendar.DATE) + days);
	        return c.getTime();
	}
	
	public static Date fetchFirstDateThisWeek()
	{
	        Calendar c=Calendar.getInstance();
	        c.set(Calendar.DAY_OF_WEEK, c.getActualMinimum(Calendar.DAY_OF_WEEK));
	        Date firstDate = fetchDateByday(c.getTime(),1);//从周1开始
	        return firstDate;
	}
	
	public static Date fetchLastDateThisWeek()
	{
	        Calendar c=Calendar.getInstance();
	        c.set(Calendar.DAY_OF_WEEK, c.getActualMaximum(Calendar.DAY_OF_WEEK));
	        Date lastDate = fetchDateByday(c.getTime(),1);//到周日结束
	        return lastDate;
	}
}
