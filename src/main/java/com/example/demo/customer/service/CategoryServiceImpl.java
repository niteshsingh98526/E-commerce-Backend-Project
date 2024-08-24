package com.example.demo.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.customer.model.Category;
import com.example.demo.customer.repositry.CategoryRepositry;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepositry categoryRepositry;

	

	@Override
	public List<Category> findAll() {
		return categoryRepositry.findAll();
	}



	@Override
	public Category save(Category category) {
		return categoryRepositry.save(category);
	}



	@Override
	public Category findById(Long id) {
		Optional<Category> byId = this.categoryRepositry.findById(id);
		if(byId.isPresent()) {
			return byId.get();
	}
		return null;
	}



	@Override
	public void deleteById(Long id) {
      this.categoryRepositry.deleteById(id);		
	}

	

}
