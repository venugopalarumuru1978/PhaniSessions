<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View All Cricketers</title>
</head>
<body>
<img src="pics/pic1.jpg"  width="100%" height="250px"  alt="None" />
<h1 style="text-align:center">View All Cricketers</h1>
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
<table width="100%" border="1">
<tr>
<th>Crk Number</th>
<th>Crk Name</th>
<th>Crk Game</th>
<th>Crk Runs</th>
<th>Operations</th>
</tr>

<c:forEach  items="${crkList }"  var="crk">
	<tr>
	<td>${crk.crno }</td>
	<td>${crk.crname }</td>
	<td>${crk.crgame }</td>
	<td>${crk.runs }</td>
	<td>
	<a href="delcrk/${crk.crno }">Delete</a>
	&nbsp;&nbsp;|&nbsp;&nbsp;
	<a href="modcrk/${crk.crno }">Update</a>
	</td>
	</tr>
</c:forEach>
</table>
</body>
</html>