<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!--  <title>Basic Struts 2 Application - Welcome</title>-->
<title>Aplicacion basica en Struts 2 </title>
</head>
<body>
<h1>Bienvenido a Struts 2!!!</h1>
<!-- <p><a href="<s:url action='hello'/>">Hello World</a></p> -->
<p><a href="<s:url action='p'/>">Persona</a></p>

<s:form action="nombreEdad">
<s:textfield name="nombre" label="Nombre"></s:textfield>
<s:textfield name="edad" label="Edad"></s:textfield>
<s:submit></s:submit>
</s:form>

<s:form action="eid">
<s:textfield name="id" label="Id empleado"></s:textfield>
<s:submit></s:submit>
</s:form>

<s:form action="ca">
<s:textfield name="marca" label="Marca"></s:textfield>
<!--<s:textfield name="modelo" label="Modelo"></s:textfield>
<s:textfield name="matricula" label="Matricula"></s:textfield>
<s:textfield name="fecha_compra" label="Fecha compra"></s:textfield>
<s:textfield name="potencia" label="Potencia"></s:textfield>
<s:textfield name="cc" label="CC"></s:textfield>-->
<s:submit></s:submit>
</s:form>

</body>
</html>