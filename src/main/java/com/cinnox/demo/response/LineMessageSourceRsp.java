package com.cinnox.demo.response;

import com.cinnox.demo.model.LineMessageSource;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper=true)
public class LineMessageSourceRsp extends BaseRsp{
	
	private LineMessageSource lineMessageSource;

}
