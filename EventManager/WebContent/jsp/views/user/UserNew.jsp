<%@ include file="/WEB-INF/jspf/Prolog.jspf" %>

	<h3> Create an account now ! </h3>
	<form action="/user_new" method="post">
		<div class="field">
			<label for="user_email">Your email*</label> 
			<input type="text" id="user_email" name="userEmail" required>
		</div>
	
		<div class="field">
			<label for="user_password">Your password*</label> 
			<input type="password" id="user_password" name="userPassword" required>
		</div>
	
		<div class="field">
			<label for="user_firstname">Your first name</label> 
			<input type="text" id="user_firstname" name="userFirstName">
		</div>
	
		<div class="field">
			<label for="user_lastname">Your last name</label> 
			<input type="text" id="user_lastname" name="userlastName">
		</div>

		<div class="field">
			<label for="user_company">Your company</label> 
			<input type="text" id="user_company" name="userCompany">
		</div>
	
		<input type="submit" value="Create my account">
	</form>

<%@ include file="/WEB-INF/jspf/Epilog.jspf" %>