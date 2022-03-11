<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="ISO-8859-1">
<title>jstl</title>
<style>
	table, th, td{ 
		border: 1px solid black;
	}
	table {
		margin-left: auto;
  		margin-right: auto;
	}	
	table tr:nth-child(even) td {
		background-color: #4C8BF5;
		color: #fff;
	}
</style>
</head>
<body>
	${nombres }
	<br>
	<table>
	<caption>Nombres de Persona</caption>
		<tr>
			<th>NOMBRE</th>
		</tr>
		<c:forEach items="${nombres}" var="nombre">
			<tr>
				<td>${nombre }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>