<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personal Info</title>

<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>

<script type="text/javascript">
	$(document).ready(function(event) {
		$("#submitBtn").click(function(e) {
			//starting ajax call
			$.ajax({
				type : "POST",
				url : window.location + "/personalInfo",
				data : $('form[name=userForm]').serialize(),
				success : function(result) {
					//process the result
					$("#result").html(result);
				},
				error : function() {
					alert("Error occured");
				}
			})
		})
	})
</script>
</head>
<body>
<h1 style="color:red; text-align: center">Personal Info Details</h1>
<h2 style="color:green; text-align: center" id="result"></h2>
<form:form name="userForm" method="POST" modelAttribute="model">
<table>
  <tr>
    <td>UserName:</td>
    <td><form:input path="uname"></form:input></td>
 	</tr>
 	<tr>
 	<td>Email:</td>
    <td><form:input path="email"></form:input></td>
  </tr>
  <tr>
 	<td>Password:</td>
    <td><form:password path="pwd"></form:password></td>
  </tr>
  <tr>
  	<td><input type="reset" value="Reset"></td>
  	<td><input type="button" id="submitBtn" value="Submit"></td>
  </tr>
  
</table>
</form:form>
</body>
</html>