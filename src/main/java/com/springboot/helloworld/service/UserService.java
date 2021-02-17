package com.springboot.helloworld.service;

import java.util.List;
import java.util.Optional;

import com.springboot.helloworld.entity.User;

public interface UserService {
	
	public User saveUser();
	
	public Optional<User> getUserById(int id);
	
	public List<User> getUserList();

}
