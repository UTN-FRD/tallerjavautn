<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="frd.model.Product" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Productos</title>
</head>

<body>
	<h1>Productos</h1>
	<hr>
	<form action="product">
		Nombre:<input type="text" name="name"><br>
		Descripción:<input type="text" name="description"><br>
		<input type="submit">
	</form>
	<hr>
	<table>
	<% 
	List<Product> products = (List<Product>)request.getAttribute("products");
	if(products!=null){
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


</body>
</html>