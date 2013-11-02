<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="frd.model.Product" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Lotes</title>
</head>

<body>
	<h1>Lotes</h1>
	<hr>
	<form action="lot">
		<!-- completar con los campos necesarios para el lote -->
		<!-- Fecha de Creación:<input type="text" name="createDate"><br> -->
		Fecha de Vencimiento:<input type="text" name="dueDate"><br>
		Monto inicial:<input type="text" name="initialAmount"><br>
		Monto actual:<input type="text" name="currentAmount"><br>
		Producto:<input type="text" name="product"><br>
		<input type="submit">
	</form>
	<hr>
	<!-- Tabla con todos los objetos enviados en el request desde el servlet -->
	<table>
		<tr>
			<td> Fecha de Creación </td>
			<td> Fecha de Vencimiento </td>
			<td> Monto inicial </td>
			<td> Monto total </td>
			<td> Monto actual </td>
			<td> Producto </td>
		</tr>
	</table>
</body>

</html>