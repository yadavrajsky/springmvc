<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Upload Form</title>
    <link href="<c:url value="/resources/global.css" />" type="text/css" rel="stylesheet">
</head>
<body>
    <header>${Header}</header>
    <h1>Upload Form</h1>
    <form action="filesubmit" method="post" enctype="multipart/form-data">
        <label for="file">File:</label>
        <input type="file" id="file" name="file" required><br><br>
        
        <input type="submit" value="Submit">
    </form>
    <footer>${Footer}</footer>
</html>