<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html lang="es">
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<!-- serverTime lo hemos metido en el model en el servlet HomeController -->
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>