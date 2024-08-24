package com.example.demo.customer.service;

import java.util.List;

import com.example.demo.customer.model.TaxType;

public interface TaxTypeService {
	
	public TaxType save(TaxType taxtype);
	public List<TaxType> findAll();
	public TaxType findById(Long id);
	public void delete(Long id);

}
