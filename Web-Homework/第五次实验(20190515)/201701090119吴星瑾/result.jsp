<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>��ѯ���</title>
<jsp:useBean id="StuScore" scope="page" class=aaa.StuScore></jsp:useBean>
</head>
<%
	String get_no = request.getParameter("no");
%>
<jsp:setProperty name="StuScore" property="no" value="<%=get_no %>" />
<body>
	<h1>
		��ѯ���
	</h1>
	<hr>
	<%
		StuScore.getScores();
		if(StuScore.getName() == null){
	%>
	<p>
		ϵͳû�в�ѯ��ѧ�ţ�<%=get_no %>�ĳɼ���
	</p>
	<%
		}
		else{
	%>
	<table>
		<tr>
			<td>ѧ��</td>
			<td>����</td>
			<td>���ݽṹ</td>
			<td>���ݿ�ԭ��</td>
			<td>Java�������</td>
			<td>web��������</td>
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