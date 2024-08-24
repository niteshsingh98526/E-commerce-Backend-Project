package com.example.demo.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.customer.model.Venue;
import com.example.demo.customer.repositry.VenueRepository;

@Service
public class VenueServiceImpl implements VenueService {
	
	@Autowired
	private VenueRepository venueRepository;

	@Override
	public Venue save(Venue venue) {
		return venueRepository.save(venue);
	}

	@Override
	public List<Venue> findAll() {
		return venueRepository.findAll();
	}

}
