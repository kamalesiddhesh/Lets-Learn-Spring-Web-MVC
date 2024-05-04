<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<title>Student Inquiry</title>
</head>
<body>

<h1>Student Inquiry</h1>

<form:form action="/submitInquiry" method="post" modelAttribute="student">

  <p>
    <label for="name">Name:</label>
    <form:input path="name" id="name" type="text" />
  </p>
  <p>
    <label for="email">Email:</label>
    <form:input path="email" id="email" type="email" />
  </p>
  <p>
    <label for="courseId">Course:</label>
    <form:select path="courseId" id="courseId">
      <form:options items="${courses}" itemValue="courseId" itemLabel="courseName" />
    </form:select>
  </p>
  <p>
    <button type="submit">Submit</button>
  </p>

</form:form>

</body>
</html>
