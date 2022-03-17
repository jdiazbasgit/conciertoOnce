<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.gris {
	background-color: #cacaca
}

.rosa {
	background-color: #fabada
}
</style>
</head>
<body>

	${nombres}
	<br>
	<table border="1">
		<tr>
			<td>NOMBRE</td>
		</tr>
		<c:set var="fila" scope="page" value="0" />
		<c:forEach items="${nombres}" var="nombre">
			<c:choose>
				<c:when test='${ fila mod 2 eq 0}'>
					<tr class="gris">
						<td>${nombre}</td>
					</tr>
				</c:when>
				<c:otherwise>
					<tr class="rosa">
						<td>${nombre}</td>
					</tr>

				</c:otherwise>

			</c:choose>
			<c:set var="fila" scope="page" value="${fila+1}" />
		</c:forEach>
	</table>

</body>
</html>