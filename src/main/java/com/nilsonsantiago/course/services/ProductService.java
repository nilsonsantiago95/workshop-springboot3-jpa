package com.nilsonsantiago.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nilsonsantiago.course.entities.Product;
import com.nilsonsantiago.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		List<Product> products = repository.findAll();
		return products;
	}
	
	public Product findById(Long id) {
		return repository.findById(id).get();
	}

}
