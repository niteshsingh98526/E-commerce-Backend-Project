package com.example.demo.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.customer.model.TaxRule;
import com.example.demo.customer.repositry.TaxRuleRepository;

@Service
public class TaxRuleServiceImpl implements TaxRuleService{
	
	@Autowired
	private TaxRuleRepository taxruleRepository;

	@Override
	public TaxRule save(TaxRule taxrule) {
		return taxruleRepository.save(taxrule);
	}

	@Override
	public TaxRule findById(Long id) {
		Optional<TaxRule> byId = this.taxruleRepository.findById(id);
		if(byId.isPresent()) {
			return byId.get();
		}
		return null;	
	}

	@Override
	public List<TaxRule> findAll() {
		return taxruleRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		 this.taxruleRepository.deleteById(id);
	}

}
