public class Circle {

	// Variable
	private double radius;

	// Constructor
	public Circle() {
		this(1.0);
	}

	public Circle(double radius) {
		this.radius = radius >= 1.0 ? radius : 1.0;
	}

	// Get / Set
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Inspect
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	// Equals
	public boolean equals(Object obj) {
		Circle other = (Circle) obj;
		return radius == other.getRadius();
	}

	// Method
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
