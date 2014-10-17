<%@ include file="/WEB-INF/jspf/Prolog.jspf" %>

<section>
	<c:if test="${param.error == \"authentication\" }">
		<section class="alert alert-info">
			<p>You need to be logged in to do that.</p>
			<p>Doesn't have an account? <a href="${pageContext.request.contextPath}/user_new">Create one now</a></p>
		</section>
	</c:if>

	<h3> Sign in </h3>

	<c:if test="${param.error == \"credentials\" }">
		<p class="alert alert-danger">Error: Wrong user name or password</p>
	</c:if>
	
	<form action="${pageContext.request.contextPath}/login" method="post">
		<div class="form-group">
			<label for="user_email">Your email</label> 
			<input type="text" id="user_email" name="userEmail" required class="form-control">
		</div>
	
		<div class="form-group">
			<label for="user_password">Your password</label> 
			<input type="password" id="user_password" name="userPassword" required class="form-control">
		</div>
		
		<input type="submit" value="Sign in" class="btn btn-primary">
	</form>
</section>