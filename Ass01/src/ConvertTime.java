import java.util.Scanner;

public class ConvertTime {
	public static void main(String[] args) {

		// Variable
		long sec_inp;
		long day, hour, min, sec, remain;

		// Input
		Scanner kb = new Scanner(System.in);

		System.out.print("Seconds: ");
		sec_inp = kb.nextLong();

		kb.close();

		// Check Input > 0
		if (sec_inp > 0) {

			// Process
			day = sec_inp / (24 * 60 * 60);

			remain = sec_inp % (24 * 60 * 60);
			hour = remain / (60 * 60);

			remain %= (60 * 60);
			min = remain / 60;

			sec = remain % 60;

			// Output
			System.out.printf("%,d days %d hours %d minutes %d seconds", day, hour, min, sec);

		} else {
			System.out.print("Invalid Value.");
		}

	}
}
