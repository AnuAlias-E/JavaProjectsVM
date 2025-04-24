package com.training.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public String f1(Model model) {
		System.out.println("f1");
		model.addAttribute("message", "Welcome to UST-Global !!!");
		return "welcome";
	}
	
}
