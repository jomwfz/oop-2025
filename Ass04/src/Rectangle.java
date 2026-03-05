public class Rectangle extends Shape {
	private double width, height;

	public Rectangle() {
		super();
	}

	public Rectangle(Point point, String color, double width, double height) {
		super(point, color);
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
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}

	@Override
	public String draw() {
		return color + " Rectangle";
	}

	@Override
	public String toString() {
		return super.toString() + " Rectangle [width=" + width + ", height=" + height + "]";
	}
}