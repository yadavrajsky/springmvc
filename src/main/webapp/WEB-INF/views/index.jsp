<%@ page contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Home Page</title>
  </head>
  <body>
    <% String name=(String)request.getAttribute("name"); %> 
    <h1>Welcome <%= name %> </h1>
    <p>This is the home page of the application.</p>
  </body>
</html>
