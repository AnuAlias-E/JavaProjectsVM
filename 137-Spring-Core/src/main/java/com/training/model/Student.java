package com.training.model;

public class Student {
 int rollNo;
 String name;
 Contact contact;

public Student(int rollNo, String name, Contact contact) {
	super();
	this.rollNo = rollNo;
	this.name=name;
	this.contact = contact;
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name +  ", contact=" + contact + "]";
}

 
}
