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
import com.example.demo.customer.model.Brand;
import com.example.demo.customer.service.BrandService;

@SuppressWarnings({"rawtypes" , "unchecked"})
@RestController
@RequestMapping("/brands")
public class BrandController {
	
	@Autowired
	private BrandService brandService;
	
	@PostMapping("")
	public ResponseEntity save(@RequestBody Brand brand) {
		return new ResponseEntity(brandService.save(brand), HttpStatus.OK);
		
	}
	
	@GetMapping("")
	public ResponseEntity findAll() {
		return new ResponseEntity(brandService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = {"/{id}"})
	public ResponseEntity findIdEntity(@PathVariable Long id) {
	return new ResponseEntity(brandService.findById(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable Long id) {
		brandService.delete(id);
		return new ResponseEntity("Success", HttpStatus.OK);
	}
}
