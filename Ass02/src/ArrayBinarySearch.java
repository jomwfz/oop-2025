public class ArrayBinarySearch {
	public static void main(String[] args) {

		// Data
		int[] list = { 1, 1, 3, 5, 6, 8, 9, 9, 11, 11, 13, 13, 14, 15, 17, 19, 21, 22, 23, 24, 26, 27, 28, 28, 29, 31,
				32, 32, 33, 33, 33, 34, 35, 35, 36, 36, 37, 40, 41, 41, 41, 42, 44, 45, 45, 48, 48, 48, 49, 49, 50, 50,
				52, 53, 54, 56, 56, 57, 57, 60, 61, 62, 65, 65, 65, 66, 66, 68, 68, 68, 70, 71, 72, 73, 77, 77, 78, 78,
				80, 81, 81, 82, 83, 84, 85, 88, 88, 88, 90, 90, 90, 91, 95, 95, 95, 96, 96, 98, 99, 100 };
		int left = 0;
		int right = list.length - 1;
		int i = -1;
		int middle = 0;
		int target = 13;
		// target = 18;

		while (left <= right) {
			middle = (left + right) / 2;
			if (target == list[middle]) {
				i = middle;
				break;
			} else if (target < list[middle]) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
		}

		if (i > -1) {
			System.out.printf("Target %d, Found at index: %d", target, i);
		} else {
			System.out.printf("Target %d, Not Found", target);
		}
	}
}
