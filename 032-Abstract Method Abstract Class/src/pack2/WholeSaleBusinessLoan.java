package pack2;

public class WholeSaleBusinessLoan extends BusinessLoan {

	public WholeSaleBusinessLoan(double loanAmount, int tenure, String customerName, String companyName) {
		super(loanAmount, tenure, customerName, companyName);
	
	}

	@Override
	public double getInterestRate() {
		
		return .32;
	}

}
