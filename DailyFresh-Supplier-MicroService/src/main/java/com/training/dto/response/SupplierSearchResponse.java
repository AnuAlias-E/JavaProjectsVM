package com.training.dto.response;

import com.training.model.Supplier;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
public class SupplierSearchResponse {
	int statusCode;
	String description;
	Supplier supplier ;
}
