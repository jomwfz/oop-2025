public class Duck extends Pet implements Fly, Swim {

	private int age;

	public Duck() {
		super();
	}

	public Duck(String name, int age) {
		super(name);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return super.toString() + " Duck [age=" + age + "]";
	}

	public String speak() {
		return "quack";
	}

	public String fly() {
		return "Flying, Speeds " + (Fly.speed - 1);
	}

	public String swim() {
		return "Swiming";
	}
}
