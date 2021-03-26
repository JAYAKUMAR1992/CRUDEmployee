<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management</title>
</head>
<body>
 <h1>Employee Data</h1>
 
 <table border="1">
 <th>ID</th>
 <th>Name</th>
 <th>Date Of Joining</th>
 <th>Date Of Birth</th>
 <th>Address</th>
<c:forEach items="${employeeList}" var="employee">
 <tr>
 <td>${employee.empId}</td>
 <td>${employee.name}</td>
 <td>${employee.doj}</td>
 <td>${employee.dob}</td>
 <td>${employee.address}</td>
 </tr>
 </c:forEach>
 </table>

 <br>

<form:form action="employee.do" method="POST" commandName="employee">
 <table>
   <tr>
     <td>Employee ID</td>
     <td><form:input path="empId"/></td>
 </tr>
 <tr>
     <td>Name</td>
     <td><form:input path="name"/></td>
 </tr>
 <tr>
     <td>Date Of Joining</td>
     <td><form:input path="doj"/></td>
 </tr>
 <tr>
     <td>Date Of Birth</td>
     <td><form:input path="dob"/></td>
 </tr>
 <tr>
     <td>Address</td>
     <td><form:input path="address"/></td>
 </tr>
 <tr>
 <td colspan="2">
 <input type="submit" name="action" value="Add"/>
  <input type="submit" name="action" value="Edit"/>
   <input type="submit" name="action" value="Delete"/>
    <input type="submit" name="action" value="Search"/>
 </td> </tr> </table>
 </form:form>

</body>
</html>