package com.springboot.helloworld.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.helloworld.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
