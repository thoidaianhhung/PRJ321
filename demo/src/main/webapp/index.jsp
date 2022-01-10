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
    <%@page import="gui.TextOutput" %>
<%@ page import="java.io.PrintWriter" %>
    <% TextOutput textOutput = new TextOutput();
        PrintWriter printWriter = response.getWriter();
        printWriter.println(textOutput.getInfo());
    %>
</body>
</html>