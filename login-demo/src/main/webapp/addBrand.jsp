<%--
  Created by IntelliJ IDEA.
  User: yy
  Date: 2022/6/1
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>添加品牌</title>
</head>
<body>
<h3>添加品牌</h3>
<form action="/login-demo/addServlet" method="post">
    <label>
        品牌名称:
        <input type="text" name="brandName">
    </label><br>
    <label>
        企业名称:
        <input type="text" name="companyName">
    </label><br>
    <label>
        排序:
        <input type="text" name="ordered">
    </label><br>
    <label>
        描述信息:
        <textarea rows="5" cols="20" name="description"></textarea>
    </label><br>
    <label>
        状态:
        <input type="radio" name="status" value="0">禁用
        <input type="radio" name="status" value="1">启用
    </label><br>
    <input type="submit" value="提交">
</form>

</body>
</html>
