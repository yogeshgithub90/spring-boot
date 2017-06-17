<html>
<head>
<jsp:include page="header.jsp"></jsp:include>
</head>
<body>
<div class="loginForm">
	<form action="login" method="post">
		<div class="imgcontainer">
			<img src="img_avatar2.png" alt="Avatar" class="avatar">
		</div>

		<div class="container-login">
			<label><b>Username</b></label> <input type="text"
				placeholder="Enter Username" name="username" required> <label><b>Password</b></label>
			<input type="password" placeholder="Enter Password" name="password"
				required>

			<button type="submit">Login</button>
			<input type="checkbox" checked="checked"> Remember me
		</div>

		<div class="container-login" style="background-color: #f1f1f1">
			<button type="button" class="cancelbtn">Cancel</button>
			<span class="psw">Forgot <a href="#">password?</a></span>
		</div>
	</form>
	<h3 style="color: red">${message}</h3>
</div>

	<!-- /.container -->

	<jsp:include page="footer.jsp"></jsp:include>

</body>

</html>
