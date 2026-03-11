public class RectangleMain {

	public static void main(String[] args) {
		// Constructor
		Rectangle r1 = new Rectangle();
		System.out.println(r1);
		Rectangle r2 = new Rectangle(3.0, 4.0);
		System.out.println(r2);
		Rectangle r3 = new Rectangle(5.0, 6.0, "GREEN");
		System.out.println(r3);
		Rectangle r4 = new Rectangle(7.0, 8.0, "orange", true);
		System.out.println(r4);

		// r1
		System.out.println("Check r1:");
		r1.setWidth(7.0);
		r1.setHeight(8.0);
		r1.setColor("OrAnGe");
		r1.setFill(true);
		System.out.println(r1);
		System.out.printf("Width:         %.2f\n", r1.getWidth());
		System.out.printf("Height:        %.2f\n", r1.getHeight());
		System.out.printf("Color:         %s\n", r1.getColor());
		System.out.printf("Fill:          %b\n", r1.isFill());
		System.out.printf("Draw:          %s\n", r1.draw());
		System.out.printf("Area:          %.2f\n", r1.area());
		System.out.printf("r1 equals r3   %b\n", r1.equals(r3));
		System.out.printf("r1 equals r4   %b\n", r1.equals(r4));

		// r3
		System.out.println("Check r3:");
		System.out.printf("Width:         %.2f\n", r3.getWidth());
		System.out.printf("Height:        %.2f\n", r3.getHeight());
		System.out.printf("Color:         %s\n", r3.getColor());
		System.out.printf("Fill:          %b\n", r3.isFill());
		System.out.printf("Draw:          %s\n", r3.draw());
		System.out.printf("Area:          %.2f\n", r3.area());
	}

}
