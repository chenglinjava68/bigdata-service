package cn.com.enersun.data_center.bigdata_service.common.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDao {

	/** 加载指定ID的持久化对象 */
	public Object loadById(Class<?> clazz, Serializable id);

	/** 加载满足条件的持久化对象 */
	public Object loadObject(String hql);

	/** 装载指定类的所有持久化对象 */
	public List listAll(String clazz);

	/** 分页装载指定类的所有持久化对象 */
	public List listAll(Class<?> clazz, int pageNo, int pageSize);

	/** 统计指定类的所有持久化对象 */
	public int countAll(String clazz);

	/** 分页查询指定类的满足条件的持久化对象 */
	public List query(String hql, int pageNo, int pageSize);

	/** 统计指定类的查询结果 */
	public int countQuery(String hql);

	/** 执行sql语句，返回List对象 */

	public List getListBySql(String sql);

	/** 执行sql语句，返回单个String值 */
	public String getSingleValueBySql(String sql);

	/** 执行sql语句，返回单个个数值 */
	public int getCountValueBySql(String sql);


	/** 统计指定类满足条件的所有持久化对象 */
	public int countAll(String clazz, Map<String, Object> map);


	// 单条数据以map获取,并使用别名替换原来字段
	public Map<String, Object> getWithAliasName(Map<String, String> aliasName);

	// 单条数据以map获取,并隐藏不需要显示的字段
	public Map<String, Object> getWithAliasName(List<String> hiddenFields, Map<String, String> aliasName);

	// 单条数据以map获取,隐藏不需要显示的字段,使用别名替换原来字段
	public Map<String, Object> get(List<String> hiddenFields);

	// 多条数据以list获取
	public List<Map<String, Object>> getList();

	// 多条数据以list获取,并隐藏不需要显示的字段
	public List<Map<String, Object>> getList(List<String> hiddenFields);

	// 多条数据以list获取,并使用别名替换原来字段
	public List<Map<String, Object>> getListWithAliasName(Map<String, String> aliasName);

	// 多条数据以list获取,隐藏不需要显示的字段,使用别名替换原来字段
	public List<Map<String, Object>> getListWithAliasName(List<String> hiddenFields, Map<String, String> aliasName);

	// 单条数据转为对象
	public <T> T as(Class<T> beanClass);

	// 多条数据转为对象
	public <T> List<T> asList(Class<T> beanClass);

}
