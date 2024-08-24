package com.example.demo.customer.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.customer.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
