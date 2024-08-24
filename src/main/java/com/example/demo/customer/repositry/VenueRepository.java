package com.example.demo.customer.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.customer.model.Venue;

public interface VenueRepository extends JpaRepository<Venue, Long> {

}
