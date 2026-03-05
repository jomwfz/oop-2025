public class Salary extends Employee implements Social33, PayBank {

	private double salary;

	public Salary() {
		super();
	}

	public Salary(String name, double salary) {
		super(name);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return super.toString() + " Salary [salary=" + salary + "]";
	}

	public double payment() {
		return salary - contributionSend();
	}

	public double contributionSend() {
		double contrib = salary * contributionRate / 100;
		return contrib > contributionMaximum ? contributionMaximum : contrib;
	}
	
	public void printPayBank() {
		System.out.printf("โอนเงินเข้าธนาคาร %,.2f บาท\n", payment());
	}
}
