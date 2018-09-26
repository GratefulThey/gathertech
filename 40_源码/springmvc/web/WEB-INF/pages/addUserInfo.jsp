<%@ page language="java" isELIgnored="false" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'addUserInfo.jsp' starting page</title>
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
  <p>My JSP 'addUserInfo.jsp' starting page</p>
    <h2>提交的用户信息如下 - </h2>
    <table>
        <tr>
            <td>姓名：</td>
            <td>${userInfo.name}</td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td>${userInfo.age}</td>
        </tr>
        <tr>
            <td>编号：</td>
            <td>${userInfo.id}</td>
        </tr>
    </table>
  </body>
</html>
