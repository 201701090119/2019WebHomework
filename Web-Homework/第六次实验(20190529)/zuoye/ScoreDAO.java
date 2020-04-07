package cn.edu.hnucm.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.edu.hnucm.util.DBUtil;
import cn.edu.hnucm.vo.StuScore;



public class ScoreDAO {
	
	public StuScore QueryByNo(String no){
		Connection con = DBUtil.getConnection();
		PreparedStatement pstmt;
		ResultSet rs; 
		StuScore stuScore = new StuScore();
		try {
			String sql = "select * from stuscore where no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, no);
		    rs = pstmt.executeQuery();// 执行SQL语句
			if (rs.next()) {
				stuScore.setNo(rs.getString("no"));
				stuScore.setName(rs.getString("name"));
				stuScore.setDs(rs.getInt("ds"));
				stuScore.setDb(rs.getInt("db"));
				stuScore.setJava(rs.getInt("java"));
				stuScore.setWeb(rs.getInt("web"));
			}
			//关闭，释放资源
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   return stuScore;
	}
	
	
	
}
