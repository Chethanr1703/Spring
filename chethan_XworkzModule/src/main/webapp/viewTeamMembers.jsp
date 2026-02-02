<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>View Team Members | X-Workz</title>

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
            padding-top: 110px;
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

<!-- MAIN CONTENT -->
<main class="container">

    <!-- SEARCH CARD -->
    <div class="row justify-content-center mb-5">
        <div class="col-md-6 col-lg-5">
            <div class="card shadow p-4">

                <h4 class="fw-bold text-primary text-center mb-4">
                    View Team Members
                </h4>

                <form action="getTeamMembers" method="get">
                    <div class="row align-items-center mb-4">
                        <div class="col-4 fw-semibold text-end">
                            Team Name :
                        </div>
                        <div class="col-8">
                            <input type="text"
                                   name="teamName"
                                   class="form-control"
                                   placeholder="Enter team name"
                                   value="${param.teamName}"
                                   required>
                        </div>
                    </div>

                    <div class="text-center">
                        <button type="submit"
                                class="btn btn-primary rounded-pill px-5 fw-semibold">
                            View Members
                        </button>
                    </div>
                </form>

            </div>
        </div>
    </div>

    <!-- TABLE: SHOW ONLY AFTER SEARCH -->
    <c:if test="${not empty param.teamName}">

        <!-- MEMBERS FOUND -->
        <c:if test="${not empty members}">
            <div class="table-responsive shadow-sm">
                <table class="table table-bordered table-hover align-middle text-center">
                    <thead class="table-primary">
                    <tr>
                        <th>Member Name</th>
                        <th>Email</th>
                        <th>Phone</th>
                        <th>Team Name</th>
                        <th>Team Head Email</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${members}" var="m">
                        <tr>
                            <td class="fw-semibold">${m.name}</td>
                            <td>${m.email}</td>
                            <td>${m.phone}</td>
                            <td>${m.teamName}</td>
                            <td>${m.teamHeadEmail}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </c:if>

        <!-- NO MEMBERS FOUND -->
        <c:if test="${empty members}">
            <div class="alert alert-warning text-center fw-semibold shadow-sm">
                No Team Members Found for <b>${param.teamName}</b>
            </div>
        </c:if>

    </c:if>

</main>

<!-- FOOTER -->
<footer class="bg-primary text-white text-center py-3 mt-auto">
    <p class="mb-0 fw-semibold">© 2026 X-Workz Training Institute</p>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
