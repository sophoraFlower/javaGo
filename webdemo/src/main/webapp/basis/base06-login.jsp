<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/javaweb-session" method="post">
    名称： <input type="text" name="name"/>
    <br/>
    密码： <input type="password" name="pwd"/>
    <input type="submit" value="登录">
    消息提示 ${msg}
</form>
</body>
</html>
