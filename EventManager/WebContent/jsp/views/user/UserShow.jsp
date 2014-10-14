<%@ include file="/WEB-INF/jspf/Prolog.jspf" %>

	<h3> Information about ${user.firstName} ${user.lastName} </h3>
	<table>
		<tr>
			<th>Email</th>
			<th>${user.email}</th>
		</tr>
		<tr>
			<th>Company</th>
			<th>${user.company}</th>
		</tr>
	</table>

<%@ include file="/WEB-INF/jspf/Epilog.jspf" %>