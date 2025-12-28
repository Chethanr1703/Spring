<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Job Portal | Get Profile</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f4f6f9;
        }
        .card {
            max-width: 450px;
            margin: 120px auto;
            border-radius: 10px;
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

<!-- Spacer for fixed navbar -->
<div style="height:80px;"></div>

<!-- ================= EMAIL FORM ================= -->
<div class="card shadow">
    <div class="card-header bg-primary text-white text-center">
        <h5>View Profile</h5>
    </div>

    <div class="card-body">
        <form action="getProfile" method="get">

            <div class="mb-3">
                <label class="form-label">Email Address</label>
                <input type="email"
                       class="form-control"
                       name="email"
                       placeholder="Enter your registered email"
                       required>
            </div>

            <div class="d-grid">
                <button type="submit" class="btn btn-success">
                    Get Profile
                </button>
            </div>

        </form>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
