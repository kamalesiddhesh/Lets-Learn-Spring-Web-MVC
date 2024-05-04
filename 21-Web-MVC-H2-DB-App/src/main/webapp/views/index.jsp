<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
	<h2>Add Product Here: </h2> <br/>
	<form:form action="product" modelAttribute="product" method="post">
		<table>
			<tr>
				<td>Name: </td>
				<td><form:input path="name"/></td>
			
			</tr>
			<tr>
				<td>Price: </td>
				<td><form:input path="price"/></td>
			
			</tr>
			<tr>
				<td>Quantity: </td>
				<td><form:input path="quantity"/></td>
			
			</tr>
			
			<tr>
				<td></td>
				<td> <input type="submit" value="Save"/> </td>
			</tr>
			
		
		</table>
	</form:form>
	
	<p>
		<font color='green'>${msg }</font>
	</p>

</body>
</html>