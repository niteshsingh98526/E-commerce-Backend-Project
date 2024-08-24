package com.example.demo.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.customer.model.Invest;
import com.example.demo.customer.service.InvestService;

@SuppressWarnings({"rawtypes","unchecked"})
@RestController
@RequestMapping("/invests")
public class InvestController {
	
	@Autowired
	private InvestService inverstseService;
	
	@PostMapping("")
	public ResponseEntity<Invest> save(@RequestBody Invest invest) {
		return new ResponseEntity(inverstseService.save(invest), HttpStatus.OK );
	}
	
	@GetMapping("")
	public ResponseEntity findAll() {
		return new ResponseEntity(inverstseService.findAll(), HttpStatus.OK);
	}

}
