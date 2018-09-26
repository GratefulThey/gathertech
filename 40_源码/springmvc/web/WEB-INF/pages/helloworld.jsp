<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>    
    <title>My JSP 'helloworld.jsp' starting page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
  <body>
    <%-- <h1>${greeting}</h1> --%>
	<form action="login" method="post">
	    username:<input type="text" name="username" />
	    <p>
	    password:<input type="password" name="password"/>
	    <p>
	    <input type="submit" value="submit" />
	</form>
    <!--  <form:form action="/showEmployee" method="post" modelAttribute="employee">
	   <table>
	      <tr>
	         <td><form:label path="empName">用户名：</form:label></td>
	         <td><form:input path="empName"/></td>
	      </tr>
	      <tr>
	         <td><form:label path="empPwd">密码：</form:label></td>
	         <td><form:password path="empPwd"/></td>
	      </tr>
	      <tr>
             <td><form:label path="id">编号：</form:label></td>
             <td><form:hidden path="id"/></td>
          </tr>
	      <tr>
	         <td colspan="2">
	            <input type="submit" value="提交"/>
	         </td>
	      </tr>
	   </table>
	   </form:form> -->
	  </body>
</html>
