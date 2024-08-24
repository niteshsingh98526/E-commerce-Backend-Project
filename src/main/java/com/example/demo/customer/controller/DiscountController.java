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

import com.example.demo.customer.model.Discount;
import com.example.demo.customer.service.DiscountService;

@SuppressWarnings({"rawtypes", "unchecked"})
@RestController
@RequestMapping("/discounts")
public class DiscountController {
	
	@Autowired
	private DiscountService discountService;
	
	@PostMapping("")
	public ResponseEntity save(@RequestBody Discount discount) {
		return new ResponseEntity(discountService.save(discount), HttpStatus.OK);
	}
	
	@GetMapping("")
	public ResponseEntity findAll() {
		return new ResponseEntity(discountService.FindAll(), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable Long id) {
		discountService.delete(id);
		return new ResponseEntity("Success", HttpStatus.OK);
	}

}
