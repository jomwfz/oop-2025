public class ArrayMethod {

	public static void main(String[] args) {
		double[][] numbers = getData();
		System.out.printf("Min:  %,.2f\n", min(numbers));
		System.out.printf("Max:  %,.2f\n", max(numbers));
		System.out.printf("Tot:  %,.2f\n", tot(numbers));
		System.out.printf("Avg:  %,.2f\n", avg(numbers));
		System.out.printf("Std:  %,.2f\n", std(numbers));
	}

	// min
	public static double min(double[][] arrs) {
		double min = arrs[0][0];
		for (int row = 0; row < arrs.length; row++) {
			for (int col = 0; col < arrs[row].length; col++) {
				min = min > arrs[row][col] ? arrs[row][col] : min;
			}
		}
		return min;
	}

	// max
	public static double max(double[][] arrs) {
		double max = arrs[0][0];
		for (int row = 0; row < arrs.length; row++) {
			for (int col = 0; col < arrs[row].length; col++) {
				max = max < arrs[row][col] ? arrs[row][col] : max;
			}
		}
		return max;
	}

	// tot
	public static double tot(double[][] arrs) {
		double tot = 0;
		for (int row = 0; row < arrs.length; row++) {
			for (int col = 0; col < arrs[row].length; col++) {
				tot += arrs[row][col];
			}
		}
		return tot;
	}

	// avg
	public static double avg(double[][] arrs) {
		double avg = 0;
		avg = (tot(arrs)) / (arrs.length * arrs[0].length);
		return avg;
	}

	// std
	public static double std(double[][] arrs) {
		double totStd = 0;
		double std = 0;

		// totStd
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				totStd += Math.pow((arrs[i][j] - avg(arrs)), 2);
			}
		}
		std = Math.sqrt((totStd) / (arrs.length * arrs[0].length - 1));
		return std;
	}

	// getData
	public static double[][] getData() {
		double[][] arrs = { { 177, 476, 483, 450, 412, 271, 411, 421, 343, 400 },
				{ 111, 312, 228, 386, 115, 159, 416, 441, 149, 136 },
				{ 370, 451, 297, 491, 388, 264, 371, 439, 131, 291 },
				{ 482, 118, 266, 480, 246, 446, 100, 197, 335, 486 },
				{ 104, 397, 256, 466, 391, 205, 367, 313, 418, 410 },
				{ 345, 294, 315, 431, 382, 475, 360, 463, 319, 498 },
				{ 209, 202, 220, 465, 377, 304, 497, 494, 338, 158 },
				{ 179, 189, 122, 320, 156, 473, 376, 358, 425, 194 }, };
		return arrs;
	}

}
