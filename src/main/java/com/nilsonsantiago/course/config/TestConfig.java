package com.nilsonsantiago.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.nilsonsantiago.course.entities.Category;
import com.nilsonsantiago.course.entities.Order;
import com.nilsonsantiago.course.entities.User;
import com.nilsonsantiago.course.entities.enums.OrderStatus;
import com.nilsonsantiago.course.repositories.CategoryRepository;
import com.nilsonsantiago.course.repositories.OrderRepository;
import com.nilsonsantiago.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		Order o1 = new Order(null, Instant.parse("2025-10-23T10:45:30Z"), OrderStatus.WAITING_PAYMENT, u1);
		Order o2 = new Order(null, Instant.parse("2025-10-24T12:45:20Z"), OrderStatus.PAID, u2);
		Order o3 = new Order(null, Instant.parse("2025-10-25T23:30:25Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	
}
