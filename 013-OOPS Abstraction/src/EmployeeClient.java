
public class EmployeeClient {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.basicSalary=5000.00;
		e1.grade='A';
		System.out.println("Employee 1");
		System.out.println("Basic Salary : "+ e1.basicSalary+"\nGrade: "+e1.grade);
		System.out.println("Allowance: "+e1.calculateAllowance()+"\nDeduction: "+e1.deduction()+"\nNet Salary: "+e1.calculateNetSalary());
		
		Employee e2 = new Employee();
		e2.basicSalary=5000.00;
		e2.grade='B';
		System.out.println("Employee 2");
		System.out.println("Basic Salary : "+ e2.basicSalary+"\nGrade: "+e2.grade);
		System.out.println("Allowance: "+e2.calculateAllowance()+"\nDeduction: "+e2.deduction()+"\nNet Salary: "+e2.calculateNetSalary());
		
		
		Employee e3= new Employee();
		e3.basicSalary=5000.00;
		e3.grade='C';
		System.out.println("Employee 3");
		System.out.println("Basic Salary : "+ e3.basicSalary+"\nGrade: "+e3.grade);
		System.out.println("Allowance: "+e3.calculateAllowance()+"\nDeduction: "+e3.deduction()+"\nNet Salary: "+e3.calculateNetSalary());
	}

}
