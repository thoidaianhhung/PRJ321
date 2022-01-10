<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%= session.getMaxInactiveInterval()%>
<br>
<a href="${pageContext.request.contextPath}/hello-servlet">Show Cart</a>
</body>
</html>