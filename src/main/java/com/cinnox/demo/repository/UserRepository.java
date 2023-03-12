package com.cinnox.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cinnox.demo.model.User;

public interface UserRepository extends MongoRepository<User, String>{

}
