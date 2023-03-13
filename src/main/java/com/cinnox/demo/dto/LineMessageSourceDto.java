package com.cinnox.demo.dto;

import com.cinnox.demo.dto.innerObj.Event;

import lombok.Data;

@Data
public class LineMessageSourceDto {
	
	private String destination;
	
	private Event[] events;

}
