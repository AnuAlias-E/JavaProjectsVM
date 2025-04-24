package pack2;

public class EducationLoan extends Loan{
 private int durationOfStudy;

public EducationLoan(double loanAmount, int tenure, String customerName, int durationOfStudy) {
	super(loanAmount, tenure, customerName);
	this.durationOfStudy = durationOfStudy;
}

@Override
public double getInterestRate() {
	
	return 0.32;
}
 
}
