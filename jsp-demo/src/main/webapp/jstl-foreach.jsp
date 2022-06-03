<%--
  Created by IntelliJ IDEA.
  User: yy
  Date: 2022/6/1
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1" cellspacing="0" width="800">
    <tr>
        <th>序号</th>
        <th>品牌名称</th>
        <th>企业名称</th>
        <th>排序</th>
        <th>品牌介绍</th>
        <th>状态</th>
        <th>操作</th>

    </tr>

    <c:forEach items="${brands}" var="brand" varStatus="ststus">
        <tr align="center">
           <%-- <td>${brand.id}</td>--%>
            <td>${ststus.count}</td>
            <td>${brand.brandName}</td>
            <td>${brand.companyName}</td>
            <td>${brand.ordered}</td>
            <td>${brand.description}</td>
            <c:if test="${brand.status==0}">
                <td>禁用</td>
            </c:if>
            <c:if test="${brand.status==1}">
                <td>启用</td>
            </c:if>
        </tr>
    </c:forEach>

</table>

</body>
</html>
