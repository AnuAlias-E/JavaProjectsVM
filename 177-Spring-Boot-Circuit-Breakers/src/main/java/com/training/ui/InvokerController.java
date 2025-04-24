package com.training.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class InvokerController {
	
@Autowired
RestTemplateBuilder builder;


	@GetMapping("/invoke")
	@CircuitBreaker(name ="serviceA",fallbackMethod = "f1")
	public String welcome() {
		String url="http://localhost:9088/helloapi/hello";
		RestTemplate restTemplate= builder.build();
		String result=restTemplate.getForObject(url, String.class);
		return result.toUpperCase();
	}
	
	public String f1(Exception e) {
		return "Just for a while";
	}
}
