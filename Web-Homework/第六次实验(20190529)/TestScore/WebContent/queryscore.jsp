<%@ page language="java" contentType="text/html; charset=gb2312"
	pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>成绩查询</title>
</head>
<body>
	<center>
		<h1>成绩查询系统</h1>
		<hr>
		<form action="ScoreQueryServlet" method="post">
			输入学号：<input type="text" name="no"> <input type="submit"
				value="提交">
		</form>
	</center>
</body>
</html>