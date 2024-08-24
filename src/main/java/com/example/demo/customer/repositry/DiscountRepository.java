package com.example.demo.customer.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.customer.model.Discount;

public interface DiscountRepository extends JpaRepository<Discount, Long> {

}
