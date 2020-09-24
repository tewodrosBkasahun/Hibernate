package com.hibernate.partTwo.StandardJPAAnnotations.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table(name = "EMPLOYEE")
public class Employee {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name",nullable=false,length= 40)
	private String firstName;

	@Column(name = "last_name", nullable=false,length= 40)
	private String lastName;

	@Column(name = "salary")
	private int salary;
	
	@Column(name="ssn", nullable =false,length=11)
	private String SSN;

	public Employee() {
	}
	
	public Employee(String firstName, String lastName, int salary,String SSN) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.SSN=SSN;
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

	public void setFirstName(String first_name) {
		this.firstName = first_name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String last_name) {
		this.lastName = last_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
}
