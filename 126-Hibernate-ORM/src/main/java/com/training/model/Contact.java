package com.training.model;


public class Contact {
	int id;
	String name;
	String emailid;
	String phone;

	public Contact() {
		super();
	}

	public Contact(int id, String name, String emailid, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "\nContact [id=" + id + ", name=" + name + ", emailid=" + emailid + ", phone=" + phone + "]";
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
		if (!(obj instanceof Contact))
			return false;
		Contact other = (Contact) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
