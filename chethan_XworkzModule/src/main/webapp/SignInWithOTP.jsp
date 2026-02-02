<!doctype html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign In with OTP | X-Workz</title>

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
    <a class="navbar-brand d-flex align-items-center" href="<c:url value='/'/>">
        <img src="https://x-workz.com/Logo.png" class="logo-img me-2" alt="X-Workz">
        Chethan_Xworkz
    </a>
</nav>

<!-- MAIN CONTENT -->
<main class="d-flex justify-content-center align-items-center">
    <div class="card shadow p-4" style="max-width:420px; width:100%;">
        <div class="text-center mb-4">
            <h4 class="fw-bold text-primary">Sign In with OTP</h4>
        </div>

        <!-- SEND OTP -->
        <form action="sendOTP" method="post" onsubmit="handleSendOtp(event)">
            <p class="text-center fw-bold text-danger">${msg}</p>
            <p class="text-center fw-bold text-danger">${msgUnsuccess}</p>

            <div class="mb-3">
                <input type="email"
                       class="form-control"
                       name="email"
                       value="${email}"
                       placeholder="Enter your email"
                       required>
            </div>

            <div class="d-grid mb-4">
                <button type="submit"
                        id="sendOtpBtn"
                        class="btn btn-primary"
                <c:if test="${otpSent}">disabled</c:if>>
                Send OTP
                </button>

            </div>
        </form>

        <!-- VERIFY OTP -->
        <form action="signInWithOTP" method="post">
            <input type="hidden" name="email" value="${email}"/>

            <div class="mb-3">
                <input type="number"
                       class="form-control"
                       name="otp"
                       placeholder="Enter OTP"
                       required>
            </div>

            <p id="timer" class="text-center fw-bold text-danger" style="display:none;"></p>

            <div class="d-grid mb-3">
                <button type="submit"
                        class="btn btn-primary fs-5 fw-semibold text-uppercase">
                    Sign In
                </button>
            </div>

            <p class="text-center fw-bold text-danger">${wrongOTP}</p>
        </form>


        <form action="sendOTP" method="post" onsubmit="handleResendOtp(event)">
            <input type="hidden" name="email" value="${email}">
            <button type="submit"
                    id="resendBtn"
                    class="btn btn-primary fs-5 fw-semibold text-uppercase"
                    style="display:none;">
                Resend OTP
            </button>
        </form>

    </div>
</main>

<footer class="bg-primary text-white text-center py-3 mt-auto">
    <p class="mb-0 fw-semibold">© 2026 X-Workz Training Institute</p>
</footer>

<script>
    let timer;
    let seconds = 60;
    let otpSent = ${otpSent == true};

    if (otpSent) {
        startOtpTimer();
    }

    function startOtpTimer() {
        clearInterval(timer);
        seconds = 60;

        document.getElementById("timer").style.display = "block";
        document.getElementById("resendBtn").style.display = "none";
        document.getElementById("sendOtpBtn").disabled = true;

        timer = setInterval(() => {
            document.getElementById("timer").innerHTML =
                "OTP expires in " + seconds + " seconds";

            seconds--;

            if (seconds < 0) {
                clearInterval(timer);
                document.getElementById("timer").innerHTML = "OTP expired";
                document.getElementById("resendBtn").style.display = "block";
            }
        }, 1000);
    }
</script>

</script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
