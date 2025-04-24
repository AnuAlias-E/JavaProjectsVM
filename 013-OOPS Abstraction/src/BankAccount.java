
public class BankAccount {

	double balance;

	void deposit(double amt) {
		balance += amt;
	}

	void withdraw(double amt) {
		balance -= amt;
	}

	void printBalance() {
		System.out.println("The balance is " + balance);
	}

	double getbalance() {
		return balance;
	}

}
