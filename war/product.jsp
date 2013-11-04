<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="frd.model.Product" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">	
	<link href="/resources/estilos.css" rel="stylesheet">
	<title>Productos</title>
</head>

<body>

	<div class="jumbotron"> <!-- contenedor principal bootstrap -->

		<h1>Productos</h1>
		<hr>

		<form action="product">

			<div class=form-group>
			Nombre:<input type="text" name="name" class="form-control">
			</div>

			<div class=form-group>
			Descripción:<input type="text" name="description" class="form-control">
			</div>

			<input type="submit" class="btn btn-primary">
		</form>

		<hr>

		<div class="panel panel-primary"> <!-- panel bootstrap -->

			<div class="panel-heading">Products</div> <!-- encabezado de panel bootstrap -->

			<table class="table">
			<% List<Product> products = (List<Product>)request.getAttribute("products");
			if(products!=null && products.size()>0){
			%>
				<tr>
					<td>Nombre</td>
					<td>Descripción</td>
				</tr>
			<%
				for( Product prod : products ) { 
			%>
				<tr>
					<td><%= prod.getName() %></td>
					<td><%= prod.getDescription() %></td>
				</tr>
			<% 
				}
			}else{
			%>
				<tr>
					<td>No hay productos cargados</td>
				</tr>
			<%
			}
			%>	
			</table>
		</div>

	</div>

</body>
</html>