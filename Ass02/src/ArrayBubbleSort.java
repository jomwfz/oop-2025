public class ArrayBubbleSort {

	public static void main(String[] args) {
		// Data
		int[] list = { 23, 98, 81, 33, 88, 13, 42, 91, 56, 45, 77, 57, 57, 82, 48, 50, 65, 88, 77, 9, 37, 41, 66, 100,
				88, 31, 24, 56, 96, 54, 85, 26, 95, 21, 41, 70, 84, 90, 36, 66, 95, 17, 35, 14, 68, 33, 83, 33, 32, 15,
				80, 61, 29, 65, 49, 73, 41, 11, 11, 71, 90, 78, 28, 53, 72, 48, 36, 3, 35, 45, 44, 34, 22, 48, 95, 27,
				19, 13, 68, 78, 81, 32, 99, 6, 68, 28, 50, 52, 40, 1, 9, 90, 65, 96, 60, 62, 8, 1, 5, 49 };
		int temp = 0;
		int loop = list.length;
		boolean swapped = false;

		for (int i = 0; i < loop - 1; i++) {
			swapped = false;

			for (int j = 0; j < loop - 1; j++) {
				if (list[j] > list[j + 1]) {
					temp = list[j + 1];
					list[j + 1] = list[j];
					list[j] = temp;

					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
		}

		for (int i = 0; i < loop; i++) {
			System.out.printf("%d, ", list[i]);
		}
	}
}
