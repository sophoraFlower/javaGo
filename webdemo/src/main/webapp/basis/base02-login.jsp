<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>简易登录</title>
</head>
<body>
    <div>登录页面</div>
    <from action="/javaweb-login-form-servlet" method="post">
        <div>用户名：<input type="text" name="userName" /> </div>
        <div>密码：<input type="password" name="pwd" /> </div>
        <div>登录：<input type="submit" value="登录" /></div>
    </from>
</body>
</html>
