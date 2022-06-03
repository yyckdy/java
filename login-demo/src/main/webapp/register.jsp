<%--
  Created by IntelliJ IDEA.
  User: yy
  Date: 2022/6/3
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>欢迎注册</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            list-style-type: none;
        }

        .reg-content {
            padding: 30px;
            margin: 3px;
        }

        a, img {
            border: 0;
        }

        body {
            background-image: url("./imgs/reg_bg_min.jpg");
            text-align: center;
        }

        table {
            border-collapse: collapse;
            border-spacing: 0;
        }

        td, th {
            padding: 0;
            height: 90px;

        }

        .inputs {
            vertical-align: top;
        }

        .clear {
            clear: both;
        }

        .clear:before, .clear:after {
            content: "";
            display: table;
        }

        .clear:after {
            clear: both;
        }

        .form-div {
            background-color: rgba(255, 255, 255, 0.27);
            border-radius: 10px;
            border: 1px solid #aaa;
            width: 424px;
            margin-top: 150px;
            margin-left: 1050px;
            padding: 30px 0 20px 0px;
            font-size: 16px;
            box-shadow: inset 0 0 10px rgba(255, 255, 255, 0.5), 0 0 15px rgba(75, 75, 75, 0.3);
            text-align: left;
        }

        .form-div input[type="text"], .form-div input[type="password"], .form-div input[type="email"] {
            width: 268px;
            margin: 10px;
            line-height: 20px;
            font-size: 16px;
        }

        .form-div input[type="checkbox"] {
            margin: 20px 0 20px 10px;
        }

        .form-div input[type="button"], .form-div input[type="submit"] {
            margin: 10px 20px 0 0;
        }

        .form-div table {
            margin: 0 auto;
            text-align: right;
            color: rgba(64, 64, 64, 1.00);
        }

        .form-div table img {
            vertical-align: middle;
            margin: 0 0 5px 0;
        }

        .footer {
            color: rgba(64, 64, 64, 1.00);
            font-size: 12px;
            margin-top: 30px;
        }

        .form-div .buttons {
            float: right;
        }

        input[type="text"], input[type="password"], input[type="email"] {
            border-radius: 8px;
            box-shadow: inset 0 2px 5px #eee;
            padding: 10px;
            border: 1px solid #D4D4D4;
            color: #333333;
            margin-top: 5px;
        }

        input[type="text"]:focus, input[type="password"]:focus, input[type="email"]:focus {
            border: 1px solid #50afeb;
            outline: none;
        }

        input[type="button"], input[type="submit"] {
            padding: 7px 15px;
            background-color: #3c6db0;
            text-align: center;
            border-radius: 5px;
            overflow: hidden;
            min-width: 80px;
            border: none;
            color: #FFF;
            box-shadow: 1px 1px 1px rgba(75, 75, 75, 0.3);
        }

        input[type="button"]:hover, input[type="submit"]:hover {
            background-color: #5a88c8;
        }

        input[type="button"]:active, input[type="submit"]:active {
            background-color: #5a88c8;
        }

        .err_msg {
            color: red;
            padding-right: 170px;
        }

        #password_err, #tel_err {
            padding-right: 195px;
        }

        #reg_btn {
            margin-right: 50px;
            width: 285px;
            height: 45px;
            margin-top: 20px;
        }

        #checkCode {
            width: 100px;
        }

        #changeImg {
            color: aqua;
        }
    </style>
</head>
<body>

<div class="form-div">
    <div class="reg-content">
        <h1>欢迎注册</h1>
        <span>已有帐号？</span> <a href="login.jsp">登录</a>
    </div>
    <form id="reg-form" action="/login-demo/registerServlet" method="post">

        <table>

            <tr>
                <td>用户名</td>
                <td class="inputs">
                    <input name="username" type="text" id="username">
                    <br>
                    <span id="username_err" class="err_msg">${register_msg}</span>
                </td>

            </tr>

            <tr>
                <td>密码</td>
                <td class="inputs">
                    <input name="password" type="password" id="password">
                    <br>
                    <span id="password_err" class="err_msg" style="display: none">密码格式有误</span>
                </td>
            </tr>


            <tr>
                <td>验证码</td>
                <td class="inputs">
                    <input name="checkCode" type="text" id="checkCode">
                    <img id="checkCodeImg" src="/login-demo/checkCodeServlet">
                    <a href="#" id="changeImg">看不清？</a>
                </td>
            </tr>

        </table>

        <div class="buttons">
            <input value="注 册" type="submit" id="reg_btn">
        </div>
        <br class="clear">
    </form>

</div>
</body>
<script>
    document.getElementById("changeImg").onclick = function () {
        let milliseconds = new Date().getMilliseconds();
        document.getElementById("checkCodeImg").src = "/login-demo/checkCodeServlet?" + milliseconds
    }

    document.getElementById("checkCodeImg").onclick = function () {
        let milliseconds = new Date().getMilliseconds();
        document.getElementById("checkCodeImg").src = "/login-demo/checkCodeServlet?" + milliseconds
    }
</script>
</html>