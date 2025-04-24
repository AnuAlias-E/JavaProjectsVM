package com.training.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ContactInfos")
public class ContactInfo {

	@Id
	@Column
	int contactId;
	@Column
	String email;
	@Column
	String phoneNumber;

	public ContactInfo() {
		super();
	}

	public ContactInfo(int contactId, String email, String phoneNumber) {
		super();
		this.contactId = contactId;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "\nContactInfo [contactId=" + contactId + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + contactId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ContactInfo))
			return false;
		ContactInfo other = (ContactInfo) obj;
		if (contactId != other.contactId)
			return false;
		return true;
	}

}
