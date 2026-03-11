public class CircleMain {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(c1);
		System.out.println("Count    " + Circle.getCount());

		Circle c2 = new Circle(2.0);
		System.out.println(c2);
		System.out.println("Count    " + Circle.getCount());

		Circle c3 = new Circle(3.0);
		System.out.println(c3);
		System.out.println("Count    " + Circle.getCount());

		// Check c1
		System.out.println("Check c1:");
		c1.setRadius(4.0);

		System.out.println("Id:      " + c1.getId());
		System.out.println("Radius:  " + c1.getRadius());
		System.out.println("Area:    " + c1.computeArea());
	}
}