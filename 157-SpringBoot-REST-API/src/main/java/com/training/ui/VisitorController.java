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

import com.training.dto.request.VisitorAddRequest;
import com.training.dto.request.VisitorDeleteRequest;
import com.training.dto.request.VisitorUpdateRequest;
import com.training.dto.response.VisitorAddResponse;
import com.training.dto.response.VisitorDeleteResponse;
import com.training.dto.response.VisitorModifyResponse;
import com.training.dto.response.VisitorSearchResponse;
import com.training.dto.response.VisitorShowAllByCityResponse;
import com.training.dto.response.VisitorShowAllByNameResponse;
import com.training.dto.response.VisitorShowAllResponse;
import com.training.exception.VisitorNotFoundException;
import com.training.model.Visitor;
import com.training.service.VisitorService;

@RestController
@RequestMapping(value = "/api")
public class VisitorController {

	@Autowired
	VisitorService service;

	@PostMapping(value = "/add", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<VisitorAddResponse> addVisitor(@RequestBody VisitorAddRequest request) {
		VisitorAddResponse addResponse = new VisitorAddResponse();
		
		Visitor visitor1 = service.addNewVisitor(request.getVisitor());
		addResponse.setStatusCode(201);
		addResponse.setDescription("Visitor Added Successfully");
		addResponse.setVisitor(visitor1);
		return new ResponseEntity<>(addResponse, HttpStatus.CREATED);
	}

	@PutMapping(value = "/modify")
	public ResponseEntity<VisitorModifyResponse> updateVisitor(@RequestBody VisitorUpdateRequest request) {
		VisitorModifyResponse response = new VisitorModifyResponse();
		
		Visitor visitor1 = service.searchVisitor(request.getVisitor());
		if (visitor1 != null) {
		
		Visitor visitor2 = service.updateVisitor(request.getVisitor());
		response.setStatusCode(200);
		response.setDescription("Visitor Modified Successfully");
		response.setVisitor(visitor2);
		return new ResponseEntity<>(response, HttpStatus.OK);
		}else {
			response.setStatusCode(404);
			response.setDescription("Visitor Not Found");
			response.setVisitor(visitor1);			
			return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
		}
	}

//	@GetMapping(value="/find")
//	public Visitor searchVisitor(@RequestParam(name="vid") int visitorId)
//	{
//		return service.searchVisitor(visitorId);
//	}

	@GetMapping(value = "/find/{vid}")
	public ResponseEntity<VisitorSearchResponse> searchVisitor(@PathVariable(name = "vid") int visitorId) throws Exception{
		Visitor visitor = service.searchVisitor(visitorId);
		VisitorSearchResponse response = new VisitorSearchResponse();
		if (visitor != null) {
			response.setStatusCode(200);
			response.setDescription("Visitor fetched Successfully");
			response.setVisitor(visitor);		
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
		/*else {
		response.setStatusCode(404);
		response.setDescription("Visitor Not Found");
		response.setVisitor(null);	
			
			
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		}*/
		else {
			Exception e= new VisitorNotFoundException("Visitor Not Found");
			throw e;
		}
	}

	@GetMapping(value = "/showAll", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<VisitorShowAllResponse> getAllVisitors() {
		List<Visitor> allVisitors = service.getAllVisitors();
		VisitorShowAllResponse response = new VisitorShowAllResponse();
		response.setStatusCode(200);
		response.setDescription("All Visitors Fetched");
		response.setVisitors(allVisitors);

		// return new ResponseEntity<>(response, HttpStatus.OK);
		return ResponseEntity.ok(response);
	}

	@DeleteMapping(value = "/delete")
	public ResponseEntity<VisitorDeleteResponse> deleteVisitor(@RequestBody VisitorDeleteRequest request) {
		VisitorDeleteResponse deleteResponse = new VisitorDeleteResponse();
		
		Visitor visitor1 = this.service.searchVisitor(request.getVisitor());
		if (visitor1 != null) {
			try {
				boolean isDeleted = service.deleteVisitor(request.getVisitor());
				deleteResponse.setStatusCode(200);
				deleteResponse.setDescription("Visitor Deleted Successfully");
				deleteResponse.setDeleteStatus(isDeleted);
				return ResponseEntity.ok().body(deleteResponse);

			} catch (Exception e) {
				// return new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR);
				deleteResponse.setStatusCode(500);
				deleteResponse.setDescription("Visitor Not Deleted Successfully");
				deleteResponse.setDeleteStatus(false);

				return ResponseEntity.internalServerError().body(deleteResponse);
			}
		} else {
			deleteResponse.setStatusCode(404);
			deleteResponse.setDescription("Visitor Not Found");
			deleteResponse.setDeleteStatus(false);
			
			return new ResponseEntity<>(deleteResponse,HttpStatus.NOT_FOUND);
		}

	}
	
	@GetMapping(value = "/showAllByName/{vname}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<VisitorShowAllByNameResponse> getAllVisitorsByName(@PathVariable (name="vname")String name) {
		List<Visitor> visitorsBySameName = service.getAllVisitorsBySameName(name);
		VisitorShowAllByNameResponse response = new VisitorShowAllByNameResponse();
		if(visitorsBySameName.isEmpty()) {
		response.setStatusCode(404);
		response.setDescription("There are no visitors by same name "+name);
		response.setVisitors(visitorsBySameName);
		}
		else {
			response.setStatusCode(200);
			response.setDescription("There are "+visitorsBySameName.size()+" visitors with same name "+name);
			response.setVisitors(visitorsBySameName);
		}

		// return new ResponseEntity<>(response, HttpStatus.OK);
		return ResponseEntity.ok(response);
	}
	
	
	@GetMapping(value = "/showAllByCity", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<VisitorShowAllByCityResponse> getAllVisitorsByCity(@RequestParam (name="vcity")String city) {
		List<Visitor> visitorsByCity = service.getAllVisitorsByCity(city);
		VisitorShowAllByCityResponse response = new VisitorShowAllByCityResponse();
		if(visitorsByCity.isEmpty()) {
			response.setStatusCode(404);
			response.setDescription("There are no visitors by same city "+city);
			response.setVisitors(visitorsByCity);
		}else {
			response.setStatusCode(200);
			response.setDescription("There are "+visitorsByCity.size()+" visitors with same city "+city);
			response.setVisitors(visitorsByCity);
		}

		// return new ResponseEntity<>(response, HttpStatus.OK);
		return ResponseEntity.ok(response);
	}
}
