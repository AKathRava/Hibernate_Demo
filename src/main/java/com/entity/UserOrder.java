package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserOrder {
	@Id
	private int orderId;
	
	private String name;
	
	private Double price;
	
	private int qty;

}
