package com.feizhu.servle;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/*


@WebServlet("/Add2CartServlet")
public class Add2CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Add2CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

*/







/**
 * 添加到购物车
 */
public class Add2CartServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//设置编码
response.setContentType("text/html; charset=utf-8");
PrintWriter w =response.getWriter();

//获取商品的名称
String name=request.getParameter("name");

name =new String(name.getBytes("iso8859-1"),"utf-8");

//将商品添加到购物车

 //从session种获取购物车
Map<String,Integer> map=(Map<String, Integer>) request.getSession().getAttribute("cart");

 Integer count=null;

//判断购物车是否为空
if(map==null) {
//第一次登录 创建购物车
map=new HashMap<>();

//将购物车放入session
request.getSession().setAttribute("cart", map);
count=1;
}else {
//购物车不为空  继续判断购物车是否有该商品
count=map.get(name);

if(count==null) {
 //购物车中没有该商品
count=1;
}else {
//购物车中有该商品
count++;
}

}
//将商品放入购物车
 map.put(name, count);

//提示信息
 w.print("已将<b>"+name+"添加到购物车中<hr>");
 w.println("<a href='"+request.getContextPath()+"/product_list.jsp'>继续购物</a>&nbsp;&nbsp;&nbsp;&nbsp;");
 w.println("<a href='"+request.getContextPath()+"/cart.jsp'>查看购物车</a>&nbsp;&nbsp;&nbsp;&nbsp;");;
}


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);;
}

}


