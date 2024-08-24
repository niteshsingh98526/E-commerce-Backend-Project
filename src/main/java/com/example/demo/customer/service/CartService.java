package com.example.demo.customer.service;

import java.util.List;

import com.example.demo.customer.model.Cart;

public interface CartService {
	
	public Cart save(Cart cart);
	public List<Cart> findAll();
	public Cart findById(Long id);
	public void delete(Long id);

}
