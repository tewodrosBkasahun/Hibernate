package com.hibernate.partThree.AttributeOverride.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	@Column
	private String name;
	@AttributeOverrides({		
		@AttributeOverride(name = "street", column=@Column(name="home_street")),
		@AttributeOverride(name = "city", column=@Column(name="home_city")),
		@AttributeOverride(name="state", column=@Column(name="home_state")),
		@AttributeOverride(name="zip", column=@Column(name="home_zip"))

	})
	private Address homeAddress; 
	@AttributeOverrides({		
		@AttributeOverride(name = "street", column=@Column(name="billing_street")),
		@AttributeOverride(name = "city", column=@Column(name="billing_city")),
		@AttributeOverride(name="state", column=@Column(name="billing_state")),
		@AttributeOverride(name="zip", column=@Column(name="billing_zip"))

	})
	private Address billingAddress;
}
