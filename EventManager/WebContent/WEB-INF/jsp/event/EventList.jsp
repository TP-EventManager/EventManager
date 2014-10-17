<%@ include file="/WEB-INF/jspf/Prolog.jspf" %>

<section>
	<h3> Your events </h3>
	<table class="table">
		<thead>
			<tr>
				<th> Event </th>
				<th> Where </th>
				<th> Beginning  </th>
				<th> End  </th>	
				<th> Show </th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.events}" var="event">
				
					<tr>
						<td>${event.name}</td>
						<td>${event.address}</td>
						<td><fmt:formatDate value="${event.beginning_date}" pattern="dd/MM/yyyy hh:ss"/></td>
						<td><fmt:formatDate value="${event.end_date}" pattern="dd/MM/yyyy hh:ss"/></td>
						<td><a href="${pageContext.request.contextPath}/event" class="btn btn-primary">Show</a></td>
					</tr>

			</c:forEach>
	</table>
</section>