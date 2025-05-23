package com.training.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class InvokeController {

	@Autowired
	RestTemplate template;

	@GetMapping("/welcome")
	public String f1() {
		return "WELCOME";
	}

	@GetMapping("/sayHello")
	public String f2() {
		String result;
		String url = "http://localhost:9087/hello";

		result = template.getForObject(url, String.class);
		return result.toUpperCase();
	}
	
	@PostMapping("/invokeAdd")
	public int f4(@RequestParam(name="txt_num1") int x,@RequestParam(name="txt_num2") int y) {
		int result;
		String url = "http://localhost:9087/add/"+x+"/"+y;

		result = template.postForObject(url,  null,Integer.class);
		return result;
	}
	
	@PostMapping("/invokeSubtract")
	public int f5(@RequestParam(name="txt_num1") int x,@RequestParam(name="txt_num2") int y) {
		int result;
		String url = "http://localhost:9087/subtract/"+x+"/"+y;

		result = template.postForObject(url,  null,Integer.class);
		return result;
	}
	
	@PostMapping("/invokeMultiply")
	public int f6(@RequestParam(name="txt_num1") int x,@RequestParam(name="txt_num2") int y) {
		int result;
		String url = "http://localhost:9087/multiply/"+x+"/"+y;

		result = template.postForObject(url,  null,Integer.class);
		return result;
	}
	
	@PostMapping("/invokeDivide")
	public int f3(@RequestParam(name="txt_num1") int x,@RequestParam(name="txt_num2") int y) {
		int result;
		String url = "http://localhost:9087/divide/"+x+"/"+y;

		result = template.postForObject(url,  null,Integer.class);
		return result;
	}
}
