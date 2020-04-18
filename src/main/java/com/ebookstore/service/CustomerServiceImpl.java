package com.ebookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ebookstore.dao.CustomerRepository;
import com.ebookstore.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository theCustomerRepository) {
		customerRepository = theCustomerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public Customer findById(int theId) {
		
		Optional<Customer> result = customerRepository.findById(theId);
		Customer theCustomer = null;
		
		if (result.isPresent()) {
			theCustomer = result.get();
		} else {
			throw new RuntimeException("Did not find customer id - " + theId);
		}

		return theCustomer;
	}

	@Override
	public void save(Customer theCustomer) {
		customerRepository.save(theCustomer);
		
	}

	@Override
	public void deleteById(int theId) {
		customerRepository.deleteById(theId);
	}

}
