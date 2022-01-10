<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 7/27/2021
  Time: 2:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
    <title>Thanh Hoa Tech Info Product</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
        a {
            color: aliceblue
        }

        .price {
            color: brown;
            font-size: 50px;
            font-weight: bold;
        }
    </style>
</head>
<body>
<nav>
    <%@ include file="menus.jsp" %>
</nav>

<jsp:useBean id="PRODUCT" scope="request" type="model.Product"/>
<h3>
    PRODUCT NAME:
    ${PRODUCT.PRODUCT_NAME}
</h3>

<div class="container-fluid">
    <div class="row">
        <div class="col-xl-4">
            <img src="${PRODUCT.PRODUCT_IMG_SOURCE}">
        </div>
        <div class="col-xl -8">
            <div class="price">
                ${PRODUCT.PRODUCT_PRICE}
            </div>
            <h4>${PRODUCT.PRODUCT_DES}</h4>
            <button type="submit" class="btn btn-primary">
                <a href="${pageContext.request.contextPath}/addToCart?idd=${PRODUCT.PRODUCT_ID}&action=add">Add to
                    Cart</a>
            </button>
        </div>
    </div>
</div>


</body>
</html>
