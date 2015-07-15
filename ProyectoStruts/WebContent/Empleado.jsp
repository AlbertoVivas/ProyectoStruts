<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Empleado por ID</title>
</head>
<body>
<h1>Empleado</h1>

<table border="1" bordercolor="#0000FF">
<tr align="center">
<td bgcolor="#00BFFF">ID de empleado</td>
<td bgcolor="#00BFFF">ID de trabajo</td>
<td bgcolor="#00BFFF">Nombre</td>
<td bgcolor="#00BFFF">Apellido</td>
<td bgcolor="#00BFFF">email</td>
<td bgcolor="#00BFFF">Telefono</td>
<td bgcolor="#00BFFF">Fecha de contrato</td>
<td bgcolor="#00BFFF">Salario</td>
<td bgcolor="#00BFFF">Comisión</td>
</tr> 

<tr align="center">
<td><s:property value="empleado.employeeId"/></td>
<td><s:property value="empleado.jobs.jobId"/></td>
<td><s:property value="empleado.firstName"/></td>
<td><s:property value="empleado.lastName"/></td>
<td><s:property value="empleado.email"/></td>
<td><s:property value="empleado.phoneNumber"/></td>
<td><s:property value="empleado.hireDate"/></td>
<td><s:property value="empleado.salary"/></td>
<td><s:property value="empleado.commissionPct"/></td>
</tr>

</table>
</body>
</html>