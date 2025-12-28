<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Job Portal | Profile</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body { background-color: #f4f6f9; }
        .card { border-radius: 10px; }
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
                role.readOnly = salary.readOnly = company.readOnly = true;
            } else {
                role.readOnly = salary.readOnly = company.readOnly = false;
            }
        }

        window.onload = handleExperienceChange;
    </script>
</head>

<body>

<!-- ================= NAVBAR ================= -->
<nav class="navbar navbar-expand-lg navbar-dark bg-primary fixed-top shadow">
    <div class="container">
        <a class="navbar-brand" href="index.jsp">JobPortal</a>
    </div>
</nav>

<div style="height:80px;"></div>

<!-- ================= FORM ================= -->
<div class="container my-4">
    <div class="card shadow">
        <div class="card-header bg-primary text-white text-center">
            <h4>Profile Details</h4>
        </div>

        <div class="card-body">
            <form action="<%= request.getContextPath()%>/updateApplication" method="post">

                <!-- ================= PERSONAL DETAILS ================= -->
                <div class="section-title">Personal Details</div>

                <div class="row g-3 mb-4">
                    <div class="col-md-4">
                        <label>First Name</label>
                        <input type="text" class="form-control"
                               name="firstName" value="${application.firstName}">
                    </div>

                    <div class="col-md-4">
                        <label>Last Name</label>
                        <input type="text" class="form-control"
                               name="lastName" value="${application.lastName}">
                    </div>

                    <div class="col-md-4">
                        <label>Email</label>
                        <input type="email" class="form-control"
                               name="email" value="${application.email}">
                    </div>

                    <div class="col-md-4">
                        <label>Mobile Number</label>
                        <input type="number" class="form-control"
                               name="phoneNo" value="${application.phoneNo}">
                    </div>

                    <div class="col-md-4">
                        <label>Date of Birth</label>
                        <input type="date" class="form-control"
                               name="dob" value="${application.dob}">
                    </div>

                    <div class="col-md-4">
                        <label>Gender</label>
                        <select class="form-select" name="gender">
                            <option value="male" ${application.gender=='male'?'selected':''}>Male</option>
                            <option value="female" ${application.gender=='female'?'selected':''}>Female</option>
                            <option value="other" ${application.gender=='other'?'selected':''}>Other</option>
                        </select>
                    </div>

                    <div class="col-md-6">
                        <label>Current Location</label>
                        <input type="text" class="form-control"
                               name="currentLocation" value="${application.currentLocation}">
                    </div>
                </div>

                <!-- ================= EDUCATIONAL DETAILS ================= -->
                <div class="section-title">Educational Details</div>

                <div class="row g-3 mb-4">
                    <div class="col-md-4">
                        <label>Highest Qualification</label>
                        <select class="form-select" name="qualification">
                            <option value="B.E / B.Tech" ${application.qualification=='B.E / B.Tech'?'selected':''}>B.E / B.Tech</option>
                            <option value="M.E / M.Tech" ${application.qualification=='M.E / M.Tech'?'selected':''}>M.E / M.Tech</option>
                            <option value="B.Sc" ${application.qualification=='B.Sc'?'selected':''}>B.Sc</option>
                            <option value="M.Sc" ${application.qualification=='M.Sc'?'selected':''}>M.Sc</option>
                            <option value="MCA" ${application.qualification=='MCA'?'selected':''}>MCA</option>
                            <option value="Other" ${application.qualification=='Other'?'selected':''}>Other</option>
                        </select>
                    </div>

                    <div class="col-md-4">
                        <label>Specialization</label>
                        <input type="text" class="form-control"
                               name="specialization" value="${application.specialization}">
                    </div>

                    <div class="col-md-4">
                        <label>College / University</label>
                        <input type="text" class="form-control"
                               name="collegeName" value="${application.collegeName}">
                    </div>

                    <div class="col-md-4">
                        <label>Year of Passing</label>
                        <input type="number" class="form-control"
                               name="yearOfPassing" value="${application.yearOfPassing}">
                    </div>

                    <div class="col-md-4">
                        <label>CGPA / Percentage</label>
                        <input type="text" class="form-control"
                               name="cgpa" value="${application.cgpa}">
                    </div>
                </div>

                <!-- ================= WORK EXPERIENCE ================= -->
                <div class="section-title">Work Experience</div>

                <div class="row g-3 mb-4">
                    <div class="col-md-4">
                        <label>Experience Level</label>
                        <select class="form-select" id="experienceLevel"
                                name="experience" onchange="handleExperienceChange()">
                            <option value="Fresher" ${application.experience=='Fresher'?'selected':''}>Fresher</option>
                            <option value="1-2 Years" ${application.experience=='1-2 Years'?'selected':''}>1-2 Years</option>
                            <option value="3-5 Years" ${application.experience=='3-5 Years'?'selected':''}>3-5 Years</option>
                            <option value="5+ Years" ${application.experience=='5+ Years'?'selected':''}>5+ Years</option>
                        </select>
                    </div>

                    <div class="col-md-4">
                        <label>Current Company</label>
                        <input type="text" class="form-control"
                               id="currentCompany" name="currentCompany"
                               value="${application.currentCompany}">
                    </div>

                    <div class="col-md-4">
                        <label>Current Role</label>
                        <input type="text" class="form-control"
                               id="currentRole" name="currentRole"
                               value="${application.currentRole}">
                    </div>

                    <div class="col-md-6">
                        <label>Primary Skills</label>
                        <input type="text" class="form-control"
                               name="skills" value="${application.skills}">
                    </div>

                    <div class="col-md-3">
                        <label>Current Salary (LPA)</label>
                        <input type="text" class="form-control"
                               id="currentSalary" name="currentSalary"
                               value="${application.currentSalary}">
                    </div>

                    <div class="col-md-12">
                        <label>Technical Summary</label>
                        <textarea class="form-control" rows="4"
                                  name="technicalSummary">${application.technicalSummary}</textarea>
                    </div>
                </div>


                <div class="text-center">
                    <button type="submit" class="btn btn-success px-5">Update Profile</button>

                </div>

            </form>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
