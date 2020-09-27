package com.hibernate.partFive.OneToOneBi.OneToOneBi.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.hibernate.partFive.OneToOneBi.OneToOneBi.entity.Person;

@Repository
@Transactional 
public class PersonRepository {
	@PersistenceContext
	EntityManager em;
	
	public void save(Person person) {
		em.merge(person);
	}

}
