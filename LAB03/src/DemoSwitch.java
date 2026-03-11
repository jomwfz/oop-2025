public class DemoSwitch {
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
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 2:
			days = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
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
