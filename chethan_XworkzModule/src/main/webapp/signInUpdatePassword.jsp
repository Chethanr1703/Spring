<!doctype html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Reset Password</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            min-height: 100vh;
            display: flex;
            flex-direction: column;
        }
        main {
            flex: 1;
            padding-top: 90px;
        }
        .logo-img {
            height: 45px;
        }
    </style>
</head>

<body>

<!-- ================= NAVBAR ================= -->
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
                <a class="nav-link fw-semibold" href="">Home</a>
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

<!-- ================= FORM CARD ================= -->
<div class="container-fluid vh-100 d-flex justify-content-center align-items-center">
    <div class="card shadow p-3 bg-body-tertiary"
         style="max-width: 450px; width: 100%;">

        <div class="card-body">
            <h5 class="card-title text-center fs-2 fw-bold text-uppercase">
                Reset Password
            </h5>
            <br>

            <form action="resetPassword" method="post">

                <!-- SUCCESS / ERROR MESSAGE -->
                <c:if test="${not empty msg}">
                    <p class="text-center fw-bold text-success">${msg}</p>
                </c:if>

                <c:if test="${not empty errorMsg}">
                    <p class="text-center fw-bold text-danger">${errorMsg}</p>
                </c:if>

                <!-- EMAIL (PREPOPULATED & READONLY) -->
                <div class="mb-3">
                    <label class="form-label fw-semibold">
                        Email <span class="text-danger">*</span>
                    </label>

                    <input type="email"
                           class="form-control"
                           name="email"
                           value="${email}"
                           readonly>
                </div>

                <!-- NEW PASSWORD -->
                <div class="mb-3">
                    <label class="form-label fw-semibold">
                        New Password <span class="text-danger">*</span>
                    </label>

                    <input type="password"
                           class="form-control"
                           name="newPassword"
                           placeholder="Enter new password">
                </div>

                <!-- CONFIRM PASSWORD -->
                <div class="mb-3">
                    <label class="form-label fw-semibold">
                        Confirm Password <span class="text-danger">*</span>
                    </label>

                    <input type="password"
                           class="form-control"
                           name="confirmPassword"
                           placeholder="Re-enter new password">
                </div>

                <!-- SUBMIT -->
                <div class="d-grid mt-4">
                    <button type="submit"
                            class="btn btn-primary fs-5 fw-semibold text-uppercase">
                        Update Password
                    </button>
                    <p class="text-center mt-3 fw-bold text-danger">
                        ${misMatchPassword}
                    </p>
                </div>

            </form>

        </div>
    </div>
</div>
<footer class="bg-primary text-white text-center py-3 mt-auto">
    <p class="mb-0 fw-semibold">© 2026 X-Workz Training Institute</p>
</footer>

</body>
</html>
