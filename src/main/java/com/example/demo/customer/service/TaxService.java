package com.example.demo.customer.service;

import java.util.List;

import com.example.demo.customer.model.Tax;

public interface TaxService {
	public Tax save(Tax tax);
	public List<Tax> findAll();
	public Tax findById(Long id);
    public void delete(Long id);
}
