<%@ page language="java" import="java.util.*,model.Student"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>View Students</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body>

<div class="container mt-5">

<h2>Student List</h2>

<table class="table table-bordered">

<tr>

<th>ID</th>

<th>Name</th>

<th>Email</th>

<th>Course</th>

<th>Action</th>

</tr>

<%

List<Student> students=(List<Student>)request.getAttribute("students");

if(students!=null){

for(Student s:students){

%>

<tr>

<td><%=s.getId()%></td>

<td><%=s.getName()%></td>

<td><%=s.getEmail()%></td>

<td><%=s.getCourse()%></td>

<td>

<a href="StudentController?action=edit&id=<%=s.getId()%>" class="btn btn-warning btn-sm">

Edit

</a>

<a href="StudentController?action=delete&id=<%=s.getId()%>"

class="btn btn-danger btn-sm"

onclick="return confirm('Delete Student?')">

Delete

</a>

</td>

</tr>

<%

}

}

%>

</table>

<a href="addStudent.jsp" class="btn btn-success">

Add Student

</a>

<a href="index.jsp" class="btn btn-secondary">

Home

</a>

</div>

</body>

</html>