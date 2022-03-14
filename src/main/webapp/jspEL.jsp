<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	${nombres} <br>
	<table border="1">
	<tr>
		<td>NOMBRE</td>
	</tr>
	<c:forEach items="${nombres}" var="nombre">
		<tr>
		<td>"nombre"</td>
	</tr>
	</c:forEach>
	</table>

</body>
</html>