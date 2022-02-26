<%--
  Created by IntelliJ IDEA.
  User: tanver
  Date: 2/24/22
  Time: 11:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success Form</title>
</head>
<body>

<h1>The Form is successfully submitted!!!!</h1>

<h1 style="color: purple" class="text-center">${Header}</h1>
<h1 style="color: purple" class="text-center">${desc}</h1>
<hr>

<h1 style="color: mediumblue">${massage}</h1>

<h1>User E-mail is: ${user.email}</h1>
<h1>User Name is: ${user.username}</h1>
<h1>User Password is: ${user.password}</h1>


</body>
</html>
