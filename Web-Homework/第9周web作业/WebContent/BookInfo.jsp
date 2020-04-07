<%@ page language="java" contentType="text/html; charset=GB2312"
pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BookInfo</title>
</head>
<body>
	您的选择是：
	<%=request.getParameter("bookname") %>
	<br>
	作者是：<%=request.getParameter("auther") %>
</body>
</html>