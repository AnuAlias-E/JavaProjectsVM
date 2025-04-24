package pack2;

public class RetailBusinessLoan extends BusinessLoan{

	public RetailBusinessLoan(double loanAmount, int tenure, String customerName, String companyName) {
		super(loanAmount, tenure, customerName, companyName);
		}

	@Override
	public double getInterestRate() {
		return 0.44;
	}

}
