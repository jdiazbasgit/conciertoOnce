<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	${nombres}
	<br>

	<table border="1">
		<tr>
			<td>NOMBRE</td>
			
		</tr>
		<c:set var="fila" value="0"/>
		<c:forEach items="${nombres}" var="nombre">
		<c:choose>
		<c:when test="${fila mod 2 eq 0}">
		<tr bgcolor = "#96ff33">
		</c:when>
		<c:otherwise>
		<tr bgcolor = "#f6caab">
		</c:otherwise>
		</c:choose>
				<td>${nombre}</td>
				</tr>
<c:set var="fila" value="${fila+1}"/>		
</c:forEach>
	</table>
</body>
</html>