<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false"%>

<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>Product Entry</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2>Product Entry</h2>

    <c:if test="${not empty success}">
        <div class="alert alert-success">${success}</div>
    </c:if>

    <form method="post" action="product">
        <div class="mb-3">
            <label>Name</label>
            <input type="text" name="name" value="${product.name}" class="form-control"/>
            <c:if test="${not empty nameError}">
                <span class="text-danger">${nameError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label>Brand</label>
            <input type="text" name="brand" value="${product.brand}" class="form-control"/>
            <c:if test="${not empty brandError}">
                <span class="text-danger">${brandError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label>Category</label>
            <input type="text" name="category" value="${product.category}" class="form-control"/>
            <c:if test="${not empty categoryError}">
                <span class="text-danger">${categoryError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label>Price</label>
            <input type="number" step="0.01" name="price" value="${product.price}" class="form-control"/>
            <c:if test="${not empty priceError}">
                <span class="text-danger">${priceError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label>Quantity</label>
            <input type="number" name="quantity" value="${product.quantity}" class="form-control"/>
            <c:if test="${not empty quantityError}">
                <span class="text-danger">${quantityError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label>Warranty</label>
            <input type="text" name="warranty" value="${product.warranty}" class="form-control"/>
            <c:if test="${not empty warrantyError}">
                <span class="text-danger">${warrantyError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label>Color</label>
            <input type="text" name="color" value="${product.color}" class="form-control"/>
            <c:if test="${not empty colorError}">
                <span class="text-danger">${colorError}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <label>Description</label>
            <input type="text" name="description" value="${product.description}" class="form-control"/>
            <c:if test="${not empty descriptionError}">
                <span class="text-danger">${descriptionError}</span>
            </c:if>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
