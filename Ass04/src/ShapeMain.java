public class ShapeMain {

	public static void main(String[] args) {
		Point p = new Point(0, 0);
		System.out.println(p);
		p.setX(1);
		p.setY(2);
		System.out.println("X:     " + p.getX());
		System.out.println("Y:     " + p.getY());

		Shape s = new Shape(new Point(1, 2), "Red");
		System.out.println(s);
		s.setPoint(new Point(3, 4));
		s.setColor("Blue");
		System.out.println("X:      " + s.getPoint().getX());
		System.out.println("Y:      " + s.getPoint().getY());
		System.out.println("Color:  " + s.getColor());
		System.out.println("Area:   " + s.area());
		System.out.println("Draw:   " + s.draw());

		Circle c = new Circle(new Point(1, 2), "Red", 3.0);
		System.out.println(c);
		c.setPoint(new Point(3, 4));
		c.setColor("Blue");
		c.setRadius(4.0);
		System.out.println("X:      " + c.getPoint().getX());
		System.out.println("Y:      " + c.getPoint().getY());
		System.out.println("Color:  " + c.getColor());
		System.out.println("Radius: " + c.getRadius());
		System.out.println("Area:   " + c.area());
		System.out.println("Draw:   " + c.draw());

		Rectangle r = new Rectangle(new Point(1, 2), "Red", 3.0, 4.0);
		System.out.println(r);
		r.setPoint(new Point(5, 6));
		r.setColor("Blue");
		r.setWidth(7.0);
		r.setHeight(8.0);
		System.out.println("X:      " + r.getPoint().getX());
		System.out.println("Y:      " + r.getPoint().getY());
		System.out.println("Color:  " + r.getColor());
		System.out.println("Width:  " + r.getWidth());
		System.out.println("Height: " + r.getHeight());
		System.out.println("Area:   " + r.area());
		System.out.println("Draw:   " + r.draw());
	}

}
