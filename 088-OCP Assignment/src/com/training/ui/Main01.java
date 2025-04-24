package com.training.ui;

import com.training.model.AGradeDeduction;
import com.training.model.BGradeDeduction;
import com.training.model.CGradeDeduction;
import com.training.model.DeductionCalculator;

public class Main01 {
	public static void main(String[] args) {
		DeductionCalculator calculator = new DeductionCalculator();
		double deductionForAGrade = calculator.calculateDeduction(new AGradeDeduction(), 10000.00);
		double deductionForBGrade = calculator.calculateDeduction(new BGradeDeduction(), 10000.00);
		double deductionForCGrade = calculator.calculateDeduction(new CGradeDeduction(), 10000.00);

		System.out.println("A Grade Deduction : " + deductionForAGrade);
		System.out.println("B Grade Deduction : " + deductionForBGrade);
		System.out.println("C Grade Deduction : " + deductionForCGrade);
	}
}
