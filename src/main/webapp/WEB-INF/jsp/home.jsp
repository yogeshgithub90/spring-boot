<html>
<head>
<jsp:include page="header.jsp"></jsp:include>
</head>
<body>
	<div class="container">
		<button class="accordion">Your Profile</button>
		<div class="panel">
			<table style="width: -webkit-fill-available;">
				<thead>
					<tr>
						<th>Name</th>
						<th>Username</th>
						<th>role</th>
						<th>address</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>${userDto.name}</td>
						<td>${userDto.username}</td>
						<td>${userDto.role}</td>
						<td>${userDto.addresses.address}</td>
					</tr>
				</tbody>
			</table>
		</div>
		<button class="accordion">Your Tasks</button>
		<div class="panel">
		<ul>
			<li>Create your profile</li>
			<li>Create </li>
			<li>Create your profile</li>
			<li>Create your profile</li>
		</ul>
		
	</div>
	<button class="accordion">Your Hobbies</button>
	<div>Your hobbies are - gossiping, talking, stalking, walking and eating..</div>
	</div>


	<!-- /.container -->

	<jsp:include page="footer.jsp"></jsp:include>

</body>

</html>
