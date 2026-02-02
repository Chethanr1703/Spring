
<!DOCTYPE html>0
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>X-Workz | Home</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            min-height: 100vh;
            display: flex;
            flex-direction: column;


            background:
                    linear-gradient(rgba(0,0,0,0.55), rgba(0,0,0,0.55)),
                    url("https://images.unsplash.com/photo-1522071820081-009f0129c71c");
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            background-attachment: fixed;
        }

        main {
            flex: 1;
            color: white;
        }

        .logo-img {
            height: 45px;
            width: auto;
        }
    </style>
</head>

<body>

<!-- NAVBAR -->
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

        <!-- LEFT MENU -->
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
                <a class="nav-link active fw-semibold" href="">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link fw-semibold" href="#">Courses</a>
            </li>
        </ul>

        <!-- RIGHT BUTTONS -->
        <div class="d-flex gap-2">
            <a href="signIn"
               class="btn btn-outline-light rounded-pill px-3">
                Sign In
            </a>

            <a href="signUp"
               class="btn btn-light text-primary rounded-pill px-3 fw-semibold">
                Sign Up
            </a>
        </div>
    </div>
</nav>

<!-- MAIN CONTENT -->
<main class="d-flex align-items-center justify-content-center text-center"
      style="padding-top: 90px;">

    <div>
        <h1 class="fw-bold display-4">
            Welcome to X-Workz
        </h1>

        <p class="lead mt-3">
            Learn • Build • Grow with Industry Experts
        </p>

        <div class="mt-4">
            <a href="signUp" class="btn btn-primary btn-lg rounded-pill px-5 me-3">
                Get Started
            </a>
            <a href="signIn" class="btn btn-outline-light btn-lg rounded-pill px-5">
                Login
            </a>
        </div>
    </div>

</main>

<!-- FOOTER -->
<footer class="bg-primary text-white text-center py-3 mt-auto">
    <p class="mb-0 fw-semibold">© 2026 X-Workz Training Institute</p>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
