<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="curso" uri="/WEB-INF/tlds/curso.tld"%>
<%@taglib prefix="datos" uri="/WEB-INF/tlds/datos.tld"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.rojo {
	color: red;
}
</style>
</head>
<body>
	<%!int contador = 0;%>

	<h1 class="rojo">

		<%
		int a = 0;
		String texto1 = request.getParameter("texto1");
		String texto2 = request.getParameter("texto2");
		String texto = texto1 + texto2;
		String salida = "Has escrito " + texto.toUpperCase() + " y tiene " + texto.length() + " letras";
		%>
		<%=salida%>
	</h1>
	<h1>
		<%
		contador++;
		%>
		<%="Eres el visitante numero: " + contador%>
	</h1>
	<h1 style="color: green;">
		<%
		if (session.getAttribute("visitas") == null) {
			session.setAttribute("visitas", 1);
		} else {
			int visitas = (int) session.getAttribute("visitas");
			visitas++;
			session.setAttribute("visitas", visitas);
		}
		%>
		<%="Tu has venido a verme " + session.getAttribute("visitas") + " veces"%>
	</h1>
	<ul>
		<curso:repeticiones cantidad="5">

			<li style="color: red;"><curso:texto /></li>

		</curso:repeticiones>
	</ul>

	
	<datos:conexion driver="com.mysql.jdbc.Driver"
		cadena="jdbc:mysql://localhost:3306/curso" usuario="curso"
		clave="Cursocurso1;">
		<table>
			<tr>
				<td>ID</td>
				<td>DESCRIPCION</td>
			</tr>
			<datos:resultado sql="select id,descripcion from cargos">

				<tr>
					<td><datos:valor campo="1" /></td>
					<td><datos:valor campo="2" /></td>
				</tr>

			</datos:resultado>
		</table>
	</datos:conexion>






</body>
</html>










