package com.hibernate.partThree.AttributeOverride.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hibernate.partThree.AttributeOverride.entity.Person;

public class UserRepository {

	@PersistenceContext
	EntityManager em;
	
	public void save(Person user) {
		em.merge(user);
	}
	
	
}
