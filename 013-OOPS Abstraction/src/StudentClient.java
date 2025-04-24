
public class StudentClient {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Anu";
		s1.mark1 = 90;
		s1.mark2 = 87;
		System.out.println("Student 1");
		System.out.println("Name: " + s1.name + "\nMark1: " + s1.mark1 + "\nMark2:" + s1.mark2 + "\nTotal:" + s1.computeTotal()
				+ "\nAverage:" + s1.computeAverage()+"\nGrade:"+s1.determineGrade());
		System.out.println("*****************************");
		Student s2 = new Student();
		s2.name = "Anitha";
		s2.mark1 = 67;
		s2.mark2 = 77;
		System.out.println("Student 2");
		System.out.println("Name: " + s2.name + "\nMark1: " + s2.mark1 + "\nMark2:" + s2.mark2 + "\nTotal:" + s2.computeTotal()
				+ "\nAverage:" + s2.computeAverage()+"\nGrade:"+s2.determineGrade());
		
		System.out.println("*****************************");
		Student s3 = new Student();
		s3.name = "Divya";
		s3.mark1 = 67;
		s3.mark2 = 47;
		System.out.println("Student 3");
		System.out.println("Name: " + s3.name + "\nMark1: " + s3.mark1 + "\nMark2:" + s3.mark2 + "\nTotal:" + s3.computeTotal()
				+ "\nAverage:" + s3.computeAverage()+"\nGrade:"+s3.determineGrade());
	}
}
