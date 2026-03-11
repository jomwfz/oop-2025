public class Circle {

	private static int count = 0;
	private String id;
	private double radius;

	public Circle() {
		this(1.0);
	}

	public Circle(double radius) {
		count++;

		String str = "" + (1000 + count);
		id = str.substring(1);

		setRadius(radius);
	}

	public static int getCount() {
		return count;
	}

	public String getId() {
		return id;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius >= 1.0 ? radius : 1.0;
	}

	public String toString() {
		return "Circle [id=" + id + ", radius=" + radius + "]";
	}

	public double computeArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
