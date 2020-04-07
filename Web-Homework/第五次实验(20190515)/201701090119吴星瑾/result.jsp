<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>查询结果</title>
<jsp:useBean id="StuScore" scope="page" class=aaa.StuScore></jsp:useBean>
</head>
<%
	String get_no = request.getParameter("no");
%>
<jsp:setProperty name="StuScore" property="no" value="<%=get_no %>" />
<body>
	<h1>
		查询结果
	</h1>
	<hr>
	<%
		StuScore.getScores();
		if(StuScore.getName() == null){
	%>
	<p>
		系统没有查询到学号：<%=get_no %>的成绩！
	</p>
	<%
		}
		else{
	%>
	<table>
		<tr>
			<td>学号</td>
			<td>姓名</td>
			<td>数据结构</td>
			<td>数据库原理</td>
			<td>Java程序设计</td>
			<td>web技术基础</td>
		</tr>
		<tr>
			<td><%=StuScore.getNo()%></td>
			<td><%=StuScore.getName()%></td>
			<td><%=StuScore.getDb()%></td>
			<td><%=StuScore.getDyuanli()%></td>
			<td><%=StuScore.getJava()%></td>
			<td><%=StuScore.getWeb()%></td>
		</tr>
	</table>
	<%
		}
	%>
</body>
</html>