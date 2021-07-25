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

    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/assets/css/style.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/assets/css/menuBarStyle.css">

</head>
<body>

    <div class="main">

        <div class="header">
            <h1>Customer management service</h1>
        </div>

        <div class="menuBar" style="clear: left">

            <div class="menuBarButtonContainer">
                <input class="menuBarButton" type="button" value="Create new customer"
                       onclick="window.location = 'showAddCustomerForm'"/>
            </div>

            <div class="menuBarButtonContainer">
                <input class="menuBarButton" type="button" value="Delete customer"
                       onclick="window.location = 'showDeleteCustomerForm'"/>
            </div>

            <div class="menuBarButtonContainer">
                <input class="menuBarButton" type="button" value="Update customer"
                       onclick="window.location = 'update/showUpdatableCustomerList'"/>
            </div>

            <div class="menuBarButtonContainer">
                <input class="menuBarButton" type="button" value="Main menu"
                       onclick="window.location = 'list'"/>
            </div>

        </div>

        <div class="content">
            <h4>First 15 customers:</h4>
            <table class="standardGreenTable">

                <thead>
                    <tr>
                        <th>ID</th>
                        <th>First name</th>
                        <th>Second name</th>
                        <th>Email</th>
                        <th>Gender</th>
                        <th>IP Address</th>
                    </tr>
                </thead>

                <tbody>
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
                </tbody>

            </table>
        </div>
    </div>

</body>
</html>
