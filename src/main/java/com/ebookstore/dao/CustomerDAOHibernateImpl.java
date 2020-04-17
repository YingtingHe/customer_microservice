package com.ebookstore.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ebookstore.entity.Customer;

@Repository
public class CustomerDAOHibernateImpl implements CustomerDAO{

	private EntityManager entityManager;
	
	@Autowired
	public CustomerDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	@Transactional
	public List<Customer> findAll() {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Customer> theQuery = currentSession.createQuery("From Customer", Customer.class);
		
		List<Customer> customers = theQuery.getResultList();
		
		return customers;
		
	}

}
