package com.cinnox.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cinnox.demo.dto.innerObj.Message;
import com.cinnox.demo.exception.LineMessagePushException;
import com.cinnox.demo.request.LineMessageBackRq;

@SpringBootTest
public class LineMessagePushServiceTest {
	
	@Autowired
	private LineMessagePushService lineMessagePushService;
	
	@Test
	void testPush() throws LineMessagePushException {
		
	}

}
