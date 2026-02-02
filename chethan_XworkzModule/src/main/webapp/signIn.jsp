<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>Sign In | X-Workz</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            min-height: 100vh;
            display: flex;
            flex-direction: column;
        }
        main {
            flex: 1;
            padding-top: 90px; /* for fixed navbar */
        }
        .logo-img {
            height: 45px;
        }
    </style>
</head>

<body class="bg-light">

<!-- NAVBAR (SAME AS INDEX & SIGNUP) -->
<nav class="navbar navbar-expand-lg navbar-dark bg-primary shadow fixed-top px-4">
    <a class="navbar-brand d-flex align-items-center" href="<c:url value='/'/>">
        <img src="https://x-workz.com/Logo.png" class="logo-img me-2" alt="X-Workz">
        Chethan_Xworkz
    </a>

    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
            data-bs-target="#navbarNav">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarNav">


        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
                <a class="nav-link fw-semibold" href="Home">Home</a>
            </li>

        </ul>

        <!-- RIGHT BUTTONS -->
        <div class="d-flex gap-2">
            <a href="signIn"
               class="btn btn-light text-primary px-3 fw-semibold">
                Sign In
            </a>
            <a href="signUp"
               class="btn btn-outline-light px-3 fw-semibold">
                Sign Up
            </a>
        </div>
    </div>
</nav>

<!-- MAIN CONTENT -->
<main class="d-flex align-items-center justify-content-center">
    <div class="card shadow p-4" style="width:100%; max-width:420px;">
        <div class="text-center mb-4">
            <h4 class="fw-bold text-primary">Sign In</h4>
        </div>

        <form action="login" method="post">
            <div>

                <c:if test="${not empty errorMsg}">
                    <p class="text-center fw-bold text-danger mt-4">
                        ${error}
                    </p>
                </c:if>
            </div>

            <input type="email"
                   name="email"
                   class="form-control"
                   placeholder="Enter your email"
                   value="${email}"
                   required>
            <br>
            <div class="mb-3">
                <input type="password" name="password"
                       class="form-control"
                       placeholder="Enter your password" required>
            </div>

            <p class="text-center mb-0">
                Don’t have an account?
                <a href="<c:url value='/signUp'/>">Sign Up</a>
            </p>

            <!--            <c:if test="${not empty msg}">-->
            <!--                <div class="alert alert-success mt-3">${msg}</div>-->
            <!--            </c:if>-->

            <!--            <c:if test="${not empty error}">-->
            <!--                <div class="alert alert-danger mt-3">${error}</div>-->
            <!--            </c:if>-->



            <div class="col-12 p-3">

                <!-- SIGN IN BUTTON -->
                <div class="d-grid mb-4">
                    <button type="submit"
                            class="btn btn-primary fs-5 fw-semibold text-uppercase"
                            id="signInBtn"
                    <c:if test="${disableLogin}">disabled</c:if>>
                    Sign In
                    </button>
                </div>

                <!-- FORGOT PASSWORD BUTTON -->
                <div class="d-grid">
                    <a href="SignInWithOTP"
                       class="btn btn-primary fs-6 fw-semibold text-uppercase"
                    <c:if test="${!showForgot}">hidden</c:if>>
                    Forgot Password?
                    </a>
                </div>

            </div>


        </form>
    </div>
</main>


<footer class="bg-primary text-white text-center py-3 mt-auto">
    <p class="mb-0 fw-semibold">© 2026 X-Workz Training Institute</p>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
