<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>


<%--<!DOCTYPE html>--%>
<%--<html lang="en">--%>
<%--<head>--%>
<%--<meta charset="utf-8">--%>
<%--<meta http-equiv="X-UA-Compatible" content="IE=edge">--%>
<%--<meta name="viewport" content="width=device-width, initial-scale=1">--%>
<%--<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->--%>
<%--<meta name="description" content="">--%>
<%--<meta name="author" content="">--%>
<%--<link rel="icon" href="../../favicon.ico">--%>

<%--<title>Enter to system</title>--%>

<%--<!-- Bootstrap core CSS -->--%>
<%--<link href="angular/libs/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">--%>

<%--<!-- Custom styles for this template -->--%>
<%--<link href="css/main.css" rel="stylesheet">--%>

<%--<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->--%>
<%--<!--[if lt IE 9]>--%>
<%--<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>--%>
<%--<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>--%>
<%--<![endif]-->--%>

<%--<style>--%>


<%--.absolute-center {--%>
<%--margin: auto;--%>
<%--position: absolute;--%>
<%--top: 0;--%>
<%--left: 0;--%>
<%--bottom: 0;--%>
<%--right: 0;--%>
<%--}--%>

<%--.absolute-center.is-responsive {--%>
<%--width: 50%;--%>
<%--height: 50%;--%>
<%--min-width: 200px;--%>
<%--max-width: 400px;--%>
<%--padding: 40px;--%>
<%--}--%>

<%--</style>--%>
<%--</head>--%>

<%--<body>--%>

<%--<div class="container">--%>
<%--<div class="row">--%>
<%--<div class="absolute-center is-responsive">--%>
<%--<div class="col-sm-12 col-md-10 col-md-offset-1">--%>
<%--<form action="login" id="loginForm" method="post">--%>

<%--<h4 style="text-align: center">Enter</h4>--%>

<%--<div class="form-group input-group">--%>
<%--<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>--%>
<%--<input class="form-control" type="text" name='login' placeholder="login" autofocus/>--%>
<%--</div>--%>
<%--<div class="form-group input-group">--%>
<%--<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>--%>
<%--<input class="form-control" type="password" name='password' placeholder="password"/>--%>
<%--</div>--%>
<%--<div class="form-group">--%>
<%--<button type="submit" class="btn btn-def btn-block">Sign in</button>--%>
<%--</div>--%>
<%--</form>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>

<%--</body>--%>
<%--</html>--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login page</title>
    <link href="<c:url value='/css/bootstrap.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/css/app.css'/>" rel="stylesheet"/>
    <link rel="stylesheet" type="text/css"
          href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css"/>
</head>

<body>
<div id="mainWrapper">
    <div class="login-container">
        <div class="login-card">
            <div class="login-form">
                <c:url var="loginUrl" value="/login"/>
                <form action="${loginUrl}" method="post" class="form-horizontal">
                    <c:if test="${param.error != null}">
                        <div class="alert alert-danger">
                            <p>Invalid username and password.</p>
                        </div>
                    </c:if>
                    <c:if test="${param.logout != null}">
                        <div class="alert alert-success">
                            <p>You have been logged out successfully.</p>
                        </div>
                    </c:if>
                    <div class="input-group input-sm">
                        <label class="input-group-addon" for="username"><i class="fa fa-user"></i></label>
                        <input type="text" class="form-control" id="username" name="login" placeholder="Enter Username"
                               required>
                    </div>
                    <div class="input-group input-sm">
                        <label class="input-group-addon" for="password"><i class="fa fa-lock"></i></label>
                        <input type="password" class="form-control" id="password" name="password"
                               placeholder="Enter Password" required>
                    </div>
                    <div class="form-actions">
                        <input type="submit"
                               class="btn btn-block btn-primary btn-default" value="Log in">
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

</body>
</html>