<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false"%>

<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>Employee Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2>Employee Registration</h2>

    <c:if test="${not empty success}">
        <div class="alert alert-success">${success}</div>
    </c:if>

    <form method="post" action="employee">
        <div class="mb-3">
            <label for="name">Name</label>
            <input type="text" id="name" name="name" value="${employee.name}" class="form-control"/>
            <c:if test="${not empty nameError}">
                <span class="text-danger">${nameError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label for="email">Email</label>
            <input type="text" id="email" name="email" value="${employee.email}" class="form-control"/>
            <c:if test="${not empty emailError}">
                <span class="text-danger">${emailError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label for="phone">Phone</label>
            <input type="text" id="phone" name="phone" value="${employee.phone}" class="form-control"/>
            <c:if test="${not empty phoneError}">
                <span class="text-danger">${phoneError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label for="department">Department</label>
            <input type="text" id="department" name="department" value="${employee.department}" class="form-control"/>
            <c:if test="${not empty departmentError}">
                <span class="text-danger">${departmentError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label for="designation">Designation</label>
            <input type="text" id="designation" name="designation" value="${employee.designation}" class="form-control"/>
            <c:if test="${not empty designationError}">
                <span class="text-danger">${designationError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label for="salary">Salary</label>
            <input type="number" id="salary" name="salary" value="${employee.salary}" class="form-control"/>
            <c:if test="${not empty salaryError}">
                <span class="text-danger">${salaryError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label for="experience">Experience</label>
            <input type="number" id="experience" name="experience" value="${employee.experience}" class="form-control"/>
            <c:if test="${not empty experienceError}">
                <span class="text-danger">${experienceError}</span>
            </c:if>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
