<%@page contentType="text/html;charset=gb2312" language="java" import="java.sql.*" errorPage=""%>
<%@page pageEncoding="gb2312"%>
<html>
<head>
<title> jsp���ﳵ</title>
</head>
<body>
<form action="shopcart.jsp" method="POST">
��ѡ����ӻ��Ƴ��Ĳ�Ʒ<br>
<select name="item">
<option>nokia
<option>NCE4
<option>Jsp Programing
<option>GRE
<option>toefl
</select>
<br><br>
<input type="submit" value="add" name="submit" />
<input type="submit" value="remove" name="submit" />
</form>
</body>
</html>