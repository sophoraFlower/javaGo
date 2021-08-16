<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Base jsp</title>
</head>
<body>
    <div>
        <%
            out.println("IP address is " + request.getRemoteAddr());
        %>
    </div>
</body>
</html>
