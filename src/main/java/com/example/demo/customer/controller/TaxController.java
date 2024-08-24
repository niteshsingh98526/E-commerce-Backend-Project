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

import com.example.demo.customer.model.Tax;
import com.example.demo.customer.service.TaxService;

@SuppressWarnings({"rawtypes", "unchecked"})
@RestController
@RequestMapping("/taxes")
public class TaxController {
	
	@Autowired
	private TaxService taxService;
	
	@PostMapping("")
	public ResponseEntity save(@RequestBody Tax tax) {
		return new ResponseEntity(taxService.save(tax), HttpStatus.OK);
	}
	
	@GetMapping("")
	public ResponseEntity findAll() {
		return new ResponseEntity(taxService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = {"/{id}"})
	public ResponseEntity findIdEntity(@PathVariable Long id) {
		return new ResponseEntity(taxService.findById(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable Long id) {
		taxService.delete(id);
		return new ResponseEntity("Success", HttpStatus.OK);
	}

}
