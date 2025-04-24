package com.training.ui;

import com.training.model.AGradeSalaryCalculator;
import com.training.model.BGradeSalaryCalculator;
import com.training.model.CGradeSalaryCalculator;
import com.training.model.GradeWiseSalaryCalculator;
import com.training.model.SalaryCalculator;

public class Main01 {
	public static void main(String[] args) {
		GradeWiseSalaryCalculator gradeWiseSalaryCalculator = new AGradeSalaryCalculator();
		SalaryCalculator agradeSalaryCalculator = new SalaryCalculator(gradeWiseSalaryCalculator);
		double basic = 20000.00;
		System.out.println("A Grade Salary Calculation");
		agradeSalaryCalculator.printSalary(basic);

		gradeWiseSalaryCalculator = new BGradeSalaryCalculator();
		SalaryCalculator bgradeSalaryCalculator = new SalaryCalculator(gradeWiseSalaryCalculator);
		basic = 15000.00;
		System.out.println("B Grade Salary Calculation");
		bgradeSalaryCalculator.printSalary(basic);

		gradeWiseSalaryCalculator = new CGradeSalaryCalculator();
		SalaryCalculator cgradeSalaryCalculator = new SalaryCalculator(gradeWiseSalaryCalculator);
		basic = 10000.00;
		System.out.println("C Grade Salary Calculation");
		cgradeSalaryCalculator.printSalary(basic);

	}
}
