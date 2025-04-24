package com.training.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.training.model.Student;

@Controller
public class StudentController {

	
	@RequestMapping("/input")
	public ModelAndView f2() {
		ModelAndView mav = new ModelAndView("studentInput");
		Student student = new Student();
		mav.addObject("stud",student);
		return mav;
	}
	
	@RequestMapping("/output")
	public ModelAndView f3(@ModelAttribute(name="stud") Student student) {
		ModelAndView mav = new ModelAndView("StudentOutput1");
		mav.addObject("stu",student);
		return mav;
	}
	
}
