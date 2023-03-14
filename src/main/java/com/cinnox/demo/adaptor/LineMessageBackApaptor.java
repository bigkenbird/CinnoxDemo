package com.cinnox.demo.adaptor;

import com.cinnox.demo.request.LineMessageBackRq;
import com.cinnox.demo.request.SendBackRq;

public class LineMessageBackApaptor {
	
	public LineMessageBackRq transLineMessageBackRq(SendBackRq rq) {
		LineMessageBackRq target = new LineMessageBackRq();
		target.setReplyToken(rq.getReplyToken());
		target.setMessage(rq.getMessage());
		return target;
	}

}
