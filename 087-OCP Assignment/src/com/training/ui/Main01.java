package com.training.ui;

import com.training.model.AGradeAllowance;
import com.training.model.AllowanceComputation;
import com.training.model.BGradeAllowance;
import com.training.model.CGradeAllowance;

public class Main01 {
	public static void main(String[] args) {
		AllowanceComputation computation = new AllowanceComputation();
		double allowanceForAGrade = computation.computeAllowance(new AGradeAllowance(), 10000.00);
		double allowanceForBGrade = computation.computeAllowance(new BGradeAllowance(), 10000.00);
		double allowanceForCGrade = computation.computeAllowance(new CGradeAllowance(), 10000.00);

		System.out.println("A Grade Allowance : " + allowanceForAGrade);
		System.out.println("B Grade Allowance : " + allowanceForBGrade);
		System.out.println("C Grade Allowance : " + allowanceForCGrade);
	}
}
