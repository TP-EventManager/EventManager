/*
 * Created on 20 oct. 2014 ( Time 17:32:43 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
package org.demo.persistence.services;

import java.util.List;
import java.util.Map;

import org.demo.bean.jpa.SubscriptionsEntity;

/**
 * Basic persistence operations for entity "Subscriptions"
 * 
 * This Bean has a basic Primary Key : String
 *
 * @author Telosys Tools Generator
 *
 */
public interface SubscriptionsPersistence {

	/**
	 * Deletes the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param subscriptions
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(SubscriptionsEntity subscriptions) ;

	/**
	 * Deletes the entity by its Primary Key <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param email
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(String email) ;

	/**
	 * Inserts the given entity and commit <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param subscriptions
	 */
	public void insert(SubscriptionsEntity subscriptions) ;

	/**
	 * Loads the entity for the given Primary Key <br>
	 * @param email
	 * @return the entity loaded (or null if not found)
	 */
	public SubscriptionsEntity load(String email) ;

	/**
	 * Loads ALL the entities (use with caution)
	 * @return
	 */
	public List<SubscriptionsEntity> loadAll() ;

	/**
	 * Loads a list of entities using the given "named query" without parameter 
	 * @param queryName
	 * @return
	 */
	public List<SubscriptionsEntity> loadByNamedQuery(String queryName) ;

	/**
	 * Loads a list of entities using the given "named query" with parameters 
	 * @param queryName
	 * @param queryParameters
	 * @return
	 */
	public List<SubscriptionsEntity> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;

	/**
	 * Saves (create or update) the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param subscriptions
	 * @return
	 */
	public SubscriptionsEntity save(SubscriptionsEntity subscriptions) ;

	/**
	 * Search the entities matching the given search criteria
	 * @param criteria
	 * @return
	 */
	public List<SubscriptionsEntity> search( Map<String, Object> criteria ) ;

	/**
	 * Count all the occurrences
	 * @return
	 */
	public long countAll();
	
}
