<%@ page language="java" contentType="text/html; charset=gb2312"
	pageEncoding="gb2312"%>
<%@ page import="cn.edu.hnucm.vo.StuScore" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>��ѯ���</title>
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
		<h1>��ѯ���</h1>
		<hr>
		<%
		    StuScore  stu = (StuScore) session.getAttribute("stuScore");
		%>

		<%
			if (stu.getName() != null) {
		%>
		<table>
			<tr>
				<td>ѧ��</td>
				<td>����</td>
				<td>���ݽṹ</td>
				<td>���ݿ�ԭ��</td>
				<td>Java�������</td>
				<td>web��������</td>
				<td>ƽ����</td>
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
				<td><a href="modifyScore.jsp">�޸�</a></td>
			<tr>
		</table>
		<%
			} else {
		%>
		ϵͳ��û�в�ѯ���ɼ���
		<%
			}
		%>
	</center>
</body>
</html>