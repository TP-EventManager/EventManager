<%@ include file="/WEB-INF/jspf/Prolog.jspf" %>

<section>
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
				<fmt:formatDate value="${event.beginning_date}" pattern="dd/MM/yyyy hh:ss"/> 
				to 
				<fmt:formatDate value="${event.end_date}" pattern="dd/MM/yyyy hh:ss"/>
			</td>
		</tr>
	</table>
</section>

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
			<label for="user_firstname">Your first name</label> 
			<input type="text" id="user_firstname" name="userFirstName" class="form-control">
		</div>

		<div class="form-group">
			<label for="user_lastname">Your last name</label> 
			<input type="text" id="user_lastname" name="userlastName" class="form-control">
		</div>

		<div class="form-group">
			<label for="user_company">Your company</label> 
			<input type="text" id="user_company" name="userCompany" class="form-control">
		</div>
		
		<input type="submit" value="Subscribe" class="btn btn-primary btn-lg">
	</form>
</section>