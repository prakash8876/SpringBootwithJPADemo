package com.springboot.helloworld.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.helloworld.entity.User;
import com.springboot.helloworld.service.UserService;

@RestController
public class HomeController {

	@Autowired
	private UserService service;
	
	@GetMapping("/save")
	public User saveUser() {
		return this.service.saveUser();
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getUserById(@PathVariable int id) {
		return this.service.getUserById(id);
	}
	
	@GetMapping("/")
	public List<User> getUserList() {
		return this.service.getUserList();
	}
	
}
