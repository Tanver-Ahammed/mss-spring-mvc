<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: tanver
  Date: 2/24/22
  Time: 7:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Help Page</title>
</head>
<body>

<h1>This is help page</h1>
<h2>I am Tanver Ahammed.</h2>
<p>Please, Help me in Java Programming.</p>

<%
    //    Integer id = (Integer) request.getAttribute("id");
//    String name = (String) request.getAttribute("name");
//    LocalDateTime time = (LocalDateTime) request.getAttribute("time");
%>

<hr>

<h1>My id is:
    <%--<%=id%>--%>
    ${id}
</h1>

<h1>My id is:
    <%--<%=name%>--%>
    ${name}
</h1>

<h1 style="color: red">
    My id is:
    <%--<%=time%>--%>
    ${time}
</h1>
<hr>

<c:forEach var="mark" items="${marks}">
    <h1 style="color: deeppink"><c:out value="${mark}"/></h1>
</c:forEach>

</body>
</html>
