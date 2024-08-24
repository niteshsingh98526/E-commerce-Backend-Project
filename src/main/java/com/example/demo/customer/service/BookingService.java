package com.example.demo.customer.service;

import java.util.List;

import com.example.demo.customer.model.Booking;

public interface BookingService {
	
	public Booking save(Booking booking); 
	public List<Booking> findAll();

}
