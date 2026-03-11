public class Cylinder extends Circle {

	private double height;

	public Cylinder() {
		super();
	}

	public Cylinder(String color, double radius, double heigth) {
		super(color, radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String toString() {
		return super.toString() + " Cylinder [height=" + height + "]";
	}

	public double area() {
		return 2 * super.area() + 2 * Math.PI * radius * height;
	}

	public String draw() {
		return color + " Cylinder";
	}
}
