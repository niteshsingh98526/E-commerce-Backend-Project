package com.example.demo.customer.service;

import java.util.List;

import com.example.demo.customer.model.Discount;

public interface DiscountService {
	
	public Discount save(Discount discount);
	public List<Discount> FindAll();
	public void delete(Long id);

}
