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

        <div class="ms-auto d-flex gap-2">
            <button class="btn p-0 border-0 bg-transparent"
                    data-bs-toggle="modal"
                    data-bs-target="#profileModal"
                    title="Profile">

                <c:choose>
                    <c:when test="${not empty sessionScope.fileId}">
                        <img src="<c:url value='/getImage?id=${sessionScope.fileId}'/>"
                             class="rounded-circle border border-2 border-light"
                             width="40" height="40"
                             style="object-fit: cover;">
                    </c:when>
                    <c:otherwise>
                        <img src="https://ui-avatars.com/api/?name=${sessionScope.user.name}&size=40"
                             class="rounded-circle border border-2 border-light"
                             width="40" height="40">
                    </c:otherwise>
                </c:choose>

            </button>


            <a href="logout" class="btn btn-outline-light rounded-pill">
                Logout
            </a>
        </div>
    </div>
</nav>


<main style="padding-top: 90px;">
    <div class="container mt-5 text-center">
        <h3 class="fw-bold">
            Hello <span class="text-primary">${sessionScope.user.name}</span>
        </h3>
        <p class="text-muted fs-5">
            Welcome to <b>X-Workz Training Institute</b>
        </p>
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



<div class="modal fade" id="profileModal">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">

            <!-- HEADER WITH PROFILE IMAGE -->
            <div class="modal-header border-0 justify-content-center pb-0">
                <div class="text-center">

                    <c:choose>
                        <c:when test="${not empty sessionScope.fileId}">
                            <img src="<c:url value='/getImage?id=${sessionScope.fileId}'/>"
                                 class="rounded-circle shadow"
                                 width="110" height="110"
                                 style="object-fit: cover;">
                        </c:when>
                        <c:otherwise>
                            <img src="https://ui-avatars.com/api/?name=${sessionScope.user.name}&size=110"
                                 class="rounded-circle shadow"
                                 width="110" height="110">
                        </c:otherwise>
                    </c:choose>

                </div>

                <button class="btn-close position-absolute end-0 me-3"
                        data-bs-dismiss="modal"></button>
            </div>

            <!-- BODY -->
            <div class="modal-body text-center pt-3">

                <h5 class="fw-bold mb-1">
                    ${sessionScope.user.name}
                </h5>
                <p class="text-muted mb-3">
                    ${sessionScope.user.email}
                </p>

                <!-- INFO LIST -->
                <div class="text-start px-3">

                    <div class="d-flex justify-content-between border-bottom py-2">
                        <span class="text-muted">Phone</span>
                        <span class="fw-semibold">${sessionScope.user.phone}</span>
                    </div>

                    <div class="d-flex justify-content-between border-bottom py-2">
                        <span class="text-muted">Age</span>
                        <span class="fw-semibold">${sessionScope.user.age}</span>
                    </div>

                    <div class="d-flex justify-content-between py-2">
                        <span class="text-muted">Address</span>
                        <span class="fw-semibold text-end"
                              style="max-width: 60%;">
                            ${sessionScope.user.address}
                        </span>
                    </div>

                </div>

                <!-- ACTION BUTTONS -->
                <div class="mt-4">
                    <button class="btn btn-primary w-100 mb-2"
                            data-bs-toggle="modal"
                            data-bs-target="#editProfileModal"
                            data-bs-dismiss="modal">
                        Edit Profile
                    </button>

                    <button class="btn btn-outline-secondary w-100"
                            data-bs-toggle="modal"
                            data-bs-target="#changePasswordModal"
                            data-bs-dismiss="modal">
                        Change Password
                    </button>
                </div>

            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="editProfileModal">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">

            <form action="<c:url value='/update-profile'/>" method="post">
                <div class="modal-header">
                    <h5>Edit Profile</h5>
                    <button class="btn-close" data-bs-dismiss="modal"></button>
                </div>

                <div class="modal-body">

                    <c:if test="${not empty profileMsg}">
                        <div class="alert alert-success mt-2">
                            ${profileMsg}
                        </div>
                    </c:if>

                    <c:if test="${not empty profileError}">
                        <div class="alert alert-danger mt-2">
                            ${profileError}
                        </div>
                    </c:if>


                    <input type="hidden" name="email" value="${user.email}">

                    <div class="mb-2">
                        <label>Name</label>
                        <input class="form-control" value="${user.name}" readonly>
                    </div>

                    <div class="mb-2">
                        <label>Phone</label>
                        <input name="phone" class="form-control" value="${user.phone}" required>
                    </div>

                    <div class="mb-2">
                        <label>Age</label>
                        <input name="age" type="number" class="form-control" value="${user.age}" required>
                    </div>

                    <div class="mb-2">
                        <label>Address</label>
                        <input name="address" class="form-control" value="${user.address}" required>
                    </div>
                </div>

                <div class="modal-footer">
                    <button class="btn btn-success w-100">Update Profile</button>
                </div>
            </form>
        </div>
    </div>
</div>




<div class="modal fade" id="changePasswordModal">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">

            <form action="<c:url value='/change-password'/>" method="post">
                <div class="modal-header">
                    <h5>Change Password</h5>
                    <button class="btn-close" data-bs-dismiss="modal"></button>
                </div>

                <c:if test="${not empty error}">
                    <div class="alert alert-danger mx-3 mt-2">
                        ${error}
                    </div>
                </c:if>

                <div class="modal-body">

                    <div class="mb-3">
                        <label>New Password</label>
                        <input type="password" id="newPassword"
                               name="newPassword"
                               class="form-control"
                               onkeyup="checkPasswordMatch()">
                    </div>

                    <div class="mb-3">
                        <label>Confirm Password</label>
                        <input type="password" id="confirmPassword"
                               name="confirmPassword"
                               class="form-control"
                               onkeyup="checkPasswordMatch()">

                        <small id="pwdError" class="text-danger"></small>
                    </div>


                </div>

                <div class="modal-footer">
                    <button type="submit" id="changePwdBtn" class="btn btn-primary" disabled>
                        Change Password
                    </button>

                </div>
            </form>

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
