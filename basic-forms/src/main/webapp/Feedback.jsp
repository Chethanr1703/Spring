<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false"%>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <title>Feedback</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <h3>Feedback Form</h3>

    <c:if test="${not empty success}">
        <div class="alert alert-success">${success}</div>
    </c:if>

    <form method="post" action="feedback">

        <div class="mb-2">
            <label>Name</label>
            <input type="text" name="name" value="${feedback.name}" class="form-control"/>
            <span class="text-danger">${nameError}</span>
        </div>

        <div class="mb-2">
            <label>Email</label>
            <input type="text" name="email" value="${feedback.email}" class="form-control"/>
            <span class="text-danger">${emailError}</span>
        </div>

        <div class="mb-2">
            <label>Phone</label>
            <input type="text" name="phone" value="${feedback.phone}" class="form-control"/>
            <span class="text-danger">${phoneError}</span>
        </div>

        <div class="mb-2">
            <label>Subject</label>
            <input type="text" name="subject" value="${feedback.subject}" class="form-control"/>
            <span class="text-danger">${subjectError}</span>
        </div>

        <div class="mb-2">
            <label>Rating (1–5)</label>
            <input type="number" name="rating" value="${feedback.rating}" class="form-control"/>
            <span class="text-danger">${ratingError}</span>
        </div>

        <div class="mb-2">
            <label>Message</label>
            <textarea name="message" class="form-control">${feedback.message}</textarea>
            <span class="text-danger">${messageError}</span>
        </div>

        <button class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
