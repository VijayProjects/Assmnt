<script src="./js/jquery-1.11.1.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#name").keyup(function() {
			var enterdTxt = $("#name").val();
			$.ajax({
				url : "WishMsgServlet",
				data : {
					name : enterdTxt
				},
				success : function(responseText) {
					$("#response").empty();
					$("#response").append(responseText);
				}
			});
		});
	});
</script>
</head>
<body>
	Enter Name :
	<input type="text" name="name" id="name" />
	<hr />
	<div id="response"></div>
</body>
</html>