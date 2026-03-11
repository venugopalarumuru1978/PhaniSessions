<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Cricketer</title>
</head>
<body>
<img src="pics/pic1.jpg"  width="100%" height="250px"  alt="None" />
<h1 style="text-align:center">Update Cricketer Page</h1>
<hr />
<p style="text-align: center">
<a href="../viewall">Back</a>
</p>
<hr />
<sf:form method="post"  action="../modInfo"  modelAttribute="crk">
	<p style="text-align:center">
		<sf:input type="text"  path="crno"  />
		<br /><br />			
		<sf:input type="text"  path="crname"  />
		<br /><br />		
		<sf:input type="text"  path="crgame"  />
		<br /><br />		
		<sf:input type="text"  path="runs"  />
		<br /><br />		
		<input type="submit" value="Click Me" />
	</p>
</sf:form>
</body>
</html>