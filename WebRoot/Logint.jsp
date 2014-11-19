<%@ page contentType="text/html;charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page import ="com.ht.servlet.*"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 
<title>用户登陆</title>
  </head>
  
<body>
教师登陆
    <form action="Loginpage.jsp">
    username:<input type="text" name="username"><br>
    password:<input type="password" name="pwd"><br>
    <input type="submit">
    </form>
  </body>
</html>  
