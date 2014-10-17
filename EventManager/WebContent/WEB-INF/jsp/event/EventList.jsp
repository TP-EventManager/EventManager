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
						<td><fmt:formatDate value="${event.beginning_date}" pattern="dd/MM/yyyy hh:ss"/></td>
						<td><fmt:formatDate value="${event.end_date}" pattern="dd/MM/yyyy hh:ss"/></td>
						<td>
							<c:choose>
								<c:when test="${event.published}"> Yes </c:when>
								<c:otherwise>                      No  </c:otherwise>
							</c:choose>		
						</td>
						<td>
							<c:choose>
								<c:when test="${event.published}">
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
</section>