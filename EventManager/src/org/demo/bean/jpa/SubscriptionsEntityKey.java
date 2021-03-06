/*
 * Created on 24 oct. 2014 ( Time 13:24:02 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
package org.demo.bean.jpa;
import java.io.Serializable;

import javax.persistence.*;

/**
 * Composite primary key for entity "SubscriptionsEntity" ( stored in table "SUBSCRIPTIONS" )
 *
 * @author Telosys Tools Generator
 *
 */
 @Embeddable
public class SubscriptionsEntityKey implements Serializable {
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY KEY ATTRIBUTES 
    //----------------------------------------------------------------------
    @Column(name="EMAIL", nullable=false, length=32)
    private String     email        ;
    
    @Column(name="EVENT", nullable=false)
    private Integer    event        ;
    

    //----------------------------------------------------------------------
    // CONSTRUCTORS
    //----------------------------------------------------------------------
    public SubscriptionsEntityKey() {
        super();
    }

    public SubscriptionsEntityKey( String email, Integer event ) {
        super();
        this.email = email ;
        this.event = event ;
    }
    
    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR KEY FIELDS
    //----------------------------------------------------------------------
    public void setEmail( String value ) {
        this.email = value;
    }
    public String getEmail() {
        return this.email;
    }

    public void setEvent( Integer value ) {
        this.event = value;
    }
    public Integer getEvent() {
        return this.event;
    }


    //----------------------------------------------------------------------
    // equals METHOD
    //----------------------------------------------------------------------
	public boolean equals(Object obj) { 
		if ( this == obj ) return true ; 
		if ( obj == null ) return false ;
		if ( this.getClass() != obj.getClass() ) return false ; 
		SubscriptionsEntityKey other = (SubscriptionsEntityKey) obj; 
		//--- Attribute email
		if ( email == null ) { 
			if ( other.email != null ) 
				return false ; 
		} else if ( ! email.equals(other.email) ) 
			return false ; 
		//--- Attribute event
		if ( event == null ) { 
			if ( other.event != null ) 
				return false ; 
		} else if ( ! event.equals(other.event) ) 
			return false ; 
		return true; 
	} 


    //----------------------------------------------------------------------
    // hashCode METHOD
    //----------------------------------------------------------------------
	public int hashCode() { 
		final int prime = 31; 
		int result = 1; 
		
		//--- Attribute email
		result = prime * result + ((email == null) ? 0 : email.hashCode() ) ; 
		//--- Attribute event
		result = prime * result + ((event == null) ? 0 : event.hashCode() ) ; 
		
		return result; 
	} 


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() {
		StringBuffer sb = new StringBuffer(); 
		sb.append(email); 
		sb.append("|"); 
		sb.append(event); 
        return sb.toString();
    }
}
