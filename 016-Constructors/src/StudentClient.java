
public class StudentClient {
public static void main(String[] args) {
	Student student =new Student();
	student.setRollNumber(100);
	student.setName("Anju");
	student.setMark1(56);
	student.setMark2(78);
	student.setGender("Female");
	System.out.println("Student 1 Details");
	System.out.println("RollNo:"+student.getRollNumber());
	System.out.println("Name:"+student.getName());
	System.out.println("Mark1:"+student.getMark1());
	System.out.println("Mark2:"+student.getMark2());
	System.out.println("Gender:"+student.getGender());
	System.out.println("******************");
	Student student1 =new Student(101, "Raju", 54, 98, "Male");
	System.out.println("Student 2 Details");
	System.out.println("RollNo:"+student1.getRollNumber());
	System.out.println("Name:"+student1.getName());
	System.out.println("Mark1:"+student1.getMark1());
	System.out.println("Mark2:"+student1.getMark2());
	System.out.println("Gender:"+student1.getGender());
	
}
}
