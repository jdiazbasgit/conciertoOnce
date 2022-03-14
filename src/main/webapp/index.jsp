<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="curso" uri="/WEB-INF/tlds/curso.tld"%>
<%@taglib prefix="datos" uri="/WEB-INF/tlds/datos.tld"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
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

<%--192.168.10.17 --%>
	<datos:conexion driver="com.mysql.jdbc.Driver"
		cadena="jdbc:mysql://192.168.10.17:3306/curso" usuario="curso" clave="Cursocurso1;">
		<table border="1" align="center">

			<tr>
				<td>NOMBRE</td>
				<td>DNI</td>
				<td>ESTADO CIVIL</td>
				<td>CARGO</td>
				<td>SALARIO</td>
				<td>FECHA NACIMIENTO</td>
			</tr>
			<datos:resultado
				sql="select e.nombre, e.dni, ec.descripcion, c.descripcion, dl.salario,E.FECHA_NACIMIENTO
			from empleados as e, datos_laborales as dl,datos_personales as dp, cargos as c, estado_civil as ec 
			where e.datos_laborales_id=dl.id and e.datos_personales_id=dp.id and dp.estado_civil_id=ec.id and 
			dl.cargos_id=c.id">
			<c:forEach items="${nombres}" var="contador">
				<c:set var="fila" scope="page" value="0" />
				<c:if test='${ fila mod 2 eq 0}'>
					<tr bgcolor="ffff00">
					<td> ${fila}${contador}</td>
					</tr>
				
					<tr>
					
						<td id=1><datos:valor campo="1" /></td>
						<td id=2><datos:valor campo="2" /></td>
						<td id=3><datos:valor campo="3" /></td>
						<td id=4><datos:valor campo="4" /></td>
						<td id=5><datos:valor campo="5" /></td>
						<td id=6><datos:valor campo="6" /></td>
					</tr>
				</c:if>
				</c:forEach>
			</datos:resultado>
		</table>

	</datos:conexion>
	<%-- <curso:repeticiones texto="NweTime" cantidad="5">
		<br>
		<TR><td><curso:texto /></td></TR>
	</curso:repeticiones>--%>

</body>
</html>










