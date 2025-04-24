package com.training.dto.response;

import com.training.model.Visitor;

public class VisitorModifyResponse {

	int statusCode;
	String description;
	Visitor visitor;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Visitor getVisitor() {
		return visitor;
	}

	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}

	@Override
	public String toString() {
		return "VisitorAddResponse [statusCode=" + statusCode + ", description=" + description + ", visitor=" + visitor
				+ "]";
	}


}
