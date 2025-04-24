package com.training.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public ModelAndView f1() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Spring MVC is an exciting world!!");
		mav.setViewName("welcome");
		return mav;
	}
	
	@RequestMapping("/goodbye")
	public ModelAndView f2() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Thanks for using Spring MVC");
		mav.setViewName("goodbye");
		return mav;
	}
	
	
	@RequestMapping("/greet")
	public String greet() {
		
		return "greeting";
	}
}
