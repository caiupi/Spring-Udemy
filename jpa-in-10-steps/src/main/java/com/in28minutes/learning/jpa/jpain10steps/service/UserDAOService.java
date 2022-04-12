package com.in28minutes.learning.jpa.jpain10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.learning.jpa.jpain10steps.Entity.User;
@Transactional
@Repository
public class UserDAOService {
	@PersistenceContext
	private EntityManager entityManager;

	public long inser(User user) {
		
		entityManager.persist(user);
		
		return user.getId();
	}
}
