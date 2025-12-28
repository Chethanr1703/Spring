<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <title>Profile Details</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f4f6f9;
        }
        .profile-card {
            max-width: 900px;
            margin: 80px auto;
            border-radius: 10px;
        }
        .section-title {
            font-weight: 600;
            color: #0d6efd;
            border-bottom: 2px solid #dee2e6;
            margin-bottom: 15px;
            padding-bottom: 5px;
        }
        .label {
            font-weight: 500;
            color: #495057;
        }
    </style>
</head>

<body>
<form action="editProfile">
    <div class="card profile-card shadow">
        <c:if test="${application !=null}">
            <div class="card-header bg-primary text-white text-center">
                <h4>Profile Details</h4>
            </div>

            <div class="card-body">

                <div class="section-title">Personal Details</div>

                <table class="table table-bordered">
                    <tr>
                        <td class="label">First Name</td>
                        <td>${application.firstName}</td>
                    </tr>
                    <tr>
                        <td class="label">Last Name</td>
                        <td>${application.lastName}</td>
                    </tr>
                    <tr>
                        <td class="label">Email</td>
                        <td>${application.email}</td>
                    </tr>
                    <tr>
                        <td class="label">Mobile Number</td>
                        <td>${application.phoneNo}</td>
                    </tr>
                    <tr>
                        <td class="label">Date of Birth</td>
                        <td>${application.dob}</td>
                    </tr>
                    <tr>
                        <td class="label">Gender</td>
                        <td>${application.gender}</td>
                    </tr>
                    <tr>
                        <td class="label">Current Location</td>
                        <td>${application.currentLocation}</td>
                    </tr>
                </table>


                <div class="section-title mt-4">Educational Details</div>

                <table class="table table-bordered">
                    <tr>
                        <td class="label">Highest Qualification</td>
                        <td>${application.qualification}</td>
                    </tr>
                    <tr>
                        <td class="label">Specialization</td>
                        <td>${application.specialization}</td>
                    </tr>
                    <tr>
                        <td class="label">University / College</td>
                        <td>${application.collegeName}</td>
                    </tr>
                    <tr>
                        <td class="label">Year of Passing</td>
                        <td>${application.yearOfPassing}</td>
                    </tr>
                    <tr>
                        <td class="label">Percentage / CGPA</td>
                        <td>${application.cgpa}</td>
                    </tr>
                </table>


                <div class="section-title mt-4">Work Experience</div>

                <table class="table table-bordered">
                    <tr>
                        <td class="label">Experience Level</td>
                        <td>${application.experience}</td>
                    </tr>
                    <tr>
                        <td class="label">Current Company</td>
                        <td>${application.currentCompany}</td>
                    </tr>
                    <tr>
                        <td class="label">Current Role</td>
                        <td>${application.currentRole}</td>
                    </tr>
                    <tr>
                        <td class="label">Primary Skills</td>
                        <td>${application.skills}</td>
                    </tr>
                    <tr>
                        <td class="label">Current Salary</td>
                        <td>${application.currentSalary}</td>
                    </tr>
                    <tr>
                        <td class="label">Technical Summary</td>
                        <td>${application.technicalSummary}</td>
                    </tr>
                </table>


    </div>
    <div class="text-center mt-4">
        <a href="editProfile/${application.email}" class="btn btn-primary px-4">EDIT</a>
        <a href="index.jsp" class="btn btn-primary px-4">Dashboard</a>

        <a href="deleteProfile/${application.email}" class="btn btn-primary px-4">Delete</a>
    </div>
        </c:if>


</form>
</body>
</html>
