
public class Student {
	String name;
	int mark1;
	int mark2;

	int computeTotal() {
		return mark1 + mark2;
	}

	int computeAverage() {
		return  computeTotal() / 2;
	}
	
	char determineGrade() {
		char grade;
		int avg=computeAverage();
		if(avg>=80)
			grade='A';
		else if(avg>=60)
			grade='B';
		else if(avg>=40)
			grade='C';
		else
			grade='D';
		return grade;
			
	}

}
