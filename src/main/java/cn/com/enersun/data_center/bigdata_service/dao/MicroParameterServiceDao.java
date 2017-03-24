package cn.com.enersun.data_center.bigdata_service.dao;

import java.util.List;
import java.util.Map;


import cn.com.enersun.data_center.bigdata_service.entity.*;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: MicroParameterServiceDao.java 
* @Package cn.com.enersun.data_center.bigdata_service.dao 
* @Description: TODO(基础台账服务dao) 
* @author enersun_lhb  
* @date 2017年3月21日 下午12:49:34 
* @version V1.0   
*/
public interface MicroParameterServiceDao {

	/**
	 * 
	* @Title: queryTerminalThemeInfo 
	* @Description: TODO(通过终端类型和主题分类查询终端主题台账) 
	* @param @param sql
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<TerminalThemeEntity> queryTerminalThemeInfo(String sql);

	/**
	 * 
	* @Title: queryIceRealtimeInfo 
	* @Description: TODO(覆冰实时信息查询) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<IceRealtimeEntity> queryIceRealtimeInfo(String sql);

	/**
	 * 
	* @Title: queryMainAssetInfoByOrgAndSite 
	* @Description: TODO(根据年份,查询山火实时信息) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<Map<String,String>>  queryWildFileRemoteInfoByYear(String sql);
	
	/**
	 * 
	* @Title: queryLineInfoByOrgcode 
	* @Description: TODO(通过供电局编码或者线路ID，查询线路基本信息含技术参数) 
	* @param @param sql
	* @param @param Map<String, Object> params 参数
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<LineEntity> queryLineInfoByOrgcode(String sql, Map<String, Object> params);
	
	/**
	 * 
	* @Title: queryTowerInfoById 
	* @Description: TODO(通过杆塔ID，查询杆塔设备基本信息含技术参数) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	Map<String,String> queryTowerInfoById(String sql);
	
	
	
}
