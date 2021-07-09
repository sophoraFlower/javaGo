<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>EL 表达式</title>
</head>
<body>
  请求URI为：${pageContext.request.requestURI} <br />
  Content-Type响应头：${pageContext.response.contentType} <br />
  服务器信息：${pageContext.servletContext.serverInfo} <br />
  Servlet注册名为：${pageContext.servletConfig.servletName} <br />

  <% pageContext.setAttribute("userName", "Jack1"); %>
  <% request.setAttribute("userName", "Jack2"); %>
  <% session.setAttribute("userName", "Jack3"); %>
  <% application.setAttribute("userName", "Jack4"); %>

  pageScope.userName的值：${pageScope.userName}<br />
  requestScope.userName的值：${requestScope.userName}<br />
  sessionScope.userName的值：${sessionScope.userName}<br />
  applicationScope.userName的值：${applicationScope.userName}<br />

</body>
</html>
