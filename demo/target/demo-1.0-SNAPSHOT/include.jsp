<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Hùng
  Date: 12/27/2021
  Time: 8:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@ include file="copyright"%>
    <br>
    <jsp:include page="update"/>
    <br>
    <%@ include file="variable.jsp"%>
    <%= name%>
</body>
</html>
