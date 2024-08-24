package com.example.demo.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.customer.model.Filter;
import com.example.demo.customer.service.FilterService;

@SuppressWarnings({"rawtypes", "unchecked"})
@RestController
@RequestMapping("/filters")
public class FilterController {
	
	@Autowired
	private FilterService filterService;
	
	@PostMapping("")
	public ResponseEntity save(@RequestBody Filter filter) {
		return new ResponseEntity(filterService.save(filter), HttpStatus.OK);
	}

	@GetMapping("")
	public ResponseEntity findAll() {
		return new ResponseEntity(filterService.findAll(), HttpStatus.OK);
	}
}
