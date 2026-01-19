<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false"%>

<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <title>User Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <h3>User Registration Form</h3>

    <c:if test="${not empty success}">
        <div class="alert alert-success">${success}</div>
    </c:if>

    <form method="post" action="userRegistration">
        <div class="mb-2">
            <label>First Name</label>
            <input type="text" name="firstName" value="${user.firstName}" class="form-control"/>
            <span class="text-danger">${firstNameError}</span>
        </div>

        <div class="mb-2">
            <label>Last Name</label>
            <input type="text" name="lastName" value="${user.lastName}" class="form-control"/>
            <span class="text-danger">${lastNameError}</span>
        </div>

        <div class="mb-2">
            <label>Email</label>
            <input type="text" name="email" value="${user.email}" class="form-control"/>
            <span class="text-danger">${emailError}</span>
        </div>

        <div class="mb-2">
            <label>Phone</label>
            <input type="text" name="phoneNo" value="${user.phoneNo}" class="form-control"/>
            <span class="text-danger">${phoneNoError}</span>
        </div>

        <div class="mb-2">
            <label>Date of Birth</label>
            <input type="date" name="dob" value="${user.dob}" class="form-control"/>
            <span class="text-danger">${dobError}</span>
        </div>

        <div class="mb-2">
            <label>Gender</label>
            <select name="gender" class="form-control">
                <option value="">Select Gender</option>
                <option value="Male" ${user.gender == 'Male' ? 'selected' : ''}>Male</option>
                <option value="Female" ${user.gender == 'Female' ? 'selected' : ''}>Female</option>
                <option value="Other" ${user.gender == 'Other' ? 'selected' : ''}>Other</option>
            </select>
            <span class="text-danger">${genderError}</span>
        </div>

        <div class="mb-2">
            <label>Address</label>
            <input type="text" name="address" value="${user.address}" class="form-control"/>
            <span class="text-danger">${addressError}</span>
        </div>

        <div class="mb-2">
            <label>City</label>
            <input type="text" name="city" value="${user.city}" class="form-control"/>
            <span class="text-danger">${cityError}</span>
        </div>

        <div class="mb-2">
            <label>State</label>
            <input type="text" name="state" value="${user.state}" class="form-control"/>
            <span class="text-danger">${stateError}</span>
        </div>

        <div class="mb-2">
            <label>Country</label>
            <input type="text" name="country" value="${user.country}" class="form-control"/>
            <span class="text-danger">${countryError}</span>
        </div>

        <button class="btn btn-primary">Register</button>
    </form>
</div>
</body>
</html>
