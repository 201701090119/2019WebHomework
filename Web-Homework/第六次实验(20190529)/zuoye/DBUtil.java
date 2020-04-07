package cn.edu.hnucm.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class DBUtil {

	public static Connection getConnection() {
        //连接sql server
		//String username = "sa";
        // String password = "jsjzx123456";
        // String url="jdbc:sqlserver://localhost:1433;DatabaseName=QQDB";
        // String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		
		//连接my sql
        String username = "root";
        String password = "";
        String url="jdbc:mysql://localhost:3306/csqs";
        String driver="com.mysql.jdbc.Driver";  
        try {
            Class.forName(driver);
            Connection con= DriverManager.getConnection(url, username, password);
            return con;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = DBUtil.getConnection();
		System.out.println(con.toString());
	}

}