<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
<br/>
    <%@page import="com.example.practicejsp.TextOutput" %>
    <%@page import="java.util.Date" %>
    <%@ page import="java.io.PrintWriter" %>
    <%= new Date()%>
    <%  TextOutput textOutput = new TextOutput();
        PrintWriter printWriter = response.getWriter();
        printWriter.println(textOutput.getInfo());
    %>
    <%  String name = request.getParameter("name");
        printWriter.println("JSP Xin chào " + name);
    %>
</body>
</html>