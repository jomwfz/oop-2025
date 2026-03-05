public class EmployeeMain {
	public static void main(String[] args) {

		Hourly somjai = new Hourly("Somjai", 1.0, 2.0);
		System.out.println(somjai);
		somjai.setRate(500.0);
		somjai.setHours(6.5);
		System.out.printf("Name:    %s\n", somjai.getName());
		System.out.printf("Rate:    %,.2f\n", somjai.getRate());
		System.out.printf("Hours:   %,.2f\n", somjai.getHours());
		System.out.printf("Payment: %,.2f\n", somjai.payment());
		somjai.printPayCash();

		Salary somchai = new Salary("Somchai", 0.0);
		System.out.println(somchai);
		somchai.setSalary(10000.0);
		System.out.printf("Name:         %s\n", somchai.getName());
		System.out.printf("Salary:       %,.2f\n", somchai.getSalary());
		System.out.printf("Contribution: %,.2f\n", somchai.contributionSend());
		System.out.printf("Payment:      %,.2f\n", somchai.payment());
		somchai.printPayBank();

		Salary somboon = new Salary("Somboon", 20000.0);
		System.out.printf("Name:         %s\n", somboon.getName());
		System.out.printf("Salary:       %,.2f\n", somboon.getSalary());
		System.out.printf("Contribution: %,.2f\n", somboon.contributionSend());
		System.out.printf("Payment:      %,.2f\n", somboon.payment());
		somboon.printPayBank();
	}

}
