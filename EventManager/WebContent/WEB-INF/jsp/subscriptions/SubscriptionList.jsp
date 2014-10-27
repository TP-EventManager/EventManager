<%@ include file="/WEB-INF/jspf/Prolog.jspf" %>

<section>
	<h3> Subscriptions </h3>
	<table class="table">
		<thead>
			<tr>
				<th> Name </th>
				<th> Email </th>
				<th> Company  </th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.subscriptions}" var="s">
				
					<tr>
						<td>${s.firstName} ${s.lastName}</td>
						<td>${s.email}</td>
						<td>${s.company}</td>
					</tr>

			</c:forEach>
	</table>
	<a href="${pageContext.request.contextPath}/event?id=${eventId}" class="btn btn-primary">Go Back</a>
</section>