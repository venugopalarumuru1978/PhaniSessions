<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Cricketer</title>
</head>
<body>
<img src="pics/pic1.jpg"  width="100%" height="250px"  alt="None" />
<h1 style="text-align:center">Search Cricketer Based Game</h1>
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
<form name="frmSearch" method="post" action="gameinfo">
<p style="text-align: center">
<input type="text"  name="txtGame"  placeholder="Cricketer Game(T20/OneDay/Test)" />
<input type="submit"  value="Search" />
</p>
</form>

	<table width="100%" border="1">
	<tr>
	<th>Crk Number</th>
	<th>Crk Name</th>
	<th>Crk Game</th>
	<th>Crk Runs</th>
	</tr>
	<c:forEach  items="${crkGameList }" var="crk">
	<tr>
	<td>${crk.crno }</td>
	<td>${crk.crname }</td>
	<td>${crk.crgame }</td>
	<td>${crk.runs }</td>
	</tr>
	</c:forEach>
	
	
	</table>

</body>
</html>