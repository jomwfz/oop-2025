public class DemoWhile {
	public static void main(String[] args) {
		// variable
		int sum = 0;
		int cnt = 2;

		// process / output
		System.out.printf("%5s %10s\n", "No", "Sum");

		while (cnt <= 10) {
			sum += cnt;
			System.out.printf("%5s %10s\n", cnt, sum);
			cnt += 2;
		}
	}
}
