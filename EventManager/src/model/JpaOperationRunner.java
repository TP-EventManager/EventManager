package model;

import javax.persistence.PersistenceException;

import org.demo.persistence.PersistenceConfig;
import org.demo.persistence.commons.jpa.JpaEnvironment;
import org.demo.persistence.commons.jpa.JpaEnvironments;
import org.demo.persistence.commons.jpa.JpaOperation;

public class JpaOperationRunner<T> {
	public T execute(JpaOperation operation) throws PersistenceException {
		return execute(operation, false);
	}
		
	public T execute(JpaOperation operation, boolean transactional) throws PersistenceException {
		JpaEnvironment jpaEnvironment = JpaEnvironments.getInstance().getJpaEnvironment(PersistenceConfig.JPA_PERSISTENCE_UNIT_NAME);
		if ( transactional ) {
			return (T)jpaEnvironment.executeWithTransaction(operation) ;
		}
		else {
			return (T)jpaEnvironment.executeWithoutTransaction(operation) ;	
		}
	}
}