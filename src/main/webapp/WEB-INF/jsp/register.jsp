<html>
<head>
<jsp:include page="header.jsp"></jsp:include>
</head>
<body>
	<div class="loginForm">
		<form action="register" method="post">
			<div class="imgcontainer">
				<img src="img_avatar2.png" alt="Avatar" class="avatar">
			</div>

			<div class="container-login">
				<label><b>Name</b></label> <input type="text"
					placeholder="Enter Name" name="name" required> <label><b>Username</b></label>
				<input type="text" placeholder="Enter Username" name="username"
					required> <label><b>Password</b></label> <input
					type="password" placeholder="Enter Password" name="password"
					required> <label><b>Address</b></label> <input type="text"
					placeholder="address" name="address" required>
				<button type="submit">Register</button>
			</div>

			<div class="container-login" style="background-color: #f1f1f1">
				<button type="button" class="cancelbtn">Cancel</button>
			</div>
		</form>

	</div>


	<!-- /.container -->

	<jsp:include page="footer.jsp"></jsp:include>

</body>

</html>
