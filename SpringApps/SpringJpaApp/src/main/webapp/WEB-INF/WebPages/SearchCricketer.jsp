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
<h1 style="text-align:center">Search Cricketer Page</h1>
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
<form name="frmSearch" method="post" action="searchInfo">
<p style="text-align: center">
<input type="text"  name="txtCrno"  placeholder="Enter Cricketer Number" />
<input type="submit"  value="Search" />
</p>
</form>

<c:if test="${crkinfo!=null }">
	<table width="100%" border="1">
	<tr>
	<th>Crk Number</th>
	<th>Crk Name</th>
	<th>Crk Game</th>
	<th>Crk Runs</th>
	</tr>
	<tr>
	<td>${crkinfo.crno }</td>
	<td>${crkinfo.crname }</td>
	<td>${crkinfo.crgame }</td>
	<td>${crkinfo.runs }</td>
	</tr>
	</table>
</c:if>
<c:if test="${crkinfo==null }">
<h3 style="text-align: center">Cricketer Not Found....</h3>
</c:if>

</body>
</html>