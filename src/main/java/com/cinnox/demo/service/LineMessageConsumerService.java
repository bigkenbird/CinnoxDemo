package com.cinnox.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinnox.demo.adaptor.LineMessageConsumerAdaptor;
import com.cinnox.demo.dto.LineMessageSourceDto;
import com.cinnox.demo.model.LineMessageSource;
import com.cinnox.demo.repository.LineMessageSourceRepository;
import com.cinnox.demo.response.LineMessageSourceRsp;

@Service
public class LineMessageConsumerService {
	
	@Autowired
	private LineMessageSourceRepository lineMessageSourceRepository;
	
	@Autowired
	private LineMessageConsumerAdaptor lineMessageConsumerAdaptor;
	
	public LineMessageSourceRsp search(String destination) {
	Optional<LineMessageSource> source = lineMessageSourceRepository.findById(destination);
	return LineMessageSourceRsp.builder()
		    .status("200")
		    .message(source.isPresent() ? "success" : "no data")
		    .lineMessageSource(source.orElse(null))
		    .build();
		
	}
	
	public void saveSourceMsg(LineMessageSourceDto source) {
		LineMessageSource saveData = lineMessageConsumerAdaptor.transLineMessageSource(source);
		lineMessageSourceRepository.save(saveData);
	}

}
