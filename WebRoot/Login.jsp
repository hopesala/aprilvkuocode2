<%@ page contentType="text/html;charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 
<title>用户登陆</title>
  </head>
  
<body>
    <form action="login1">
    username:<input type="text" name="username"><br>
    password:<input type="password" name="pwd"><br>
    <input type="submit">
    </form>
  </body>
</html>  
