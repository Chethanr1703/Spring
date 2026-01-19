<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false"%>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>Event Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2>Event Registration</h2>

    <c:if test="${not empty success}">
        <div class="alert alert-success">${success}</div>
    </c:if>

    <form method="post" action="event">

        <div class="mb-3">
            <label>Name</label>
            <input type="text" name="name" value="${event.name}" class="form-control"/>
            <span class="text-danger">${nameError}</span>
        </div>

        <div class="mb-3">
            <label>Email</label>
            <input type="text" name="email" value="${event.email}" class="form-control"/>
            <span class="text-danger">${emailError}</span>
        </div>

        <div class="mb-3">
            <label>Phone</label>
            <input type="text" name="phone" value="${event.phone}" class="form-control"/>
            <span class="text-danger">${phoneError}</span>
        </div>

        <div class="mb-3">
            <label>Event Name</label>
            <input type="text" name="eventName" value="${event.eventName}" class="form-control"/>
            <span class="text-danger">${eventNameError}</span>
        </div>

        <div class="mb-3">
            <label>Location</label>
            <input type="text" name="location" value="${event.location}" class="form-control"/>
            <span class="text-danger">${locationError}</span>
        </div>

        <div class="mb-3">
            <label>Date</label>
            <input type="date" name="date" value="${event.date}" class="form-control"/>
            <span class="text-danger">${dateError}</span>
        </div>


        <button type="submit" class="btn btn-primary">Register</button>
    </form>
</div>
</body>
</html>
