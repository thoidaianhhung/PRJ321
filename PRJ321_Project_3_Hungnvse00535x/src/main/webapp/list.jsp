<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 7/27/2021
  Time: 3:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Thanh Hoa Tech List</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
        td img {
            width: 200px;
        }
    </style>
</head>
<body>
<nav>
    <%@ include file="menus.jsp" %>
</nav>
<h2>List Product</h2>
<table class="table">
    <tr>
        <th>PRODUCT_ID</th>
        <th>PRODUCT_NAME</th>
        <th>PRODUCT_DES</th>
        <th>PRODUCT_PRICE</th>
        <th>PRODUCT_IMG_SOURCE</th>
        <th>PRODUCT_TYPE</th>
        <th>PRODUCT_BRAND</th>
        <th>PRODUCT_NUMBER</th>
        <!-- rest of you columns -->
    </tr>
    <jsp:useBean id="PRODUCTS" scope="request" type="java.util.List"/>
    <c:forEach items="${PRODUCTS}" var="list">
        <tr>
            <td>${list.PRODUCT_ID}</td>
            <td>${list.PRODUCT_NAME}</td>
            <td>${list.PRODUCT_DES}</td>
            <td>${list.PRODUCT_PRICE}</td>
            <td><a href="${pageContext.request.contextPath}/productdetail?id=<c:out value="${list.PRODUCT_ID}"/>"><img
                    src="${list.PRODUCT_IMG_SOURCE}" alt="product"></a></td>
            <td>${list.PRODUCT_TYPE}</td>
            <td>${list.PRODUCT_BRAND}</td>
            <td>${list.PRODUCT_NUMBER}</td

        </tr>
    </c:forEach>
</table>
</body>
</html>
