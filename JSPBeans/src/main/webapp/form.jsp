<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Hùng
  Date: 1/13/2022
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/hello-servlet" method="get">
        <label>
            <input type="text" name="user">
        </label>
        <br/>
        <input type="submit" value="OK">
    </form>
</body>
</html>
