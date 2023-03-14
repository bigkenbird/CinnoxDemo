package com.cinnox.demo.service;


import java.util.concurrent.ExecutionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.cinnox.demo.exception.LineMessagePushException;
import com.cinnox.demo.request.LineMessageBackRq;
import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.model.ReplyMessage;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.model.response.BotApiResponse;

@Service
public class LineMessagePushService {
	
	Logger logger = LoggerFactory.getLogger(LineMessagePushService.class);
	
	@Value("${line.bot.channelToken}")
	private String channelToken;
	

	public void push(LineMessageBackRq rq) throws LineMessagePushException {
		LineMessagingClient client = LineMessagingClient
		        .builder(channelToken)
		        .build();
		TextMessage textMessage = new TextMessage(rq.getMessage());
		ReplyMessage replyMessage = new ReplyMessage(
		        rq.getReplyToken(),
		        textMessage);
		try {
			BotApiResponse botApiResponse = client.replyMessage(replyMessage).get();
			logger.info(botApiResponse.getRequestId());
			logger.info(botApiResponse.getMessage());
		} catch (InterruptedException | ExecutionException e) {
		    logger.error(e.getMessage());
		    throw new LineMessagePushException(e);
		}
		
	}

}
