<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Hùng
  Date: 1/9/2022
  Time: 4:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/hello-servlet" method="get">
        <div>
            <label>
                <input type="text" name="user">
            </label>
        </div>
        <div>
            <label>
                <input type="text" name="password">
            </label>
        </div>

        <input type="submit" value="OK">
    </form>
</body>
</html>
