package com.example.demo.customer.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.customer.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{

}
