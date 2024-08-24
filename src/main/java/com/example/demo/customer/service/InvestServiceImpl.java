package com.example.demo.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.customer.model.Invest;
import com.example.demo.customer.repositry.InvestRepository;

@Service
public class InvestServiceImpl implements InvestService{
	
	@Autowired
	private InvestRepository investRepository;

	@Override
	public Invest save(Invest invest) {
		return investRepository.save(invest);
	}

	@Override
	public List<Invest> findAll() {
		return investRepository.findAll();
	}

}
