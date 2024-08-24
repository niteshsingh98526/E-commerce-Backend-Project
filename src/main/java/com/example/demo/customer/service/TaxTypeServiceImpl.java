package com.example.demo.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.customer.model.TaxType;
import com.example.demo.customer.repositry.TaxTypeRepository;

@Service
public class TaxTypeServiceImpl implements TaxTypeService{
	
	@Autowired
	private TaxTypeRepository taxtypeRepository;

	@Override
	public TaxType save(TaxType taxtype) {
		return taxtypeRepository.save(taxtype);
	}

	@Override
	public List<TaxType> findAll() {
		return taxtypeRepository.findAll();
	}

	@Override
	public TaxType findById(Long id) {
    Optional<TaxType> byId = this.taxtypeRepository.findById(id);
    if(byId.isPresent()) {
    	return byId.get();
    }
	return null;
	}

	@Override
	public void delete(Long id) {
      this.taxtypeRepository.deleteById(id);		
	}

}
