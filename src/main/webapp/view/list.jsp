<%--
  Created by IntelliJ IDEA.
  User: scawd
  Date: 1/21/2020
  Time: 6:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://unpkg.com/bootstrap-material-design@4.1.1/dist/css/bootstrap-material-design.min.css" integrity="sha384-wXznGJNEXNG1NFsbm0ugrLFMQPWswR3lds2VeinahP8N0zJw9VWSopbjv2x7WCvX" crossorigin="anonymous">
    <link rel="stylesheet" href="../resources/css/style.css">
    <link href="https://fonts.googleapis.com/css?family=Oldenburg&display=swap" rel="stylesheet">

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="hero-image">
    <div class="hero-text">
        <div class="card" style="width: 100%;">
            <div class="card-body">
                <div class="card-title">Our Menu</div>
                <ul class="list-group container">
                    <li class="list-group-item row"><p class="col-8">Sandwich 1</p><i class="edit fa fa-pencil col"></i><i class="delete fa fa-trash col"></i></li>
                    <hr>
                    <li class="list-group-item row"><p class="col-8">Sandwich 2</p><i class="edit fa fa-pencil col"></i><i class="delete fa fa-trash col"></i></li>
                    <hr>
                    <li class="list-group-item row"><p class="col-8">Sandwich 3</p><i class="edit fa fa-pencil col"></i><i class="delete fa fa-trash col"></i></li>
                    <hr>
                    <li class="list-group-item row"><p class="col-8">Sandwich 4</p><i class="edit fa fa-pencil col"></i><i class="delete fa fa-trash col"></i></li>
                </ul>
                <button onclick="window.location.href = 'detail.jsp';" class="btn btn-lg btn-outline-dark active"><i class="fa fa-list"></i> Add Item</button>
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
