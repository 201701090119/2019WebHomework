package cn.edu.hnucm.service;

import cn.edu.hnucm.dao.ScoreDAO;
import cn.edu.hnucm.vo.StuScore;

public class ScoreQuery {

	public StuScore getScoreByNo(String no)
	{
		ScoreDAO sd=new ScoreDAO();
		StuScore stuScore=sd.QueryByNo(no);
		int average=(stuScore.getDs()+stuScore.getDb()+stuScore.getJava()+stuScore.getWeb())/4;
		stuScore.setAverage(average);
		return stuScore;
		
	}
	
}
