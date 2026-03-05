public class Circle extends Shape {
	private double radius;

	public Circle() {
		super();
	}

	public Circle(Point point, String color, double radius) {
		super(point, color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public String draw() {
		return color + " Circle";
	}

	@Override
	public String toString() {
		return super.toString() + " Circle [radius=" + radius + "]";
	}
}