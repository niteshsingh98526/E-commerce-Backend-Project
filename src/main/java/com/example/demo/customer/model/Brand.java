package com.example.demo.customer.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "book")
@Data
@ToString
@EqualsAndHashCode
public class Brand implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bid;
	
	private String bname;
	private Number price;
	private String authorized;
	private Long publisherid;
	private String bstatus;
	private String bcreateby;
	private Date bcreatedate;
	private String bupdateby;
	private Date bupdatedate;

}
