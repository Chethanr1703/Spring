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
                    <form action="addTeam" method="post" enctype="multipart/form-data">

                        <!-- TEAM NAME -->
                        <div class="row align-items-center mb-3">
                            <div class="col-4 fw-semibold text-end">
                                Team Name :
                            </div>
                            <div class="col-8">
                                <input type="text" id="teamName" name="teamName"
                                       class="form-control"
                                       value="${dto.teamName}"
                                       oninput="validateTeamName()" onchange="validateTeamName()">
                                <div class="text-danger small" id="teamNameError"></div>
                            </div>
                        </div>

                        <!-- TEAM HEAD -->
                        <div class="row align-items-center mb-3">
                            <div class="col-4 fw-semibold text-end">
                                Team Head :
                            </div>
                            <div class="col-8">
                                <input type="text" id="teamHeadName" name="teamHeadName"
                                       class="form-control"
                                       value="${dto.teamHeadName}"
                                       oninput="validateTeamHeadName()" onchange="validateTeamHeadName()">
                                <div class="text-danger small" id="teamHeadNameError"></div>

                            </div>
                        </div>

                        <!-- PHONE -->
                        <div class="row align-items-center mb-3">
                            <div class="col-4 fw-semibold text-end">
                                Phone :
                            </div>
                            <div class="col-8">
                                <input type="tel" id="phone" name="phone"
                                       class="form-control"
                                       value="${dto.phone}"
                                       onchange="validatePhoneNumber()">
                                <div class="text-danger small" id="phoneError"></div>

                            </div>
                        </div>

                        <!-- EMAIL -->
                        <div class="row align-items-center mb-3">
                            <div class="col-4 fw-semibold text-end">
                                Email :
                            </div>
                            <div class="col-8">
                                <input type="email" id="email" name="email"
                                       class="form-control"
                                       value="${dto.email}"
                                       onchange="validateEmail()">
                                <div class="text-danger small" id="emailError"></div>

                            </div>
                        </div>
                        <div class="row align-items-center mb-3">
                            <div class="col-4 fw-semibold text-end">

                                Profile Photo
                            </div>
                            <div class="col-8">
                                <input type="file"
                                       class="form-control"
                                       name="image"
                                       id="profileImage"
                                       accept="image/png,image/jpeg"
                                       onchange="validateImage()">

                                <div class="text-danger small" id="imageError"></div>
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


<script>

    /* ================= TEAM NAME ================= */
    function validateTeamName() {
        const name = document.getElementById("teamName").value.trim();
        const error = document.getElementById("teamNameError");

        const regex = /^[A-Za-z ]{3,50}$/;

        if (name === "") {
            error.textContent = "Team Name is required";
            return false;
        }

        if (!regex.test(name)) {
            error.textContent = "3–50 letters only (no numbers or symbols)";
            return false;
        }

        error.textContent = "";
        return true;
    }

    /* ================= TEAM HEAD ================= */
    function validateTeamHeadName() {
        const head = document.getElementById("teamHeadName").value.trim();
        const error = document.getElementById("teamHeadNameError");

        const regex = /^[A-Za-z ]{3,50}$/;

        if (head === "") {
            error.textContent = "Team Head Name is required";
            return false;
        }

        if (!regex.test(head)) {
            error.textContent = "3–50 letters only (no numbers or symbols)";
            return false;
        }

        error.textContent = "";
        return true;
    }

    /* ================= PHONE ================= */
    function validatePhoneNumber() {

        const phone = document.getElementById("phone").value.trim();
        const phoneError = document.getElementById("phoneError");

        if (!/^[6-9][0-9]{9}$/.test(phone)) {
            phoneError.textContent =
                "Phone must start with 6–9 and contain 10 digits";
            phoneError.classList.add("text-danger");
            return false;
        }

        phoneError.textContent = "";

        const phoneCheck =
            "http://localhost:8080/chethan_XworkzModule/checkTeamHeadPhNo?phone=";

        fetch(phoneCheck + phone)
            .then(res => res.text())
            .then(data => {
                phoneError.textContent = data;
                if (data.includes("Valid")) {
                    phoneError.classList.remove("text-danger");
                    phoneError.classList.add("text-success");
                } else {
                    phoneError.classList.remove("text-success");
                    phoneError.classList.add("text-danger");
                }
            })
            .catch(() => {
                phoneError.textContent = "Unable to validate phone";
                phoneError.classList.add("text-danger");
            });

        return true;
    }

    /* ================= EMAIL ================= */
    function validateEmail() {

        const email = document.getElementById("email").value.trim();
        const emailError = document.getElementById("emailError");

        if (!/^[a-zA-Z0-9._%+-]+@gmail\.com$/.test(email)) {
            emailError.textContent = "Email must end with @gmail.com";
            return false;
        }

        emailError.textContent = "";

        const emailCheck =
            "http://localhost:8080/chethan_XworkzModule/checkTeamHeadEmail?email=";

        fetch(emailCheck + email)
            .then(res => res.text())
            .then(data => {
                emailError.textContent = data;

                if (data.includes("Valid")) {
                    emailError.classList.remove("text-danger");
                    emailError.classList.add("text-success");
                } else {
                    emailError.classList.remove("text-success");
                    emailError.classList.add("text-danger");
                }
            })
            .catch(() => {
                emailError.textContent = "Unable to validate Email";
                emailError.classList.add("text-danger");
            });

        return true;
    }

    /* ================= MEMBERS ================= */
    function validateMembers() {

        const members = document.getElementById("noOfTeamMember").value;
        const error = document.getElementById("membersError");

        if (members < 1 || members > 50) {
            error.textContent = "Members must be between 1 and 50";
            return false;
        }

        error.textContent = "";
        return true;
    }

    /* ================= FORM ================= */
    function validateForm() {
        return validateTeamName() &&
               validateTeamHeadName() &&
               validatePhoneNumber() &&
               validateEmail() &&
               validateMembers();
    }

</script>


<!-- FOOTER -->
<footer class="bg-primary text-white text-center py-3 mt-auto">
    <p class="mb-0 fw-semibold">© 2026 X-Workz Training Institute</p>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
