package aLAB06;

public class Circle {
	private double radius;

	public Circle() {
		this(1.0);
	}

	public Circle(double radius) {
		this.radius = radius >= 1.0 ? radius : 1.0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	public boolean equals(Object obj) {
		Circle other = (Circle)obj;
		return radius == other.getRadius();
	}

	public double computeArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double computeDiameter() {
		return radius * 2;
	}
	
	public double computeCircumference() {
		return 2 * Math.PI * radius;
	}
}
