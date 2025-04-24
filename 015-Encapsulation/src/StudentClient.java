
public class StudentClient {
	public static void main(String[] args) {
		Student student = new Student();

		student.setRollNumber(-100);
		student.setName(null);
		student.setMark1(890);
		student.setMark2(-45);
		student.setGender("ssdd");

		System.out.println(student.getRollNumber());
		System.out.println(student.getName());
		System.out.println(student.getMark1());
		System.out.println(student.getMark2());
		System.out.println(student.getGender());

		System.out.println("***************************");

		Student student1 = new Student();

		student1.setRollNumber(101);
		student1.setName("Alisha");
		student1.setMark1(76);
		student1.setMark2(67);
		student1.setGender("Female");

		System.out.println(student1.getRollNumber());
		System.out.println(student1.getName());
		System.out.println(student1.getMark1());
		System.out.println(student1.getMark2());
		System.out.println(student1.getGender());
	}
}
