<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Hùng
  Date: 12/28/2021
  Time: 10:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@page import="bean.Cart" %>
    <% Cart cart = (Cart) session.getAttribute("cart");%>
    Items is cart: <%= cart.getTotalItems()%>
</body>
</html>
