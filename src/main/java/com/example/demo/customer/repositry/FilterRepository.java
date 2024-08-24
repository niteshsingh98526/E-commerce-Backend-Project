package com.example.demo.customer.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.customer.model.Filter;

public interface FilterRepository extends JpaRepository<Filter, Long> {

}
