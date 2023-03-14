package com.cinnox.demo.adaptor;

import com.cinnox.demo.dto.innerObj.Event;

import com.cinnox.demo.dto.UserMessageDto;
import com.cinnox.demo.model.LineMessageSource;

public class LineMessageQueryAdaptor {
	
	public UserMessageDto transToUserMessageDto(LineMessageSource source) {
		Event event = source.getEvents()[0];
		
		return UserMessageDto.builder()
				.message(event.getMessage())
				.replyToken(event.getReplyToken())
				.webhookEventId(event.getWebhookEventId())
				.build();
		
	}

}
