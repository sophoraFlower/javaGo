<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index JSP</title>
</head>
<body>
    index jsp!
    <br>
    <%-- name = ${pageScope.name} --%>
    name = ${user.name}
    <br>
    name = ${user.id}
    <br>
    name = ${user.host}
    <br>
    name = <%= (String) request.getAttribute("name")%>
</body>
</html>
