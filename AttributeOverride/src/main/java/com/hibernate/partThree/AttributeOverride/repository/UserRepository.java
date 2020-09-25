package com.hibernate.partThree.AttributeOverride.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.hibernate.partThree.AttributeOverride.entity.Person;

@Repository
@Transactional
public class UserRepository {

	@PersistenceContext
	EntityManager em;
	
	public void save(Person user) {
		em.merge(user);
	}
	
	
}
