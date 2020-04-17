package com.ebookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebookstore.dao.CustomerDAO;
import com.ebookstore.entity.Customer;


@RestController
public class CustomerRestController {

	private CustomerDAO customerDAO;
	
	@Autowired
	public CustomerRestController(CustomerDAO theCustomerDAO) {
		customerDAO = theCustomerDAO;
	}
	
	@RequestMapping("/")
	public String createCustomer() {
		return "";
	}
	
	@RequestMapping("/customers")
	public List<Customer> getAllCustomers() {
		return customerDAO.findAll();
	}
	
}
