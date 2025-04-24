
public class BankClient {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		System.out.println(account.balance);
		account.deposit(1000.00);
		account.deposit(200.00);
		account.deposit(400.00);
		// System.out.println(account.getbalance());
		account.printBalance();
		account.withdraw(500.00);
		account.printBalance();
		account.withdraw(10.00);
		account.printBalance();
	}

}
