<%--<%@ page language="java" contentType="text/html; charset=UTF-8"--%>
<%--         pageEncoding="UTF-8" isELIgnored="false"%>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>


<%--<head>--%>
<%--    <title>Getting Started:Serving Web Content</title>--%>
<%--    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />--%>
<%--</head>--%>


<%--<body>--%>
<%--<div id="moods">--%>
<%--    <b>说说列表:</b><br>--%>

<%--    <c:forEach items="${moods}" var="mood">--%>
<%--        ----------------------------------------------%>
<%--        <br>--%>
<%--        <b>用户:</b>--%>
<%--        <span id="account">${mood.userName}</span>--%>
<%--        <br>--%>
<%--        <b>说说内容:</b>--%>
<%--        <span id="content">${mood.content}</span>--%>
<%--        <br>--%>
<%--        <b>发表时间:</b>--%>
<%--        <span id="public_time"> ${mood.publishTime} </span>--%>
<%--        <br>--%>
<%--        <b>点赞数:</b>--%>
<%--        <span id="praise_num">${mood.praiseNum}</span>--%>
<%--        <br>--%>
<%--        <div style="margin-left: 350px">--%>
<%--            <a id="praise">赞</a>--%>
<%--        </div>--%>
<%--    </c:forEach>--%>
<%--</div>--%>
<%--</body>--%>
<%--<script></script>--%>
<%--</html>--%>
<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!-- 转发到登录页面 -->
<jsp:forward page="/WEB-INF/views/login.jsp"/>