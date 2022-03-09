package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.ProductRepo;
import com.app.pojos.Product;

@Service
@Transactional
public class ProductService implements IProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Product getProductById(int pId) {
		// TODO Auto-generated method stub
		return productRepo.findById(pId).orElseThrow(()-> new ResourceNotFoundException("Product with ID " + pId + " not found!!!!!!!!!"));
	}

	@Override
	public Product getProductByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProductByCategory() {
		// TODO Auto-generated method stub
		return null;
	}

}
