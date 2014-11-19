<%@ page contentType="text/html;charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page import ="com.ht.servlet.*"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
<body>
  <a>jioashi登录</a>
  <input type="button" value="Addbook" onclick="window.location.href='Addbookday.jsp'"  style="background:White;width:400px;height:40px;font-size:20px;">
  <input type="button" value="Mybook" onclick="window.location.href='Mybookt.jsp'"  style="background:White;width:400px;height:40px;font-size:20px;">
  <input type="button" value="Return" onclick="window.location.href='Login.jsp'"  style="background:White;width:400px;height:40px;font-size:20px;">
  <input type="button" value="Logout" onclick="window.location.href='Login.jsp'"  style="background:White;width:400px;height:40px;font-size:20px;">
  </body>
  </body>
</html>
