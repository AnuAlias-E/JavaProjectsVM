package com.training.model;

public class Employee {
	private double basicSalary;


	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) throws Exception {
		if (basicSalary < 0) {
			Exception e  = new Exception("Incorrect basic salary: "+ basicSalary);
			//try{
			throw e;
			
			//}catch (Exception ex) {
				//ex.printStackTrace();
			//}
		}
		this.basicSalary = basicSalary;
	}

	public double computeAllowance() {
		return this.basicSalary * 0.35;
	}
}
