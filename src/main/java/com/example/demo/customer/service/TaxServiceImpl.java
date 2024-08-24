package com.example.demo.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.customer.model.Tax;
import com.example.demo.customer.repositry.TaxRepository;

@Service
public class TaxServiceImpl implements TaxService {
	
	@Autowired
	private TaxRepository taxRepository;

	@Override
	public Tax save(Tax tax) {
		return taxRepository.save(tax);
	}

	@Override
	public List<Tax> findAll() {
		return taxRepository.findAll();
	}

	@Override
	public Tax findById(Long id) {
		Optional<Tax> byId = this.taxRepository.findById(id);
		if(byId.isPresent()) {
			return byId.get();
		}
		return null;
	}

	@Override
	public void delete(Long id) {
		this.taxRepository.deleteById(id);
	}

}
