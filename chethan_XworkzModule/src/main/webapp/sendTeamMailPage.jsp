<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
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
        }
        main {
            flex: 1;
        }
        .logo-img {
            height: 45px;
            width: auto;
        }
    </style>
</head>

<body class="bg-light">

<!-- NAVBAR -->

<nav class="navbar navbar-expand-lg navbar-dark bg-primary shadow fixed-top px-4">
    <button class="btn btn-primary me-3"
            type="button"
            data-bs-toggle="offcanvas"
            data-bs-target="#dashboardOffcanvas">
        <span class="navbar-toggler-icon"></span>
    </button>

    <a class="navbar-brand d-flex align-items-center" href="<c:url value='/'/>">
        <img src="https://x-workz.com/Logo.png" class="logo-img me-2" alt="X-Workz">
        Chethan_Xworkz
    </a>

    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
            data-bs-target="#navbarNav">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav me-auto">
            <li class="nav-item">
                <a class="nav-link active fw-semibold" href="<c:url value='/home'/>">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link fw-semibold" href="#">Courses</a>
            </li>
        </ul>


    </div>
</nav>
<main style="padding-top: 110px;">
    <div class="container d-flex justify-content-center align-items-center"
         style="min-height: 70vh;">

        <div class="card shadow-lg border-0"
             style="width: 500px; border-radius: 18px;">

                <div class="card-body p-4">

                    <h4 class="fw-bold text-center text-danger mb-4">
                        Send Team Email
                    </h4>

                    <!-- 🔥 ADD MESSAGE HERE -->

                    <c:if test="${not empty msg}">
                        <div class="alert alert-success alert-dismissible fade show">
                            ${msg}
                            <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
                        </div>
                    </c:if>

                    <c:if test="${not empty error}">
                        <div class="alert alert-danger alert-dismissible fade show">
                            ${error}
                            <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
                        </div>
                    </c:if>

                <form action="sendTeamMail" method="post">

                    <div class="mb-3">
                        <label class="form-label fw-semibold">
                            Select Team
                        </label>
                        <select name="teamName" class="form-select">
                            <c:forEach items="${teams}" var="team">
                                <option value="${team.teamName}">
                                    ${team.teamName}
                                </option>
                            </c:forEach>
                        </select>
                    </div>

                    <div class="mb-4">
                        <label class="form-label fw-semibold">
                            Message
                        </label>
                        <textarea name="message"
                                  class="form-control"
                                  rows="5"
                                  placeholder="Enter your message here..."></textarea>
                    </div>

                    <button class="btn btn-danger w-100 rounded-pill fw-semibold py-2">
                        Send Email
                    </button>

                </form>

            </div>
        </div>

    </div>
</main>


<div class="offcanvas offcanvas-start shadow"
     tabindex="-1"
     id="dashboardOffcanvas"
     style="width: 270px;">

    <div class="offcanvas-header bg-primary text-white">
        <h5 class="offcanvas-title fw-bold">
            Dashboard
        </h5>
        <button type="button"
                class="btn-close btn-close-white"
                data-bs-dismiss="offcanvas"></button>
    </div>

    <div class="offcanvas-body p-0 bg-light">

        <div class="d-flex flex-column p-3 gap-3">

            <a href="addTeam"
               class="btn btn-outline-primary rounded-pill fw-semibold py-2">
                Add Team
            </a>

            <a href="addTeamMember"
               class="btn btn-outline-primary rounded-pill fw-semibold py-2">
                Add Team Member
            </a>

            <a href="viewTeamMembers"
               class="btn btn-outline-primary rounded-pill fw-semibold py-2">
                View Team Members
            </a>

            <a href="viewTeams"
               class="btn btn-outline-primary rounded-pill fw-semibold py-2">
                View Teams
            </a>

            <a href="sendTeamMailPage"
               class="btn btn-outline-danger rounded-pill fw-semibold py-2">
                Send Team Email
            </a>

        </div>

    </div>
</div>



<!-- FOOTER -->
<footer class="bg-primary text-white text-center py-3 mt-auto">
    <p class="mb-0 fw-semibold">© 2026 X-Workz Training Institute</p>
</footer>
<script>
    function checkPasswordMatch() {
        const newPwd = document.getElementById("newPassword").value;
        const confirmPwd = document.getElementById("confirmPassword").value;
        const error = document.getElementById("pwdError");
        const btn = document.getElementById("changePwdBtn");

        if (newPwd === "" || confirmPwd === "") {
            error.textContent = "";
            btn.disabled = true;
            return;
        }

        if (newPwd !== confirmPwd) {
            error.textContent = "Passwords do not match";
            btn.disabled = true;
        } else {
            error.textContent = "";
            btn.disabled = false;
        }
    }
</script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
