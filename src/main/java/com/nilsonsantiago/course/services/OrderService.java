package com.nilsonsantiago.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nilsonsantiago.course.entities.Order;
import com.nilsonsantiago.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		List<Order> orders = repository.findAll();
		return orders;
	}
	
	public Order findById(Long id) {
		return repository.findById(id).get();
	}

}
