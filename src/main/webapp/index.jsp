<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="curso" uri="/WEB-INF/tlds/curso.tld"%>
<%@taglib prefix="datos" uri="/WEB-INF/tlds/datos.tld"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.rojo {
	color: red;
}

.gris {
	background-color: #cacaca
}

.rosa {
	background-color: #fabada
}
</style>
</head>
<body>
	<c:set var="contador" value="0" scope="page" />
	<%--!int contador = 0;--%>


	<h1 class="rojo">

		<c:set var="a" value="0" scope="page" />
		<c:set var="texto1" value="${param.texto1}" scope="page" />
		<c:set var="texto2" value="${param.texto2}" scope="page" />
		<c:set var="texto" value="${texto1}${texto2}" scope="page" />
		<c:set var="salida"
			value="Has escrito  ${fn:toUpperCase(texto)} y tiene  ${fn:length(texto)} letras"
			scope="page" />

		<%--
		String texto1 = request.getParameter("texto1");
		String texto2 = request.getParameter("texto2");
		String texto = texto1 + texto2;
		String salida = "Has escrito " + texto.toUpperCase() + " y tiene " + texto.length() + " letras";
		--%>

		<c:out value="${salida}" />
	</h1>
	<h1>
		<c:set var="contador" value="${contador+1}" />
		<%--
		contador++;
		--%>

		<c:out value="Eres el visitante numero: ${contador}" />
		<%--="Eres el visitante numero: " + contador--%>
	</h1>
	<h1 style="color: green;">
		<%--
		if (session.getAttribute("visitas") == null) {
			session.setAttribute("visitas", 1);
		} else {
			int visitas = (int) session.getAttribute("visitas");
			visitas++;
			session.setAttribute("visitas", visitas);
		}
		--%>

		<%--="Tu has venido a verme " + session.getAttribute("visitas") + " veces"--%>

		<c:choose>
			<c:when test="${sessionScope.visitas eq null}">
				<c:set var="visitas" value="1" scope="session" />
			</c:when>
			<c:otherwise>
				<c:set var="visitas" value="${sessionScope.visitas + 1 }"
					scope="session" />
			</c:otherwise>
		</c:choose>
		<c:out value="Tu has venido a verme ${sessionScope.visitas} veces"></c:out>
	</h1>
	<ul>
		<curso:repeticiones cantidad="5">

			<li style="color: red;"><curso:texto /></li>

		</curso:repeticiones>
	</ul>

	<%--192.168.10.17 --%>
	<datos:conexion driver="com.mysql.jdbc.Driver"
		cadena="jdbc:mysql://localhost:3306/curso" usuario="root" clave="1234">
		<table border="1" align="center">

			<tr>
				<td>NOMBRE</td>
				<td>DNI</td>
				<td>ESTADO CIVIL</td>
				<td>CARGO</td>
				<td>SALARIO</td>
				<td>FECHA NACIMIENTO</td>
			</tr>
			<c:set var="fila" value="0" />
			<datos:resultado
				sql="select e.nombre, e.dni, ec.descripcion, c.descripcion, dl.salario,E.FECHA_NACIMIENTO
			from empleados as e, datos_laborales as dl,datos_personales as dp, cargos as c, estado_civil as ec 
			where e.datos_laborales_id=dl.id and e.datos_personales_id=dp.id and dp.estado_civil_id=ec.id and 
			dl.cargos_id=c.id">


				<c:choose>
					<c:when test="${fila mod 2 eq 0}">
						<tr class="gris">
					</c:when>
					<c:otherwise>
						<tr class="rosa">
					</c:otherwise>
				</c:choose>
				<c:set var="fila" value="${fila+1}" />
				<tr>

					<td><datos:valor campo="1" /></td>
					<td><datos:valor campo="2" /></td>
					<td><datos:valor campo="3" /></td>
					<td><datos:valor campo="4" /></td>
					<td><datos:valor campo="5" /></td>
					<td><datos:valor campo="6" /></td>
				</tr>


			</datos:resultado>


		</table>

	</datos:conexion>
	<%-- <curso:repeticiones texto="NweTime" cantidad="5">
		<br>
		<TR><td><curso:texto /></td></TR>
	</curso:repeticiones>--%>

</body>
</html>










