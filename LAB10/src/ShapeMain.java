public class ShapeMain {
	public static void main(String[] args) {

//		Shape s = new Shape("Red");
//		System.out.println(s);
//		s.setColor("Green");
//		System.out.printf("Color:    %s\n", s.getColor());

		Rectangle r = new Rectangle("Red", 1.0, 2.0);
		System.out.println(r);
		r.setColor("Blue");
		r.setWidth(3.0);
		r.setHeight(4.0);
		System.out.printf("Color:  %s\n", r.getColor());
		System.out.printf("Width:  %.2f\n", r.getWidth());
		System.out.printf("Height: %.2f\n", r.getHeight());
		System.out.printf("Area:   %.2f\n", r.area());
		System.out.printf("Draw:   %s\n", r.draw());

		Circle c = new Circle("Red", 3.0);
		System.out.println(c);
		c.setColor("Blue");
		c.setRadius(4.0);
		System.out.printf("Color:  %s\n", c.getColor());
		System.out.printf("Radius: %.2f\n", c.getRadius());
		System.out.printf("Area:   %.2f\n", c.area());
		System.out.printf("Draw:   %s\n", c.draw());

		Cylinder l = new Cylinder("Red", 1.0, 2.0);
		System.out.println(l);
		l.setColor("Blue");
		l.setRadius(3.0);
		l.setHeight(4.0);
		System.out.printf("Color:  %s\n", l.getColor());
		System.out.printf("Radius: %.2f\n", l.getRadius());
		System.out.printf("Height: %.2f\n", l.getHeight());
		System.out.printf("Area:   %.2f\n", l.area());
		System.out.printf("Draw:   %s\n", l.draw());
	}
}
