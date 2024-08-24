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

import com.example.demo.customer.model.Category;
import com.example.demo.customer.service.CategoryService;

@SuppressWarnings({"rawtypes" , "unchecked"})
@RestController
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired 
	private CategoryService categoryService;
	

	@PostMapping("")
    public ResponseEntity save(@RequestBody Category category) {
		return new ResponseEntity(categoryService.save(category), HttpStatus.OK);
	}
	
	@GetMapping("")
	public ResponseEntity findAll() {
	return new ResponseEntity(categoryService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = {"/{id}"})
	public ResponseEntity findIdEntity(@PathVariable Long id) {
		return new ResponseEntity(categoryService.findById(id), HttpStatus.OK);
	}
	
	@DeleteMapping(value = {"/{id}"})
	public ResponseEntity deleteIdEntity(@PathVariable Long id) {
		categoryService.deleteById(id);
		return new ResponseEntity("Success", HttpStatus.OK);
	}
}
