<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Hùng
  Date: 12/9/2021
  Time: 4:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--<jsp:useBean id="user5" class="bean.User" scope="page">
        <jsp:setProperty name="user5" property="password" param="p"/>
     </jsp:useBean>--%>
    <%--<jsp:useBean id="user5" class="bean.User" scope="page">
        <jsp:setProperty name="user5" property="password"/>
    </jsp:useBean>--%>
    <jsp:useBean id="user5" class="bean.User" scope="page">
        <jsp:setProperty name="user5" property="*"/>
    </jsp:useBean>
    <%= user5.getPassword()%>
    <br>
    <%= user5.getEmail()%>
</body>
</html>
