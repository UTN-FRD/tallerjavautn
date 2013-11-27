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
	              <h2>Example body text</h2>
	              <p>Nullam quis risus eget <a href="#">urna mollis ornare</a> vel eu leo. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nullam id dolor id nibh ultricies vehicula.</p>
	              <p><small>This line of text is meant to be treated as fine print.</small></p>
	              <p>The following snippet of text is <strong>rendered as bold text</strong>.</p>
	              <p>The following snippet of text is <em>rendered as italicized text</em>.</p>
	              <p>An abbreviation of the word attribute is <abbr title="attribute">attr</abbr>.</p>
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