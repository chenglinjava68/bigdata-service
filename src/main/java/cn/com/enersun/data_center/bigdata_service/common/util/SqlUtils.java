package cn.com.enersun.data_center.bigdata_service.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.com.enersun.data_center.facade.dto.ParamDTO;

import javax.persistence.EntityManager;
import javax.servlet.jsp.jstl.sql.Result;
import javax.servlet.jsp.jstl.sql.ResultSupport;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * SQL查询帮助类
 *
 * @author zhaolong
 */
public class SqlUtils {
    private static  Logger LOG =LoggerFactory.getLogger(SqlUtils.class);
    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;

    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public SqlUtils() {

    }

    public SqlUtils(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    /**
     * 获得Result结果集
     *
     * @param sql
     * @return
     */
    public Result getResult(String sql) {
        Result result = null;
        try {
            conn = JdbcUtils.openConn(this.getEntityManager());
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            result = ResultSupport.toResult(rs);
        } catch (Exception e) {
        	LOG.error(e.getMessage());
        } finally {
            JdbcUtils.closeConn(rs, pstmt, conn);
        }
        return result;
    }

    /**
     * 获得Result结果集（防sql注入）
     *
     * @param sql
     * @param params 参数列表
     * @return
     */
    public Result getResult(String sql, List<ParamDTO> params) {
        Result result = null;
        try {
            conn = JdbcUtils.openConn(this.getEntityManager());
            pstmt = conn.prepareStatement(sql);
            if (params != null && !params.isEmpty()) {
                for (int i = 0; i < params.size(); i++) {
                    ParamDTO paramDTO = params.get(i);
                    //字符串类型参数
                    if (paramDTO.getType() == String.class) {
                        pstmt.setString(i + 1, paramDTO.getValue());
                    }
                    //整形
                    if (paramDTO.getType() == Integer.class) {
                        int x = 0;
                        try {
                            Integer.parseInt(paramDTO.getValue());
                        } catch (Exception e) {
                            e.printStackTrace();
                            x = 0;
                        }
                        pstmt.setInt(i + 1, x);
                    }
                }
            }
            rs = pstmt.executeQuery();
            result = ResultSupport.toResult(rs);
        } catch (Exception e) {
        	LOG.error(e.getMessage());
        } finally {
            JdbcUtils.closeConn(rs, pstmt, conn);
        }
        return result;
    }

    public String queryClobString(String sql) {
        String str = "";
        try {
            conn = JdbcUtils.openConn(this.getEntityManager());
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Clob clob = rs.getClob(1);
                str = StringUtils.clobToString(clob);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeConn(rs, pstmt, conn);
        }
        return str;
    }

    /**
     * 获得列有序的结果集
     *
     * @param sql
     * @return
     */
    public List<LinkedHashMap<String, Object>> getSortedResult(String sql) {
        List<LinkedHashMap<String, Object>> list = null;
        try {
            list = new ArrayList<LinkedHashMap<String, Object>>();
            conn = JdbcUtils.openConn(this.getEntityManager());
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            ResultSetMetaData resultSetMetaData = rs.getMetaData();
            int count = resultSetMetaData.getColumnCount();
            while (rs.next()) {
                LinkedHashMap<String, Object> row = new LinkedHashMap<String, Object>();
                for (int i = 1; i <= count; i++) {
                    String colName = resultSetMetaData.getColumnName(i);
                    row.put(colName, rs.getString(i));
                }
                list.add(row);
            }
        } catch (Exception e) {
            System.out.println("发生异常的SQL语句:" + sql);
            LOG.error(e.getMessage());
        } finally {
            JdbcUtils.closeConn(rs, pstmt, conn);
        }
        return list;
    }

    /**
     * 获得列有序的结果集（防止sql注入）
     *
     * @param sql
     * @param params 参数列表
     * @return
     */
    public List<LinkedHashMap<String, Object>> getSortedResult(String sql, List<ParamDTO> params) {
        List<LinkedHashMap<String, Object>> list = null;
        try {
            list = new ArrayList<LinkedHashMap<String, Object>>();
            conn = JdbcUtils.openConn(this.getEntityManager());
            pstmt = conn.prepareStatement(sql);
            if (params != null && !params.isEmpty()) {
                for (int i = 0; i < params.size(); i++) {
                    ParamDTO paramDTO = params.get(i);
                    //字符串类型参数
                    if (paramDTO.getType() == String.class) {
                        pstmt.setString(i + 1, paramDTO.getValue());
                    }
                    //整形
                    if (paramDTO.getType() == Integer.class) {
                        int x = 0;
                        try {
                            Integer.parseInt(paramDTO.getValue());
                        } catch (Exception e) {
                            e.printStackTrace();
                            x = 0;
                        }
                        pstmt.setInt(i + 1, x);
                    }
                }
            }
            rs = pstmt.executeQuery();
            ResultSetMetaData resultSetMetaData = rs.getMetaData();
            int count = resultSetMetaData.getColumnCount();
            while (rs.next()) {
                LinkedHashMap<String, Object> row = new LinkedHashMap<String, Object>();
                for (int i = 1; i <= count; i++) {
                    String colName = resultSetMetaData.getColumnName(i);
                    row.put(colName, rs.getString(i));
                }
                list.add(row);
            }
        } catch (Exception e) {
            System.out.println("发生异常的SQL语句:" + sql);
            LOG.error(e.getMessage());
        } finally {
            JdbcUtils.closeConn(rs, pstmt, conn);
        }
        return list;
    }

}