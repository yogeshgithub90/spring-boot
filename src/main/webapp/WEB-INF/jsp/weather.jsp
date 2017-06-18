<html>
<head>
<jsp:include page="header.jsp"></jsp:include>
<script>
	$(function() {
		$(".flip").flip({
			trigger : 'hover',
			axis : 'y'
		});
	});
</script>
</head>
<body>
	<div style="display:-webkit-inline-box;width: 350px;margin-left: 290px;">
		<div class="flip">
			<div class="front">
				<img src="/cloud1.jpg" alt="" />
			</div>
			<div class="back">
				<h3>Cloudy Weather</h3>
			</div>
		</div>
		<div class="flip">
			<div class="front">
				<img src="/cloud2.jpg" alt="" />
			</div>
			<div class="back">
				<h3>Wind Stormmmmm!!!!</h3>
			</div>
		</div>
	</div>
	<div class="container">
		<button class="accordion">Weather Today</button>
		<div class="panel">Today's weather is very pretty, the decent
			temperature of 25 degrees is quite pleasant. The normal wind is
			blowing , not at very high speeds though. weather is going to be
			cloudy today.</div>
		<button class="accordion">Weather Forecast</button>
		<div class="panel">Weather in the coming days is going to be a
			little hot, the day wise temperatures are going to cross 29 degrees
			is quite pleasant. The normal wind is blowing , not at very high
			speeds though. weather is going to be cloudy today.</div>
		<button class="accordion">Weather this week</button>
		<div class="panel">This week weather is going to be very pretty,
			the decent temperature of 25 degrees is quite pleasant. The normal
			wind is blowing , not at very high speeds though. weather is going to
			be cloudy this week.</div>
		<button class="accordion">Weather this Month</button>
		<div class="panel">Weather this month is going to be a little
			hot, the temperature mark of 25 degrees is likely to be crossed. The
			normal wind is blowing , not at very high speeds though. weather is
			going to be cloudy this month.</div>

		<button class="accordion">Weather Calender</button>
		<div class="panel">You can access the weather report day by day
			on this calender.</div>
	</div>
	<!-- /.container -->

	<jsp:include page="footer.jsp"></jsp:include>

</body>

</html>
