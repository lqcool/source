package q.base.util.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;

import q.base.util.dbconnect.Jdbc;

public class DBDao {
	/**
	 * 获取数据库连接实例
	 * @return
	 * @throws Exception
	 */
	public static Connection getConnction() throws Exception{
		Class.forName(Jdbc.DRIVERCLASSNAME);
		Connection con = DriverManager.getConnection(Jdbc.DBURL,Jdbc.USERNAME,Jdbc.PASSWORD);
		return con;
	}
	
	/**
	 * 获取数据库名称
	 * @return
	 */
	public static String getDBName(){
		String DBUrl =Jdbc.DBURL;
		String DBName = DBUrl.substring(DBUrl.lastIndexOf('/') + 1,DBUrl.indexOf('?'));
		System.out.println(DBName);
		return DBName;
	}
}
