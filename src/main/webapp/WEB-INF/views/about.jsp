<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>About Page</title>
  </head>
  <body>
    <h1>About Page</h1>
    <h1>Welcome ${name}</h1>
    <!-- <% String name=(String)request.getAttribute("name"); %> -->
    <!-- <h1>Welcome <%= name %></h1> -->
    <p>This is the home page of the application.</p>
    <c:forEach var="name" items="${versions}">
      <p>${name}</p>
    </c:forEach>
  </body>
</html>
