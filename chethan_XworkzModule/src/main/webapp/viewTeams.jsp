<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>View Teams | X-Workz</title>

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
            padding-top: 90px;
        }
        .logo-img {
            height: 45px;
        }

        /* ===== CARD DESIGN ===== */
        .team-card {
            border-radius: 16px;
            transition: transform 0.3s ease, box-shadow 0.3s ease;
        }

        .team-card:hover {
            transform: translateY(-6px);
            box-shadow: 0 14px 30px rgba(0,0,0,0.15);
        }

        .team-header {
            background: linear-gradient(135deg, #0d6efd, #0a58ca);
            color: white;
            padding: 14px;
            text-align: center;
            font-weight: 600;
            border-top-left-radius: 16px;
            border-top-right-radius: 16px;
        }

        .member-badge {
            font-size: 14px;
            padding: 6px 14px;
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

    <h4 class="fw-bold text-primary text-center mb-4">
        Team Details
    </h4>

    <!-- TEAMS PRESENT -->
    <c:if test="${not empty members}">
        <div class="row g-4">

            <c:forEach items="${members}" var="m">
                <div class="col-md-6 col-lg-4">

                    <div class="card team-card shadow-sm h-100">

                        <!-- HEADER -->
                        <div class="team-header">
                            ${m.teamName}
                        </div>

                        <!-- BODY -->
                        <div class="card-body">

                            <p class="d-flex mb-2">
                                <span class="fw-semibold me-1">👤 Team Head :</span>
                                <span>${m.teamHeadName}</span>
                            </p>

                            <p class="d-flex mb-2">
                                <span class="fw-semibold me-1">📧 Email :</span>
                                <span>${m.email}</span>
                            </p>

                            <p class="d-flex mb-2">
                                <span class="fw-semibold me-1">📞 Phone :</span>
                                <span>${m.phone}</span>
                            </p>

                            <div class="mt-3 text-center">
                                <span class="badge bg-success member-badge">
                                    👥 ${m.noOfTeamMember} Members
                                </span>
                            </div>

                        </div>
                    </div>

                </div>
            </c:forEach>

        </div>
    </c:if>

    <!-- NO TEAMS -->
    <c:if test="${empty members}">
        <div class="alert alert-warning text-center fw-semibold shadow-sm">
            ${noTeams}
        </div>
    </c:if>

</main>

<!-- FOOTER -->
<footer class="bg-primary text-white text-center py-3 mt-auto">
    <p class="mb-0 fw-semibold">© 2026 X-Workz Training Institute</p>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
