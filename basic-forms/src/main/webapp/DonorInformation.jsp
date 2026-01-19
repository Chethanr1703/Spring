<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false"%>

<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <title>Donor Information</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <h3>Donor Information Form</h3>

    <c:if test="${not empty success}">
        <div class="alert alert-success">${success}</div>
    </c:if>

    <form method="post" action="donor">
        <div class="mb-2">
            <label>Donor Name</label>
            <input type="text" name="donorName" value="${donor.donorName}" class="form-control"/>
            <span class="text-danger">${donorNameError}</span>
        </div>

        <div class="mb-2">
            <label>Email</label>
            <input type="text" name="email" value="${donor.email}" class="form-control"/>
            <span class="text-danger">${emailError}</span>
        </div>

        <div class="mb-2">
            <label>Phone</label>
            <input type="text" name="phone" value="${donor.phone}" class="form-control"/>
            <span class="text-danger">${phoneError}</span>
        </div>

        <div class="mb-2">
            <label>Blood Group</label>
            <input type="text" name="bloodGroup" value="${donor.bloodGroup}" class="form-control"/>
            <span class="text-danger">${bloodGroupError}</span>
        </div>

        <div class="mb-2">
            <label>Address</label>
            <input type="text" name="address" value="${donor.address}" class="form-control"/>
            <span class="text-danger">${addressError}</span>
        </div>

        <div class="mb-2">
            <label>City</label>
            <input type="text" name="city" value="${donor.city}" class="form-control"/>
            <span class="text-danger">${cityError}</span>
        </div>

        <div class="mb-2">
            <label>State</label>
            <input type="text" name="state" value="${donor.state}" class="form-control"/>
            <span class="text-danger">${stateError}</span>
        </div>

        <div class="mb-2">
            <label>Country</label>
            <input type="text" name="country" value="${donor.country}" class="form-control"/>
            <span class="text-danger">${countryError}</span>
        </div>

        <button class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
