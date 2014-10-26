package model;

import org.demo.bean.jpa.UsersEntity;
import org.demo.persistence.services.jpa.UsersPersistenceJPA;

public class UsersValidator {

	public UsersEntity validate(String email, String password) {
		if (email == null || password == null)
			return null;
		
		if (new UsersPersistenceJPA().load(email) != null)
			return null;
		
		UsersEntity user = new UsersEntity();
		user.setEmail(email);
		user.setPassword(password);
		return user;
	}
	
}
