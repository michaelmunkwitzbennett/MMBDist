<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="cp" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Update/Add Sandwich</title>
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
                <div class="card-title">Enter Sandwich Info:</div>
                <form:form action="${cp}/sandwich/save" modelAttribute="aSandwich" method="post">

                    <!-- hidden sandwich object props -->
                    <form:hidden path="id" value="${aSandwich.id}"/>

                    <div class="form-group">
                        <label for="sandwichName">Name</label>
                        <form:input path="name" type="text" class="form-control" id="sandwichName"/>
                        <form:errors path="name" cssClass="error"/>
                        <small id="familyHelp" class="form-text text-muted">Enter a name for your sandwich</small>
                    </div>
                    <div class="form-group">
                        <label for="sandwichYear">Year</label>
                        <form:input path="inventionYear" type="number" class="form-control" id="sandwichYear"/>
                        <form:errors path="inventionYear" cssClass="error"/>
                        <small id="familyHelp" class="form-text text-muted">Enter the year the sandwich was created</small>
                    </div>
                    <div class="form-group">
                        <label for="sandwichFamily">Family</label>
                        <form:select path="family" type="text" class="form-control" id="sandwichFamily">
                            <form:option value="Melt">Melt</form:option>
                            <form:option value="Melt">Submarine</form:option>
                            <form:option value="Melt">Toastie</form:option>
                            <form:option value="Melt">Classic</form:option>
                        </form:select>
                    </div>
                    <button type="submit" class="btn btn-dark">Save</button>
                </form:form>
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
