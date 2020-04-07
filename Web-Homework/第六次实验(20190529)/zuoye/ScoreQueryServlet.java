package cn.edu.hnucm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.edu.hnucm.service.ScoreQuery;
import cn.edu.hnucm.vo.StuScore;

/**
 * Servlet implementation class ScoreQueryServlet
 */
@WebServlet("/ScoreQueryServlet")
public class ScoreQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScoreQueryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no=request.getParameter("no");
		ScoreQuery sq=new ScoreQuery();
		StuScore stuScore=sq.getScoreByNo(no);
		HttpSession session=request.getSession();
		session.setAttribute("stuScore", stuScore);
		response.sendRedirect("result.jsp");
		
	}

}
