public class RectangleMain {

	public static void main(String[] args) {
		// Constructor
		Rectangle r1 = new Rectangle();		
		Rectangle r2 = new Rectangle(3.0);
		Rectangle r3 = new Rectangle(4.0, 5.0);
		
		// Inspect
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		// r1 Set
		r1.setWidth(4.0);
		r1.setHeight(5.0);
		System.out.println(r1);
		
		// r1 Get
		System.out.printf("Width:         %.2f\n", r1.getWidth());
		System.out.printf("Height:        %.2f\n", r1.getHeight());
		
		// r1 Method
		System.out.printf("Area:          %.2f\n", r1.computeArea());
		System.out.printf("Circumference: %.2f\n", r1.computeCircumference());
		System.out.printf("Diameter:      %.2f\n", r1.computeDiameter());
		
		// Equals
		System.out.printf("r1 equals r2   %b\n", r1.equals(r2));
		System.out.printf("r1 equals r3   %b\n", r1.equals(r3));
	}

}
