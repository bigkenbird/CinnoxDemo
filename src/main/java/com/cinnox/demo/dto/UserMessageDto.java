package com.cinnox.demo.dto;

import com.cinnox.demo.dto.innerObj.Message;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserMessageDto {
	
	private String webhookEventId;
	
	private Message message;
	
	private String replyToken;

}
