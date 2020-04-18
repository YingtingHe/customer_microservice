package com.ebookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebookstore.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
}
