package com.example.demo.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.customer.model.Filter;
import com.example.demo.customer.repositry.FilterRepository;

@Service
public class FilterServiceImpl implements FilterService{
	
	@Autowired
	private FilterRepository filterRepository;

	@Override
	public Filter save(Filter filter) {
		return filterRepository.save(filter);
	}

	@Override
	public List<Filter> findAll() {
		return filterRepository.findAll();
	}

}
