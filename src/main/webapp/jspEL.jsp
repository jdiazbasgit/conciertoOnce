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

	${nombres }
	<br>
	<c:set var="fila" value="0" />
	<table border="1">
		<tr>
			<td>NOMBRE</td>
		</tr>
		<c:forEach items="${nombres}" var="nombre">
			<c:choose>
				<c:when test="${fila mod 2 eq 0 }">
					<tr bgcolor="#c7c7c7">
				</c:when>

				<c:otherwise>
					<tr bgcolor="#f03687">
				</c:otherwise>

			</c:choose>
			<td>${nombre }</td>
			</tr>
			<c:set var="fila" value="${fila+1 }" />
		</c:forEach>
	</table>
</body>
</html>