<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<head>
    <title>Student Management Application</title>
</head>
<body>
<div style="text-align: center;">
    <h1>Student Management</h1>
    <h2>
        <a href="app?action=students">List All Students</a>
    </h2>
</div>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Edit Student
                </h2>
            </caption>.

            <c:if test="${student != null}">
                <input type="hidden" name="id" value="<c:out value='${student.id}' />"/>
            </c:if>
            <tr>
                <th>Student Name:</th>
                <td>
                    <input type="text" name="name" size="45"
                           value="<c:out value='${student.name}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Student Email:</th>
                <td>
                    <input type="text" name="email" size="45"
                           value="<c:out value='${student.email}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Student Phone:</th>
                <td>
                    <input type="text" name="phoneNumber" size="45"
                           value="<c:out value='${student.phoneNumber}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Date Of Birth:</th>
                <td>
                    <input type="text" name="dateOfBirth" size="45"
                           value="<c:out value='${student.dateOfBirth}' />"
                    />
                </td>
            </tr><tr>
            <th>Theory Mark:</th>
            <td>
                <input type="text" name="theoryMark" size="45"
                       value="<c:out value='${student.theoryMark}' />"
                />
            </td>
        </tr><tr>
            <th>CaseStudy Mark:</th>
            <td>
                <input type="text" name="caseStudyMark" size="45"
                       value="<c:out value='${student.caseStudyMark}' />"
                />
            </td>
        </tr><tr>
            <th>Practice Mark:</th>
            <td>
                <input type="text" name="practiceMark" size="45"
                       value="<c:out value='${student.practiceMark}' />"
                />
            </td>
        </tr><tr>
            <th>Module :</th>
            <td>
                <input type="text" name="module" size="45"
                       value="<c:out value='${student.module}' />"
                />
            </td>
        </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>