package com.cinnox.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinnox.demo.adaptor.LineMessageBackApaptor;
import com.cinnox.demo.exception.LineMessagePushException;
import com.cinnox.demo.request.LineMessageBackRq;
import com.cinnox.demo.request.SendBackRq;
import com.cinnox.demo.service.LineMessagePushService;

@RestController
@RequestMapping("line/message/back")
public class LineMessageBackController {
	
	@Autowired
	private LineMessageBackApaptor lineMessageBackApaptor;
	
	@Autowired
	private LineMessagePushService lineMessagePushService;
	
	@PostMapping(value="send",consumes = {"application/*; charset=UTF-8"},produces="application/json;charset=UTF-8")
	public void send(@RequestBody SendBackRq rq) throws LineMessagePushException {
		LineMessageBackRq transRq = lineMessageBackApaptor.transLineMessageBackRq(rq);
		lineMessagePushService.push(transRq);
	}

}
