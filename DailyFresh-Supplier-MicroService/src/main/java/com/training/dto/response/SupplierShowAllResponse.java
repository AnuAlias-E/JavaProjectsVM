package com.training.dto.response;

import java.util.List;

import com.training.model.Supplier;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SupplierShowAllResponse {
	int statusCode;
	String description;
	List<Supplier> suppliers;
}
