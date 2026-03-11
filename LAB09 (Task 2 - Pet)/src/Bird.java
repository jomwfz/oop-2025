public class Bird extends Pet {
	
	private String color;
	
	public Bird() {
		super();
	}

	public Bird(String name, String color) {
		super(name);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return super.toString() + " Bird [color=" + color + "]";
	}
	
	public String speak() {
		return "Cheep";
	}
	
	public String fly() {
		return "Flying";
	}
}
