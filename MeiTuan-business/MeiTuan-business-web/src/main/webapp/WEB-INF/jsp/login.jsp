<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>登录 | 美团外卖</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/mycss/base.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/mycss/login.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/myjs/login.js"></script>
</head>
<body>
	<form action="${pageContent.request.contextPath }/business/loginValidate" method="post" id="loginForm" onsubmit="return checkNull()">
		<div id="login_logo">
			<img src="${pageContext.request.contextPath }/images/login/kang.png">
		</div>
		<div id="login_left">
			<img src="${pageContext.request.contextPath }/images/login/backg.png">
		</div>
		<div id="login_right">
			<div id="legend">
				<span>账号登录</span>
				<span class="font_size">
					<a href="${pageContext.request.contextPath}/business/register">免费注册</a>
				</span>
			</div>
			<center>
				<input type="text" name="telephone" id="userName" placeholder="手机号/用户名/邮箱" onblur="judgeUserName();">
				<img src="${pageContext.request.contextPath }/images/login/san.png" class="triangle position" id="triangle1">
				<div class="judge position" id="judge1">用户名不能为空哦！</div>
				<br/>
				<input type="password" name="loginPassword" id="password" placeholder="密码" onblur="judgePassword();">
				<img src="${pageContext.request.contextPath }/images/login/san.png" class="triangle position" id="triangle2">
				<div class="judge position" id="judge2">登录密码不能为空哦！</div>
				<br/>
				<input type="submit" value="login" id="register">
			</center>
			<div id="protocol">
				<p class="font_size">
					提示： 未注册美团账号的手机号，登录时将自动注册美团账号，且代表您已同意<a href="">&lt;&lt;美团网用户协议&gt;&gt;</a>
				</p>
			</div>
			<div class="font_size">
				<hr>用合作网站账号登录<hr>
				<center>
					<a href=""><img src="${pageContext.request.contextPath }/images/login/Q.png" class="bottom_img"></a>
					<a href=""><img src="${pageContext.request.contextPath }/images/login/B.png" class="bottom_img"></a>
				</center>
			</div>
		</div>
	</form>
</body>
</html>