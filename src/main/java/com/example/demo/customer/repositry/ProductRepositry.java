package com.example.demo.customer.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.customer.model.Product;

public interface ProductRepositry extends JpaRepository<Product, Long> {

	//List<Product> findByPrice(int price);
	
	//@Query(nativeQuery= true, value =  "select * from Product p where price == :price")
	//List<Product> test(int price);
}