package com.example.demo.customer.repositry;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.customer.model.Customer;

public interface CustomerRepositry extends JpaRepository<Customer, Long> {
    
	List<Customer> findByAgeGreaterThan(int age);
	
	@Query(nativeQuery= true, value =  "select * from Customer c where age > :age")
	List<Customer> test(int age);

	Optional<Customer> findByMobile(String mobile);

}
