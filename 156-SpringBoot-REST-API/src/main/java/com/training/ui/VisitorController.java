package com.training.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
@RequestMapping(value = "/api")
public class VisitorController {

	@Autowired
	VisitorService service;

	@PostMapping(value = "/add")
	public ResponseEntity<Visitor> addVisitor(@RequestBody Visitor visitor) {
		Visitor visitor1 = service.addNewVisitor(visitor);
		return new ResponseEntity<>(visitor1, HttpStatus.CREATED);
	}

	@PutMapping(value = "/modify")
	public ResponseEntity<Visitor> updateVisitor(@RequestBody Visitor visitor) {
		Visitor visitor1 = service.updateVisitor(visitor);
		return new ResponseEntity<>(visitor1, HttpStatus.OK);
	}

//	@GetMapping(value="/find")
//	public Visitor searchVisitor(@RequestParam(name="vid") int visitorId)
//	{
//		return service.searchVisitor(visitorId);
//	}

	@GetMapping(value = "/find/{vid}")
	public ResponseEntity<Visitor> searchVisitor(@PathVariable(name = "vid") int visitorId) {
		Visitor visitor = service.searchVisitor(visitorId);
		if (visitor != null)
			return new ResponseEntity<>(visitor, HttpStatus.OK);
		else {
			return new ResponseEntity<>(visitor, HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(value = "/showAll", produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Visitor>> getAllVisitors() {
		List<Visitor> allVisitors = service.getAllVisitors();
		// return new ResponseEntity<>(allVisitors, HttpStatus.OK);
//	return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(allVisitors);
		return ResponseEntity.ok(allVisitors);
	}

	@DeleteMapping(value = "/delete")
	public ResponseEntity<Boolean> deleteVisitor(@RequestBody Visitor visitor) {
		try {
			boolean isDeleted = service.deleteVisitor(visitor);
			return new ResponseEntity<Boolean>(isDeleted, HttpStatus.OK);
		} catch (Exception e) {
		//	return new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR);
			return ResponseEntity.internalServerError().body(false);
		}
	}
}
