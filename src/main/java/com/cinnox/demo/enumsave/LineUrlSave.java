package com.cinnox.demo.enumsave;

import org.springframework.http.HttpMethod;

public enum LineUrlSave {
	
	MessagePush("https://api.line.me/v2/bot/message/push",HttpMethod.POST);
	
	private String url;
	
	private HttpMethod httpMethod;
	
	
	LineUrlSave(String url, HttpMethod httpMethod) {
		this.url = url;
		this.httpMethod = httpMethod;
	}


	public String getUrl() {
		return url;
	}


	public HttpMethod getHttpMethod() {
		return httpMethod;
	}
	
	

}
