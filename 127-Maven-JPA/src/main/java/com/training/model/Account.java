package com.training.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Accounts")
public class Account {
	@Id
	@Column(name="acc_id")
	int id;
	@Column(name="acc_holder_name")
	String accountHolderName;
	@Column(name="acc_type")
	String typeOfAccount;
	@Column(name="balance")
	double balance;

	public Account() {
		super();
	}

	public Account(int id, String accountHolderName, String typeOfAccount, double balance) {
		super();
		this.id = id;
		this.accountHolderName = accountHolderName;
		this.typeOfAccount = typeOfAccount;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getTypeOfAccount() {
		return typeOfAccount;
	}

	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "\nAccount [id=" + id + ", accountHolderName=" + accountHolderName + ", typeOfAccount=" + typeOfAccount
				+ ", balance=" + balance + "]";
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
		if (!(obj instanceof Account))
			return false;
		Account other = (Account) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
