<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Management System</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container mt-5">

    <h2 class="text-center text-primary">
        Student Management System
    </h2>

    <hr>

    <div class="text-center">

        <a href="addStudent.jsp" class="btn btn-success">
            Add Student
        </a>

        <a href="StudentController?action=list" class="btn btn-primary">
            View Students
        </a>

    </div>

</div>

</body>
</html>