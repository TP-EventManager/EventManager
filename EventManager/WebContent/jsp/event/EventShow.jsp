<%@ include file="/WEB-INF/jspf/Prolog.jspf" %>

<section>
	<h3> ${event.name} </h3>
	<table class="table">
		<tr>
			<th>Where</th>
			<th>${event.address}</th>
		</tr>
		<tr>
			<th>When</th>
			<th>From ${event.beginning_date} to ${event.end_date}</th>
		</tr>
	</table>
</section>
