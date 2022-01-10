<%@ page import="model.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 7/27/2021
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Thanh Hoa Tech Cart</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
    <jsp:useBean id="cart" scope="session" type="model.Cart"/>
    <nav>
        <%@ include file="menus.jsp" %>
    </nav>
    <div class="row">
        <div class="col-xl-6">
            <h4>Sản Phẩm: ${cart.items.size()}</h4>
        </div>
        <div class="col-xl-2">
            <h4>Đơn Giá</h4>
        </div>
        <div class="col-xl-2">
            <h4>Số Lượng</h4>
        </div>
        <div class="col-xl-2">
            <h4>Tổng Cộng</h4>
        </div>
    </div>
    <%
        List<Product> items = cart.getItems();
        for (Product product : items) {

    %>

    <div class="row">
        <div class="col-xl-6"><%out.println(product.getPRODUCT_NAME());%></div>
        <div class="col-xl-2"><%out.println(product.getPRODUCT_PRICE());%></div>
        <div class="col-xl-2"><%out.println(product.getPRODUCT_NUMBER());%></div>
        <div class="col-xl-2"><%out.println(cart.getAmount());%></div>
    </div>
    <%
        }
    %>

        <form action="${pageContext.request.contextPath}/pay" class="was-validated" method="post">
            <div class="form-group">
                <div class="row">
                    <div class="col-xl-4"><label for="USER_MAIL">USER_MAIL:</label></div>
                    <div class="col-xl-8"><input type="text" class="form-control" id="USER_MAIL" placeholder="Enter USER_MAIL" name="USER_MAIL" required></div>
                </div>
            </div>
            <div class="form-group">
                <div class="row">
                    <div class="col-xl-4"><label for="ORDER_ID">ORDER_ID:</label></div>
                    <div class="col-xl-8"><input type="text" class="form-control" id="ORDER_ID" placeholder="Enter ORDER_ID" name="ORDER_ID" required></div>
                </div>
            </div>
            <div class="form-group">
                <div class="row">
                    <div class="col-xl-4"><label for="ORDER_STATUS">ORDER_STATUS:</label></div>
                    <div class="col-xl-8"><input type="text" class="form-control" id="ORDER_STATUS" placeholder="Enter ORDER_STATUS" name="ORDER_STATUS" required></div>
                </div>
            </div>
            <div class="form-group">
                <div class="row">
                    <div class="col-xl-4"><label for="ORDER_DATE">ORDER_DATE:</label></div>
                    <div class="col-xl-8"><input type="text" class="form-control" id="ORDER_DATE" placeholder="Enter ORDER_DATE" name="ORDER_DATE" required></div>
                </div>
            </div>
            <div class="form-group">
                <div class="row">
                    <div class="col-xl-4"><label for="ORDER_DISCOUNT_CODE">ORDER_DISCOUNT_CODE:</label></div>
                    <div class="col-xl-8"><input type="text" class="form-control" id="ORDER_DISCOUNT_CODE" placeholder="Enter ORDER_DISCOUNT_CODE"
                                                 name="ORDER_DISCOUNT_CODE" required></div>
                </div>
            </div>
            <div class="form-group">
                <div class="row">
                    <div class="col-xl-4"><label for="ORDER_ADDRESS">ORDER_ADDRESS:</label></div>
                    <div class="col-xl-8"><input type="text" class="form-control" id="ORDER_ADDRESS" placeholder="Enter ORDER_ADDRESS" name="ORDER_ADDRESS" required></div>
                </div>
            </div>
            <div class="form-group form-check">
                <label class="form-check-label">
                    <input class="form-check-input" type="checkbox" name="remember" required> I agree to the Thanh Hoa.
                    <div class="valid-feedback">Valid.</div>
                    <div class="invalid-feedback">Check this checkbox to continue.</div>
                </label>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
            <%= session.getAttribute("error")%>
        </form>

</div>
</body>
</html>
