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

<table>
<tr>
<td>ID de empleado</td>
<td>ID de trabajo</td>
<td>Nombre</td>
<td>Apellido</td>
<td>email</td>
<td>telefono</td>
<td>Fecha de contrato</td>
<td>Salario</td>
<td>Comisión</td>
</tr> 

<tr>
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