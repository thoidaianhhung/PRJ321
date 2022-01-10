<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Nguyễn Hùng
  Date: 12/27/2021
  Time: 8:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% String user = request.getParameter("user");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("This user parameter is: " + user);
    %>
</body>
</html>
