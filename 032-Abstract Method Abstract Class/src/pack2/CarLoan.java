package pack2;

public class CarLoan extends Loan {
	private String regNumber;

	public CarLoan(double loanAmount, int tenure, String customerName, String regNumber) {
		super(loanAmount, tenure, customerName);
		this.regNumber = regNumber;
	}
	
	@Override
	public double getInterestRate() {
		return 0.35;
	}

}
