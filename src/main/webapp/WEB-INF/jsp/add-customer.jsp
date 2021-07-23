<%--
  Created by IntelliJ IDEA.
  User: peter
  Date: 23.07.2021
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Create new customer</title>
        <link rel="stylesheet" type="text/css"
              href="${pageContext.request.contextPath}/assets/css/style.css">
        <link rel="stylesheet" type="text/css"
              href="${pageContext.request.contextPath}/assets/css/menuBarStyle.css">
    </head>
    <body>

    <div style="    background-color: gray;
    padding: 15px;">
        <div class="header">

            <h1>Add customer</h1>

        </div>

        <div class="menuBarButton">

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

        <div style="clear: left">
            lorem zgipsum
        </div>
    </div>

    </body>
</html>
