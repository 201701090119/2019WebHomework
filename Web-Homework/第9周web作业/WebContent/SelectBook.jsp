<%@ page language="java" contentType="text/html; charset=GB2312"
pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Select Book</title>
</head>
<body>
<form name="form1" method="post" action="ReceiveBook.jsp">
<table border="1">
	<tr>
		<td>
			����׵����������Ԥ����
		</td>
		<td>
			��׵����ͻ���ճ�����
		</td>
	</tr>
	<tr>
		<td>
			<input type="radio" name="book" value="jingzhui">
		</td>
		<td>
			<input type="radio" name="book" value="zhuijianoan">
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" name="Submit" value="ȷ��">
		</td>
	</tr>
</table>
</form>
</body>
</html>