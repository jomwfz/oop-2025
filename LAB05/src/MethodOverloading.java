public class MethodOverloading {
	public static void main(String[] args) {
		System.out.println(max(1.0, 2.0));
		System.out.println(max(3.0F, 4.0F));
		System.out.println(max(5, 6));
		System.out.println(max(7L, 8L));
		System.out.println(max(9, 10L));
		System.out.println(max(11, 12.0));
		System.out.println(max(13L, 14.0));
		System.out.println(max(14.0F, 15.0));
	}

	// max(double, double)
	public static double max(double a, double b) {
		System.out.println("Call: max(double, double)");
		return a > b ? a : b;
	}

	// max(float, float)
	public static float max(float a, float b) {
		System.out.println("Call: max(float, float)");
		return a > b ? a : b;
	}

	// max(int, int)
	public static int max(int a, int b) {
		System.out.println("Call: max(int, int)");
		return a > b ? a : b;
	}

	// max(long, long)
	public static long max(long a, long b) {
		System.out.println("Call: max(long, long)");
		return a > b ? a : b;
	}
}
