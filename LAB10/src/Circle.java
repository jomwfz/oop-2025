public class Circle extends Shape {

	protected double radius;

	public Circle() {
		super();
	}

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public String draw() {
		return color + " Circle";
	}

	public String toString() {
		return super.toString() + " Circle [radius=" + radius + "]";
	}
}
