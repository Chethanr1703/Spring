<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Profile Update Failed</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f4f6f9;
        }
        .error-card {
            max-width: 650px;
            margin: 120px auto;
            border-radius: 10px;
        }
        .error-icon {
            font-size: 64px;
            color: #dc3545;
        }
    </style>
</head>

<body>

<div class="card error-card shadow text-center p-4">
    <div class="card-body">
        <div class="error-icon">✖</div>

        <h3 class="mt-3 text-danger">Profile Update Failed</h3>

        <p class="mt-3">
            We were unable to update your profile due to a technical issue.
            Please review your information and try again.
        </p>

        <div class="mt-4">
            <a href="profile.jsp" class="btn btn-warning px-4">Edit Profile</a>
            <a href="index.jsp" class="btn btn-secondary px-4">Go to Home</a>
        </div>
    </div>
</div>

</body>
</html>
