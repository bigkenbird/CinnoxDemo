package com.cinnox.demo.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class User {
	
	@Id
	private String id;
	
	private String name;
	
	

	
	

}
