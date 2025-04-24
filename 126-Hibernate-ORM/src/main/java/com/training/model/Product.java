package com.training.model;

public class Product {
int id;
String name;
double price;
String category;

public Product() {
	super();
}
public Product(int id, String name, double price, String category) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.category = category;
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
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
@Override
public String toString() {
	return "\nProduct [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
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
	if (!(obj instanceof Product))
		return false;
	Product other = (Product) obj;
	if (id != other.id)
		return false;
	return true;
}


}
