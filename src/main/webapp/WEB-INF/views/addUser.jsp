<%--
  Created by IntelliJ IDEA.
  User: MxhSpin5
  Date: 2021/6/16
  Time: 8:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="<%=request.getContextPath()%>/user/finduser.do">
    <input id="id" type="text" name="id" />
    <input id="name" type="text" name="name" />
    <input id="account" type="text" name="account" />
    <button type="submit">提交</button>
</form>

</body>
</html>
