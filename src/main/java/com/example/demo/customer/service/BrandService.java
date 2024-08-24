package com.example.demo.customer.service;

import java.util.List;

import com.example.demo.customer.model.Brand;

public interface BrandService {
	
	public Brand save(Brand brand);
	public List<Brand> findAll();
	public Brand findById(Long id);
	public void delete(Long id);
}
