<%@ page language="java" contentType="text/html; charset=gb2312"
	pageEncoding="gb2312"%>
<%@ page import="cn.edu.hnucm.vo.StuScore" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>查询结果</title>
<style type="text/css">
table {
	border-collapse: collapse;
} 

table,th,td {
	border: 1px solid black;
	text-align:center;
}
</style>
</head>
<body>
	<center>
		<h1>查询结果</h1>
		<hr>
		<%
		    StuScore  stu = (StuScore) session.getAttribute("stuScore");
		%>

		<%
			if (stu.getName() != null) {
		%>
		<table>
			<tr>
				<td>学号</td>
				<td>姓名</td>
				<td>数据结构</td>
				<td>数据库原理</td>
				<td>Java程序设计</td>
				<td>web技术基础</td>
				<td>平均分</td>
				<td></td>
			<tr>
			<tr>
				<td><%=stu.getNo()%></td>
				<td><%=stu.getName()%></td>
				<td><%=stu.getDs()%></td>
				<td><%=stu.getDb()%></td>
				<td><%=stu.getJava()%></td>
				<td><%=stu.getWeb()%></td>
				<td><%=stu.getAverage()%></td>
				<td><a href="modifyScore.jsp">修改</a></td>
			<tr>
		</table>
		<%
			} else {
		%>
		系统中没有查询到成绩！
		<%
			}
		%>
	</center>
</body>
</html>