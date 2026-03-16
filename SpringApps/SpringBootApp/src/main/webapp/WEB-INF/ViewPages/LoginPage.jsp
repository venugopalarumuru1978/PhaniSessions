<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p style="text-align:center">
		<a href="pg1">Page-1</a>
		&nbsp;&nbsp;|&nbsp;&nbsp;
		<a href="pg2">Page-2</a>
		&nbsp;&nbsp;|&nbsp;&nbsp;
		<a href="login">Login</a>
	</p>
	<hr />
	<h1 style="text-align:center">Login Page</h1>
	<form  name="frmLogin"  method="POST" action="loginProcess">
	<p style="text-align:center">
		<input type="text"  name="txtUname"  placeholder="Username" />
		<br />
		<br />
		<input type="password"  name="txtPwd"  placeholder="Password" />
		<br />
		<br />		
		<input type="submit"  value="Click Me" />
	</p>
	</form>
	
	<h2 style="text-align:center">${msg }</h2>
</body>
</html>