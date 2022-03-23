<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<spring:form action="loginConObjeto" method="POST"
		modelAttribute="login">
		Usuario:<spring:input path="usuario" />
		<br>
		Clave:<spring:password path="clave" />
		<br>
		<spring:button>EnviaR</spring:button>
	</spring:form>
</body>
</html>
