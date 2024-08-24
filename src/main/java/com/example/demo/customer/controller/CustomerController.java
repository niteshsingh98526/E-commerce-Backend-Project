package com.example.demo.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.customer.model.Customer;
import com.example.demo.customer.service.CustomerService;

@SuppressWarnings({"rawtypes", "unchecked"})
@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	
	@PostMapping("")
	public ResponseEntity save(@RequestBody Customer customer) {
		return new ResponseEntity(customerService.save(customer), HttpStatus.OK);
	}
	
	@GetMapping("")
	public ResponseEntity findAll() {
		return new ResponseEntity(customerService.findAll(), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable Long id) {
		customerService.delete(id);
		return new ResponseEntity("Success", HttpStatus.OK);
	
	}
	      
	@GetMapping(value={"/age/{age}"})
	public ResponseEntity findAgeEntity(@PathVariable int age) {
		return new ResponseEntity(this.customerService.findAge(age), HttpStatus.OK);
	}
	
	
	@GetMapping(value={"/{id}"})
	public ResponseEntity findIdEntity(@PathVariable Long id) {
		return new ResponseEntity(this.customerService.findById(id), HttpStatus.OK);
	}

	
	
	@GetMapping(value= {"/search/mobile/{mobile}"})
	public ResponseEntity findMobileEntity(@PathVariable String mobile) {
		return new ResponseEntity(this.customerService.findByMobile(mobile), HttpStatus.OK);
		
	}
}