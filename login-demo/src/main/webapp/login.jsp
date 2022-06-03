
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>


<html>

<head>
    <title>login</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        html {
            height: 100%;
            width: 100%;
            overflow: hidden;
            margin: 0;
            padding: 0;
            background: url(./imgs/Desert1.jpg) no-repeat 0 0;
            background-size: 100% 100%;
            -moz-background-size: 100% 100%;
        }

        body {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100%;
        }

        #loginDiv {
            width: 37%;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 380px;
            background-color: rgba(75, 81, 95, 0.3);
            box-shadow: 7px 7px 17px rgba(52, 56, 66, 0.5);
            border-radius: 5px;
        }

        #name_trip {
            margin-left: 50px;
            color: red;
        }

        p {
            margin-top: 30px;
            margin-left: 20px;
            color: azure;
        }


        #remember {
            margin-left: 15px;
            border-radius: 5px;
            border-style: hidden;
            background-color: rgba(216, 191, 216, 0.5);
            outline: none;
            padding-left: 10px;
            height: 20px;
            width: 20px;
        }

        #username {
            width: 200px;
            margin-left: 15px;
            border-radius: 5px;
            border-style: hidden;
            height: 30px;
            background-color: rgba(216, 191, 216, 0.5);
            outline: none;
            color: #f0edf3;
            padding-left: 10px;
        }

        #password {
            width: 202px;
            margin-left: 15px;
            border-radius: 5px;
            border-style: hidden;
            height: 30px;
            background-color: rgba(216, 191, 216, 0.5);
            outline: none;
            color: #f0edf3;
            padding-left: 10px;
        }

        .button {
            border-color: cornsilk;
            background-color: rgba(100, 149, 237, .7);
            color: aliceblue;
            border-style: hidden;
            border-radius: 5px;
            width: 100px;
            height: 31px;
            font-size: 16px;
        }

        #subDiv {
            text-align: center;
            margin-top: 30px;
        }

        #loginMsg {
            text-align: center;
            color: aliceblue;
        }

        #errorMsg {
            text-align: center;
            color: red;
        }
    </style>
</head>

<body>

<div id="loginDiv" style="height: 350px">
    <form action="/login-demo/loginServlet" id="form">
        <h1 id="loginMsg">LOGIN IN</h1>
        <div id="errorMsg">${login_msg} ${register_msg}</div>
        <p><label for="username">Username:</label><input id="username" name="username" value="${cookie.username.value}" type="text"></p>
        <p><label for="password">Password:</label><input id="password" name="password" value="${cookie.password.value}" type="password"></p>
        <p><label for="remember">Remember:</label><input id="remember" name="remember" type="checkbox" value="1"></p>
        <div id="subDiv">
            <input type="submit" class="button" value="login up">
            <input type="reset" class="button" value="reset">&nbsp;&nbsp;&nbsp;
            <a href="register.jsp">没有账号？</a>
        </div>
    </form>
</div>

</body>
</html>