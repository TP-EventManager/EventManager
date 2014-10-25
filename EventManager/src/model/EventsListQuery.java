package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import org.demo.bean.jpa.EventsEntity;
import org.demo.bean.jpa.UsersEntity;
import org.demo.persistence.commons.jpa.JpaOperation;
import org.hibernate.Hibernate;

public class EventsListQuery {
	public List<EventsEntity> execute(final String email) {
		return new JpaOperationRunner<List<EventsEntity>>().execute(
			new JpaOperation() {					
				@Override
				public Object exectue(EntityManager em) throws PersistenceException {
					UsersEntity user = em.find(UsersEntity.class, email);
					List<EventsEntity> events = user.getListOfEvents();
					Hibernate.initialize(events);
					return events;
				}
			}
		);
	}	
}