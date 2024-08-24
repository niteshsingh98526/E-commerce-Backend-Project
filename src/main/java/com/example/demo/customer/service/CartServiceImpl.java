package com.example.demo.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.customer.model.Cart;
import com.example.demo.customer.repositry.CartRepository;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public Cart save(Cart cart) {
		return cartRepository.save(cart);
	}

	@Override
	public List<Cart> findAll() {
		return cartRepository.findAll();
	}

	@Override
	public Cart findById(Long id) {
		Optional<Cart> byId = this.cartRepository.findById(id);
		if(byId.isPresent()) {
			return byId.get();
		}
		return null;
	}

	@Override
	public void delete(Long id) {
        this.cartRepository.deleteById(id);		
	}

}
