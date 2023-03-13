package com.cinnox.demo.adaptor;

import org.springframework.beans.BeanUtils;

import com.cinnox.demo.dto.LineMessageSourceDto;
import com.cinnox.demo.model.LineMessageSource;

public class LineMessageConsumerAdaptor {
	
	public  LineMessageSource transLineMessageSource(LineMessageSourceDto source) {
		LineMessageSource target = new LineMessageSource();
		BeanUtils.copyProperties(source, target);
		return target;
		
	}

}
