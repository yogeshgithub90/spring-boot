<div class="footer-row1">
	<div class="container">
    	<div class="row">
         	<div class="col-md-6 col-sm-12 col-xs-12">
  				<ul>
		          	<li><a href="#">© YogApp	Inc. 2017.</a></li> 
			    	<li><a href="#">Contact</a></li> 
			    	<li><a href="#">About Us</a></li> 
			    	<li>Feedback</li>
		        </ul>
			</div>
		</div>
	</div>
</div>
    <script>
var acc = document.getElementsByClassName("accordion");
var i;

for (i = 0; i < acc.length; i++) {
  acc[i].onclick = function() {
    this.classList.toggle("active");
    var panel = this.nextElementSibling;
    if (panel.style.maxHeight){
      panel.style.maxHeight = null;
    } else {
      panel.style.maxHeight = panel.scrollHeight + "px";
    } 
  }
}
</script>
