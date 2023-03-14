package com.cinnox.demo.request;

import lombok.Data;

@Data
public class LineMessageBackRq {
	
	private String replyToken;
	
	private String message;

}
