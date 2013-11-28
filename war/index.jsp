<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="frd.model.Product" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<script src="/js/jquery-2.0.3.min.js"></script>
	<link href="/css/bootstrap.css" rel="stylesheet">
	<title>Sistema de Stock FRD</title>
</head>

<body>
	<div class="navbar navbar-default navbar-fixed-top">
		<div class="navbar-header">
		  <a class="navbar-brand" href="#">Stock FRD</a>
		</div>
		<div class="navbar-collapse collapse navbar-responsive-collapse">
			<jsp:include page="/resources/userMenu.jsp"></jsp:include>
		</div><!-- /.nav-collapse -->
	</div>
	<div class="container">
		<div class="page-header" style="padding-top:50px">
			<div class="row">
	          <div class="col-lg-6">
	            <h1>Sistema de Stock</h1>
	            <p class="lead">UTN - FRD</p>
	          </div>
	          <div class="col-lg-6" style="padding: 15px 15px 0 15px;">
	            <div class="well">
	              <span style="float: left; margin-right: 15px;">
	                <img src="/img/deposito.jpg" width="175" height="135" style="border-radius: 4px;">
	              </span>
	              <h4 style="margin-bottom: 0.4em; color: #fff;">Administraci&oacute;n Efectiva de Stock</h4>
	              <div style="color: #fff;" class="clearfix">
	              	<span>Sistema de administraci&oacute;n y control de stock.</span>
	              	<button type="button" class="btn btn-primary" style="float:right;margin-top:40px">Ver Demo</button>
	              </div>
	            </div>
	          </div>
	        </div>
		</div>
		
		<div class="bs-docs-section">
			<div class="row">
	          <div class="col-lg-2">
	          </div>
	          <div class="col-lg-8">
	            <div class="bs-example">
	              <h2>Proyecto de los alumnos</h2>
	              <p>En el taller de java de la <a href="http://www.frd.utn.edu.ar/">Universidad Tecnologica Nacional - Facultad regional Delta</a> se creo este maravilloso sistema de stocks que administra el stock de productos agrupados en lotes de cada usuario.</p>
	              <p><small>Este es el resultado del esfuerzo colectivo puesto fuera de los horarios de clases.</small></p>
	              <p>Bajo las alas de nuestro guia <strong>Sergio Viera</strong>.</p>
	              <p>Los invitamos a saber mas acerca del grupo de nosotros en la pesta�a acerca de nosotros.</em>.</p>
	            </div>
	          </div>
	        </div>
			<div class="row">
			  <div class="col-lg-12">
	            <div class="bs-example">
	              <div class="list-group">
	              </div>
	            </div>
	          </div>
			</div>
		</div>
	</div>
</body>
</html>