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
				<th> Published </th>
				<th> Action </th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.events}" var="event">
				
					<tr>
						<td>${event.name}</td>
						<td>${event.address}</td>
						<td><fmt:formatDate value="${event.beginningDate}" pattern="dd/MM/yyyy hh:ss"/></td>
						<td><fmt:formatDate value="${event.endDate}" pattern="dd/MM/yyyy hh:ss"/></td>
						<td>
							<c:choose>
								<c:when test="${event.published == 1}"> Yes </c:when>
								<c:otherwise>                          No  </c:otherwise>
							</c:choose>		
						</td>
						<td>
							<c:choose>
								<c:when test="${event.published == 1}">
									<a href="${pageContext.request.contextPath}/event" class="btn btn-primary">Show</a>
								</c:when>
								<c:otherwise>
									<form action="${pageContext.request.contextPath}/publish" method="post">
										<input type="submit" value="Publish" class="btn btn-primary">
									</form>
								</c:otherwise>
							</c:choose>	
						</td>
					</tr>

			</c:forEach>
	</table>
	<a href="${pageContext.request.contextPath}/event_new" class="btn btn-primary">Add an event</a>
</section>