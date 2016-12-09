package cn.com.enersun.data_center.bigdata_service.dao;

import java.util.HashMap;
import java.util.List;


import cn.com.enersun.data_center.bigdata_service.entity.ServiceParameterEntity;

/**
 * 
 * @author enersun_lhb
 *
 */
public interface MicroServiceOrderDao {
	
	
	/**
	 * @Description：获取微服务台账清单
	 * @param String [] fields 显示字段
	 * @return json格式
	 */
	public List<ServiceParameterEntity> queryServiceOrder();
	/**
	 * @Description 服务授权-传入服务编号获取授权码
	 * @param serviceId  服务编号
	 * @return keyCode 授权码
	 */
	public String queryServiceAuthorityById(String serviceId);
	
	/**
	 * 
	  * @Description 传入微服务编号和相应的授权码值 ，获取相应的格式的数据(XML/JSON/Excel(返回文件地址))
	  * @param serviceId  服务编号
	  * @param keyCode    授权码
	  * @return 返回不同格式的数据(XML/JSON)、excel文件返回下载地址
	 */
	public ServiceParameterEntity queryDetailServiceStr(String id,String keyCode);
	

	/**
	 * 
	  * @Description 传入微服务编号、相应的授权码值和参数值 ，获取相应的格式的数据(XML/JSON/Excel(返回文件地址))
	  * @param serviceId  服务编号
	  * @param keyCode    授权码
	  * @param params[]   条件参数数组
	  * @return 返回不同格式的数据(XML/JSON)、excel文件返回下载地址
	 */
	public String queryDetailServiceByParams(HashMap<?, ?> params);

}
