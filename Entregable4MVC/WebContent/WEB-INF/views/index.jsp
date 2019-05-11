<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${message}</h1>
	<form:form action="${pageContext.request.contextPath}/formData" method="POST" modelAttribute= "producto">

	<label>Ingrese Nombre:</label>
	<form:input type="text" name="name" path="nombre"/>
	<form:errors path="nombre" cssStyle="color:#E81505"></form:errors><br>
	
	<label>Ingrese Marca:</label>
	<form:input type="text" name="marca" path="marca"/>
	<form:errors path="marca" cssStyle="color:#E81505"></form:errors><br>
	
	<label>Descripcion:</label>
	<form:input type="text" name="descripcion" path="descripcion"/>
	<form:errors path="descripcion" cssStyle="color:#E81505"></form:errors><br>
	
	<label>Categoria:</label>
	<form:input type="text" name="categoria" path="categoria"/>
	<form:errors path="categoria" cssStyle="color:#E81505"></form:errors><br>
	
	<label>Precio:</label>
	<form:input type="text" name="precio" path="precio"/>
	<form:errors path="precio" cssStyle="color:#E81505"></form:errors><br>
	
	<label>Fecha de Vencimiento:</label>
	<form:input type="date" name="vencimiento" path="fechaV"/>
	<form:errors path="fechaV" cssStyle="color:#E81505"></form:errors><br>
	
	<input type="submit" value="Agregar producto">
	</form:form>

</body>
</html>