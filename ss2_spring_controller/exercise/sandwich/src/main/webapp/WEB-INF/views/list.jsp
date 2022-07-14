<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KILL YOU
  Date: 7/13/2022
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>Title</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div>
    <div class="container">
        <form action="/save" method="post">
            <div style="display: flex">
                <div class="form-check form-check-inline">
                    <input class="form-check-input" name="condiment" type="checkbox" id="inlineCheckbox1" value="Salt">
                    <label class="form-check-label" for="inlineCheckbox1">Salt</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" name="condiment" type="checkbox" id="inlineCheckbox2"
                           value="Pepper">
                    <label class="form-check-label" for="inlineCheckbox2">Pepper</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" name="condiment" type="checkbox" id="inlineCheckbox3"
                           value="Mustard">
                    <label class="form-check-label" for="inlineCheckbox3">Mustard</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" name="condiment" type="checkbox" id="inlineCheckbox4"
                           value="Sugars">
                    <label class="form-check-label" for="inlineCheckbox4">Sugars</label>
                </div>
            </div>
            <hr>
            <button type="submit" class="btn btn-outline-success">save</button>
        </form>
        <p class="alert alert-info">condiment: ${result}</p>
    </div>

</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
