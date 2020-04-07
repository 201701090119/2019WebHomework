<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>登录界面</title>
</head>
<center>
	<body>
		<%
			request.setCharacterEncoding("gb2312");
			String username = request.getParameter("username");
			String password = request.getParameter("password");

			Cookie[] cookies = request.getCookies();
			boolean fg1 = false;
			for (int i = 0; cookies != null && i < cookies.length; ++i) {
				Cookie c = cookies[i];
				if ("username".equals(c.getName()) && c.getValue().equals(username)) {
					fg1 = true;
					break;
				}
			}

			if (fg1) {

		%>
		<h2><%=request.getParameter("username")%>, 上次登录时间:<%=session.getAttribute("logintime")%>,
			欢迎再次登录
		</h2>
		<%
			} else {
				Cookie c1 = new Cookie("username", request.getParameter("username"));
				c1.setMaxAge(60 * 60 * 24);
				response.addCookie(c1);
		%>
		<h2><%=username%>, 欢迎您的首次登录</h2>
		<%
			}
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String logintime = df.format(new Date());
			session.setAttribute("logintime", logintime);
		%>
	</body>
</center>
</html>