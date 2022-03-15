<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="curso" uri="/WEB-INF/tlds/curso.tld"%>
<%@taglib prefix="datos" uri="/WEB-INF/tlds/datos.tld"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejercicio TagLib</title>
<style type="text/css">
.rojo {
	color: red;
}
</style>
</head>
<body>

	<h1 class="rojo">

		<c:set var="texto1" value="${texto1}" />
		<c:set var="texto2" value="${texto2}" />
		<c:set var="texto" value="${texto1} ${texto2}" />
		Hola Has escrito ${texto.toUpperCase()} y tiene ${texto.length()}
		letras


	</h1>
	<h1>
		<c:choose>
			<c:when test="${applicationScope.contador eq null}">
				<c:set var="contador" value="1" scope="application" />
			</c:when>
			<c:otherwise>
				<c:set var="contador" value="${contador+1}" scope="application" />
			</c:otherwise>
		</c:choose>
		Eres el visitante numero: ${applicationScope.contador}
		
	</h1>
	<h1 style="color: green;">
	
		<c:choose>
			<c:when test="${sessionScope.visitas eq null}">
				<c:set var="visitas" value="1" scope="session" />
			</c:when>
			<c:otherwise>
				<c:set var="visitas" value="${visitas+1}" scope="session" />
			</c:otherwise>
		</c:choose>
		Tu has venido a verme ${sessionScope.visitas} veces
	</h1>
	<ul>
		<curso:repeticiones cantidad="5">

			<li style="color: red;"><curso:texto /></li>

		</curso:repeticiones>
	</ul>


	<datos:conexion driver="com.mysql.jdbc.Driver"
		cadena="jdbc:mysql://192.168.10.20:3306/curso" usuario="curso"
		clave="Cursocurso1;">
		<c:set var="fila" value="0" />
		<table border="1" style="border-aling: center">
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
	<curso:repeticiones texto="NweTime" cantidad="5">
		<br>
		<tr>
			<td><curso:texto /></td>
		</tr>
		<TR>
			<td><curso:texto /></td>
		</TR>
	</curso:repeticiones>

</body>
</html>


















