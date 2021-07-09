<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <title>Example 03</title>
</head>
<body>
<%
    out.print("first line <br />");
    response.getWriter().println("second line <br />");
%>
</body>
</html>