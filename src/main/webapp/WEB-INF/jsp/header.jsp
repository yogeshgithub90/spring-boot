<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />

<!-- 
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<link
	href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<link href="/js-image-slider.css" rel="stylesheet" type="text/css" />
<script src="/js-image-slider.js" type="text/javascript"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jQuery-Flip/1.1.2/jquery.flip.min.js"></script>

</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="/">YogEapp</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="/weather">Weather</a></li>
					<li class="active"><a href="/horoscope">Horoscope</a></li>
					<li class="active"><a href="/health">Health</a></li>
					<li class="active"><a href="/technology">Technology</a></li>
					<li class="active"><a href="#about">About Us.</a></li>
					<li class="active"><a href="/login">Login here.</a></li>
					<li class="active"><a href="/register">New user?, register here.</a></li>
				</ul>
			</div>
		</div>
	</nav>
	
	<script type="text/javascript"
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>