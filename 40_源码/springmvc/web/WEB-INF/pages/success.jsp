<%@ page language="java" isELIgnored="false" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'success.jsp' starting page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
    <h2>登陆</h2>
    username:${username}<br>
    password:${password}<br><br>
          静态资源图片:<br>
     <img src="resources/img/bg.jpg"><br>
     
     <table>
     <thead></thead>
     <tbody>
     <tr><td>username:${empName}<td/><td><td/><td><td/></tr>
     </tbody>
     <tfoot></tfoot>
     </table>
  </body>
</html>
