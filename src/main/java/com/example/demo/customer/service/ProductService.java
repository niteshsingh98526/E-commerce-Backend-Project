package com.example.demo.customer.service;


import java.util.List;

import com.example.demo.customer.model.Product;


public interface ProductService {

	public Product save(Product product);
	public List<Product> findAll();
	public void delete(Long id);
	public Product findById(Long id);

}
