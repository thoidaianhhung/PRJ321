<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Hùng
  Date: 1/13/2022
  Time: 10:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="user" class="com.example.jspbeans.User" scope="request">
        <jsp:setProperty name="user" property="user" value="hungnv1995"/>
        <jsp:setProperty name="user" property="password" value="Thienthao1"/>
    </jsp:useBean>
    <%request.getRequestDispatcher("getBean.jsp").forward(request, response);%>
</body>
</html>
