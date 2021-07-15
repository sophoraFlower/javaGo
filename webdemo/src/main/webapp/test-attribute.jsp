<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>test attribute jsp</title>
</head>
<body>
  <h3>页面属性</h3>
  <%
    request.getServletContext().setAttribute("username", "houle");
    request.getServletContext().removeAttribute("username");
    session.setAttribute("username", "houle");
    session.removeAttribute("username");
    request.setAttribute("username", "houle");
    request.removeAttribute("username");
  %>
</body>
</html>