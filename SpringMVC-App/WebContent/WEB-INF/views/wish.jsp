<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
					$("#resId").html(result);
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
	<h1>${msg}</h1>

	<input type="button" value="Click Here" id="Btn">
	<br />
	<span id="resId"></span>
</body>
</html>