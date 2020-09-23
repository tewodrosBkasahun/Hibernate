package com.hibernate.partOne.EntityVsValueType.entity;

import javax.persistence.Embeddable;

/*
 *  Value object has no database identity (No primary key). It belongs to an entity 
 *  object and it is embedded in the table row of owning entity 
 * **/

@Embeddable
public class Address {
	private String street;
	private String city;
	private String zip;

	public Address() {

	}

	public Address(String street, String city, String zip) {
		this.street = street;
		this.city = city;
		this.zip = zip;
	}

}
