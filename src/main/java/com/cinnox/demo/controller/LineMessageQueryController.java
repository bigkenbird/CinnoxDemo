package com.cinnox.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinnox.demo.response.LineMessageQueryUserMsgRsp;
import com.cinnox.demo.service.LineMessageQueryService;

@RestController
@RequestMapping("line/message/query")
public class LineMessageQueryController {
	
	@Autowired
	private LineMessageQueryService lineMessageQueryService;
	
	
	@GetMapping("usermsg/{webhookEventId}")
	public LineMessageQueryUserMsgRsp userMsg(@PathVariable("webhookEventId") String webhookEventId) {
		LineMessageQueryUserMsgRsp result = lineMessageQueryService.queryUserMsg(webhookEventId);
		return result;
	}

}
