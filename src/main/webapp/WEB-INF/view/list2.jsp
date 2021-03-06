<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="cp" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>List</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://unpkg.com/bootstrap-material-design@4.1.1/dist/css/bootstrap-material-design.min.css" integrity="sha384-wXznGJNEXNG1NFsbm0ugrLFMQPWswR3lds2VeinahP8N0zJw9VWSopbjv2x7WCvX" crossorigin="anonymous">
    <link rel="stylesheet" href="${cp}/resources/css/style.css" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Oldenburg&display=swap" rel="stylesheet">
    <base href="${cp}/"/>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="hero-image">
    <div class="hero-text">
        <div class="card" style="width: 36rem;">
            <div class="card-body">
                <button class="add-button btn btn-primary"
                        onclick="window.location.href='${cp}/sandwich/showAddSandwichForm'; return false;">
                    Add Sandwich
                </button>

                <form:form action="sandwich/search" method="get">
                    <div class="form-group">
                        <input type="search" name="searchTerm"/>
                        <input type="submit" value="Search" class="add-button"/>
                    </div>
                </form:form>

                <table class="table">
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Year</th>
                            <th>Family</th>
                            <!-- edit -->
                            <!-- delete -->
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="s" items="${sandwiches}">

                        <c:url var="updateLink" value="/sandwich/showUpdateSandwichForm">
                            <c:param name="sandwichId" value="${s.id}"/>
                        </c:url>

                        <c:url var="deleteLink" value="/sandwich/delete">
                            <c:param name="sandwichId" value="${s.id}"/>
                        </c:url>

                        <tr>
                            <td>${s.name}</td>
                            <td>${s.inventionYear}</td>
                            <td>${s.family}</td>
                            <td><a href="${updateLink}"><i class="fas fa-save"></i></a></td>
                            <td><a href="${deleteLink}" onclick="if (!confirm('Are you sure?')) return false"><i class="fas fa-trash"></i></a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <jsp:include page="footer.jsp"></jsp:include>
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
