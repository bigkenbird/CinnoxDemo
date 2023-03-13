package com.cinnox.demo.dto.innerObj;

import lombok.Data;

@Data
public class Event {
	
	private String type;
	
	private Message message;
	
	private String webhookEventId;
	
	private DeliveryContext deliveryContext;
	
	private String  timestamp;
	
	private String replyToken;
	
	private String mode;
	
	

}
