package controllers.user;
public class UserBean {

		private String firstName;
		private String lastName;
		private String password;
		private String company;
		private String email;
		
		public UserBean() { 
			this("John", "Doe", "secret", "None", "john@doe.com");
		}

		public UserBean(String firstName, String lastName, String password, String company, String email) {
			super();
			this.firstName = firstName;
			this.lastName  = lastName;
			this.password  = password;
			this.company   = company;
			this.email     = email;
		}
			
		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "UserBean [firstName=" + firstName + ", lastName="
					+ lastName + ", password=" + password + ", company="
					+ company + ", email=" + email + "]";
		}

}
