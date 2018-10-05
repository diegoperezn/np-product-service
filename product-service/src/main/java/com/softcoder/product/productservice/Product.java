package com.softcoder.product.productservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;

	public Product() {
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
