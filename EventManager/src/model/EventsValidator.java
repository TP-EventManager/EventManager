package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.demo.bean.jpa.EventsEntity;
import org.demo.bean.jpa.UsersEntity;
import org.demo.persistence.services.jpa.UsersPersistenceJPA;

public class EventsValidator {

	public EventsEntity validate(String name, String address, String _begDate, String _endDate, String _published, String email) {
		if (name == null || address == null || _begDate == null || _endDate == null)
			return null;
		
		EventsEntity event = new EventsEntity();
		event.setName(name);
		event.setAddress(address);
		
		UsersEntity user = new UsersPersistenceJPA().load(email);
		if (user == null)
			return null;
		event.setUsers(user);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		Date begDate;
		Date endDate;
		try {
			begDate = sdf.parse(_begDate);
			endDate = sdf.parse(_endDate);
		}
		catch (ParseException e) { return null; }
		if (begDate.after(endDate)) return null;
		event.setBeginningDate(begDate);
		event.setEndDate(endDate);
		
		int published = "on".equals(_published) ? 1 : 0;
		event.setPublished(published);
		
		return event;
	}
}
