<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>Bank Account Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2>Bank Account Registration</h2>

    <c:if test="${not empty success}">
        <div class="alert alert-success">${success}</div>
    </c:if>

    <form method="post" action="bank">

        <div class="mb-3">
            <label>Holder Name</label>
            <input type="text" name="holderName" value="${bank.holderName}" class="form-control"/>
            <c:if test="${not empty holderNameError}">
                <span class="text-danger">${holderNameError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label>Account Number</label>
            <input type="text" name="accountNo" value="${bank.accountNo}" class="form-control"/>
            <c:if test="${not empty accountNoError}">
                <span class="text-danger">${accountNoError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label>IFSC</label>
            <input type="text" name="ifsc" value="${bank.ifsc}" class="form-control"/>
            <c:if test="${not empty ifscError}">
                <span class="text-danger">${ifscError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label>Bank Name</label>
            <input type="text" name="bankName" value="${bank.bankName}" class="form-control"/>
            <c:if test="${not empty bankNameError}">
                <span class="text-danger">${bankNameError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label>Branch</label>
            <input type="text" name="branch" value="${bank.branch}" class="form-control"/>
            <c:if test="${not empty branchError}">
                <span class="text-danger">${branchError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label>Aadhaar</label>
            <input type="text" name="aadhaar" value="${bank.aadhaar}" class="form-control"/>
            <c:if test="${not empty aadhaarError}">
                <span class="text-danger">${aadhaarError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label>PAN</label>
            <input type="text" name="pan" value="${bank.pan}" class="form-control"/>
            <c:if test="${not empty panError}">
                <span class="text-danger">${panError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label>Balance</label>
            <input type="number" step="0.01" name="balance" value="${bank.balance}" class="form-control"/>
            <c:if test="${not empty balanceError}">
                <span class="text-danger">${balanceError}</span>
            </c:if>
        </div>

        <button type="submit" class="btn btn-primary">Register</button>
    </form>
</div>
</body>
</html>
