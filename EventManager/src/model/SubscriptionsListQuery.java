package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import org.demo.bean.jpa.EventsEntity;
import org.demo.bean.jpa.SubscriptionsEntity;
import org.demo.persistence.commons.jpa.JpaOperation;
import org.hibernate.Hibernate;

public class SubscriptionsListQuery {
	public List<SubscriptionsEntity> execute(final String id) {
		return new JpaOperationRunner<List<SubscriptionsEntity>>().execute(
			new JpaOperation() {					
				@Override
				public Object exectue(EntityManager em) throws PersistenceException {
					EventsEntity event = em.find(EventsEntity.class, Integer.parseInt(id));
					List<SubscriptionsEntity> subscribers = event.getListOfSubscriptions();
					Hibernate.initialize(subscribers);
					return subscribers;
				}
			}
		);
	}	
}