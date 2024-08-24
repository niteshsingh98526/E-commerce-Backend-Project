package com.example.demo.customer.service;

import java.util.List;

import com.example.demo.customer.model.Coupon;

public interface CouponService {
	
	public Coupon save(Coupon coupon);
	public List<Coupon> findAll();
	public void delete(Long id);

}
