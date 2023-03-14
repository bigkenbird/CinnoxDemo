package com.cinnox.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.cinnox.demo.adaptor.LineMessageQueryAdaptor;
import com.cinnox.demo.model.LineMessageSource;
import com.cinnox.demo.repository.LineMessageSourceRepository;
import com.cinnox.demo.response.LineMessageQueryUserMsgRsp;

@Service
public class LineMessageQueryService {
	
	@Autowired
	private LineMessageSourceRepository lineMessageSourceRepository;
	
	@Autowired
	private LineMessageQueryAdaptor lineMessageQueryAdaptor;
	
	
	public LineMessageQueryUserMsgRsp queryUserMsg(String webhookEventId) {
		List<LineMessageSource> results =lineMessageSourceRepository.findByWebhookEventId(webhookEventId);
		
		return 
				LineMessageQueryUserMsgRsp.builder()
				.status("200")
				.message(CollectionUtils.isEmpty(results) ? "no data":"success")
				.userMessageDtos(CollectionUtils.isEmpty(results)? null:results.stream().map(data->{
					return lineMessageQueryAdaptor.transToUserMessageDto(data);
				}).collect(Collectors.toList()))
				.build();	
	}
	
	

}
