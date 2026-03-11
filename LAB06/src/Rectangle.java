
public class Rectangle {
	// var
	private double width;
	private double height;

	// constructor
	public Rectangle() {
		this(1.0, 2.0);
	}

	public Rectangle(double side) {
		this(side, side);
	}

	public Rectangle(double width, double height) {
		// this.width = width;
		// this.height = height;
		this.width = width >= 1.0 ? width : 1.0;
		this.height = height >= 1.0 ? height : 1.0;
	}

	// method
	public void setWidth(double width) {
		this.width = width >= 1.0 ? width : 1.0;
	}

	public double getWidth() {
		return width;
	}

	public void setHeight(double height) {
		this.height = height >= 1.0 ? height : 1.0;
	}

	public double getHeight() {
		return height;
	}

	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	// equals
	public boolean equals(Object obj) {
		Rectangle other = (Rectangle) obj;
		return (width == other.getWidth()) && (height == other.getHeight());
	}

	// compute
	public double computeArea() {
		return width * height;
	}

	public double computeDiameter() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

	public double computeCircumference() {
		return (2 * width) + (2 * height);
	}
}
