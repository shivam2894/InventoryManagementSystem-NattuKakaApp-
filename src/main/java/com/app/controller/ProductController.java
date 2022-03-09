package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.IProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@GetMapping
	public ResponseEntity<?> fetchAllProducts(){
		System.out.println("in fetch all products");
		return new ResponseEntity<>(productService.getAllProducts(),HttpStatus.OK);
	}
	
	@GetMapping("/{pId}")
	public ResponseEntity<?> fetchProductById(@PathVariable int pId){
		System.out.println("in fetch all product by id");
		return new ResponseEntity<>(productService.getProductById(pId),HttpStatus.OK);
	}
	
	
	
}
