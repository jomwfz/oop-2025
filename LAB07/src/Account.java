public class Account {
	private static int count = 0;

	private int id;
	private String name;
	private double balance;

	public Account() {
		this("unknown", 0.0);
	}

	public Account(String name, double balance) {
		count++;
		this.id = 690000 + count;
		this.name = name;
		this.balance = balance >= 0 ? balance : 0;
	}

	public static int getCount() {
		return count;
	}

	// get / set
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	// deposit
	public boolean deposit(double amount) {
		boolean success = false;
		if (amount > 0) {
			success = true;
			balance += amount;
		}
		return success;
	}

	// withdraw
	public boolean withdraw(double amount) {
		boolean success = false;
		if (amount > 0 && amount <= balance) {
			success = true;
			balance -= amount;
		}
		return success;
	}

	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
}