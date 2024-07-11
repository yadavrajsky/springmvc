<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Contact Form</title>
    <link href="<c:url value="/resources/global.css" />" type="text/css" rel="stylesheet">
</head>
<body>
    <header>${Header}</header>
    <h1>Contact Form</h1>
    <form action="submit" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>
        
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br><br>
        
        <label for="phone">Phone:</label>
        <input type="text" id="phone" name="phone" required><br><br>

        <label for="age">Age:</label>
        <input type="text" id="age" name="age" required><br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>
        
        <input type="submit" value="Submit">
    </form>
    <form:errors path="user.*" />
    <footer>${Footer}</footer>
</body>
</html>