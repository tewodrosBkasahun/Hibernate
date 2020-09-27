package com.hibernate.partFive.OneToOneBi.OneToOneBi.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Passport {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Temporal(TemporalType.DATE)
	private Date issuedDate;
	
	@Temporal(TemporalType.DATE)
	private Date expirationDate;
	
	Passport (){
		
	}

}
