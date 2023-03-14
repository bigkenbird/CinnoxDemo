package com.cinnox.demo.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cinnox.demo.exception.LineMessagePushException;
import com.cinnox.demo.response.ExceptionRsp;

@ControllerAdvice
public class ExceptionSolveHandler {
	
	@ExceptionHandler(value=LineMessagePushException.class)
	public ExceptionRsp lineMessagePushException(LineMessagePushException ex) {
		return ExceptionRsp.builder()
				.status("400")
				.message(ex.getMessage())
				.build();
		
	}

}
