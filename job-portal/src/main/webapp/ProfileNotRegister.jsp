<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Profile Not Registered</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npmbootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f4f6f9;
        }
        .card {
            max-width: 650px;
            margin: 120px auto;
            border-radius: 10px;
        }
        .icon {
            font-size: 64px;
            color: #dc3545;
        }
        .navbar-brand {
            font-weight: 600;
            letter-spacing: 0.5px;
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

<!-- Spacer -->
<div style="height:80px;"></div>

<!-- ================= CONTENT ================= -->
<div class="card shadow text-center p-4">
    <div class="card-body">
        <div class="icon">⚠</div>

        <h3 class="mt-3 text-danger">Profile Not Registered</h3>

        <p class="mt-3">
            We could not find any profile associated with the provided email address.
            Please create your profile to access job opportunities.
        </p>

        <div class="mt-4">
            <a href="profile.jsp" class="btn btn-success px-4">Create Profile</a>
            <a href="index.jsp" class="btn btn-secondary px-4">Go to Home</a>
        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
