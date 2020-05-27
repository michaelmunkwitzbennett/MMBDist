<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: scawd
  Date: 1/21/2020
  Time: 6:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Login</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://unpkg.com/bootstrap-material-design@4.1.1/dist/css/bootstrap-material-design.min.css" integrity="sha384-wXznGJNEXNG1NFsbm0ugrLFMQPWswR3lds2VeinahP8N0zJw9VWSopbjv2x7WCvX" crossorigin="anonymous">
    <link rel="stylesheet" href="${cp}/resources/css/style.css" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Oldenburg&display=swap" rel="stylesheet">

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="hero-image">
    <div class="hero-text">
        <div class="card" style="width: 18rem;">
            <div class="card-body">
                <div class="card-title">Account Login</div>
                <form:form action="${cp}/authenticate" method="POST">
                    <table>
                        <!-- Only show this message if the user has been logged out -->
                        <c:if test="${param.logout != null}">
                            <tr>
                                <td></td>
                                <td>You have been logged out</td>
                            </tr>
                        </c:if>
                        <tr>
                            <td><label>Username</label></td>
                            <!-- Spring expects this to have name="username" -->
                            <td><input type="text" name="username"></td>
                        </tr>
                        <tr>
                            <td><label>Password</label></td>
                            <!-- Spring expects this to have name="password" -->
                            <td><input type="password" name="password"></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><input type="submit" value="Login"></td>
                        </tr>
                        <!-- Only show this row if there was a login error -->
                        <c:if test="${param.error != null}">
                            <tr>
                                <td></td>
                                <td class="error">Invalid login</td>
                            </tr>
                        </c:if>
                    </table>
                </form:form>

            </div>
        </div>
    </div>
    <jsp:include page="footer.jsp"></jsp:include>s
</div>


<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://unpkg.com/popper.js@1.12.6/dist/umd/popper.js" integrity="sha384-fA23ZRQ3G/J53mElWqVJEGJzU0sTs+SvzG8fXVWP+kJQ1lwFAOkcUOysnlKJC33U" crossorigin="anonymous"></script>
<script src="https://unpkg.com/bootstrap-material-design@4.1.1/dist/js/bootstrap-material-design.js" integrity="sha384-CauSuKpEqAFajSpkdjv3z9t8E7RlpJ1UP0lKM/+NdtSarroVKu069AlsRPKkFBz9" crossorigin="anonymous"></script>
<script>$(document).ready(function() { $('body').bootstrapMaterialDesign(); });</script>
<script src="https://kit.fontawesome.com/63dbec8ec8.js" crossorigin="anonymous"></script>
</body>
</html>
