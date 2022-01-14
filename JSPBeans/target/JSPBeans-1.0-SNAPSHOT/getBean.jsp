<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Hùng
  Date: 1/13/2022
  Time: 10:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="user" class="com.example.jspbeans.User" scope="request"/>
    <jsp:getProperty name="user" property="user"/>
    <br/>
    <jsp:getProperty name="user" property="password"/>
    <%--<h1>Email: <%=user.getUser()%></h1>
    <h1>Password: <%=user.getPassword()%></h1>--%>
</body>
</html>
