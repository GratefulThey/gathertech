<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<form:form method="GET" action="/springmvc/staticPage">
		<table>
		    <tr>
			    <td>
			     <input type="submit" value="获取HTML页面"/>
			    </td>
		    </tr>
		</table>  
	</form:form>
	<br>
	<form:form method="GET" action="/springmvc/redirect">
        <table>
            <tr>
                <td><input type="text" name="username" value="" /></td>
            </tr>
            <tr>
                <td><input type="password" name="password" value=""/></td>
            </tr>
            <tr>
                <td>
                 <input type="submit" value="页面重定向"/>
                </td>
            </tr>
        </table>  
    </form:form>
</body>
</html>