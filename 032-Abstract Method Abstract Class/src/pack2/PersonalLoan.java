package pack2;

public class PersonalLoan extends Loan {
private double monthlySalary;

public PersonalLoan(double loanAmount, int tenure, String customerName, double monthlySalary) {
	super(loanAmount, tenure, customerName);
	this.monthlySalary = monthlySalary;
}

@Override
public double getInterestRate() {
	
	return 0.21;
}


}
