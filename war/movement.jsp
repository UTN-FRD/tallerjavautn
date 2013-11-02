<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="frd.model.Product" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Movimientos</title>
</head>

<body>
	<h1>Movimientos</h1>
	<hr>
	<form action="movement">
		<!-- completar con los campos necesarios para el movimiento -->
		<input type="submit">
	</form>
	<hr>
	<!-- Tabla con todos los objetos enviados en el request desde el servlet -->
	<table>
		<tr>
			<td>Nombre</td>
			<td>Descripción</td>
		</tr>
	</table>
</body>

</html>