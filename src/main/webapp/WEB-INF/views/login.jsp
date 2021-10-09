<%--
  Created by IntelliJ IDEA.
  User: MxhSpin5
  Date: 2021/6/14
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Hello   QQ</title>
    <script>
        // 判断是登录账号和密码是否为空
        function check(){
            var username = $("#username").val();
            var password = $("#password").val();
            if(username=="" || password==""){
                $("#message").text("账号或密码不能为空！");
                return false;
            }
            return true;
        }
    </script>
</head>
<body leftMargin=0 topMargin=0 marginwidth="0" marginheight="0"
      background="${pageContext.request.contextPath}/images/qq.png">
<div ALIGN="center">
    <table border="0" width="100%" cellspacing="0" cellpadding="0"
           id="table1">
        <tr>
            <td height="93"></td>
            <td></td>
        </tr>
        <tr>

            <td class="login_msg" width="100%" align="center">
                <!-- margin:0px auto; 控制当前标签居中 -->
                <fieldset style="width: 70%; margin: 0px auto;">
                    <legend>
                        <font style="font-size:25px" face="宋体">
                            欢迎登录QQ
                        </font>
                    </legend>
<%--                    <font color="red">--%>
<%--                        &lt;%&ndash; 提示信息&ndash;%&gt;--%>
<%--                        <span id="message">${msg}</span>--%>
<%--                    </font>--%>
                    <%-- 提交后的位置：/WEB-INF/jsp/customer.jsp--%>
                    <form action="<%=request.getContextPath()%>/login.do"
                          method="post" onsubmit="return check()" class="form-horizontal">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br /><br />

                        账&nbsp;号：<input id="username" type="text" name="username" />
                        <br /><br />
                        密&nbsp;码：<input id="password" type="password" name="password" />
                        <br /><br />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="submit" value="登录" class="btn btn-primary" />
                    </form>
                </fieldset>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
