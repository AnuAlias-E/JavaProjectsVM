package com.training.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class InvokerController {

	
	@Autowired
	@Lazy
	private EurekaClient eurekaClient;
	
	@Value("${spring.application.name}")
	private String appName;
	
	@Autowired
	private RestTemplateBuilder builder;
	
	@GetMapping("/invokeHello")
	public String f1() {
		RestTemplate template=builder.build();
		InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("165-SPRING-BOOT-EUREKACLIENT1", false);
		String baseUrl=instanceInfo.getHomePageUrl();
		String result=template.getForObject(baseUrl+"/hello", String.class);
		return result;
	}
	@GetMapping("/invokeWelcome")
	public String f2() {
		RestTemplate template=builder.build();
		InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("166-SPRING-BOOT-EUREKACLIENT2", false);
		String baseUrl=instanceInfo.getHomePageUrl();
		String result=template.getForObject(baseUrl+"/welcome", String.class);
		return result;
	}
}
