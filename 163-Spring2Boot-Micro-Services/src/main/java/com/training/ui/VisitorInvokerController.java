package com.training.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.training.model.Visitor;



@RestController
public class VisitorInvokerController {
	
	@Autowired
	RestTemplate template;

	@GetMapping("/invokeFetchVisitor")
	public ResponseEntity<Visitor> f1() {
		ResponseEntity<Visitor> result;
		String url = "http://localhost:9087/fetchVisitor";

		result = template.getForEntity(url,  Visitor.class);
		
		return result;
	}
	
	@GetMapping("/invokeFetchVisitors")
	public ResponseEntity<List > f2() {
		ResponseEntity<List > result;
		String url = "http://localhost:9087/fetchVisitors";

		result = template.getForEntity(url,  List.class);
		
		return result;
	}
	

	@PostMapping("/invokeConvert")
	public ResponseEntity<Visitor> f3(@RequestBody Visitor visitor) {
		ResponseEntity<Visitor> result;
		String url = "http://localhost:9087/convert";

		result = template.postForEntity(url,visitor,  Visitor.class);
		
		return result;
	}
	
	
}
