package com.example.demo.customer.service;

import java.util.List;

import com.example.demo.customer.model.Filter;

public interface FilterService {
	
	public Filter save(Filter filter);
	public List<Filter> findAll();

}
