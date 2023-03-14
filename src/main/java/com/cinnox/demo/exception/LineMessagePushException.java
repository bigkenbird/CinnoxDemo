package com.cinnox.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class LineMessagePushException extends Exception{

	private static final long serialVersionUID = -6359206171834754409L;
	
	private Exception exception;
	
	

}
