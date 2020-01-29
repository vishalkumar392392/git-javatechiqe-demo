package com.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.entity.User;
import com.jwt.repository.UserRepository;

@RestController
public class WelomeController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/")
	public String welcomeController() {
		
		return "jason-web-token";
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		
		return userRepository.findAll();
		
	}
}
