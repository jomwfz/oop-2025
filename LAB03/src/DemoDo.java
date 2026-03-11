public class DemoDo {
	public static void main(String[] args) {
		// variable
		int sum = 0;
		int cnt = 1;

		// process / output
		System.out.printf("%5s %10s\n", "No", "Sum");

		do {
			sum += cnt;
			System.out.printf("%5s %10s\n", cnt, sum);
			cnt += 2;
		} while (cnt <= 9);
	}
}
