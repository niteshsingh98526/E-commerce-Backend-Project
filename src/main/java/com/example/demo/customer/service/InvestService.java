package com.example.demo.customer.service;

import java.util.List;

import com.example.demo.customer.model.Invest;

public interface InvestService {
	
	public Invest save(Invest invest);
	public List<Invest> findAll();

}
