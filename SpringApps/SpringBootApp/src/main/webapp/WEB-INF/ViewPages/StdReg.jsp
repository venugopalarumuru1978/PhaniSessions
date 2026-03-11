<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center">Register Page</h1>
<hr />
<sf:form method="post"  action="stdinfo"  modelAttribute="std">
	<p style="text-align:center">
		<sf:input type="text"  path="sname"  placeholder="Student Name" />
		<br /><br />
		<label>Gender</label>
		<sf:radiobutton path="gender"  value="Male"  label="Male"/>
		<sf:radiobutton path="gender"  value="Female"  label="Female"/>
		
		<br /><br />
		<label>Location</label>
		<sf:select path="location">
			<sf:option value="Hyderabad"/>
			<sf:option value="Amarvathi"/>
			<sf:option value="Bangalore"/>
		</sf:select>
		<br /><br />
		<input type="submit" value="Click Me" />
	</p>
</sf:form>
</body>
</html>