<%@ include file="/WEB-INF/jspf/Prolog.jspf" %>

<section>
	<c:if test="${param.invalid == \"true\" }">
		<p class="alert alert-danger">Error: Invalid data</p>
	</c:if>
	<c:if test="${param.subscribed == \"true\" }">
		<p class="alert alert-success">Congratulations ! You've subscribed to this event.</p>
	</c:if>

	<h3> ${event.name} </h3>
	<table class="table">
		<tr>
			<td>Where</td>
			<td>${event.address}</td>
		</tr>
		<tr>
			<td>When</td>
			<td>
				From 
				<fmt:formatDate value="${event.beginningDate}" pattern="dd/MM/yyyy hh:ss"/> 
				to 
				<fmt:formatDate value="${event.endDate}" pattern="dd/MM/yyyy hh:ss"/>
			</td>
		</tr>
	</table>
</section>

<c:if test="${!empty sessionScope.token && sessionScope.token eq event.users.email}">
	<a href="${pageContext.request.contextPath}/subscribers?id=${event.id}" class="btn btn-primary">See Subscribers</a>
</c:if>

<hr>

<section class="panel panel-default">
	<header class="panel-heading">
		<h4>Subscribe to this Event</h4>
	</header>
	<form action="${pageContext.request.contextPath}/subscribe" method="post" class="panel-body">
		<div class="form-group">
			<label for="user_email">Your email*</label> 
			<input type="email" id="user_email" name="userEmail" required class="form-control">
		</div>
		
		<div class="form-group">
			<label for="user_firstname">Your first name*</label> 
			<input type="text" id="user_firstname" name="userFirstName" required class="form-control">
		</div>

		<div class="form-group">
			<label for="user_lastname">Your last name*</label> 
			<input type="text" id="user_lastname" name="userLastName" required class="form-control">
		</div>

		<div class="form-group">
			<label for="user_company">Your company*</label> 
			<input type="text" id="user_company" name="userCompany" required class="form-control">
		</div>
		
		<input class="hidden" type="text" value="${event.id}" name="eventId">
		
		<input type="submit" value="Subscribe" class="btn btn-primary btn-lg">
	</form>
</section>