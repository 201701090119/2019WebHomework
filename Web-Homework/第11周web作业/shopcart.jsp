<%@page pageEncoding="gb2312" language="java" contentType="text/html;charset=gb2312" import="java.sql.*,jsp2.*" errorPage="" %>
<html>
<jsp:useBean id="cart" scope="session" class="jsp2.ShopCart" />
<jsp:setProperty name="cart" property="*" />

<%
String submit=cart.getSubmit();
String item=cart.getItem();
if(submit==null)
{
cart.addItem(item);
}
if(submit.equals("add")) cart.addItem(item);
if(submit.equals("remove")) cart.removeItem(item);

cart.reset();
%>
<br>
目前在您的购物车中有以下商品：
<ol>
<%
String[] items=cart.getItems();
for(int i=0;i<items.length;i++)
{
%>
<li> <% out.print(HTMLFilter.filter(items[i])); %>
<%
}
%>
</ol>
<hr>
<%@include file="cart.jsp" %>
</html>