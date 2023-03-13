package com.cinnox.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cinnox.demo.model.LineMessageSource;

public interface LineMessageSourceRepository extends MongoRepository<LineMessageSource, String>{

}
