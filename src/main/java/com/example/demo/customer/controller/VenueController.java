package com.example.demo.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.customer.model.Venue;
import com.example.demo.customer.service.VenueService;

@SuppressWarnings({"rawtypes", "unchecked"})
@RestController
@RequestMapping("/venues")
public class VenueController {
	
	@Autowired
	private VenueService venueService;
	
	@PostMapping("")
	public ResponseEntity save(@RequestBody Venue venue) {
		return new ResponseEntity(venueService.save(venue), HttpStatus.OK);
	}
	
	@GetMapping("")
	public ResponseEntity findAll() {
		return new ResponseEntity(venueService.findAll(), HttpStatus.OK);
	}

}
