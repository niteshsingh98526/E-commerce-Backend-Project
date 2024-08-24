package com.example.demo.customer.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.customer.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {

}
