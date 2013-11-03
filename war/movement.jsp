<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="frd.model.Movement" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
	<title>Movimientos</title>
</head>

<body>
	<div class="jumbotron">
		<h1>Movimientos</h1>
		<hr>
		<form action="movement">
			Fecha:<input type="text" name="date"><br>
			Cantidad:<input type="text" name="cantidad"><br>
			Descripcion:<input type="text" name="description"><br>
			LotId:<input type="text" name="lotId"><br>
			<input type="submit">
		</form>
		<hr>
		<!-- Tabla con todos los objetos enviados en el request desde el servlet -->
		<div class="panel panel-primmary">
			<div class="panel-heading">			
				<table align="center" width="100%" class="table">
				<%
					List<Movement> movements= (List<Movement>)request.getAttribute("movements");
				
					if( movements!=null && movements.size()>0 ){
				%>
					<tr>
						<td>Id</td>
						<td>Fecha</td>
						<td>Cantidad</td>
						<td>Descripcion</td>
						<td>LotId</td>
					</tr>
				<%
						for( Movement mov : movements ) { 
				%>
						
					<tr>
						<td><%= mov.getId() %></td>
						<td><%= mov.getDate() %></td>
						<td><%= mov.getCantidad() %></td>
						<td><%= mov.getDescription() %></td>
						<td><%= mov.getLotId() %></td>
					</tr>
				<% 
						}
					}else{
				%>
					<tr>
						<td>No hay Movements cargados</td>
					</tr>
				<%
					}
				%>	
				</table>
			</div>
		</div>
	</div>
</body>

</html>