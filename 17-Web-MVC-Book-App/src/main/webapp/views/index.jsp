<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Details</title>
</head>
<body>
	<h3>Book Details</h3>
	<form action="book" method="get">
		Book ID : <input type="text" name ="id" />
		<input type="submit" value="Search"> </input>
	</form>
	<hr></hr>
	
	Book ID : ${book.bookId} <br/>
	Book Name : ${book.bookName}<br/>
	Book Price : ${book.bookPrice} <br/>
</body>
</html>