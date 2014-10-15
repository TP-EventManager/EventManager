<%@ include file="/WEB-INF/jspf/Prolog.jspf" %>

<section>
	<h3> Sign in </h3>

	<c:if test="${!empty param.error}">
		<p class="bg-danger">Error: Wrong user name or password</p>
	</c:if>

	<form action="/EventManager/login" method="post">
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