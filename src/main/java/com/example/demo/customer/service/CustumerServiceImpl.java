package com.example.demo.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.customer.model.Customer;
import com.example.demo.customer.repositry.CustomerRepositry;

@Service
public class CustumerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepositry customerRepositry;
	
	@Override
	public Customer save(Customer customer) {
		return customerRepositry.save(customer);
	}
	

	@Override
	public List<Customer> findAll() {
		return customerRepositry.findAll();
	}


	@Override
	public void delete(Long id) {
		this.customerRepositry.deleteById(id);
	}


	@Override
	public List<Customer> findAge(int age) {
		return this.customerRepositry.findByAgeGreaterThan(age);
	}


	@Override
	public Customer findById(Long id) {
		Optional<Customer> byId = this.customerRepositry.findById(id);
		if(byId.isPresent()) {
			return byId.get();
	}
		return null;
	}


	@Override
	public Customer findByMobile(String mobile) {
		Optional<Customer> byMobile = this.customerRepositry.findByMobile(mobile);
		if(byMobile.isPresent()) {
			return byMobile.get();
	}
		return null;
	}


}