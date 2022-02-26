<%--
  Created by IntelliJ IDEA.
  User: tanver
  Date: 2/25/22
  Time: 10:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success Complex Form</title>
</head>
<body>

<h1>Student Id: ${student.id}</h1>
<h1>Student Name: ${student.name}</h1>
<h1>Student DOB: ${student.dob}</h1>
<h1>Student Courses: ${student.courses}</h1>
<h1>Student Gender: ${student.gender}</h1>
<h1>Student Type: ${student.type}</h1>
<hr>
<h1>Student Street: ${student.address.street}</h1>
<h1>Student City: ${student.address.city}</h1>

</body>
</html>
