<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#but1").click(function() {
			$.get(
				"json.do",
				"name=aa&password=123",
				function(msg) {
					$("#sp").text(msg);
				},
				"text"
			);
		});
	});
</script>
</head>
<body>
<button id="but1">Ajax事件2</button>
<span id="sp"></span>
</body>
</html>