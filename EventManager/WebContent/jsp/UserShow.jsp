<%@ include file="/WEB-INF/jspf/Prolog.jspf" %>

	<table>
		<thead>
			<tr>
				<th>Column</th>
				<th>Value </th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th>First Name</th>
				<th>${user.firstName}</th>
			</tr>
			<tr>
				<th>Last Name</th>
				<th>${user.firstName}</th>
			</tr>
			<tr>
				<th>Email</th>
				<th>${user.email}</th>
			</tr>
			<tr>
				<th>Company</th>
				<th>${user.company}</th>
			</tr>
		</tbody>
	</table>

<%@ include file="/WEB-INF/jspf/Epilog.jspf" %>