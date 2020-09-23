package com.hibernate.partOne.EntityVsValueType.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*
 * An object of entity type has its own identity(Primary key value).
 * An entity has its own life cycle 
 * **/
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable = false)
	private String name;
    // Value Type
	@Embedded
	private Address address;

	public User(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	public User() {
		
	}

}
