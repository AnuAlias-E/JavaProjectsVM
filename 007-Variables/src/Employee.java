
public class Employee {// Class scope

	int empId;// instance varibale //default value of int is 0
	String name;// instance varible default value is null
	static int count;// global variable default value is 0

	void calculateAllowance() {
		double allowance;// local variable
		System.out.println(allowance);// we should initialize variable otherwise it should show error
		System.out.println(empId);
	}

	void calculateTax() {//Function scope
		double tax = 0;// local varibale
		System.out.println(tax);
	}

	void calculateIncentive(int extraHours) {// Parameter variable scope limited to the function
		System.out.println(extraHours);
	}

	void test() {
		int x = 90;
		if (x > 90) {//block scope
			System.out.println("Qualified");
			int y = 100;
			System.out.println(y);
		} else {
			System.out.println(y);//error
		}
	}
}
