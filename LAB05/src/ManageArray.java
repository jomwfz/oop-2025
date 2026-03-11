public class ManageArray {
	public static void main(String[] args) {
		int[] arrs = getArray();
		showArray(arrs);

		// call by reference, modify array
		sortArray(arrs);
		showArray(arrs);

		// call by reference, not modify array
		int index = searchArray(3, arrs);
		System.out.printf("Index: %d\n", index);
		index = searchArray(6, arrs);
		System.out.printf("Index: %d\n", index);

		// call by reference, return new array
		int[] arrs1 = expandArray(2, arrs);
		showArray(arrs1);
	}

	// sortArray
	public static void sortArray(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = 0; j < list.length - 1 - i; j++) {
				if (list[j] > list[j + 1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
	}

	// searchArray
	public static int searchArray(int target, int[] list) {
		int left = 0;
		int right = list.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (target == list[mid])
				return mid;
			else if (target < list[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}
		return -1;
	}

	// expandArray
	public static int[] expandArray(int factor, int[] list) {
		int[] newArr = new int[list.length * factor];

		for (int i = 0; i < list.length; i++) {
			newArr[i] = list[i];
		}

		for (int i = list.length; i < newArr.length; i++) {
			newArr[i] = -1;
		}
		return newArr;
	}

	// showArray
	public static void showArray(int[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.printf("%3d,", list[i]);
		}
		System.out.printf("\n");
	}

	// getArray
	public static int[] getArray() {
		int[] arrs = { 1, 2, 5, 4, 3 };
		return arrs;
	}
}