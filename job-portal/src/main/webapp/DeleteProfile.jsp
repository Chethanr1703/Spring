<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Profile Deleted</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f4f6f9;
        }
        .card {
            max-width: 600px;
            margin: 140px auto;
            border-radius: 10px;
        }
        .icon {
            font-size: 60px;
            color: #dc3545;
        }
        .navbar-brand {
            font-weight: 600;
        }
    </style>
</head>

<body>

<!-- ================= NAVBAR ================= -->
<nav class="navbar navbar-expand-lg navbar-dark bg-primary fixed-top shadow">
    <div class="container">
        <a class="navbar-brand" href="index.jsp">JobPortal</a>
    </div>
</nav>

<div style="height:80px;"></div>

<!-- ================= MESSAGE ================= -->
<div class="card shadow text-center p-4">
    <div class="card-body">
        <div class="icon">✔</div>

        <h4 class="mt-3 text-danger">Your profile is deleted</h4>

        <p class="mt-3">
            Your profile has been successfully removed from our system.
        </p>

        <div class="mt-4">
            <a href="index.jsp" class="btn btn-primary px-4">
                Go to Home
            </a>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
