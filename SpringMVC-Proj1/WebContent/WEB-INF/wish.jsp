<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>

<script type="text/javascript">
	$(document).ready(function(event) {
		$("#Btn").click(function(e) {
			//starting ajax call
			$.ajax({
				type : "GET",
				url : window.location + "/greet",
				success : function(result) {
					//process the result
					$("#msg").html(result);
				},
				error : function() {
					alert("Error occured");
				}
			})
		})
	})
</script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello! This is Spring MVC <br><br>${msg}</h1>
<br>
<input type="button" id="Btn" value="Click Me"><br><br>
<span id="msg"></span><br><br>
<a href="userForm">Input Personal Info</a>
</body>
</html>