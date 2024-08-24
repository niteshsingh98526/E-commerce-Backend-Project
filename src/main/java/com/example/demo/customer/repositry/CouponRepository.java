package com.example.demo.customer.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.customer.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

}
