package com.example.demo.customer.service;

import java.util.List;

import com.example.demo.customer.model.Category;

public interface CategoryService {
	
	public Category save(Category category);
	public List<Category> findAll();
	public Category findById(Long id);
	public void deleteById(Long id);

}
