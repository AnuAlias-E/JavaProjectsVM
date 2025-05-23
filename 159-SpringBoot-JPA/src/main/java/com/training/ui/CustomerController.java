package com.training.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.dto.request.CustomerAddRequest;
import com.training.dto.request.CustomerDeleteRequest;
import com.training.dto.request.CustomerUpdateRequest;
import com.training.dto.response.CustomerAddResponse;
import com.training.dto.response.CustomerDeleteResponse;
import com.training.dto.response.CustomerSearchResponse;
import com.training.dto.response.CustomerShowAllByNameResponse;
import com.training.dto.response.CustomerShowAllResponse;
import com.training.dto.response.CustomerShowByPhoneResponse;
import com.training.exception.CustomerNotFoundException;
import com.training.model.Customer;
import com.training.service.CustomerService;

@RestController
@RequestMapping(value = "/api")
public class CustomerController {

	@Autowired
	CustomerService service;

	@PostMapping(value = "/add", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<CustomerAddResponse> addVisitor( @RequestBody CustomerAddRequest request) {
		CustomerAddResponse addResponse = new CustomerAddResponse();

		Customer customer = service.addNewCustomer(request.getCustomer());
		addResponse.setStatusCode(201);
		addResponse.setDescription("Customer Added Successfully");
		addResponse.setCustomer(customer);
		return new ResponseEntity<>(addResponse, HttpStatus.CREATED);
	}

	@PutMapping(value = "/modify")
	public ResponseEntity<CustomerAddResponse> updateVisitor(@RequestBody CustomerUpdateRequest request) throws CustomerNotFoundException {
		CustomerAddResponse response = new CustomerAddResponse();

		Customer customer = service.getCustomerById(request.getCustomer().getId());
		if (customer != null) {

			Customer customer1 = service.updateCustomer(customer);
			response.setStatusCode(200);
			response.setDescription("Customer Modified Successfully");
			response.setCustomer(customer1);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else {
			response.setStatusCode(404);
			response.setDescription("Customer Not Found");
			response.setCustomer(customer);
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(value = "/find/{custid}")
	public ResponseEntity<CustomerSearchResponse> searchVisitor(@PathVariable(name = "custid") int customerId)
			throws Exception {
		Customer customer = service.getCustomerById(customerId);
		CustomerSearchResponse response = new CustomerSearchResponse();
		if (customer != null) {
			response.setStatusCode(200);
			response.setDescription("Customer fetched Successfully");
			response.setCustomer(customer);
			return new ResponseEntity<>(response, HttpStatus.OK);
		}

		else {
			Exception e = new CustomerNotFoundException("Customer Not Found");
			throw e;
		}
	}

	@GetMapping(value = "/showAll", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<CustomerShowAllResponse> getAllVisitors() {
		List<Customer> customers = service.getAllCustomers();
		CustomerShowAllResponse response = new CustomerShowAllResponse();
		if (customers.isEmpty()) {
			response.setStatusCode(404);
			response.setDescription("There are no cutomers");
			response.setCustomers(customers);
		} else {
			response.setStatusCode(200);
			response.setDescription("All Customers Fetched");
			response.setCustomers(customers);
		}
		// return new ResponseEntity<>(response, HttpStatus.OK);
		return ResponseEntity.ok(response);
	}

	@DeleteMapping(value = "/delete")
	public ResponseEntity<CustomerDeleteResponse> deleteVisitor(@RequestBody CustomerDeleteRequest request) throws CustomerNotFoundException {
		CustomerDeleteResponse deleteResponse = new CustomerDeleteResponse();

		Customer customer = this.service.getCustomerById(request.getCustomer().getId());
		if (customer != null) {
			try {
				boolean isDeleted = service.deleteCustomer(request.getCustomer());
				deleteResponse.setStatusCode(200);
				deleteResponse.setDescription("Customer Deleted Successfully");
				deleteResponse.setDeleteStatus(isDeleted);
				return ResponseEntity.ok().body(deleteResponse);

			} catch (Exception e) {
				deleteResponse.setStatusCode(500);
				deleteResponse.setDescription("Customer Not Deleted Successfully");
				deleteResponse.setDeleteStatus(false);

				return ResponseEntity.internalServerError().body(deleteResponse);
			}
		} else {
			deleteResponse.setStatusCode(404);
			deleteResponse.setDescription("Customer Not Found");
			deleteResponse.setDeleteStatus(false);

			return new ResponseEntity<>(deleteResponse, HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping(value = "/showAllByName/{custname}", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<CustomerShowAllByNameResponse> getAllCustomersByName(
			@PathVariable(name = "custname") String name) {
		List<Customer> customersBySameName = service.getAllCustomersBySameName(name);
		CustomerShowAllByNameResponse response = new CustomerShowAllByNameResponse();
		if (customersBySameName.isEmpty()) {
			response.setStatusCode(404);
			response.setDescription("There are no customers by same name " + name);
			response.setCustomers(customersBySameName);
		} else {
			response.setStatusCode(200);
			response.setDescription("There are " + customersBySameName.size() + " customers with same name " + name);
			response.setCustomers(customersBySameName);
		}

		return ResponseEntity.ok(response);
	}

	@GetMapping(value = "/showAllByPhone", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<CustomerShowByPhoneResponse> getAllVisitorsByCity(
			@RequestParam(name = "phone") String phoneNo) {
		Customer customerByPhone = service.getCustomersByPhoneNumber(phoneNo);
		CustomerShowByPhoneResponse response = new CustomerShowByPhoneResponse();
		if (customerByPhone!=null) {
			response.setStatusCode(404);
			response.setDescription("There is no customer by phone number " + phoneNo);
			response.setCustomer(customerByPhone);
		} else {
			response.setStatusCode(200);
			response.setDescription("There is " + customerByPhone + " customer with phone number " );
			response.setCustomer(customerByPhone);
		}

		return ResponseEntity.ok(response);
	}
}
