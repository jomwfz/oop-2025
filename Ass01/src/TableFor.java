public class TableFor {
	public static void main(String[] args) {

		System.out.printf("%-3s", "R/C");
		for (int i = 1; i <= 12; i++) {
			System.out.printf("%4d", i);
		}
		System.out.println();

		for (int i = 2; i <= 12; i++) {
			System.out.printf("%-3d", i);
			for (int j = 1; j <= 12; j++) {
				System.out.printf("%4d", i * j);
			}
			i++;
			System.out.println();
		}
	}
}
