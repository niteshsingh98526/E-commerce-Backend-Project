package com.example.demo.customer.service;

import java.util.List;



import com.example.demo.customer.model.Customer;

public interface CustomerService {

	public Customer save(Customer customer);
	public void delete(Long id);
	public List<Customer> findAge(int age);
	public List<Customer> findAll();
	public Customer findById(Long id);
	public Customer findByMobile(String mobile);
	
}
