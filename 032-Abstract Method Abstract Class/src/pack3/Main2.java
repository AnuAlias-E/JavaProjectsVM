package pack3;

import pack2.BusinessLoan;
import pack2.CarLoan;
import pack2.EducationLoan;
import pack2.HomeLoan;
import pack2.Loan;
import pack2.PersonalLoan;
import pack2.RetailBusinessLoan;
import pack2.WholeSaleBusinessLoan;

public class Main2 {
	public static void main(String[] args) {

		Loan loan;
		
		loan=new CarLoan(100000, 12, "Kiran", "KL171245");
		System.out.println(loan.getInterestRate());
		
		loan=new HomeLoan(100000, 12, "Anju", "Kochi");
		System.out.println(loan.getInterestRate());
		
		loan=new PersonalLoan(100000, 12, "Mythri", 40000.00);
		System.out.println(loan.getInterestRate());
		
		loan=new EducationLoan(100000, 12, "Maria",12);
		System.out.println(loan.getInterestRate());
		
		BusinessLoan businessLoan=new RetailBusinessLoan(100000, 10, "Maria","ABC Company");
		System.out.println(businessLoan.getInterestRate());
		
		businessLoan=new WholeSaleBusinessLoan(100000, 10, "Maria","XYZ Company");
		System.out.println(businessLoan.getInterestRate());
		
	}
}
