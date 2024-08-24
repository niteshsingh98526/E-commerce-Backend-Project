package com.example.demo.customer.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.customer.model.TaxRule;

public interface TaxRuleRepository extends JpaRepository<TaxRule, Long> {

}
