<%@ page language="java" import="model.Student"%>

<%

Student student=(Student)request.getAttribute("student");

%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Edit Student</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body>

<div class="container mt-5">

<h2>Edit Student</h2>

<form action="StudentController" method="post">

<input type="hidden" name="action" value="update">

<input type="hidden" name="id" value="<%=student.getId()%>">

<div class="mb-3">

<label>Name</label>

<input type="text"

class="form-control"

name="name"

value="<%=student.getName()%>">

</div>

<div class="mb-3">

<label>Email</label>

<input type="email"

class="form-control"

name="email"

value="<%=student.getEmail()%>">

</div>

<div class="mb-3">

<label>Course</label>

<input type="text"

class="form-control"

name="course"

value="<%=student.getCourse()%>">

</div>

<button class="btn btn-primary">

Update Student

</button>

<a href="StudentController?action=list"

class="btn btn-secondary">

Back

</a>

</form>

</div>

</body>

</html>