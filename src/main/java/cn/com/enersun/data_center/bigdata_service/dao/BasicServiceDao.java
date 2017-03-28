package cn.com.enersun.data_center.bigdata_service.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import cn.com.enersun.data_center.bigdata_service.entity.*;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: BasicServiceDao.java 
* @Package cn.com.enersun.data_center.bigdata_service.dao 
* @Description: TODO(基础台账服务dao) 
* @author enersun_lhb  
* @date 2016年9月12日 下午12:49:34 
* @version V1.0   
*/
@Component
public interface BasicServiceDao {


	/**
	 * 
	* @Title: queryInfoBySql 
	* @Description: TODO(通过sql查询数据服务台账中的任何满足sql的数据) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List<Map<String ,String >>    返回类型 
	* @throws
	 */
	List<Map<String ,String >> queryInfoBySql(String sql);
	
	
	/**
	 * 
	* @Title: queryDefectsInfo 
	* @Description: TODO(每月缺陷导出，查询缺陷信息) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<DefectEntity> queryDefectsInfo(String sql);

	/**
	 * 
	* @Title: queryOrganizationInfo 
	* @Description: TODO(组S织机构信息查询) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<OrganizationEntity> queryOrganizationInfo(String sql);

	/**
	 * 
	* @Title: queryMainAssetInfoByOrgAndSite 
	* @Description: TODO(根据供电局编号,查询厂站信息) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<SubstationEntity> querySubstationInfoByOrg(String sql);
	
	/**
	 * 
	* @Title: queryMainAssetInfoByOrgAndSite 
	* @Description: TODO(通过设备供电局编码和变电站名称，查询一二次设备基本信息) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<DmDeviceEntity> queryMainAssetInfoByOrgAndSite(String sql);
	
	/**
	 * 
	* @Title: queryPartsInfoByOrgAndSite 
	* @Description: TODO(通过设备供电局编码和变电站名称，查询一二次部件基本信息) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<DmPartEntity> queryPartsInfoByOrgAndSite(String sql);
	
	/**
	 * 
	* @Title: queryMainAssetInfoByAssetId 
	* @Description: TODO(通过设备ID，查询一二次设备基本信息) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<DmDeviceEntity> queryMainAssetInfoByAssetId(String sql);
	
	/**
	 * 
	* @Title: queryPartsInfoByPartId 
	* @Description: TODO(通过设备ID，查询一二次部件基本信息) 
	* @param @param sql
	* @param @param Map<String, String> params 参数
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<DmPartEntity> queryPartsInfoByPartId(String sql);

	/**
	 * 
	* @Title: queryAssetInfoBySql 
	* @Description: TODO(通过SQL，查询一二次设备基本信息) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<DmDeviceEntity> queryAssetInfoBySql(String sql);

	/**
	 * 
	* @Title: queryPartsInfoBySql 
	* @Description: TODO(通过SQL，查询一二次部件基本信息) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<DmPartEntity> queryPartsInfoBySql(String sql);

	
	/**
	 * 
	* @Title: queryMainAssetInfoByClassfiyId 
	* @Description: TODO(通过设备分类编码，查询主设备基本信息) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<DmDeviceEntity> queryMainAssetInfoByClassfiyId(String sql);
	
	/**
	 * 
	* @Title: queryLineInfoByOrgcode 
	* @Description: TODO(通过供电局编码或者线路ID，查询线路基本信息含技术参数) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<LineEntity> queryLineInfoByOrgcode(String sql);
	
	/**
	 * 
	* @Title: queryTowerInfoByOrgcode 
	* @Description: TODO(通过供电局编码或者杆塔ID，，查询杆塔基本信息含技术参数) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<TowerEntity> queryTowerInfoByOrgcode(String sql);
	
	/**
	 * 
	* @Title: queryTransformerInfoByParameters 
	* @Description: TODO(通过供电局编码或者设备ID，查询变压器技术参数信息) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<Dm_TransformerEntity> queryTransformerInfoByParameters(String sql);
	
	/**
	 * 
	* @Title: queryCurrentTransformerByParameters 
	* @Description: TODO(通过供电局编码或者设备ID，查询电流互感器技术参数信息) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<Dm_Current_TransformerEntity> queryCurrentTransformerByParameters(String sql);
	
	
	/**
	 * 
	* @Title: queryPotenTransformerByParameters 
	* @Description: TODO(通过供电局编码或者设备ID，查询电压互感器技术参数信息) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<Dm_Poten_TransformerEntity> queryPotenTransformerByParameters(String sql);
	
	/**
	 * 
	* @Title: queryBreakerByParameters 
	* @Description: TODO(通过供电局编码或者设备ID，查询断路器技术参数信息) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<Dm_BreakerEntity> queryBreakerByParameters(String sql);
	
	/**
	 * 
	* @Title: queryIsolatorSwitchByParameters 
	* @Description: TODO(通过供电局编码或者设备ID，查询隔离开关技术参数信息) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<Dm_Isolator_SwitchEntity> queryIsolatorSwitchByParameters(String sql);
	
	
	/**
	 * 
	* @Title: queryTowerInfoByOrgcode 
	* @Description: TODO(通过供电局编码或者设备ID，查询熔断器技术参数信息) 
	* @param @param sql
	* @param @return    设定文件 
	* @return List    返回类型 
	* @throws
	 */
	List<Dm_FuseEntity> queryFuseByParameters(String sql);
	
	
}
