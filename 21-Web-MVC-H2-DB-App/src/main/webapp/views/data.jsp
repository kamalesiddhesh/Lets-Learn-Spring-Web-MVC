<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2> All Product Details </h2>
	<table>
		<%-- <c:forEach items="${eList}" var="employee"> --%>
	    <tr>
	       <%--  <td>Employee ID: <c:out value="${employee.eid}"/></td>
	        <td>Employee Pass: <c:out value="${employee.ename}"/></td> --%> 
	        <td>Data</td> 
	        <td>${products}</td>
	    </tr>
	<%-- </c:forEach> --%>
	</table>

</body>
</html>