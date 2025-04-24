package com.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.db.StudentDAO;

@Service
public class StudentService {

	@Autowired
	StudentDAO dao;

	@Override
	public String toString() {
		return "StudentService [dao=" + dao + "]";
	}
	
	

}
