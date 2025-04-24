package com.training.ui;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.model.Customer;
import com.training.service.CustomerService;

import jakarta.validation.Valid;

@Controller
public class CustomerManagementController {

	@Autowired
	CustomerService service;

	@RequestMapping("/ListCustomers")
	public ModelAndView f1() {
		ModelAndView mav = new ModelAndView("DisplayAllCustomers");
		List<Customer> customers = service.getAllCustomers();
		mav.addObject("customers", customers);
		return mav;
	}

	@RequestMapping("/AddCustomer1")
	public String f2(Model model) {
		model.addAttribute("cust", new Customer());
		return "NewCustomerInput";
	}

	@RequestMapping(value = "/AddCustomer2")
	public String f3(@Valid @ModelAttribute(name = "cust") Customer customer, BindingResult result, Model model) {

		if (result.hasErrors())
			return "NewCustomerInput";
		Customer c = service.addCustomer(customer);
		if (c != null)
			model.addAttribute("add_status", "Customer Added Succesfully");
		else {
			model.addAttribute("add_status", "Customer Not Added Succesfully");
		}
		return "CustomerAddResult";

	}

	@RequestMapping("/UpdateCustomer1")
	public String f4(Model model) {
		List<Customer> customers = service.getAllCustomers();
		model.addAttribute("customer", customers);
		return "ListCustomerForUpdate";
	}

	@RequestMapping("/UpdateCustomer2")
	public String f5(@RequestParam(name = "txt_customerId") int id, Map<String, Object> modelMap) {
		Customer customerForEdit = service.searchCustomer(id);
		modelMap.put("cust", customerForEdit);
		return "EditCustomer";
	}

	@RequestMapping(value = "/UpdateCustomer3", method = RequestMethod.POST)
	public String f6(@Valid @ModelAttribute(name = "cust") Customer customer, BindingResult result, Model model) {
		if (result.hasErrors())
			return "EditCustomer";
		Customer c = service.updateCustomer(customer);
		if (c != null) {
			model.addAttribute("update_status", "Customer Updated Succesfully");
		} else {
			model.addAttribute("update_status", "Customer Not Updateda Succesfully");
		}
		return "CustomerUpdateResult";

	}

	@RequestMapping("/DeleteCustomer1")
	public String f7(Model model) {
		List<Customer> customers = service.getAllCustomers();
		model.addAttribute("customers", customers);
		return "ListCustomersForDelete";
	}

	@RequestMapping("/DeleteCustomer2")
	public String f8(@RequestParam(name = "txt_customerId") int id, Map<String, Object> modelMap) {
		Customer customerForDelete = service.searchCustomer(id);
		modelMap.put("cust", customerForDelete);
		return "DeleteCustomer";
	}

	@RequestMapping(value = "/DeleteCustomer3", method = RequestMethod.POST)
	public String f9(@ModelAttribute(name = "cust") Customer customer, Model model) {

		boolean status =service.deleteCustomer(customer);
		if(status)
		model.addAttribute("message", "Customer Deleted Successfully");
		else
			model.addAttribute("message", "Customer Not Deleted Successfully");
		return "CustomerDeleteResult";
	}

}
