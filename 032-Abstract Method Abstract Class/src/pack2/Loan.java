package pack2;

public abstract class Loan {
private double loanAmount;
private int tenure;
private String customerName;
public Loan(double loanAmount, int tenure, String customerName) {
	super();
	this.loanAmount = loanAmount;
	this.tenure = tenure;
	this.customerName = customerName;
}
public abstract double getInterestRate() ;

}
