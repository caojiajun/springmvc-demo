<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<head>
  <title>Spring MVC Hello World</title>
</head>

<body>
<h2>用户列表</h2>

<table border="1">
  <tr>
    <th>User Id</th>
    <th>User Name</th>
  </tr>
  <c:forEach items="${users}" var="user">
    <tr>
      <td>${user.id}</td>
      <td>${user.name}</td>
    </tr>
  </c:forEach>
</table>
<a href="json/list">json显示</a><br>
<a href="input">添加新用户</a><br>
<a href="../index.html">返回首页</a>

</body>
</html>