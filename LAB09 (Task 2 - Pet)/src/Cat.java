public class Cat extends Pet {
	
	private String pedigree;
	
	public Cat() {
		super();
	}

	public Cat(String name, String pedigree) {
		super(name);
		this.pedigree = pedigree;
	}
	
	public String getPedigree() {
		return pedigree;
	}

	public void setPedigree(String pedigree) {
		this.pedigree = pedigree;
	}
	
	public String toString() {
		return super.toString() + " Cat [pedigree=" + pedigree + "]";
	}
	
	public String sleep() {
		return "Sleeping";
	}

	public String speak() {
		return "Meow";
	}
}
