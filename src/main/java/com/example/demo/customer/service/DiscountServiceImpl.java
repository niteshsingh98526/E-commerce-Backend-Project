package com.example.demo.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.customer.model.Discount;
import com.example.demo.customer.repositry.DiscountRepository;

@Service
public class DiscountServiceImpl implements DiscountService{
	
	@Autowired
	private DiscountRepository discountRepository;

	@Override
	public Discount save(Discount discount) {
		return discountRepository.save(discount);
	}

	@Override
	public List<Discount> FindAll() {
		return discountRepository.findAll();
	}

	@Override
	public void delete(Long id) {
      this.discountRepository.deleteById(id);		
	}

}
