public class EmployeeApp {

	public static void main(String[] args) {
		Employee[] arrs = new Employee[6];
		arrs[0] = new Salary("Sombat", 10000.0);
		arrs[1] = new Hourly("Sommai", 400.0, 6.0);
		arrs[2] = new Hourly("Somchai", 500.0, 6.5);
		arrs[3] = new Salary("Somsri", 20000.0);
		arrs[4] = new Salary("Somboon", 30000.0);
		arrs[5] = new Hourly("Somkit", 600.0, 7.0);

		// Your code
		System.out.println("Payment Report");
		System.out.printf("%-15s %10s %10s\n", "Name", "Payment", "Social");
		System.out.println("------------------------------------");

		double total = 0.0;
		for (int i = 0; i < arrs.length; i++) {
			System.out.printf("%-15s", arrs[i].name);
			if (arrs[i] instanceof Salary) {
				Salary s = (Salary) arrs[i];
				System.out.printf("%11.2f %10.2f\n", s.payment(), s.contributionSend());
			}
			if (arrs[i] instanceof Hourly) {
				Hourly s = (Hourly) arrs[i];
				System.out.printf("%11.2f %10s\n", s.payment(), "-");
			}
			total += arrs[i].payment();
		}
		System.out.println("------------------------------------");
		System.out.printf("Total %20.2f\n\n", total);

		System.out.println("Payment Method Report");
		System.out.println("------------------------------------");
		for (int i = 0; i < arrs.length; i++) {
			System.out.printf("%-15s", arrs[i].name);
			if (arrs[i] instanceof Salary) {
				Salary s = (Salary) arrs[i];
				s.printPayBank();
			}
			if (arrs[i] instanceof Hourly) {
				Hourly s = (Hourly) arrs[i];
				s.printPayCash();
			}
		}
	}
}
