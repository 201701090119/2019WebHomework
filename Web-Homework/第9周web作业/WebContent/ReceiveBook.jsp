<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>move</title>
</head>
<body>
<%
	String getsel;
	getsel=request.getParameter("book");
	if(getsel.equals("jingzhui")){
%>
<jsp:forward page="BookInfo.jsp">
	<jsp:param name="bookname" value="《颈椎病的治疗与预防》"/>
	<jsp:param name="auther" value="one"/>
</jsp:forward>
<%
	}else if(getsel.equals("zhuijianoan")){
%>
<jsp:forward page="BookInfo.jsp">
	<jsp:param name="bookname" value="《椎间盘突出日常护理》"/>
	<jsp:param name="auther" value="no one"/>
</jsp:forward>
<%
	}
%>
</body>
</html>