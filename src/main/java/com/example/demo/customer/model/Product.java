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

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "product")
@Data
@ToString
@EqualsAndHashCode
public class Product implements Serializable{
	
	private static final long serialVersionUID = 1L ;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "cid")
	private Category cid;
	
	@ManyToOne
	@JoinColumn(name = "bid")
	private Brand bid;
	
	private String status;
	private String createby;
	private Date createdate;
	private String updateby;
	private Date updatedate;
	
}
