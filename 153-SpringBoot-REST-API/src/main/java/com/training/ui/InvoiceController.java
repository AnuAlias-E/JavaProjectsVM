package com.training.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Invoice;
import com.training.service.InvoiceService;

@RestController
@RequestMapping("/api")
public class InvoiceController {
	
	@Autowired
	InvoiceService service;
	
	@PostMapping(value="/add" ,produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE} )
	public Invoice addNewInvoice(@RequestBody Invoice invoice) {
		return service.addNewInvoice(invoice);
	}
	
	@PutMapping(value="/modify",produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public Invoice updateInvoice(@RequestBody Invoice invoice) {
		return service.addNewInvoice(invoice);
	}


	@GetMapping(value="/find",produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public Invoice findInvoiceById(@RequestParam(name="invId")int invoiceId ) {
		return service.getInvoiceById(invoiceId);
	}

	
	@GetMapping(value="/showAll",produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public List<Invoice> getAllInvoices() {
		return service.getAllInvoices();
	}
	
	@DeleteMapping("/delete")
	public boolean deleteInvoice(@RequestBody Invoice invoice) {
		return service.deleteInvoice(invoice);
	}
}
