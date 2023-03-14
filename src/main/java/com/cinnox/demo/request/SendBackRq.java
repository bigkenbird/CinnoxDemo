package com.cinnox.demo.request;

import lombok.Data;

@Data
public class SendBackRq {
	
	private String replyToken;
	
	private String message;

}
