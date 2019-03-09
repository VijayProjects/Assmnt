<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Case Worker Registration</title>
</head>
<body>
	<h2>Case Worker Registration</h2><br>
	<h2>${cw_reg_msg}</h2>
	<form:form action="cwReg" method="POST" modelAttribute="cwModel">
		<table>
			<tr>
				<td>First Name:</td>
				<td><form:input path="fName"/></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input path="lName"/></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td>
					<form:radiobutton path="gender" label="Male" value="M"/>
					<form:radiobutton path="gender" label="Fe-Male" value="F"/>
				</td>
			</tr>
			<tr>
				<td>SSN:</td>
				<td><form:input path="ssn"/></td>
			</tr>
			<tr>
				<td>Date of Birth:</td>
				<td><form:input path="dob"/></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:password path="pwd"/></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><form:input path="phno"/></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>