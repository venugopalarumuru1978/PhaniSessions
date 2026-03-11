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
<h1 style="text-align:center">Add Cricketer Page</h1>
<hr />
<p style="text-align: center">
<a href="viewall">All Cricketers</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="newcrk">New Cricketer</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="searchcrk">Search Cricketer</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="gamecrk">Search Cricketer By Game</a>

</p>
<hr />
<sf:form method="post"  action="crkinfo"  modelAttribute="crk">
	<p style="text-align:center">
		<sf:input type="text"  path="crname"  placeholder="Cricketer Name" />
		<br /><br />		
		<label>Game</label>
		<sf:select path="crgame">
			<sf:option value="T20"/>
			<sf:option value="OneDay"/>
			<sf:option value="Test"/>
		</sf:select>
		<br /><br />
		<sf:input type="text"  path="runs"  placeholder="Runs" />
		<br /><br />		

		<input type="submit" value="Click Me" />
	</p>
</sf:form>
</body>
</html>