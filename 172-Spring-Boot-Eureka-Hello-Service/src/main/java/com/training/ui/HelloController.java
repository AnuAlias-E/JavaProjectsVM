package com.training.ui;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/helloapi")
public class HelloController {

	@GetMapping("/hello")
	public String f1() {
		return "Hello".toUpperCase();
	}
	
	
}
