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

import com.example.demo.customer.model.TaxRule;
import com.example.demo.customer.service.TaxRuleService;

@SuppressWarnings({"rawtypes", "unchecked"})
@RestController
@RequestMapping("/taxrules")
public class TaxRuleController {
	
	@Autowired
	private TaxRuleService taxruleService;
	
	@PostMapping("")
	public ResponseEntity save(@RequestBody TaxRule taxrule) {
		return new ResponseEntity(taxruleService.save(taxrule), HttpStatus.OK);
	}
	
	@GetMapping(value = {"/{id}"})
	public ResponseEntity findIdEntity(@PathVariable Long id) {
		return new ResponseEntity(taxruleService.findById(id), HttpStatus.OK);
	}
	
	@GetMapping("")
	public ResponseEntity findAll() {
		return new ResponseEntity(taxruleService.findAll(), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable Long id) {
		taxruleService.delete(id);
		return new ResponseEntity("Success", HttpStatus.OK);
	}

}
