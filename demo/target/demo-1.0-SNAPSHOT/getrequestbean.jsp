<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Hùng
  Date: 12/9/2021
  Time: 3:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--<jsp:useBean id="user3" class="bean.User" scope="request">

    </jsp:useBean>
    Email: <%= user3.getEmail()%>--%>
    <%--<jsp:forward page="getrequestbean.jsp"></jsp:forward>--%>
    <jsp:useBean id="user" class="bean.User" scope="session"/>
    Email: <%= user.getEmail()%>
    <br>
    Password: <%= user.getPassword()%>
</body>
</html>
