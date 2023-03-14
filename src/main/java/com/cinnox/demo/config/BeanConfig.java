package com.cinnox.demo.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.cinnox.demo.adaptor.LineMessageBackApaptor;
import com.cinnox.demo.adaptor.LineMessageConsumerAdaptor;

@Configuration
public class BeanConfig {
	
	@Bean
	public LineMessageConsumerAdaptor lineMessageConsumerAdaptor() {
		return new LineMessageConsumerAdaptor();
	}
	
	@Bean
	public LineMessageBackApaptor lineMessageBackApaptor() {
		return new LineMessageBackApaptor();
	}
	
	@Bean
	RestTemplate restTemplate() {
		final RestTemplate restTemplate = new RestTemplate();
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
		messageConverters.add(converter);
		restTemplate.setMessageConverters(messageConverters);
	    return restTemplate;
	}

}
