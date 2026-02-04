<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>Sign Up | X-Workz</title>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>

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

<body class="bg-light">

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-primary shadow fixed-top px-4">
    <div class="container-fluid">

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
                    <a class="nav-link fw-semibold" href="">Home</a>
                </li>
            </ul>

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
    </div>
</nav>

<!-- MAIN CONTENT -->
<main class="d-flex align-items-center justify-content-center">
    <div class="card shadow p-4" style="width:100%; max-width:520px;">

        <div class="text-center mb-4">
            <h4 class="fw-bold text-primary">Create Account</h4>
        </div>

        <form action="signUp" method="post" enctype="multipart/form-data">


            <div class="mb-3">
                <label class="form-label">Full Name</label>
                <input type="text" id="name" name="name" class="form-control" value="${dto.name}"
                       oninput="validateName()" onchange="validateName()">
                <div class="text-danger small" id="nameError"></div>
                <div class="text-danger small">
                    ${nameError}
                </div>

            </div>


            <div class="mb-3">
                <label class="form-label">Email</label>
                <input type="email" id="email" name="email" class="form-control" value="${dto.email}"
                       oninput="validateEmail()" onchange="validateEmail()">
                <div class="text-danger small" id="emailError"></div>
                <div class="text-danger small">${emailError}</div>

            </div>


            <div class="mb-3">
                <label class="form-label">Phone</label>
                <input type="number" id="phone" name="phone" class="form-control" maxlength="10" value="${dto.phone}"
                       onchange="validatePhoneNumber()">
                <div class="text-danger small" id="phoneError"></div>
                <div class="text-danger small">${phoneError}</div>

            </div>


            <div class="mb-3">
                <label class="form-label">Age</label>
                <input type="number" id="age" name="age" class="form-control" value="${dto.age}"
                       oninput="validateAge()" onchange="validateAge()">
                <div class="text-danger small" id="ageError"></div>
            </div>


            <div class="mb-3">
                <label class="form-label">Gender</label>
                <div class="d-flex gap-3">
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="gender" value="Male"
                               onchange="validateGender()">
                        <label class="form-check-label">Male</label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="gender" value="Female"
                               onchange="validateGender()">
                        <label class="form-check-label">Female</label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="gender" value="Other"
                               onchange="validateGender()">
                        <label class="form-check-label">Other</label>
                    </div>
                </div>

                <div class="text-danger small" id="genderError"></div>
                <div class="text-danger small">${genderError}</div>


            </div>


            <div class="mb-3">
                <label class="form-label">Address</label>
                <input type="text" id="address" name="address" class="form-control" value="${dto.address}"
                       oninput="validateAddress()" onchange="validateAddress()">
                <div class="text-danger small" id="addressError"></div>
                <div class="text-danger small">${addressError}</div>

            </div>


            <div class="mb-3">
                <label class="form-label">Profile Photo</label>
                <input type="file"
                       class="form-control"
                       name="image"
                       id="profileImage"
                       accept="image/png,image/jpeg"
                       onchange="validateImage()">

                <div class="text-danger small" id="imageError"></div>
            </div>


            <!-- PASSWORD -->
            <div class="mb-3">
                <label class="form-label">Password</label>
                <input type="password" id="password" name="password" class="form-control"
                       oninput="validatePassword()" onchange="validatePassword()">
                <div class="text-danger small" id="passwordError"></div>
                <div class="text-danger small">${passwordError}</div>

            </div>

            <!-- CONFIRM PASSWORD -->
            <div class="mb-3">
                <label class="form-label">Confirm Password</label>
                <input type="password" id="confirmPassword" name="confirmPassword" class="form-control"
                       oninput="validateConfirmPassword()" onchange="validateConfirmPassword()">
                <div class="text-danger small" id="confirmPasswordError"></div>
                <div class="text-danger small">${confirmPasswordError}</div>

            </div>

            <div class="d-grid mb-3">
                <button type="submit" class="btn btn-primary fw-semibold">
                    Sign Up
                </button>
            </div>

            <!-- BACKEND MESSAGES -->
            <c:if test="${not empty msg}">
                <div class="alert alert-success">${msg}</div>
            </c:if>

            <c:if test="${not empty error}">
                <div class="alert alert-danger">${error}</div>
            </c:if>

        </form>
    </div>
</main>
<script>

function validatePhoneNumber() {
    console.log("start");

    const phone = document.getElementById("phone").value.trim();
    const phoneError = document.getElementById("phoneError");


    if (!/^[6-9][0-9]{9}$/.test(phone)) {
        phoneError.textContent =
            "Phone number must start with 6–9 and contain 10 digits";
        phoneError.classList.remove("text-success");
        phoneError.classList.add("text-danger");
        return false;
    }


    phoneError.textContent = "";

    const phoneCheck =
        "http://localhost:8080/chethan_XworkzModule/checkPhoneNumber?phone=";


    fetch(phoneCheck + phone)
        .then(res => res.text())
        .then(data => {
            console.log(data); // backend message
            phoneError.textContent = data;

            // Optional: color based on response
            if (data.includes("Valid")) {
                phoneError.classList.remove("text-danger");
                phoneError.classList.add("text-success");
            } else {
                phoneError.classList.remove("text-success");
                phoneError.classList.add("text-danger");
            }
        })
        .catch(err => {
            console.error(err);
            phoneError.textContent = "Unable to validate phone number";
            phoneError.classList.add("text-danger");
        });

    return true;
}



function allowOnlyLetters(event) {
    const char = event.key;
    return /^[A-Za-z ]$/.test(char);
}

function validateName() {
    const nameInput = document.getElementById("name");
    const nameError = document.getElementById("nameError");

    const v = nameInput.value.trim();
    const nameRegex = /^[A-Za-z ]{3,50}$/;

    if (v === "") {
        nameError.textContent = "Name is required";
        return false;
    }

    if (!nameRegex.test(v)) {
        nameError.textContent =
            "Enter a valid name (3–50 alphabets only, no numbers)";
        return false;
    }

    nameError.textContent = "";
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
    return true;
}

/* ================= AGE ================= */
function validateAge() {
    const age = document.getElementById("age").value;
    const ageError = document.getElementById("ageError");

    if (age < 18 || age > 60) {
        ageError.textContent = "Age must be between 18 and 60";
        return false;
    }

    ageError.textContent = "";
    return true;
}

/* ================= GENDER ================= */
function validateGender() {
    const genderError = document.getElementById("genderError");
    const gender = document.querySelector('input[name="gender"]:checked');

    if (!gender) {
        genderError.textContent = "Please select gender";
        return false;
    }

    genderError.textContent = "";
    return true;
}

/* ================= ADDRESS ================= */
function validateAddress() {
    const address = document.getElementById("address").value.trim();
    const addressError = document.getElementById("addressError");

    if (address.length < 10) {
        addressError.textContent =
            "Address must contain at least 10 characters";
        return false;
    }

    addressError.textContent = "";
    return true;
}

/* ================= PASSWORD ================= */
function validatePassword() {
    const password = document.getElementById("password").value;
    const passwordError = document.getElementById("passwordError");

    const regex =
        /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&]).{8,}$/;

    if (!regex.test(password)) {
        passwordError.textContent =
            "Password must have uppercase, lowercase, number & special character";
        return false;
    }

    passwordError.textContent = "";
    return true;
}

/* ================= CONFIRM PASSWORD ================= */
function validateConfirmPassword() {
    const password = document.getElementById("password").value;
    const confirmPassword =
        document.getElementById("confirmPassword").value;
    const confirmPasswordError =
        document.getElementById("confirmPasswordError");

    if (password !== confirmPassword) {
        confirmPasswordError.textContent = "Passwords do not match";
        return false;
    }

    confirmPasswordError.textContent = "";
    return true;
}

/* ================= FORM SUBMIT ================= */
function validateForm() {
    return validateName() &
           validateEmail() &
           validatePhoneNumber() &
           validateAge() &
           validateGender() &
           validateAddress() &
           validatePassword() &
           validateConfirmPassword();
}


<!--    function validateImage() {-->
<!--    const fileInput = document.getElementById("profileImage");-->
<!--    const error = document.getElementById("imageError");-->

<!--    if (fileInput.files.length === 0) {-->
<!--        error.textContent = "Profile photo is required";-->
<!--        return false;-->
<!--    }-->

<!--    const file = fileInput.files[0];-->

<!--    if (!["image/jpeg", "image/png"].includes(file.type)) {-->
<!--        error.textContent = "Only JPG or PNG allowed";-->
<!--        return false;-->
<!--    }-->

<!--    if (file.size > 2 * 1024 * 1024) {-->
<!--        error.textContent = "Image must be less than 2MB";-->
<!--        return false;-->
<!--    }-->

<!--    error.textContent = "";-->
<!--    return true;-->
<!--}-->


</script>

<!-- FOOTER -->
<footer class="bg-primary text-white text-center py-3 mt-auto">
    <p class="mb-0 fw-semibold">© 2026 X-Workz Training Institute</p>
</footer>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
