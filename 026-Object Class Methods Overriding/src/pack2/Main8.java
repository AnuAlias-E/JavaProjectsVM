package pack2;

import pack1.Student;

public class Main8 {
	public static void main(String[] args) {
		Student student1 =new  Student(1001, "Radhika", 34, 67);
		System.out.println(student1);
		Student student2 =new  Student(1001, "Arjun", 74, 97);
		System.out.println(student2);
		Student student3 =new  Student(1003, "Maria", 66, 54);
		System.out.println(student3);
		
		System.out.println("Equals of student1 and student2: "+student1.equals(student1));
		System.out.println("Equals of student1 and student3: "+student1.equals(student2));
	}
}
