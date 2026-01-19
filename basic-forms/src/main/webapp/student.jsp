<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false"%>
<html lang="en">
<head>
    <title>Student Registration</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">

            <div class="card shadow">
                <div class="card-header bg-primary text-white text-center">
                    <h4>Student Registration</h4>
                </div>

                <div class="card-body">

                    <div class="text-success text-center mb-3">
                        ${success}
                    </div>

                    <form action="student" method="post">

                        <div class="mb-3">
                            <label class="form-label">Name</label>
                            <input type="text" name="name" class="form-control"/>
                            <small class="text-danger">${nameError}</small>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Email</label>
                            <input type="text" name="email" class="form-control"/>
                            <small class="text-danger">${emailError}</small>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Phone</label>
                            <input type="number" name="phone" class="form-control"/>
                            <small class="text-danger">${phoneError}</small>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Age</label>
                            <input type="number" name="age" class="form-control"/>
                            <small class="text-danger">${ageError}</small>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">College</label>
                            <input type="text" name="college" class="form-control"/>
                            <small class="text-danger">${collegeError}</small>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Branch</label>
                            <input type="text" name="branch" class="form-control"/>
                            <small class="text-danger">${branchError}</small>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Semester</label>
                            <input type="number
" name="semester" class="form-control"/>
                            <small class="text-danger">${semesterError}</small>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">City</label>
                            <input type="text" name="city" class="form-control"/>
                            <small class="text-danger">${cityError}</small>
                        </div>

                        <div class="d-grid">
                            <input type="submit" value="Register" class="btn btn-primary"/>
                        </div>

                    </form>

                </div>
            </div>

        </div>
    </div>
</div>

</body>
</html>
