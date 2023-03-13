package com.cinnox.demo.model;

import org.springframework.data.annotation.Id;

import com.cinnox.demo.dto.innerObj.Event;

import lombok.Data;

@Data
public class LineMessageSource {
	
	@Id
	private String destination;
	
	private Event[] events;

}
