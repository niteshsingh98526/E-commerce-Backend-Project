package com.example.demo.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.customer.model.Product;
import com.example.demo.customer.repositry.ProductRepositry;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	public ProductRepositry productRepositry;

	@Override
	public Product save(Product product) {
		return  productRepositry.save(product);
	}

	@Override
	public List<Product> findAll() {
		return productRepositry.findAll();
	}

	@Override
	public void delete(Long id) {
      this.productRepositry.deleteById(id);	
	}

	@Override
	public Product findById(Long id) {
		Optional<Product> byId = this.productRepositry.findById(id);
		if(byId.isPresent()) {
			return byId.get();
	}
		return null;
		
	}

	//@Override
	//public List<Product> findByPrice(int price) {
		//return this.productRepositry.findByPrice(price);
	//}
	
}