package com.cinnox.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinnox.demo.dto.LineMessageSourceDto;
import com.cinnox.demo.response.LineMessageSourceRsp;
import com.cinnox.demo.service.LineMessageConsumerService;

@RestController
@RequestMapping("webhook")
public class WebhookController {
	
	@Autowired
	private LineMessageConsumerService lineMessageConsumerService;
	
	Logger logger = LoggerFactory.getLogger(WebhookController.class);
	
	@RequestMapping("consumer")
	public void consumer(@RequestBody LineMessageSourceDto source) {
		logger.info("source:"+source);
		lineMessageConsumerService.saveSourceMsg(source);
		
	}
	
	@GetMapping("search/{destination}")
	public LineMessageSourceRsp seach(@PathVariable("destination") String destination) {
		logger.info("destination:"+destination);
		LineMessageSourceRsp result=lineMessageConsumerService.search(destination);
		return result;
		
	}

}
