package com.courseudemy.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.courseudemy.course.entities.User;
import com.courseudemy.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "11999999999", "12345");
		User u2 = new User(null, "Alex Grenn", "alex@gmail.com", "11988888888", "67890");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
