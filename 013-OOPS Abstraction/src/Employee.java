
public class Employee {

	double basicSalary;
	char grade;

	double calculateAllowance() {
		double result;
		switch (grade) {
		case 'A':
			result = basicSalary * 0.35;

			break;
		case 'B':
			result = basicSalary * 0.25;

			break;
		case 'C':
			result = basicSalary * 0.15;

			break;
		default:
			result = 0;
			break;
		}
		return result;
	}
	
	double deduction() {
		double result;
		switch (grade) {
		case 'A':
			result = basicSalary * 0.28;

			break;
		case 'B':
			result = basicSalary * 0.20;

			break;
		case 'C':
			result = basicSalary * 0.10;

			break;
		default:
			result = 0;
			break;
		}
		return result;
	}
	
	double calculateNetSalary() {
		return basicSalary+calculateAllowance()-deduction();
	}
}
