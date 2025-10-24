package com.nilsonsantiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nilsonsantiago.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}
