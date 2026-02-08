<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
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

                    <div class="card team-card shadow border-0 h-100">

                        <!-- LOGO SECTION -->
                        <div class="text-center pt-4 pb-3 bg-white rounded-top">

                            <c:choose>
                                <c:when test="${m.id ne 0}">
                                    <img src="<c:url value='/getTeamImage?id=${m.id}'/>"
                                         class="rounded-circle shadow"
                                         width="110" height="110"
                                         style="object-fit: cover;">
                                </c:when>
                                <c:otherwise>
                                    <div class="d-flex align-items-center justify-content-center
        rounded-circle bg-primary text-white fw-bold"
                                         style="width:110px;height:110px;margin:auto;font-size:30px;">
                                        HI
                                    </div>
                                </c:otherwise>
                            </c:choose>

                        </div>

                        <!-- TEAM NAME -->
                        <div class="text-center pb-2">
                            <h5 class="fw-bold text-primary">
                                ${m.teamName}
                            </h5>
                        </div>

                        <!-- BODY -->
                        <div class="card-body text-center">

                            <p class="mb-2">
                                <span class="fw-semibold">Team Head :</span>
                                ${m.teamHeadName}
                            </p>

                            <p class="mb-2">
                                <span class="fw-semibold">Email :</span>
                                ${m.email}
                            </p>

                            <p class="mb-3">
                                <span class="fw-semibold">Phone :</span>
                                ${m.phone}
                            </p>

                            <div class="d-grid">
                                <form action="getTeamMembers" method="get">
                                    <input type="hidden" name="teamName" value="${m.teamName}">
                                    <button type="submit"
                                            class="btn btn-outline-primary fw-semibold">
                                        View Team Members
                                    </button>
                                </form>
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
