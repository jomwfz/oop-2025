public class ShapeArea {
	public static void main(String[] args) {
		System.out.printf("Square:    %d\n", computeArea(2));
		System.out.printf("Rectangle: %d\n", computeArea1(3, 4));
		System.out.printf("Circle:    %.2f\n", computeArea2(5.5));
		System.out.printf("Cylinder:  %.2f\n", computeArea3(6.5, 7.5));
	}

	// Square
	public static int computeArea(int side) {
		return side * side;
	}

	// Rectangle
	public static int computeArea1(int width, int height) {
		return width * height;
	}

	// Circle
	public static double computeArea2(double radius) {
		return Math.PI * radius * radius;
	}

	// Cylinder
	public static double computeArea3(double radius, double height) {
		return Math.PI * radius * radius * height;
	}
}
