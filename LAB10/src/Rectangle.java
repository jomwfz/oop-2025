public class Rectangle extends Shape {

	private double width;
	private double height;

	public Rectangle() {
		super();
	}

	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.width = height;
	}

	public String toString() {
		return super.toString() + " Rectangle [width=" + width + ", height=" + height + "]";
	}

	public double area() {
		return width * height;
	}

	public String draw() {
		return color + " Rectangle";
	}
}
