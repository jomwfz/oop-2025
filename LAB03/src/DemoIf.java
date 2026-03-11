public class DemoIf {
	public static void main(String[] args) {
		// variable
		int month = 0;
		int days = 0;
		boolean isMonth = true;

		// Input
		month = 0;
		// month = 13;
		// month = 2;
		// month = 3;
		// month = 4;

		// Process
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			days = 31;
		else if (month == 2)
			days = 28;
		else if (month == 4 || month == 6 || month == 9 || month == 11)
			days = 30;
		else {
			isMonth = false;
		}

		// Output
		if (isMonth) {
			System.out.printf("Month: %5d, Days: %5d\n", month, days);
		} else {
			System.out.printf("Invalid month: %d\n", month);
		}
	}

}


