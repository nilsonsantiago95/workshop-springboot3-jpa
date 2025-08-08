package com.nilsonsantiago.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nilsonsantiago.course.entities.User;
import com.nilsonsantiago.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		List<User> users = repository.findAll();
		return users;
	}
	
	public User findById(Long id) {
		return repository.findById(id).get();
	}

}
