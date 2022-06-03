<%--
  Created by IntelliJ IDEA.
  User: yy
  Date: 2022/6/1
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>修改品牌</title>
</head>
<body>
<h3>修改品牌</h3>
<form action="/login-demo/updateServlet" method="post">
    <input type="hidden" name="id" value="${brand.id}">
    <label>
        品牌名称:
        <input type="text" name="brandName" value="${brand.brandName}">
    </label><br>
    <label>
        企业名称:
        <input type="text" name="companyName" value="${brand.companyName}">
    </label><br>
    <label>
        排序:
        <input type="text" name="ordered" value="${brand.ordered}">
    </label><br>
    <label>
        描述信息:
        <textarea rows="5" cols="20" name="description">${brand.description}</textarea>
    </label><br>
    <label>
        状态:
        <c:if test="${brand.status==0}">
            <input type="radio" name="status" value="0" checked>禁用
            <input type="radio" name="status" value="1">启用
        </c:if>
        <c:if test="${brand.status==1}">
            <input type="radio" name="status" value="0">禁用
            <input type="radio" name="status" value="1" checked>启用
        </c:if>
    </label><br>
    <input type="submit" value="提交">
</form>

</body>
</html>
