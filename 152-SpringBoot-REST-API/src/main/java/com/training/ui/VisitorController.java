package com.training.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Visitor;
import com.training.service.VisitorService;

@RestController
@RequestMapping(value="/api")
public class VisitorController {
	
	
	@Autowired
	VisitorService service;
	
	@PostMapping(value="/add")
	public Visitor addVisitor(@RequestBody Visitor visitor)
	{
		return service.addNewVisitor(visitor);
	}
	
	@PutMapping(value="/modify")
	public Visitor updateVisitor(@RequestBody Visitor visitor)
	{
		return service.updateVisitor(visitor);
	}
	
//	@GetMapping(value="/find")
//	public Visitor searchVisitor(@RequestParam(name="vid") int visitorId)
//	{
//		return service.searchVisitor(visitorId);
//	}
	
	@GetMapping(value="/find/{vid}")
	public Visitor searchVisitor(@PathVariable(name="vid") int visitorId)
	{
		return service.searchVisitor(visitorId);
	}
	
	@GetMapping(value="/showAll")
	public List< Visitor> searchVisitor()
	{
		return service.getAllVisitors();
	}
	
	@DeleteMapping(value="/delete")
	public boolean deleteVisitor(@RequestBody Visitor visitor)
	{
		return service.deleteVisitor(visitor);
	}
}
