<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>��ѯ���</title>
<jsp:useBean id="StuScore1" scope="page" class="beans.StuScore"></jsp:useBean>
</head>
<%
	String qry_no = request.getParameter("stuno");
	//out.print(stuno);
%>
<jsp:setProperty name="StuScore1" property="no" value="<%=qry_no%>" />
<body>
	<center>
		<h1>��ѯ���</h1>
		<hr></hr>
		<%
			StuScore1.getScores();
			if (StuScore1.getName() == null) {
		%>
		<p>
			ϵͳ��û�в�ѯ��ѧ�ţ�<%=qry_no%>�ĳɼ�!
		</p>
		<%
			} else {
		%>
		<table border = "1" cellpadding = 0 cellspacing = 0 style = "text-align:center">
			<tr>
				<td>ѧ��</td>
				<td>����</td>
				<td>���ݽṹ</td>
				<td>���ݿ�ԭ��</td>
				<td>Java�������</td>
				<td>web��������</td>
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