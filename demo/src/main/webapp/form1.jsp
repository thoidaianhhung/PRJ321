<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Hùng
  Date: 12/14/2021
  Time: 7:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/hello-servlet" method="get">
        <input type="text" name="user">
        <input type="submit" value="OK">
    </form>
</body>
</html>
