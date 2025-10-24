package com.nilsonsantiago.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nilsonsantiago.course.entities.Category;
import com.nilsonsantiago.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		List<Category> categories = repository.findAll();
		return categories;
	}
	
	public Category findById(Long id) {
		return repository.findById(id).get();
	}

}
