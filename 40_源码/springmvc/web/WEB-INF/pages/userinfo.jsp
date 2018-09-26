<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>    
    <title>My JSP 'userinfo.jsp' starting page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
  <body>
    <%-- <form:form method="POST" action="/springmvc/addUser" id="command">
	   <table>
		    <tr>
		        <td><input type="text" name="username"/></td>
		    </tr>
		    <tr>
		        <td><input type="password" name="password"/></td>
		    </tr>
		    <tr>
		        <td colspan="2">
		            <input type="submit" value="提交表单"/>
		        </td>
		    </tr>
		</table>
      </form:form>
      <br>
      <p>USERINFO</p>
      <form:form method="POST" action="/springmvc/addUserInfo">
        <table>
            <tr>
                <td><form:label path="id">A:</form:label></td>
                <td><form:input path="id" /></td>
            </tr>
            <tr>
                <td><form:label path="name">B:</form:label></td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td><form:label path="age">C:</form:label></td>
                <td><form:input path="age" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交用户信息" /></td>
            </tr>
        </table>
    </form:form><br> --%>
    njnjj: ${userInfo.name}<br>
    bjrns: ${userInfo.age }<br>
    pwd:${userInfo.pwd }<br>
    aid:${userInfo.id }
   </body>
</html>
