<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<br />
<%
    out.println("IP address is " + request.getRequestURL());
%>
<br />
<%= request.getRequestURL()  %>
<br />
<form action="/user/login" method="post">
    <div>⽤用户名: <input type="text" name="userName" /> </div>
    <div>密码: <input type="password" name="pwd"/> </div>
    <div> <input type="submit" value="登录"> </div>
</form>
</body>
</html>