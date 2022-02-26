<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home Page</title>
</head>
<body>

<h1>This is Home page</h1>

<%
    Integer id = (Integer) request.getAttribute("id");
    String name = (String) request.getAttribute("name");
    List<String> friends = (List<String>) request.getAttribute("friends");
%>

<h1>
    My Id is: <%=id%>
</h1>
<h1>
    My Name is: <%=name%>
</h1>
<hr>

<%
    for (String friend :
            friends) {
%>
<h1><%=friend%></h1>
<%
    }
%>

</body>
</html>