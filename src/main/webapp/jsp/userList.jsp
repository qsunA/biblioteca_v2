<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017-07-22
  Time: 오후 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>이용자 목록 화면</title>
</head>
<body>
<div align="center">
    <h2>이용자 목록 화면</h2>
    <table border="1">
        <tr class="header">
            <th align="center" width="80">아이디</th>
            <th align="center" width="80">이름</th>
            <th align="center"> 성별</th>
        </tr>
        <c:forEach items="${userList}" var="user">
            <tr class="record">
                <td align="center">${user.id}</td>
                <td align="center">${user.name}</td>
                <td align="center">${user.sex}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
