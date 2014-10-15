<%@ include file="/WEB-INF/jspf/Prolog.jspf" %>

<main>
	<section>
		<h3> Information about ${user.firstName} ${user.lastName} </h3>
		<table class="table">
			<tr>
				<th>Email</th>
				<th>${user.email}</th>
			</tr>
			<tr>
				<th>Company</th>
				<th>${user.company}</th>
			</tr>
		</table>
	</section>
<main>

<%@ include file="/WEB-INF/jspf/Epilog.jspf" %>