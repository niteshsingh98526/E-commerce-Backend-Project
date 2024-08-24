package com.example.demo.customer.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.customer.model.Tax;

public interface TaxRepository extends JpaRepository<Tax, Long>{

}
