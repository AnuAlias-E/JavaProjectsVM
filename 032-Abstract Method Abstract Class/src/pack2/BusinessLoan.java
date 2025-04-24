package pack2;

public abstract class BusinessLoan extends Loan{
	String companyName;

	public BusinessLoan(double loanAmount, int tenure, String customerName, String companyName) {
		super(loanAmount, tenure, customerName);
		this.companyName = companyName;
	}

	
}
