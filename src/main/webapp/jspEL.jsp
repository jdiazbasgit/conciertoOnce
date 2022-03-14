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

	<table border="1">

		<tr>
			<td>NOMBRE</td>
		</tr>
		<c:set var="filas" value="0" />
		<c:forEach items="${nombres}" var="nombre">
			<c:choose>
				<c:when test="${filas mod 2 eq 0}">
					<tr bgcolor="#00ff00">
						<td>${nombre }</td>

					</tr>
				</c:when>
				<c:otherwise>
					<tr bgcolor="#fabada">
						<td>${nombre }</td>
					</tr>
				</c:otherwise>
			</c:choose>
			<c:set var="filas" value="${filas + 1} }" />

		</c:forEach>
	</table>
</body>
</html>