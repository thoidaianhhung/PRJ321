<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Nguyễn Hùng
  Date: 12/27/2021
  Time: 11:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%! private String name = "Hung"; %>
    <% PrintWriter printWriter = response.getWriter();
        printWriter.println(name);%>
</body>
</html>
