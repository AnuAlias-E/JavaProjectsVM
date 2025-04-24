package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Visitor;


@RestController
@RequestMapping("/api")
public class VisitorController {

	
	@GetMapping("/showVisitor")
	public Visitor f1() {
		Visitor visitor = new Visitor(1055, "Kiran",  25,"Male");
		return visitor;
	}
	
	
	@GetMapping("/visitors")
	public List<Visitor> f2() {
		Visitor visitor1 = new Visitor(1055, "Kiran",  25,"Male");
		Visitor visitor2 = new Visitor(1056, "Manu",  34,"Male");
		Visitor visitor3 = new Visitor(1057, "Anu Alias",  39,"Female");
		List<Visitor> visitors=new LinkedList<>();
		visitors.add(visitor1);
		visitors.add(visitor2);
		visitors.add(visitor3);
		return visitors;
	}
}
