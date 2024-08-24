package com.example.demo.customer.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.customer.model.TaxType;

public interface TaxTypeRepository extends JpaRepository<TaxType, Long>{

}
