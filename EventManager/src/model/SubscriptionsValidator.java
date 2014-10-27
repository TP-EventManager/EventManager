package model;

import org.demo.bean.jpa.SubscriptionsEntity;
import org.demo.bean.jpa.UsersEntity;
import org.demo.persistence.services.jpa.EventsPersistenceJPA;

public class SubscriptionsValidator {

	public SubscriptionsEntity validate(String email, String firstName, String lastName, String company, String eventId) {
		if (email == null || firstName == null || lastName == null || company == null || eventId == null)
			return null;

		try {
			if (new EventsPersistenceJPA().load(Integer.parseInt(eventId)) == null)
				return null;
		} catch (NumberFormatException e) {
			return null;
		}

		SubscriptionsEntity s = new SubscriptionsEntity();
		s.setEmail(email);
		s.setEvent(Integer.parseInt(eventId));
		s.setCompany(company);
		s.setFirstName(firstName);
		s.setLastName(lastName);
		return s;
	}
	
}
