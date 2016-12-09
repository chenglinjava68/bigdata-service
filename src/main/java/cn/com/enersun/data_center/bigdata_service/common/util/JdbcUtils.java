package cn.com.enersun.data_center.bigdata_service.common.util;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.internal.SessionFactoryImpl;

/**
 * JDBC工具类
 * @author zhaolong
 *
 */
public class JdbcUtils {
	
	public static Connection openConn(EntityManager entityManager) throws SQLException{
		Connection conn=null;
		Session session=entityManager.unwrap(Session.class);
		SessionFactoryImpl sessionFactory=(SessionFactoryImpl) session.getSessionFactory();
		conn=sessionFactory.getConnectionProvider().getConnection();
		return conn;
	}
	
	public static PreparedStatement openPstmt(Connection conn,String sql) throws SQLException{
		PreparedStatement pstmt=null;
		pstmt=conn.prepareStatement(sql);
		return pstmt;
	}

	public static Statement openStmt(Connection conn) throws SQLException{
		Statement stmt=null;
		stmt=conn.createStatement();
		return stmt;
	}
	
	public static ResultSet openRs(PreparedStatement pstmt) throws SQLException{
		ResultSet rs=null;
		rs=pstmt.executeQuery();
		return rs;
	}
	
	public static void closeConn(ResultSet rs,Statement stmt,Connection conn){
		try{
			if(rs!=null){
				rs.close();
			}
			if(stmt!=null){
				stmt.close();
			}
			if(conn!=null){
				conn.close();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public static List<Map> findBySql(EntityManager entityManager,String sql){
		List<Map> result=new ArrayList<Map>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=openConn(entityManager);
			pstmt=openPstmt(conn,sql);
			ResultSetMetaData rsmd=pstmt.getMetaData();
			rs=openRs(pstmt);
			while(rs.next()){
				Map data=new HashMap();
				for(int i=1;i<=rsmd.getColumnCount();i++){
					String columnName=rsmd.getColumnName(i);
					data.put(columnName,rs.getObject(columnName));
				}
				result.add(data);
			}
		}catch (SQLException e){
			e.printStackTrace();
		}finally {
			closeConn(rs,pstmt,conn);
		}
		return result;
	}
	
	public static List<String> findColumnLabelBySql(EntityManager entityManager,String sql){
		List<String> result=new ArrayList<String>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=openConn(entityManager);
			pstmt=openPstmt(conn,sql);
			ResultSetMetaData rsmd=pstmt.getMetaData();
			for(int i=1;i<=rsmd.getColumnCount();i++){
				String columnName=rsmd.getColumnName(i);
				result.add(columnName);
			}
		}catch (SQLException e){
			e.printStackTrace();
		}finally {
			closeConn(rs,pstmt,conn);
		}
		return result;
	}
}