package com.example.demo.customer.service;

import java.util.List;

import com.example.demo.customer.model.Venue;

public interface VenueService {
	
	public Venue save(Venue venue);
	public List<Venue> findAll();

}
