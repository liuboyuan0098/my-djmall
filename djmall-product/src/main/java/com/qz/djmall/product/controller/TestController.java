package com.qz.djmall.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
	
	@Value("${spring.redis.host}")
	String host;
	
	@Value("${spring.zipkin.base-url}")
	String baseUrl;
	
	@RequestMapping("/test")
	public String test(){
		return host + "-----------" + baseUrl;
	}
}
