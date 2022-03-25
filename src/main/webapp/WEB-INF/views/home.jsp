<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<html>
<head>
<title>Home</title>
</head>
<body>

	<spring:form action="loginConObjeto" method="POST"
		modelAttribute="login">
		<spring:label path="usuario">Usuario:</spring:label>
        <spring:input path="usuario" />
		<br>
		<br>
		<spring:label path="clave">Clave:&nbsp;&nbsp;&nbsp;</spring:label>
        <spring:password path="clave" />
		<br>
		<br>

		<spring:button>EnviaR</spring:button>


	</spring:form>




</body>
</html>