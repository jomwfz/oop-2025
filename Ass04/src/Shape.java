
public class Shape {
	protected Point point;
	protected String color;

	public Shape() {
		super();
	}

	public Shape(Point point, String color) {
		this.point = point;
		this.color = color;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double area() {
		return 0.0;
	}

	public String draw() {
		return "Template";
	}

	public String toString() {
		return "Shape [point=" + point + ", color=" + color + "]";
	}
}