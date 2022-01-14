<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Hùng
  Date: 1/13/2022
  Time: 1:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/controller" method="post">
        <input type="hidden" name="action" value="dologin">
        <h1>Email: <input type="text" name="user"></h1>
        <h1>Password: <input type="text" name="password"></h1>
        <h1><input type="submit" value="OK"></h1>
    </form>
</body>
</html>
