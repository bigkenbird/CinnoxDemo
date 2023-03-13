package com.cinnox.demo.response;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class BaseRsp {
	
	private String status;
	
	private String message;

}
