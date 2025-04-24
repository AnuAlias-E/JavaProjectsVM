import java.util.Scanner;

public class Main4 {
public static void main(String[] args) {
	//to display  menu
	int menuChoice;
	//Menu  options
	//1. Add employee
	//2.Search Employee
	//3.Display All Employees
	//4.Delete an Employee
	//5.Exit
	//take input for menuchoice from user
	//the above steps to be repeated until menuchoice==5
	
	Scanner sc = new Scanner(System.in);	
	
	do {
		System.out.println("1.Add Employee");
		System.out.println("2.Search Employee");
		System.out.println("3.Display All Employee");
		System.out.println("4.Delete Employee");
		System.out.println("5.Exit");
		System.out.println("Enter the menu");
		
		menuChoice=sc.nextInt();
		System.out.println(menuChoice);
		
	} while (menuChoice!=5);
	
}
}
