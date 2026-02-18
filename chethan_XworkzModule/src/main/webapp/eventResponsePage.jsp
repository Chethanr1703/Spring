<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Event Response</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5 text-center">

    <div class="card shadow p-4">

        <h4 class="mb-4">Will you attend this event?</h4>

        <c:if test="${not empty msg}">
            <div class="alert alert-success text-center fw-semibold">
                ${msg}
            </div>
        </c:if>
        <c:if test="${not empty error}">
            <div class="text-center fw-bold text-danger">
                ${error}
            </div>
        </c:if>

        <form action="submitResponse" method="post">

            <input type="hidden" name="eventId" value="${eventId}">
            <input type="hidden" name="email" value="${email}">


            <button type="submit"
                    name="response"
                    value="ATTENDING"
                    class="btn btn-success m-2 px-4">
                ✅ Attending
            </button>

            <button type="submit"
                    name="response"
                    value="NOT_ATTENDING"
                    class="btn btn-danger m-2 px-4">
                ❌ Not Attending
            </button>

        </form>

    </div>

</div>

</body>
</html>
