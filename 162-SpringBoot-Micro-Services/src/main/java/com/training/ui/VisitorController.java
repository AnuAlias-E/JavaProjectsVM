package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.bean.Visitor;


@RestController
public class VisitorController {

	
	@GetMapping("/fetchVisitor")
	public ResponseEntity<Visitor> f1() {
		Visitor visitor = new Visitor(101, "SriRam", "Male", "Pune");
		
		return ResponseEntity.ok(visitor);
	}
	
	@GetMapping("/fetchVisitors")
	public ResponseEntity<List<Visitor> > f2() {
		Visitor visitor1 = new Visitor(101, "SriRam", "Male", "Pune");
		Visitor visitor2 = new Visitor(102, "Sree", "Female", "Kochi");
		Visitor visitor3 = new Visitor(103, "Arjun", "Male", "Kochi");
		Visitor visitor4 = new Visitor(104, "Pearl", "Female", "TVM");
		
		List<Visitor> visitors=new LinkedList<>();
		visitors.add(visitor1);
		visitors.add(visitor2);
		visitors.add(visitor3);
		visitors.add(visitor4);
		return ResponseEntity.ok(visitors);
	}
	
	
	@PostMapping("/convert")
	public ResponseEntity<Visitor> f3(@RequestBody Visitor visitor) {
		
		System.out.println("Visitor Controller: "+visitor);
		
		visitor.setName(visitor.getName().toUpperCase());
		visitor.setGender(visitor.getGender().toUpperCase());
		return ResponseEntity.ok(visitor);
	}

}
