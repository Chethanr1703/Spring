<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false"%>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <title>Course Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2>Course Registration</h2>

    <c:if test="${not empty success}">
        <div class="alert alert-success">${success}</div>
    </c:if>

    <form method="post" action="course">
        <div class="mb-3">
            <label>Name</label>
            <input type="text" name="name" value="${course.name}" class="form-control"/>
            <span class="text-danger">${nameError}</span>
        </div>

        <div class="mb-3">
            <label>Code</label>
            <input type="text" name="code" value="${course.code}" class="form-control"/>
            <span class="text-danger">${codeError}</span>
        </div>

        <div class="mb-3">
            <label>Duration</label>
            <input type="text" name="duration" value="${course.duration}" class="form-control"/>
            <span class="text-danger">${durationError}</span>
        </div>

        <div class="mb-3">
            <label>Instructor</label>
            <input type="text" name="instructor" value="${course.instructor}" class="form-control"/>
            <span class="text-danger">${instructorError}</span>
        </div>

        <div class="mb-3">
            <label>Category</label>
            <input type="text" name="category" value="${course.category}" class="form-control"/>
            <span class="text-danger">${categoryError}</span>
        </div>

        <div class="mb-3">
            <label>Level</label>
            <input type="text" name="level" value="${course.level}" class="form-control"/>
            <span class="text-danger">${levelError}</span>
        </div>

        <div class="mb-3">
            <label>Fees</label>
            <input type="number" step="0.01" name="fees" value="${course.fees}" class="form-control"/>
            <span class="text-danger">${feesError}</span>
        </div>

        <button type="submit" class="btn btn-primary">Register</button>
    </form>
</div>
</body>
</html>
