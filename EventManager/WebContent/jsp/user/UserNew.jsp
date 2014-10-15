<%@ include file="/WEB-INF/jspf/Prolog.jspf" %>

<section>
	<h3> Create an account now ! </h3>
	<form action="/user_new" method="post">
		<div class="form-group">
			<label for="user_email">Your email*</label> 
			<input type="text" id="user_email" name="userEmail" required class="form-control">
		</div>

		<div class="form-group">
			<label for="user_password">Your password*</label> 
			<input type="password" id="user_password" name="userPassword" required class="form-control">
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

		<input type="submit" value="Create my account" class="btn btn-primary">
	</form>
</section>