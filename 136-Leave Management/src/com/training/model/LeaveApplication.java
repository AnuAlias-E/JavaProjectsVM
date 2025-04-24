package com.training.model;

import java.time.LocalDate;

public class LeaveApplication {
	int empId;
	int managerId;
	LocalDate fromDate;
	LocalDate toDate;
	String reason;
	String approvedOrRejected;
	
	public LeaveApplication() {
		super();
	}

	public LeaveApplication(int empId, int managerId, LocalDate fromDate, LocalDate toDate, String reason,
			String approvedOrRejected) {
		super();
		this.empId = empId;
		this.managerId = managerId;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.reason = reason;
		this.approvedOrRejected = approvedOrRejected;
	}

	

	public LeaveApplication(int empId, int managerId, LocalDate fromDate, LocalDate toDate, String reason) {
		super();
		this.empId = empId;
		this.managerId = managerId;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.reason = reason;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getApprovedOrRejected() {
		return approvedOrRejected;
	}

	public void setApprovedOrRejected(String approvedOrRejected) {
		this.approvedOrRejected = approvedOrRejected;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof LeaveApplication))
			return false;
		LeaveApplication other = (LeaveApplication) obj;
		if (empId != other.empId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LeaveApplication [empId=" + empId + ", managerId=" + managerId + ", fromDate=" + fromDate + ", toDate="
				+ toDate + ", reason=" + reason + ", approvedOrRejected=" + approvedOrRejected + "]";
	}
	
	
}
