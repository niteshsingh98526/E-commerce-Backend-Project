package com.example.demo.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.customer.model.Coupon;
import com.example.demo.customer.service.CouponService;

@SuppressWarnings({"rawtypes", "unchecked"})
@RestController
@RequestMapping("/coupons")
public class CouponController {
	
	@Autowired
	private CouponService couponService;
	
	@PostMapping("")
	public ResponseEntity save(@RequestBody Coupon coupon) {
		return new ResponseEntity(couponService.save(coupon), HttpStatus.OK);
	}
	
	@GetMapping("")
	public ResponseEntity findAll() {
		return new ResponseEntity(couponService.findAll(), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable Long id) {
		couponService.delete(id);
		return new ResponseEntity("Success", HttpStatus.OK);
	}

}
