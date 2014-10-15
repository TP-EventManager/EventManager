<%@ include file="/WEB-INF/jspf/Prolog.jspf" %>

	<h3> Sign in </h3>
	
	<c:if test="${!empty param.error}">
		<p>Error: Wrong user name or password</p>
	</c:if>
	
	<form action="/EventManager/login" method="post">
		<div class="field">
			<label for="user_email">Your email</label> 
			<input type="text" id="user_email" name="userEmail" required>
		</div>
	
		<div class="field">
			<label for="user_password">Your password</label> 
			<input type="password" id="user_password" name="userPassword" required>
		</div>
		
		<input type="submit" value="Sign in">
	</form>

<%@ include file="/WEB-INF/jspf/Epilog.jspf" %>