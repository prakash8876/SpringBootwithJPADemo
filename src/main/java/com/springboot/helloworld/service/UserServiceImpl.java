package com.springboot.helloworld.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.helloworld.entity.User;
import com.springboot.helloworld.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repo;

	@Override
	public User saveUser() {
		User user = new User(1, "Viraj", "Pune");
		return this.repo.save(user);
	}

	@Override
	public Optional<User> getUserById(int id) {
		return this.repo.findById(id);
	}

	@Override
	public List<User> getUserList() {
		return (List<User>) this.repo.findAll();
	}

}
