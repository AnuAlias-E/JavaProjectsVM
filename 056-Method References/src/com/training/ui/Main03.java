package com.training.ui;

import com.training.model.pack3.Circle;
import com.training.model.pack3.Employee;
import com.training.model.pack3.Factory;

public class Main03 {
public static void main(String[] args) {
	Factory<Circle>factory;
	factory=r->new Circle(r);
	Circle c= factory.create(10);
	System.out.println(c);
	
	Factory<Employee> factory1;
	factory1=(i)->new Employee(i);
	Employee e = factory1.create(1601);
	System.out.println(e);
	
	//Method Reference to a constructor method
	
	factory=Circle::new;
	Circle c1= factory.create(10);
	System.out.println(c1);
	factory1=Employee::new;
	Employee e1 = factory1.create(1601);
	System.out.println(e1);
}
}
