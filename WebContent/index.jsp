<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	//jquery就绪事件
	$(function() {
		//按钮点击事件
		$("#but1").click(function() {
			//使用ajax请求数据
			$.ajax({
				type:"post",								//提交方式
				url:"getdata.do",								//提交路径
				data:"loginname=aaaddd&password=abc123",	//提交的数据内容
				dataType:"text",							//服务器返回到ajax的数据类型 text文本数据类型
				async:true,									//是否异步，true异步	，false同步
				//成功 执行回调函数方法，回调函数中的参数msg为服务器响应回来的数据
				success:function(msg){
					//把服务器响应回的信息 通过text方式传给页面
					$("#sp").text(msg);
				},
				//服务器响应失败执行的函数方法
				error:function(){
					alert("响应失败！");
				}
			});
		});
	});
</script>
</head>
<body>
<button id="but1">Ajax事件1</button>
<span id="sp"></span>
</body>
</html>