package com.example.demo.customer.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.customer.model.Invest;

public interface InvestRepository extends JpaRepository<Invest, Long>{

}
