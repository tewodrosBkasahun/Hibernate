package com.hibernate.partFive.OneToOneUni.OneToOneUni.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="card")
public class Card{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="card_id", nullable=false)
	private int id;
	
	@Column(name="card_doe_month", nullable=false,length=30)
	private String month;
	@Column(name="card_doe_Year", nullable=false,length=30)
	private String year;
	@Column(name="card_doe_csc", nullable=false,length=30)
	private String csc;
	
	
	
	public Card() {
		
	}
	
	public Card(String month, String year, String csc) {
		this.month = month;
		this.year = year;
		this.csc = csc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCsc() {
		return csc;
	}

	public void setCsc(String csc) {
		this.csc = csc;
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", month=" + month + ", year=" + year + ", csc=" + csc + "]";
	}
	
	
	
}
