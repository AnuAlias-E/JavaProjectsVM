package com.training.ui;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/helloapi")
public class HelloController {

	@GetMapping("/hello")
	public String f1() {
		return "hello";
	}
	
}
