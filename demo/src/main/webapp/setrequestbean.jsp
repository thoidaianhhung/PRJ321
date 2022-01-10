<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Hùng
  Date: 12/9/2021
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--<jsp:useBean id="user3" class="bean.User" scope="request">
        <jsp:setProperty name="user3" property="email" value="1danhvaythoi@gamil.com"/>
        <jsp:setProperty name="user3" property="password" value="hungnv"/>
    </jsp:useBean>--%>
    <%--<% response.sendRedirect("getrequestbean.jsp");%>--%>
    <%--<jsp:forward page="getrequestbean.jsp"></jsp:forward>--%>
    <jsp:useBean id="user" class="bean.User" scope="session">
        <jsp:setProperty name="user" property="email" value="1danhvaythoi@gmail.com"/>
        <jsp:setProperty name="user" property="password" value="hungnv"/>
    </jsp:useBean>
</body>
</html>
