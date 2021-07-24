<%--
  Created by IntelliJ IDEA.
  User: peter
  Date: 23.07.2021
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>Create new customer</title>
        <link rel="stylesheet" type="text/css"
              href="${pageContext.request.contextPath}/assets/css/style.css">
        <link rel="stylesheet" type="text/css"
              href="${pageContext.request.contextPath}/assets/css/menuBarStyle.css">
    </head>
    <body>

    <div class="main">

        <div class="header">
            <h1>Add customer</h1>
        </div>

        <div class="menuBar">

            <div class="menuBarButtonContainer">
                <input class="menuBarButton" type="button" value="Create new customer"
                       onclick="window.location = 'addCustomer'"/>
            </div>

            <div class="menuBarButtonContainer">
                <input class="menuBarButton" type="button" value="Delete customer"
                       onclick="window.location = 'deleteCustomer'"/>
            </div>

            <div class="menuBarButtonContainer">
                <input class="menuBarButton" type="button" value="Update customer"
                       onclick="window.location = 'updateCustomer'"/>
            </div>

            <div class="menuBarButtonContainer">
                <input class="menuBarButton" type="button" value="Main menu"
                       onclick="window.location = 'list'"/>
            </div>

        </div>

        <div class="content">

            <table>
                <tbody>
                    <spring:form action="addCustomer" method="POST" name="addCustomerForm" modelAttribute="newCustomer">
                        <tr>
                            <td>First name:</td>
                            <td><spring:input path="firstName" /></td>
                        </tr>

                        <tr>
                            <td>Last name:</td>
                            <td><spring:input path="lastName" /></td>
                        </tr>

                        <tr>
                            <td>Email:</td>
                            <td><spring:input path="email" /></td>
                        </tr>

                        <tr>
                            <td>Gender:</td>
                            <td><spring:input path="gender" /></td>
                        </tr>

                        <tr>
                            <td>IP Address:</td>
                            <td><spring:input path="ipAddress" /></td>
                        </tr>

                        <tr>
                            <td><input type="submit" value="Submit!" /></td>
                        </tr>
                    </spring:form>
                </tbody>
            </table>

        </div>
    </div>

    </body>
</html>
