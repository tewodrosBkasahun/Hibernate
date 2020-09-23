package com.hibernate.partOne.EntityVsValueType.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernate.partOne.EntityVsValueType.entity.User;

/* @Repository 
 * annotation is used to indicate that the class provides the mechanism 
 * for storage, retrieval, search, update and delete operation on objects.
 * 
 * @Transactional
 * meaning that any failure causes the entire operation to roll back to
 * its previous state and to re-throw the original exception.
 * */

@Repository 
@Transactional 
public class UserRepository {
  @PersistenceContext
  EntityManager em;
  
  public User fingById(long id) {
	  return em.find(User.class, id);
  }
  
  public void save(User user) {
	  
	  em.merge(user);
	 
  }
 
}
