public class DemoFor {
	public static void main(String[] args) {
		// variable
		int sum = 0;
		// process / output
		System.out.printf("%5s %10s\n", "No", "Sum");
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.printf("%5d %10d\n", i, sum);
		}
	}
}