package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.tomcat.dbcp.dbcp2.DriverConnectionFactory;

public class Dao{
	public Connection con;
	public void loadDriver() {
		String URL = "jdbc:mysql://localhost/user_db?serverTimezone=UTC&useSSL=false&user=root&password=123456";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	//加载驱动
			//System.out.println("驱动加载成功");
			con = DriverManager.getConnection(URL);		//数据库连接
			//System.out.println("成功连接MySQL数据库");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public String qry_stu(String sql) {
		loadDriver();
		String ret = "";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = null;
			try {
				rs = stmt.executeQuery(sql);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		try {
			if(rs.next()) {
				ret += rs.getString("name") + "#" + rs.getInt("ds") + "#" + rs.getInt("db") + "#" + 
						rs.getInt("java") + "#" + rs.getInt("web");
			}
		} catch (SQLException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
}
