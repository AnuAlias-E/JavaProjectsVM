package com.training.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "loans")
@NamedQueries({ @NamedQuery(name = "findAllLoans", query = "select l from Loan l"),
		@NamedQuery(name = "findByLoanId", query = "select l from Loan l where  l.id= :searchLoanId"),
		@NamedQuery(name = "updateLoanAmount", query = "update Loan l set l.loanAmount=l.loanAmount+5000 where l.id= :searchLoanId"),
		@NamedQuery(name = "deleteLoanBasedOnAmt", query = "delete from Loan l where l.loanAmount<= :minLoanCutOff"), })
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@Column
	String customerName;

	@Column
	double loanAmount;

	@Column
	int tenure;

	public Loan() {
		super();
	}

	public Loan(String customerName, double loanAmount, int tenure) {
		super();
		this.customerName = customerName;
		this.loanAmount = loanAmount;
		this.tenure = tenure;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	@Override
	public String toString() {
		return "\nLoan [id=" + id + ", customerName=" + customerName + ", loanAmount=" + loanAmount + ", tenure="
				+ tenure + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Loan))
			return false;
		Loan other = (Loan) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
