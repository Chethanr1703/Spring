<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Team Member | X-Workz</title>

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


<!-- MAIN -->
<main class="d-flex align-items-center justify-content-center"
      style="padding-top: 90px;">

    <div class="container">
        <div class="row justify-content-center">
            <div class="col-lg-5">

                <div class="card shadow-lg p-4">

                    <h4 class="fw-bold text-primary text-center mb-4">
                        Add Team Member
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
                    <form action="addTeamMember" method="post" onsubmit="return validateForm()">


                    <!-- MEMBER NAME -->
                        <div class="row align-items-center mb-3">
                            <div class="col-4 fw-semibold text-end">
                                Name :
                            </div>
                            <div class="col-8">
                            <input type="text"
                                   id="name"
                                   name="name"
                                   class="form-control"
                                   value="${dto.name}"
                                   oninput="validateName()" onchange="validateName()">
                            <div class="text-danger small" id="nameError"></div>
                            </div>
                        </div>

                        <!-- EMAIL -->
                        <div class="row align-items-center mb-3">
                            <div class="col-4 fw-semibold text-end">
                                Email :
                            </div>
                            <div class="col-8">
                            <input type="email"
                                   id="email"
                                   name="email"
                                   class="form-control"
                                   value="${dto.email}"
                                   onchange="validateEmail()">
                            <div class="text-danger small" id="emailError"></div>
                            </div>
                        </div>

                        <!-- PHONE -->
                        <div class="row align-items-center mb-3">
                            <div class="col-4 fw-semibold text-end">
                                Phone :
                            </div>
                            <div class="col-8">
                                <input type="tel"
                                       id="phone"
                                       name="phone"
                                       class="form-control"
                                       value="${dto.phone}"
                                       onchange="validatePhoneNumber()">
                                <div class="text-danger small" id="phoneError"></div>


                            </div>
                        </div>

                        <!-- TEAM NAME -->
                        <div class="row align-items-center mb-3">
                            <div class="col-4 fw-semibold text-end">
                                Team Name :
                            </div>
                            <div class="col-8">
                                <input type="text"
                                       id="teamName"
                                       name="teamName"
                                       class="form-control"
                                       value="${dto.teamName}"
                                       oninput="validateTeamName()" onchange="validateTeamName()">
                                <div class="text-danger small" id="teamNameError"></div>

                            </div>
                        </div>

                        <!-- TEAM HEAD EMAIL -->
                        <div class="row align-items-center mb-4">
                            <div class="col-4 fw-semibold text-end">
                                Team Head Email :
                            </div>
                            <div class="col-8">
                                <input type="email"
                                       id="teamHeadEmail"
                                       name="teamHeadEmail"
                                       class="form-control"
                                       value="${dto.teamHeadEmail}"
                                       onchange="validateTeamHeadEmail()">
                                <div class="text-danger small" id="teamHeadEmailError"></div>

                            </div>
                        </div>

                        <!-- BUTTON -->
                        <div class="text-center">
                            <button type="submit"
                                    class="btn btn-primary fw-semibold rounded-pill px-5">
                                Add Team Member
                            </button>
                        </div>

                    </form>

                </div>

            </div>
        </div>
    </div>

</main>

<script>

    /* ================= NAME ================= */
    function validateName() {
        const name = document.getElementById("name").value.trim();
        const error = document.getElementById("nameError");

        const regex = /^[A-Za-z ]{3,50}$/;

        if (name === "") {
            error.textContent = "Name is required";
            return false;
        }

        if (!regex.test(name)) {
            error.textContent =
                "Enter valid name (3–50 letters only)";
            return false;
        }

        error.textContent = "";
        return true;
    }

    /* ================= EMAIL ================= */
    function validateEmail() {

        const email = document.getElementById("email").value.trim();
        const error = document.getElementById("emailError");

        if (!/^[a-zA-Z0-9._%+-]+@gmail\.com$/.test(email)) {
            error.textContent = "Email must end with @gmail.com";
            return false;
        }

        error.textContent = "";

        const emailCheck =
            "http://localhost:8080/chethan_XworkzModule/checkEmailTeamMember?email=";

        fetch(emailCheck + email)
            .then(res => res.text())
            .then(data => {
                error.textContent = data;

                if (data.includes("Valid")) {
                    error.classList.remove("text-danger");
                    error.classList.add("text-success");
                } else {
                    error.classList.remove("text-success");
                    error.classList.add("text-danger");
                }
            })
            .catch(() => {
                error.textContent = "Unable to validate Email";
                error.classList.add("text-danger");
            });

        return true;
    }

    /* ================= PHONE ================= */
    function validatePhoneNumber() {

        const phone = document.getElementById("phone").value.trim();
        const error = document.getElementById("phoneError");

        if (!/^[6-9][0-9]{9}$/.test(phone)) {
            error.textContent =
                "Phone must start with 6–9 and contain 10 digits";
            error.classList.add("text-danger");
            return false;
        }

        error.textContent = "";

        const phoneCheck =
            "http://localhost:8080/chethan_XworkzModule/checkPhoneNumberTeamMember?phone=";

        fetch(phoneCheck + phone)
            .then(res => res.text())
            .then(data => {
                error.textContent = data;

                if (data.includes("Valid")) {
                    error.classList.remove("text-danger");
                    error.classList.add("text-success");
                } else {
                    error.classList.remove("text-success");
                    error.classList.add("text-danger");
                }
            })
            .catch(() => {
                error.textContent = "Unable to validate phone";
                error.classList.add("text-danger");
            });

        return true;
    }

    /* ================= TEAM NAME ================= */
    function validateTeamName() {

        const team = document.getElementById("teamName").value.trim();
        const error = document.getElementById("teamNameError");

        if (team.length < 3) {
            error.textContent = "Team name must be at least 3 characters";
            return false;
        }

        error.textContent = "";
        return true;
    }

    /* ================= TEAM HEAD EMAIL ================= */
    function validateTeamHeadEmail() {

        const email =
            document.getElementById("teamHeadEmail").value.trim();
        const error =
            document.getElementById("teamHeadEmailError");

        if (!/^[a-zA-Z0-9._%+-]+@gmail\.com$/.test(email)) {
            error.textContent =
                "Team Head Email must end with @gmail.com";
            return false;
        }

        error.textContent = "";
        return true;
    }

    /* ================= FORM ================= */
    function validateForm() {
        return validateName() &&
               validateEmail() &&
               validatePhoneNumber() &&
               validateTeamName() &&
               validateTeamHeadEmail();
    }

</script>


<!-- FOOTER -->
<footer class="bg-primary text-white text-center py-3 mt-auto">
    <p class="mb-0 fw-semibold">© 2026 X-Workz Training Institute</p>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
