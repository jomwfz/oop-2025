public abstract class Shape {

	protected String color;

	public Shape() {
		super();
	}

	public Shape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Shape [color=" + color + "]";
	}

	public abstract double area();

	public abstract String draw();
}
