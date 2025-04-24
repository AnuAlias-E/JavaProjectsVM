
public class Employee {

	double basicSalary;

	double getSalary() {
		double allowance = this.basicSalary * 030;
		double tax = this.basicSalary * 010;
		double net = basicSalary + allowance - tax;
		return net;

	}

	double getSalary(double incentive) {
		double allowance = this.basicSalary * 030;
		double tax = this.basicSalary * 010;
		double net = basicSalary + allowance - tax + incentive;
		return net;
	}

	double getSalary(int extraHours) {
		double allowance = this.basicSalary * 030;
		double tax = this.basicSalary * 010;
		double net = basicSalary + allowance - tax + (extraHours * 1000);
		return net;
	}

	double getSalary(boolean isPermanent, int extraHours) {
		double allowance = this.basicSalary * 030;
		double tax = this.basicSalary * 010;
		double net;

		if (isPermanent) {
			net = basicSalary + allowance - tax + (extraHours * 2000);
		} else {
			net = basicSalary + allowance - tax + (extraHours * 500);
		}
		return net;
	}
}
