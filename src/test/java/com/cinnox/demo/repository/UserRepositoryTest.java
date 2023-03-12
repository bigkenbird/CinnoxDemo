package com.cinnox.demo.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cinnox.demo.model.User;

@SpringBootTest
public class UserRepositoryTest {
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	void testFindOne() {
		List<User> users=  userRepository.findAll();
		users.stream().forEach(data->{
			System.out.println(data);
		});
	}

}
