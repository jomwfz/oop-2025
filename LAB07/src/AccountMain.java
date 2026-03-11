public class AccountMain {
	public static void main(String[] args) {
		Account a1 = new Account();
		Account a2 = new Account("Somchai", 1000.0);

		System.out.println("Inspect a1\n" + a1);
		System.out.println("Inspect a2\n" + a2);
		System.out.println("Count: " + Account.getCount());

		// name + deposit
		a1.setName("Samart");
		System.out.println("Check Set name = Samart\n" + a1);

		System.out.println("Check Deposit = -100,  Result: " + a1.deposit(-100));
		System.out.println("Check Deposit = 1500,  Result: " + a1.deposit(1500));
		System.out.println(a1);

		// withdraw
		System.out.println("Check Withdraw = -100, Result: " + a1.withdraw(-100));
		System.out.println("Check Withdraw = 2000, Result: " + a1.withdraw(2000));
		System.out.println("Check Withdraw = 800,  Result: " + a1.withdraw(800));

		// result
		printInfo(a1);
		printInfo(a2);
	}

	// met
	public static void printInfo(Account a) {
		System.out.println("Account Infomation");
		System.out.printf("Id:      %d\n", a.getId());
		System.out.printf("Name:    %s\n", a.getName());
		System.out.printf("Balance: %,.2f\n", a.getBalance());
	}
}