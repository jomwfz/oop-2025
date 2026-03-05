public class TableWhile {
	public static void main(String[] args) {

		int t = 1;
		System.out.printf("%-3s", "R/C");
		while (t <= 12) {
			System.out.printf("%4d", t);
			t++;
		}
		System.out.println();

		int r = 1, s = 1;
		while (r <= 11) {
			System.out.printf("%-3d", r);
			while (s <= 12) {
				System.out.printf("%4d", s * r);
				s++;
			}
			s = 1;
			r += 2;
			System.out.println();
		}
	}
}
