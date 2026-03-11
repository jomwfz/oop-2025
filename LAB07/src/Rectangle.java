public class Rectangle {
	// var
	private double width;
	private double height;
	private String color;
	private boolean fill;

	// constructor
	public Rectangle() {
		setWidth(1.0);
		setHeight(2.0);
		color = "white";
		fill = false;
	}

	public Rectangle(double width, double height) {
		setWidth(width);
		setHeight(height);
		color = "blue";
		fill = true;
	}

	public Rectangle(double width, double height, String color) {
		setWidth(width);
		setHeight(height);
		setColor(color);
		fill = true;
	}

	public Rectangle(double width, double height, String color, boolean fill) {
		setWidth(width);
		setHeight(height);
		setColor(color);
		setFill(fill);
	}

	// method
	public void setWidth(double width) {
		this.width = width >= 0.0 ? width : 0.0;
	}

	public double getWidth() {
		return width;
	}

	public void setHeight(double height) {
		this.height = height >= 0.0 ? height : 0.0;
	}

	public double getHeight() {
		return height;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setFill(boolean fill) {
		this.fill = fill;
	}

	public boolean isFill() {
		return fill;
	}

	public String draw() {
		if (fill) {
			String formatColor = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
			return formatColor + " Rectangle";
		} else {
			return "Rectangle";
		}
	}

	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + ", fill=" + fill + "]";
	}

	// equals
	public boolean equals(Object obj) {
		Rectangle other = (Rectangle) obj;
		return (width == other.getWidth()) 
				&& (height == other.getHeight()) 
				&& color.equalsIgnoreCase(other.color)
				&& fill == other.fill;
	}

	// compute
	public double area() {
		return width * height;
	}
}
