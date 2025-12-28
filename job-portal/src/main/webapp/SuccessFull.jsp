<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Profile Saved Successfully</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f4f6f9;
        }
        .success-card {
            max-width: 650px;
            margin: 120px auto;
            border-radius: 10px;
        }
        .success-icon {
            font-size: 64px;
            color: #198754;
        }
    </style>
</head>

<body>
<form action="">
    <div class="card success-card shadow text-center p-4">
        <div class="card-body">
            <div class="success-icon">✔</div>

            <h3 class="mt-3 text-success">Profile Saved Successfully</h3>

            <p class="mt-3">
                Your profile details have been saved successfully.
                Recruiters can now view your profile and contact you for suitable job opportunities.
            </p>

            <div class="mt-4">
                <a href="index.jsp" class="btn btn-primary px-4">Go to Home</a>

            </div>
        </div>
    </div>
</form>
</body>
</html>
