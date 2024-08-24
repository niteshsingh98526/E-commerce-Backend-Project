package com.example.demo.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.customer.model.Coupon;
import com.example.demo.customer.repositry.CouponRepository;

@Service
public class CouponServiceImpl implements CouponService{
	
	@Autowired
	private CouponRepository couponRepository;

	@Override
	public Coupon save(Coupon coupon) {
		return couponRepository.save(coupon);
	}

	@Override
	public List<Coupon> findAll() {
		return couponRepository.findAll();
	}

	@Override
	public void delete(Long id) {
      this.couponRepository.deleteById(id);		
	}

}
