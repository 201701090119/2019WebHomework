<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>查询结果</title>
<jsp:useBean id="StuScore1" scope="page" class="beans.StuScore"></jsp:useBean>
</head>
<%
	String qry_no = request.getParameter("stuno");
	//out.print(stuno);
%>
<jsp:setProperty name="StuScore1" property="no" value="<%=qry_no%>" />
<body>
	<center>
		<h1>查询结果</h1>
		<hr></hr>
		<%
			StuScore1.getScores();
			if (StuScore1.getName() == null) {
		%>
		<p>
			系统中没有查询到学号：<%=qry_no%>的成绩!
		</p>
		<%
			} else {
		%>
		<table border = "1" cellpadding = 0 cellspacing = 0 style = "text-align:center">
			<tr>
				<td>学号</td>
				<td>姓名</td>
				<td>数据结构</td>
				<td>数据库原理</td>
				<td>Java程序设计</td>
				<td>web技术基础</td>
			</tr>
			<tr>
				<td><%=StuScore1.getNo()%></td>
				<td><%=StuScore1.getName()%></td>
				<td><%=StuScore1.getDs()%></td>
				<td><%=StuScore1.getDb()%></td>
				<td><%=StuScore1.getJava()%></td>
				<td><%=StuScore1.getWeb()%></td>
			</tr>
		</table>
		<%
			}
		%>
	</center>
</body>
</html>