package com.training.dto.response;

import com.training.model.Supplier;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SupplierUpdateResponse {
	int statusCode;
	String description;
	Supplier supplier ;
}
