<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="spring"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html lang="es">
<head>
 <meta charset="UTF-8">
<title>Home</title>
</head>
<body>

	<spring:form action="loginConObjeto" method="POST"
		modelAttribute="login">
	User:<spring:input path="usuario" />
		<br />
	Password:<spring:password path="clave" />
		<br />
		<spring:button>Send</spring:button>
		<br />
	</spring:form>

	<form action="algo/javier/diaz" method="post">
		<input type="text" /><br />
		<button type="submit">Send</button>
		<br />
	</form>

	<form action="loginConObjeto" method="post">
		User:<input type="text" name="usuario" /><br /> Password:<input
			type="text" name="clave" /><br />
		<button type="submit">Send</button>
		<br />
	</form>

</body>
</html>
