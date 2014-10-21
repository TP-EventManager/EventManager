/*
 * Created on 20 oct. 2014 ( Time 17:32:43 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */

package org.demo.persistence.services.jpa;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.demo.bean.jpa.SubscriptionsEntity;
import org.demo.persistence.commons.jpa.GenericJpaService;
import org.demo.persistence.commons.jpa.JpaOperation;
import org.demo.persistence.services.SubscriptionsPersistence;

/**
 * JPA implementation for basic persistence operations ( entity "Subscriptions" )
 * 
 * @author Telosys Tools Generator
 *
 */
public class SubscriptionsPersistenceJPA extends GenericJpaService<SubscriptionsEntity, String> implements SubscriptionsPersistence {

	/**
	 * Constructor
	 */
	public SubscriptionsPersistenceJPA() {
		super(SubscriptionsEntity.class);
	}

	@Override
	public SubscriptionsEntity load( String email ) {
		return super.load( email );
	}

	@Override
	public boolean delete( String email ) {
		return super.delete( email );
	}

	@Override
	public boolean delete(SubscriptionsEntity entity) {
		if ( entity != null ) {
			return super.delete( entity.getEmail() );
		}
		return false ;
	}

	@Override
	public long countAll() {
		// JPA operation definition 
		JpaOperation operation = new JpaOperation() {
			@Override
			public Object exectue(EntityManager em) throws PersistenceException {
				Query query = em.createNamedQuery("SubscriptionsEntity.countAll");
				return query.getSingleResult() ;
			}
		} ;
		// JPA operation execution 
		return (Long) execute(operation);
	}

}
