<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Job Portal | Apply Job</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f4f6f9;
        }
        .card {
            border-radius: 10px;
        }
        .section-title {
            font-weight: 600;
            color: #0d6efd;
            border-bottom: 2px solid #dee2e6;
            margin-bottom: 15px;
            padding-bottom: 5px;
        }
        .navbar-brand {
            font-weight: 600;
            letter-spacing: 0.5px;
        }
    </style>
    <script>
        function handleExperienceChange() {
            const experience = document.getElementById("experienceLevel").value;
            const role = document.getElementById("currentRole");
            const salary = document.getElementById("currentSalary");
            const company = document.getElementById("currentCompany");

            if (experience === "Fresher") {
                role.value = "NA";
                salary.value = "NA";
                company.value = "NA";

                role.readOnly = true;
                salary.readOnly = true;
                company.readOnly = true;
            } else {
                role.value = "";
                salary.value = "";
                company.value = "";

                role.readOnly = false;
                salary.readOnly = false;
                company.readOnly = false;
            }
        }
    </script>

</head>

<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary fixed-top shadow">
    <div class="container">
        <a class="navbar-brand" href="#">JobPortal</a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#jobNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="jobNavbar">
            <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Jobs</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Companies</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Profile</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Logout</a>
                </li>
            </ul>
        </div>
    </div>
</nav>


<div style="height:80px;"></div>


<div class="container my-4">
    <div class="card shadow">
        <div class="card-header bg-primary text-white text-center">
            <h4>Job Application Form</h4>
        </div>

        <div class="card-body">
            <form action="saveForm" method="post">


                <div class="section-title">Personal Details</div>

                <div class="row g-3 mb-4">
                    <div class="col-md-4">
                        <label class="form-label">First Name</label>
                        <input type="text" class="form-control" name="firstName">
                    </div>
                    <div class="col-md-4">
                        <label class="form-label">Last Name</label>
                        <input type="text" class="form-control" name="lastName">
                    </div>
                    <div class="col-md-4">
                        <label class="form-label">Email</label>
                        <input type="email" class="form-control" name="email">
                    </div>

                    <div class="col-md-4">
                        <label class="form-label">Mobile Number</label>
                        <input type="number" class="form-control" name="phoneNo">
                    </div>
                    <div class="col-md-4">
                        <label class="form-label">Date of Birth</label>
                        <input type="date" class="form-control" name="dob">
                    </div>
                    <div class="col-md-4">
                        <label class="form-label">Gender</label>
                        <select class="form-select" name="gender">
                            <option selected disabled>Select</option>
                            <option value="male">Male</option>
                            <option value="female">Female</option>
                            <option value="other">Other</option>
                        </select>
                    </div>

                    <div class="col-md-6">
                        <label class="form-label">Current Location</label>
                        <input type="text" class="form-control" name="currentLocation">
                    </div>
                    <div class="col-md-6">
                        <label class="form-label">Resume Upload</label>
                        <input type="file" class="form-control">
                    </div>
                </div>


                <div class="section-title">Educational Details</div>

                <div class="row g-3 mb-4">
                    <div class="col-md-4">
                        <label class="form-label">Highest Qualification</label>
                        <select class="form-select" name="qualification">
                            <option value="B.E / B.Tech">B.E / B.Tech</option>
                            <option value="M.E"> M.E / M.Tech</option>
                            <option value="B.Sc">B.Sc</option>
                            <option value="M.Sc">M.Sc</option>
                            <option value="MCA">MCA</option>
                            <option value="Other">Other</option>
                        </select>
                    </div>

                    <div class="col-md-4">
                        <label class="form-label">Specialization</label>
                        <input type="text" class="form-control" name="specialization">
                    </div>

                    <div class="col-md-4">
                        <label class="form-label">University / College</label>
                        <input type="text" class="form-control" name="collegeName">
                    </div>

                    <div class="col-md-4">
                        <label class="form-label">Year of Passing</label>
                        <input type="number" class="form-control" name="yearOfPassing">
                    </div>

                    <div class="col-md-4">
                        <label class="form-label">Percentage / CGPA</label>
                        <input type="text" class="form-control" name="cgpa">
                    </div>
                </div>


                <div class="section-title">Work Experience</div>

                <div class="row g-3 mb-4">
                    <div class="col-md-4">
                        <label class="form-label">Experience Level</label>
                        <select class="form-select" id="experienceLevel" onchange="handleExperienceChange()" name="experience" >
                            <option value="">Select</option>
                            <option value="Fresher">Fresher</option>
                            <option value="1-2 Years">1-2 Years</option>
                            <option value="3-5 Years">3-5 Years</option>
                            <option value="5+ Years">5+ Years</option>
                        </select>
                    </div>

                    <div class="col-md-4">
                        <label class="form-label">Current Company</label>
                        <input type="text" class="form-control" id="currentCompany" name="currentCompany">
                    </div>

                    <div class="col-md-4">
                        <label class="form-label">Current Role / Designation</label>
                        <input type="text" class="form-control" id="currentRole" name="currentRole">
                    </div>

                    <div class="col-md-6">
                        <label class="form-label">Primary Skills</label>
                        <input type="text" class="form-control" placeholder="Java, Spring MVC, SQL" name="skills">
                    </div>

                    <div class="col-md-3">
                        <label class="form-label">Current Salary (LPA)</label>
                        <input type="text" class="form-control" id="currentSalary" name="currentSalary">
                    </div>


                    <div class="col-md-12">
                        <label class="form-label">Technical Summary</label>
                        <textarea class="form-control" rows="4"
                                  placeholder="Briefly describe your technical skills, tools, frameworks, and project responsibilities"
                                  name="technicalSummary"></textarea>
                    </div>
                </div>

                <div class="text-center">
                    <button type="submit" class="btn btn-success px-5">Save Details</button>
                    <button type="reset" class="btn btn-secondary px-5">Reset</button>
                </div>
            </form>
        </div>
    </div>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
