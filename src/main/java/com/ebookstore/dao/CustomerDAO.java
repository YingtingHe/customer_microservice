package com.ebookstore.dao;

import java.util.List;

import com.ebookstore.entity.Customer;

public interface CustomerDAO {

	public List<Customer> findAll();
}
