package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{
	Product findByProductName(String name);

}
