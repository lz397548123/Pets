<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.invalidate();
    response.sendRedirect("login.jsp");
%>
<%--<% pageContext.forward("/login.jsp"); %>--%>
</body>
</html>
