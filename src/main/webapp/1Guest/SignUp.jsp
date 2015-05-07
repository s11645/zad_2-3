<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
ServletContext context = pageContext.getServletContext();
context.setAttribute( "aKtoTo", "guest" );
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign Up</title>
</head>
<body>
<form action="/demoApp/SignUp" method="get" enctype="text/plain"><div>

 Username :<input type="text" name="username" /><br />
 Password :<input type="text" name="password" /><br />
 Confirm Password :<input type="text" name="confirm" /><br />
 Email :<input type="text" name="email" /><br />
 
<input type="submit" value="Wyślij formularz" />
<input type="reset" value="Wyczyść dane" />
</div></form>
</body>
</html>