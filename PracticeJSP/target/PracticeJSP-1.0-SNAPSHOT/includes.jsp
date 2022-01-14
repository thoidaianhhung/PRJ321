<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Hùng
  Date: 1/11/2022
  Time: 3:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Thêm tĩnh:
    <%@include file="manipulation.jsp"%>
    <br/>
    Thêm động:
    <jsp:include page="manipulation.jsp"/>
</body>
</html>
