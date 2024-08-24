package com.example.demo.customer.service;

import java.util.List;

import com.example.demo.customer.model.TaxRule;

public interface TaxRuleService {
	
	public TaxRule save(TaxRule taxrule);
	public TaxRule findById(Long id);
	public List<TaxRule> findAll();
	public void delete(Long id); 

}
