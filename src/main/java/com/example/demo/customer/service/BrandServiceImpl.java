package com.example.demo.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.customer.model.Brand;
import com.example.demo.customer.repositry.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService {
    
	@Autowired
	private BrandRepository brandRepositry;
	
	@Override
	public Brand save(Brand brand) {
		return brandRepositry.save(brand);
	}

	@Override
	public List<Brand> findAll() {
		return brandRepositry.findAll();
	}

	@Override
	public Brand findById(Long id) {
		Optional<Brand> byId = this.brandRepositry.findById(id);
		if(byId.isPresent()) {
		return byId.get();
		}
		return null;

	}

	@Override
	public void delete(Long id) {
		 this.brandRepositry.deleteById(id);
	}
	
}
