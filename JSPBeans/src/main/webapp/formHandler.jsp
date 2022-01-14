<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Hùng
  Date: 1/13/2022
  Time: 1:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="userBean" class="com.example.jspbeans.User" scope="session">
        <jsp:setProperty name="userBean" property="user"/>
        <jsp:setProperty name="userBean" property="password"/>
    </jsp:useBean>
    <h1>Email: <%=userBean.getUser()%></h1>
    <h1>Password: <%=userBean.getPassword()%></h1>
</body>
</html>
