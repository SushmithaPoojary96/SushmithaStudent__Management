<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>Add Student</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body>

<div class="container mt-5">

<h2>Add Student</h2>

<form action="StudentController" method="post">

<input type="hidden" name="action" value="add">

<div class="mb-3">

<label>Name</label>

<input type="text" class="form-control" name="name" required>

</div>

<div class="mb-3">

<label>Email</label>

<input type="email" class="form-control" name="email" required>

</div>

<div class="mb-3">

<label>Course</label>

<input type="text" class="form-control" name="course" required>

</div>

<button class="btn btn-success">

Save Student

</button>

<a href="index.jsp" class="btn btn-secondary">

Home

</a>

</form>

</div>

</body>
</html>