<%--
  Created by IntelliJ IDEA.
  User: Array
  Date: 2020/5/16
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
</head>
<body>

    <h3>查询所有账户信息</h3>

    <c:forEach items="${list}" var="account">
        ${account.name}
        <br/>
    </c:forEach>

</body>
</html>
