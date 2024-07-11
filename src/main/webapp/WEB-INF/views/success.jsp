<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Success Page</title>
</head>
<body>
    <h1>${Header}</h1>
    <h1>User Details</h1>
    <table>
        <tr>
            <th>Username:</th>
            <td>${user.username}</td>
        </tr>
        <tr>
            <th>Name:</th>
            <td>${user.name}</td>
        </tr>
        <tr>
            <th>Email:</th>
            <td>${user.email}</td>
        </tr>
        <tr>
            <th>Password:</th>
            <td>${user.password}</td>
        </tr>
    </table>
    <footer>${Footer}
        ${res}
    </footer>
</body>
</html>