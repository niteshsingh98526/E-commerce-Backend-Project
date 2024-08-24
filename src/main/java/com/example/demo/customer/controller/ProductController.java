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
import com.example.demo.customer.model.Product;
import com.example.demo.customer.service.ProductService;

@SuppressWarnings({"rawtypes", "unchecked"})
@RestController
@RequestMapping("/products")

public class ProductController {
	
	@Autowired
	public ProductService productService;
	
	@PostMapping("")
	public ResponseEntity save(@RequestBody Product product){
		return new ResponseEntity(productService.save(product), HttpStatus.OK);
		
	}
	
	@GetMapping("")
	public ResponseEntity findAll() {
		return new ResponseEntity(productService.findAll(), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable Long id) {
	     productService.delete(id);
	   return new ResponseEntity("success", HttpStatus.OK);
	     
	}
	
	@GetMapping(value = {"/{id}"})
	public ResponseEntity findById(@PathVariable Long id) {
		return new ResponseEntity(productService.findById(id),HttpStatus.OK);
	}
	
	//@GetMapping(value = {"/price{/price}"})
	//public ResponseEntity findByPrice(@PathVariable int price) {
	   // return new ResponseEntity(productService.findByPrice(price), HttpStatus.OK);
	//}
	
}

