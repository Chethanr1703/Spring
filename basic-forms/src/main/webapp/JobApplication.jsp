<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false"%>

<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <title>Job Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <h3>Job Application Form</h3>

    <c:if test="${not empty success}">
        <div class="alert alert-success">${success}</div>
    </c:if>

    <form method="post" action="job">

        <div class="mb-2">
            <label>First Name</label>
            <input type="text" name="firstName" value="${job.firstName}" class="form-control"/>
            <span class="text-danger">${firstNameError}</span>
        </div>

        <div class="mb-2">
            <label>Last Name</label>
            <input type="text" name="lastName" value="${job.lastName}" class="form-control"/>
            <span class="text-danger">${lastNameError}</span>
        </div>

        <div class="mb-2">
            <label>Email</label>
            <input type="text" name="email" value="${job.email}" class="form-control"/>
            <span class="text-danger">${emailError}</span>
        </div>

        <div class="mb-2">
            <label>Phone Number</label>
            <input type="text" name="phoneNo" value="${job.phoneNo}" class="form-control"/>
            <span class="text-danger">${phoneNoError}</span>
        </div>

        <div class="mb-2">
            <label>Date of Birth</label>
            <input type="date" name="dob" value="${job.dob}" class="form-control"/>
            <span class="text-danger">${dobError}</span>
        </div>

        <div class="mb-2">
            <label>Gender</label>
            <select name="gender" class="form-control">
                <option value="">Select</option>
                <option value="Male" ${job.gender==
                'Male' ? 'selected' : ''}>Male</option>
                <option value="Female" ${job.gender==
                'Female' ? 'selected' : ''}>Female</option>
                <option value="Other" ${job.gender==
                'Other' ? 'selected' : ''}>Other</option>
            </select>
            <span class="text-danger">${genderError}</span>
        </div>

        <div class="mb-2">
            <label>Qualification</label>
            <input type="text" name="qualification" value="${job.qualification}" class="form-control"/>
            <span class="text-danger">${qualificationError}</span>
        </div>

        <div class="mb-2">
            <label>Experience</label>
            <input type="text" name="experience" value="${job.experience}" class="form-control"/>
            <span class="text-danger">${experienceError}</span>
        </div>

        <button class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
