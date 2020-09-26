package com.hibernate.partFive.OneToOneUni.OneToOneUni.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id", nullable=false)
	private int id;
	
	@Column(name="first_name", nullable=false,length=30)
	private String firstName;
   
	@Column(name="last_name", nullable=false,length=30)
	private String lastName;
    
    @OneToOne(cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
    @JoinColumn(name="card_id")
	private Card card;

	public User() {

	}

	public User(String firstName, String lastName, Card card) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.card = card;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}
	
	

	
}
