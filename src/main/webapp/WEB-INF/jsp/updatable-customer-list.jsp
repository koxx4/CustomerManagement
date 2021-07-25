<%--
  Date: 25.07.2021
  Time: 15:09
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>



<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/style.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/menuBarStyle.css">
</head>
<body>

    <div class="main">
        <div class="header"> Edit customers information </div>
        <div class="menuBar">

            <div class="menuBarButtonContainer">
                <input class="menuBarButton" type="button" value="Main menu"
                       onclick="window.location = '/list'"/>
            </div>

        </div>

        <div class="content">

            <table class="standardGreenTable">
                <thead>
                    <tr>
                        <th>First name</th>
                        <th>Last name</th>
                        <th> Email </th>
                        <th> Gender </th>
                        <th> IP Address </th>
                        <th> Action </th>
                    </tr>
                </thead>
                <tbody>
                    <core:forEach var="customer" items="${customers}">
                        <tr>
                            <td> ${customer.firstName} </td>
                            <td> ${customer.lastName} </td>
                            <td> ${customer.email} </td>
                            <td> ${customer.gender} </td>
                            <td> ${customer.ipAddress} </td>
                            <td>
                                <form method="post" action="showCustomerToUpdate" >
                                    <input name="customerId" type="hidden" value="${customer.id}"/>
                                    <input type="submit" value="Edit"/>
                                </form>
                            </td>
                        </tr>
                    </core:forEach>
                </tbody>

            </table>

        </div>

    </div>

</body>
</html>
