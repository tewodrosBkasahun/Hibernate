package com.hibernate.partFive.OneToOneBi.OneToOneBi.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	
	@Column(name="name",nullable=false)
    private String name;
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="pass_id")
	Passport passport;
	
	public Person(){
		
	}
    
}
