<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <title>Example 01</title>
</head>
<%!
int a=1, b=2;
%>
<%!
    public String print() {
        String str = "day day up~";
        return str;
    }
%>
<body>
    <% Thread.sleep(5000); %>
    <%
        out.print(a + b);
    %>
    <br />
    <%
        out.println(print());
    %>
    <br />
    <%=print()%>
</body>
</html>
