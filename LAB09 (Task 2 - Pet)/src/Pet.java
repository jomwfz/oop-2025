public class Pet {
	
	protected String name;
	
	// Constructors
	public Pet() {
		super();
	}
	
	public Pet(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Pet [name=" + name + "]";
	}

	public String speak() {
		return "Template";
	}
}
