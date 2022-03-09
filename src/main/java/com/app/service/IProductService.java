package com.app.service;

import java.util.List;

import com.app.pojos.Product;

public interface IProductService {
	
	List<Product> getAllProducts();
	Product getProductById(int pId);
	Product getProductByName();
	List<Product> getAllProductByCategory();
}
