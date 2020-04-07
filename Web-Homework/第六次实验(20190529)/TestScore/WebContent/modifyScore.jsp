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
		<h1>修改成绩</h1>
		<hr>
		<%
		    StuScore  stu = (StuScore) session.getAttribute("stuScore");
		%>

		<%
			if (stu.getName() != null) { 
				
				
		%>
	<form action="" method="post">
		<table>
			<tr>
				<td>学号</td>
				<td>姓名</td>
				<td>数据结构</td>
				<td>数据库原理</td>
				<td>Java程序设计</td>
				<td>web技术基础</td>
				
			<tr>
			<tr>
				<td><input type="text" value="<%=stu.getNo()%>"  style="width:100px"></td> 
				<td><input type="text" value="<%=stu.getName()%>"  style="width:50px"></td>
				<td><input type="text" value="<%=stu.getDs()%>"  style="width:50px"></td>
				<td><input type="text" value="<%=stu.getDb()%>" style="width:50px"></td>
				<td><input type="text" value="<%=stu.getJava()%>" style="width:50px"></td>
				<td><input type="text" value="<%=stu.getWeb()%>" style="width:50px"></td>
			<tr>
		</table>
		<br>
		<input type="submit" value="提交">
		</form>
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