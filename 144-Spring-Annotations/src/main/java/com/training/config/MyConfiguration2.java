package com.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.model.Address;
import com.training.model.Customer;

@Configuration
public class MyConfiguration2 {

	@Bean(name="ChennaiAddress")
	public Address f3() {
		Address address = new Address("D-123", "chennai", "35262");
		return address;
	}
	
	@Bean
	public Customer f4() {
		Customer customer = new Customer();
		customer.setId(101);
		customer.setName("Abhi");
		
		return customer;
	}
	
	@Bean(name="CochinAddress")
	public Address f5() {
		Address address = new Address("C-345", "Cochin", "1123242");
		return address;
	}
	
}
