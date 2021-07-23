<%--
  Created by IntelliJ IDEA.
  User: peter
  Date: 22.07.2021
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer management</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/style.css">
</head>
<body>

    <div id="main">
        <div id="header">
            <h1>Customer management service</h1>
        </div>
        <div id="content">
            <h4>First 15 customers:</h4>
            <table>
                <tr>
                    <th>ID</th>
                    <th>First name</th>
                    <th>Second name</th>
                    <th>Email</th>
                    <th>Gender</th>
                    <th>IP Address</th>
                </tr>

                <core:forEach var="customer" items="${customers}">
                    <tr>
                        <td>${customer.id}.</td>
                        <td>${customer.firstName}</td>
                        <td>${customer.lastName}</td>
                        <td>${customer.email}</td>
                        <td>${customer.gender}</td>
                        <td>${customer.ipAddress}</td>
                    </tr>
                </core:forEach>

            </table>
        </div>
    </div>

</body>
</html>
