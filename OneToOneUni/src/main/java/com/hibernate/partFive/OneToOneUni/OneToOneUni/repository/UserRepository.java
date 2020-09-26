package com.hibernate.partFive.OneToOneUni.OneToOneUni.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.hibernate.partFive.OneToOneUni.OneToOneUni.entity.Card;
import com.hibernate.partFive.OneToOneUni.OneToOneUni.entity.User;

@Repository
@Transactional
public class UserRepository {
	
	@PersistenceContext
	EntityManager em;
	
	public void Save(User user) {
		em.merge(user);
	}
	
	

}
