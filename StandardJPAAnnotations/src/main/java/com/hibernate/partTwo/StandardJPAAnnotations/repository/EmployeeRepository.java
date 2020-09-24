package com.hibernate.partTwo.StandardJPAAnnotations.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.hibernate.partTwo.StandardJPAAnnotations.entity.Employee;
@Repository
@Transactional 
public class EmployeeRepository {
   @PersistenceContext
	EntityManager em; 
    
   public void save(Employee emp) {
	   em.merge(emp);
   }
    
}
