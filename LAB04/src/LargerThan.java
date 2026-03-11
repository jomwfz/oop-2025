public class LargerThan {
	public static void main(String[] args) {

		// Data
		int[] list = { 23, 98, 81, 33, 88, 13, 42, 91, 56, 45, 77, 57, 57, 82, 48, 50, 65, 88, 77, 9, 37, 41, 66, 100,
				88, 31, 24, 56, 96, 54, 85, 26, 95, 21, 41, 70, 84, 90, 36, 66, 95, 17, 35, 14, 68, 33, 83, 33, 32, 15,
				80, 61, 29, 65, 49, 73, 41, 11, 11, 71, 90, 78, 28, 53, 72, 48, 36, 3, 35, 45, 44, 34, 22, 48, 95, 27,
				19, 13, 68, 78, 81, 32, 99, 6, 68, 28, 50, 52, 40, 1, 9, 90, 65, 96, 60, 62, 8, 1, 5, 49 };

		// Variable
		int target = 0;
		int col = 0;
		int cnt = 0;

		// Process / Output
		target = 95;
		// target = 75;
		for (int i = 0; i < list.length; i++) {
			if (list[i] >= target) {
				System.out.printf("%4d, ", list[i]);
				cnt++;
				if ((cnt) % 12 == 0) {
					System.out.println();
				}
			}
		}
	}
}
