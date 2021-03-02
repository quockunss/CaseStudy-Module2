<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<head>
    <title>Student Management Application</title>
</head>
<body>
<div style="text-align: center;">
    <h1>Student Management</h1>
    <h2>
        <a href="/app?action=create">Add New Student</a>
    </h2>
</div>
<div align="center">
    <table border="1" cellpadding="5">
        <h2>List of Students</h2>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>date of birth</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="student" items="${listStudent}">
            <tr>
                <td><c:out value="${student.id}"/></td>
                <td><c:out value="${student.name}"/></td>
                <td><c:out value="${student.email}"/></td>
                <td><c:out value="${student.phoneNumber}"/></td>
                <td><c:out value="${student.dateOfBirth}"/></td>
                <td>
                    <a href="/app?action=edit&id=${student.id}">Edit</a>
                    <a href="/app?action=delete&id=${student.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
