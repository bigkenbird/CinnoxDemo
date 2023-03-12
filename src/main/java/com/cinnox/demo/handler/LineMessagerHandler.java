package com.cinnox.demo.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineBotDestination;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;

@LineMessageHandler
public class LineMessagerHandler {
	
		Logger logger = LoggerFactory.getLogger(LineMessagerHandler.class);
	
	 	@EventMapping
	    public TextMessage handleTextMessageEvent(@LineBotDestination String destination,
	                                              MessageEvent<TextMessageContent> event) {
	 		logger.info("event: " + event);
	        return new TextMessage(event.getMessage().getText());
	    }

}
