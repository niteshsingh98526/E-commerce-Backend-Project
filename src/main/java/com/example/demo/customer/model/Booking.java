package com.example.demo.customer.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "booking")
@Data
@ToString
@EqualsAndHashCode
public class Booking implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonIgnoreProperties(value= "Bookings")
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	@JsonIgnoreProperties(value= "Bookings")
	@ManyToOne
	@JoinColumn(name = "venueId")
	private Venue venue;
	private String packing;
	private String size;
	private Date eventdate;
	private Integer totalprice;
	private Date bookingdate;

}
