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

import com.example.demo.customer.model.Cart;
import com.example.demo.customer.service.CartService;

@SuppressWarnings({"rawtypes", "unchecked"})
@RestController
@RequestMapping("/carts")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@PostMapping("")
	public ResponseEntity save(@RequestBody Cart cart) {
		return new ResponseEntity(cartService.save(cart), HttpStatus.OK);
	}
	
	@GetMapping("")
	public ResponseEntity findAll() {
		return new ResponseEntity(cartService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = {"/{id}"})
	public ResponseEntity findIdEntity(@PathVariable Long id) {
		return new ResponseEntity(cartService.findById(id), HttpStatus.OK);
	}
	
	@DeleteMapping(value = {"/{id}"})
	public ResponseEntity delete(@PathVariable Long id) {
		cartService.delete(id);
		return new ResponseEntity("Success", HttpStatus.OK);
	}
	

}
