package com.training.ui;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.training.model.Student;
import com.training.service.StudentService;
import com.training.service.StudentServiceImpl;

@Controller
public class StudentManagementController {

	@RequestMapping("/ListStudents")
	public ModelAndView f1() {
		ModelAndView mav = new ModelAndView("DisplayAllStudents");
		StudentService service = new StudentServiceImpl();
		List<Student> allStudents = service.getAllStudents();
		mav.addObject("studs", allStudents);
		return mav;

	}

}
