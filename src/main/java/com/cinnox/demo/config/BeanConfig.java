package com.cinnox.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cinnox.demo.adaptor.LineMessageConsumerAdaptor;

@Configuration
public class BeanConfig {
	
	@Bean
	public LineMessageConsumerAdaptor lineMessageConsumerAdaptor() {
		return new LineMessageConsumerAdaptor();
	}

}
