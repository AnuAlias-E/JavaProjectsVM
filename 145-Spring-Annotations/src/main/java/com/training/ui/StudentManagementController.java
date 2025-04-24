package com.training.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.training.service.StudentService;

@Controller
public class StudentManagementController {

	@Autowired
	StudentService service;

	@Override
	public String toString() {
		return "StudentManagementController [service=" + service + "]";
	}
	
	
}
