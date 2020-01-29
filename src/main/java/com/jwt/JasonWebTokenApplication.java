package com.jwt;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jwt.entity.User;
import com.jwt.repository.UserRepository;

@SpringBootApplication
public class JasonWebTokenApplication {

	@Autowired
	private UserRepository userRepository;
	
	
	private Logger logger;
	
	public static void main(String[] args) {
		SpringApplication.run(JasonWebTokenApplication.class, args);
	}
	
	
	@PostConstruct
	public void initusers() {
		
		List<User> list = new ArrayList<>();
		
		list.add(new User(101,"vishal","password","vishal@gmail.com"));
		list.add(new User(102,"vikas","password","vishal@gmail.com"));
		list.add(new User(103,"ananya","password","vishal@gmail.com"));
		list.add(new User(104,"ajith","password","vishal@gmail.com"));
		
		userRepository.saveAll(list);
		
		logger = LoggerFactory.getLogger(getClass());
		logger.info("{}",userRepository.findAll());
	}

}
