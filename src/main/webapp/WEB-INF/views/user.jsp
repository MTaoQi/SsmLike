<%--
  Created by IntelliJ IDEA.
  User: MxhSpin5
  Date: 2021/6/14
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="users">
    <b>用户信息:</b><br>
<%--    <c:forEach items="${users}" var="user">--%>
        --------------------------------------------------
        <br>
        <b>用户：</b><span id="name">${user.name}</span><br>
        <b>说说内容：</b><span id="account">${user.account}</span><br>


<%--    </c:forEach>--%>
</div>
</body>
</html>
