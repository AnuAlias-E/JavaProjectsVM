package com.training.model;

public class InsuranceAccount {
	double balance = 10;

	public  void depositInsuranceAmount(double amt) {
		// this.balance += amount;
		String tname = Thread.currentThread().getName();
		for (int i = 1; i <= amt; i++) {
			synchronized(this) {
			this.balance++;
			if (this.balance >= 35) {
				try {
					notify();
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(tname + " : Depositing.. " + balance);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
		notify();
		System.out.println("Insurance Depositing completed with the amount of " + amt);
	}

	public synchronized void withdrawInsuranceAmount(double amt) {
		// this.balance += amount;
		String tname = Thread.currentThread().getName();
		for (int i = 1; i <= amt; i++) {

			this.balance--;
			if (this.balance <= 10) {
				try {
					notify();
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(tname + " : Withdrawing.. " + balance);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		notify();
		System.out.println("Insurance Withdrawing completed with the amount of " + amt);
	}
}
