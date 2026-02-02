<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Team | X-Workz</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            min-height: 100vh;
            display: flex;
            flex-direction: column;
        }
        main {
            flex: 1;
        }
        .logo-img {
            height: 45px;
        }
    </style>
</head>

<body class="bg-light">

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-primary shadow fixed-top px-4">
    <a class="navbar-brand d-flex align-items-center" href="<c:url value='/'/>">
        <img src="https://x-workz.com/Logo.png" class="logo-img me-2" alt="X-Workz">
        Chethan_Xworkz
    </a>
</nav>

<!-- MAIN -->
<main class="d-flex align-items-center justify-content-center"
      style="padding-top: 90px;">

    <div class="container">
        <div class="row justify-content-center">
            <div class="col-lg-5">

                <div class="card shadow-lg p-4">

                    <h4 class="fw-bold text-primary text-center mb-4">
                        Add Team
                    </h4>

                    <!-- MESSAGE -->
                    <c:if test="${not empty msg}">
                        <div class="alert alert-success text-center fw-semibold">
                            ${msg}
                        </div>
                    </c:if>

                    <c:if test="${not empty error}">
                        <div class="alert alert-danger text-center fw-semibold">
                            ${error}
                        </div>
                    </c:if>

                    <!-- FORM -->
                    <form action="addTeam" method="post">

                        <!-- TEAM NAME -->
                        <div class="row align-items-center mb-3">
                            <div class="col-4 fw-semibold text-end">
                                Team Name :
                            </div>
                            <div class="col-8">
                                <input type="text" name="teamName"
                                       class="form-control"
                                       value="${dto.teamName}">
                                <div class="text-danger small">${teamNameError}</div>
                            </div>
                        </div>

                        <!-- TEAM HEAD -->
                        <div class="row align-items-center mb-3">
                            <div class="col-4 fw-semibold text-end">
                                Team Head :
                            </div>
                            <div class="col-8">
                                <input type="text" name="teamHeadName"
                                       class="form-control"
                                       value="${dto.teamHeadName}">
                                <div class="text-danger small">${teamHeadNameError}</div>
                            </div>
                        </div>

                        <!-- PHONE -->
                        <div class="row align-items-center mb-3">
                            <div class="col-4 fw-semibold text-end">
                                Phone :
                            </div>
                            <div class="col-8">
                                <input type="tel" name="phone"
                                       class="form-control"
                                       value="${dto.phone}">
                                <div class="text-danger small">${phoneError}</div>
                            </div>
                        </div>

                        <!-- EMAIL -->
                        <div class="row align-items-center mb-3">
                            <div class="col-4 fw-semibold text-end">
                                Email :
                            </div>
                            <div class="col-8">
                                <input type="email" name="email"
                                       class="form-control"
                                       value="${dto.email}">
                                <div class="text-danger small">${emailError}</div>
                            </div>
                        </div>

                        <!-- NO OF MEMBERS -->
                        <div class="row align-items-center mb-4">
                            <div class="col-4 fw-semibold text-end">
                                Members :
                            </div>
                            <div class="col-8">
                                <input type="number" name="noOfTeamMember"
                                       class="form-control"
                                       value="${dto.noOfTeamMember}">
                                <div class="text-danger small">${noOfTeamMemberError}</div>
                            </div>
                        </div>

                        <!-- BUTTON -->
                        <div class="text-center">
                            <button type="submit"
                                    class="btn btn-primary fw-semibold rounded-pill px-5">
                                Add Team
                            </button>
                        </div>

                    </form>

                </div>
            </div>
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
