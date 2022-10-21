<%@page import="java.util.List"%>
<%@page import="net.javaguides.mvc.model.tourist"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tourist Record</title>
</head>
<body>
 <% List<Tourist> tourist = (List<Tourist>)request.getAttribute("tourist"); %>
 <table border="1" style="width: 50%" height="50%">
  <thead>
   <tr>
    <th>ID</th>
    <th>First Name</th>
    <th>Last Name</th>
   </tr>
  </thead>
  <tbody>
   <!--   for (Todo todo: todos) {  -->
   <% for(Tourist tourist : tourist){ %>
   <tr>
    <td><%=tourist.getId()%></td>
    <td><%=tourist.getFirstName()%></td>
    <td><%=tourist.getLastName()%></td>
   </tr>
   <%} %>
  </tbody>

 </table>
</body>
</html>