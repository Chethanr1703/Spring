<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JobPortal | Find Your Dream Job</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f4f6f9;
        }
        .hero {
            background: linear-gradient(135deg, #0d6efd, #0b5ed7);
            color: white;
            padding: 100px 0;
        }
        .hero h1 {
            font-weight: 700;
        }
        .search-box {
            background: white;
            border-radius: 8px;
            padding: 20px;
        }
        .feature-icon {
            font-size: 30px;
            color: #0d6efd;
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
        <a class="navbar-brand" href="#">JobPortal</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarMain">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarMain">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link active" href="#">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Jobs</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Companies</a></li>
                <li class="nav-item"><a class="nav-link" href="getProfileByEmail.jsp">GetProfile</a></li>
                <li class="nav-item">
                    <a class="btn btn-light btn-sm ms-2" href="ApplicationForm.jsp">Register</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Spacer -->
<div style="height:70px;"></div>

<!-- ================= HERO SECTION ================= -->
<section class="hero text-center">
    <div class="container">
        <h1>Find Your Dream Job</h1>
        <p class="lead mt-3">Search thousands of jobs from top companies across India</p>

        <div class="search-box mt-4 shadow mx-auto col-md-10">
            <div class="row g-2">
                <div class="col-md-4">
                    <input type="text" class="form-control" placeholder="Job title / Skills">
                </div>
                <div class="col-md-4">
                    <input type="text" class="form-control" placeholder="Location">
                </div>
                <div class="col-md-4 d-grid">
                    <button class="btn btn-primary">Search Jobs</button>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- ================= FEATURES ================= -->
<section class="container my-5">
    <div class="row text-center">
        <div class="col-md-4">
            <div class="card shadow-sm">
                <div class="card-body">
                    <div class="feature-icon">💼</div>
                    <h5 class="mt-3">Latest Jobs</h5>
                    <p>Find jobs that match your skills and experience.</p>
                </div>
            </div>
        </div>

        <div class="col-md-4">
            <div class="card shadow-sm">
                <div class="card-body">
                    <div class="feature-icon">📄</div>
                    <h5 class="mt-3">Easy Apply</h5>
                    <p>Apply for jobs quickly with your profile and resume.</p>
                </div>
            </div>
        </div>

        <div class="col-md-4">
            <div class="card shadow-sm">
                <div class="card-body">
                    <div class="feature-icon">🏢</div>
                    <h5 class="mt-3">Top Companies</h5>
                    <p>Get hired by trusted companies across industries.</p>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- ================= CALL TO ACTION ================= -->
<section class="bg-white py-5">
    <div class="container text-center">
        <h3>Ready to take the next step in your career?</h3>
        <p class="mb-4">Create your profile and apply for jobs today</p>
        <a href="ApplicationForm.jsp" class="btn btn-success btn-lg">Create Profile</a>
    </div>
</section>

<!-- ================= FOOTER ================= -->
<footer class="bg-dark text-white text-center py-3">
    <p class="mb-0">© 2025 JobPortal. All rights reserved.</p>
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
