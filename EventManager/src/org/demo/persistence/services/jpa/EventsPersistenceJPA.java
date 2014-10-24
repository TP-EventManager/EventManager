/*
 * Created on 24 oct. 2014 ( Time 13:24:02 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */

package org.demo.persistence.services.jpa;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.demo.bean.jpa.EventsEntity;
import org.demo.persistence.commons.jpa.GenericJpaService;
import org.demo.persistence.commons.jpa.JpaOperation;
import org.demo.persistence.services.EventsPersistence;

/**
 * JPA implementation for basic persistence operations ( entity "Events" )
 * 
 * @author Telosys Tools Generator
 *
 */
public class EventsPersistenceJPA extends GenericJpaService<EventsEntity, Integer> implements EventsPersistence {

	/**
	 * Constructor
	 */
	public EventsPersistenceJPA() {
		super(EventsEntity.class);
	}

	@Override
	public EventsEntity load( Integer id ) {
		return super.load( id );
	}

	@Override
	public boolean delete( Integer id ) {
		return super.delete( id );
	}

	@Override
	public boolean delete(EventsEntity entity) {
		if ( entity != null ) {
			return super.delete( entity.getId() );
		}
		return false ;
	}

	@Override
	public long countAll() {
		// JPA operation definition 
		JpaOperation operation = new JpaOperation() {
			@Override
			public Object exectue(EntityManager em) throws PersistenceException {
				Query query = em.createNamedQuery("EventsEntity.countAll");
				return query.getSingleResult() ;
			}
		} ;
		// JPA operation execution 
		return (Long) execute(operation);
	}

}
