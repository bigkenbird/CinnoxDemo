package com.cinnox.demo.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cinnox.demo.model.LineMessageSource;
import com.cinnox.demo.model.User;

@SpringBootTest
public class UserRepositoryTest {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private LineMessageSourceRepository lineMessageSourceRepository;
	
	
	void testFindOne() {
		List<User> users=  userRepository.findAll();
		users.stream().forEach(data->{
			System.out.println(data);
		});
	}
	
	@Test
	void test1() {
		List<LineMessageSource> results = lineMessageSourceRepository.findByWebhookEventId("01GVG7R6YQWN7GQ798F39EW3NE");
		results.stream().forEach(data->{
			System.out.println(data);
		});
	}

}
