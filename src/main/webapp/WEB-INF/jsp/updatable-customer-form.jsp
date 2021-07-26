<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Date: 25.07.2021
  Time: 15:54
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/assets/css/style.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/assets/css/menuBarStyle.css">
</head>
<body>
   <div class="main">

     <div class="header">
       <h2>Updating customer of ID: ${customerToUpdate.id}</h2>
     </div>

     <div class="menuBar">

       <div class="menuBarButtonContainer">
         <input class="menuBarButton" type="button" value="Main menu"
                onclick="window.location = '${pageContext.request.contextPath}/customer/list'"/>
       </div>

     </div>
     <div class="content">
         <table class="standardGreenTable">
             <tbody>
             <spring:form action="modifyCustomer" method="POST" name="addCustomerForm"
                          modelAttribute="customerToUpdate">

                 <tr>
                     <td><spring:hidden path="id"/></td>
                 </tr>

                 <tr>
                     <td>First name:</td>
                     <td><spring:input path="firstName"/></td>
                     <td><spring:errors path="firstName" cssClass="errorMessage"/></td>
                 </tr>

                 <tr>
                     <td>Last name:</td>
                     <td><spring:input path="lastName" /></td>
                     <td><spring:errors path="lastName" cssClass="errorMessage"/></td>
                 </tr>

                 <tr>
                     <td>Email:</td>
                     <td><spring:input path="email" /></td>
                 </tr>

                 <tr>
                     <td>Gender:</td>
                     <td>
                         <spring:select path="gender">
                             <spring:option value="Non-binary"/>
                             <spring:option value="Male"/>
                             <spring:option value="Female"/>
                         </spring:select>
                     </td>
                 </tr>

                 <tr>
                     <td>IP Address:</td>
                     <td><spring:input path="ipAddress" /></td>
                 </tr>

                 <tr>
                     <td><input type="submit" value="Confirm" /></td>
                 </tr>
             </spring:form>
             </tbody>
         </table>
     </div>

   </div>
</body>
</html>
