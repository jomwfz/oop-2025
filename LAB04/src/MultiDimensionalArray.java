public class MultiDimensionalArray {

	public static void main(String[] args) {

		// Data
		double[][] arrs = { { 177, 476, 483, 450, 412, 271, 411, 421, 343, 400 },
				{ 111, 312, 228, 386, 115, 159, 416, 441, 149, 136 },
				{ 370, 451, 297, 491, 388, 264, 371, 439, 131, 291 },
				{ 482, 118, 266, 480, 246, 446, 100, 197, 335, 486 },
				{ 104, 397, 256, 466, 391, 205, 367, 313, 418, 410 },
				{ 345, 294, 315, 431, 382, 475, 360, 463, 319, 498 },
				{ 209, 202, 220, 465, 377, 304, 497, 494, 338, 158 },
				{ 179, 189, 122, 320, 156, 473, 376, 358, 425, 194 },
				{ 479, 310, 387, 229, 120, 383, 181, 161, 422, 198 },
				{ 384, 224, 157, 472, 307, 295, 324, 134, 145, 436 } };

		// Variable
		double min = arrs[0][0];
		double max = arrs[0][0];
		double tot = 0.0;
		double avg = 0.0;
		double std = 0.0;
		double totStd = 0.0;
		int cnt = 0;

		// Process
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				// Min
				if (arrs[i][j] < min) {
					min = arrs[i][j];
					// Max
				}
				if (arrs[i][j] > max) {
					max = arrs[i][j];
				}
				// tot
				tot += arrs[i][j];
			}
		}
		// avg
		avg = tot / (arrs.length * arrs[0].length);

		// std
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				totStd += Math.pow((arrs[i][j] - avg), 2);
			}
		}
		std = Math.sqrt(totStd / (arrs.length * arrs[0].length - 1));

		// Output
		System.out.printf("Min:  %,.2f\n", min);
		System.out.printf("Max:  %,.2f\n", max);
		System.out.printf("Tot:  %,.2f\n", tot);
		System.out.printf("Avg:  %,.2f\n", avg);
		System.out.printf("Std:  %,.2f\n", std);

	}

}
