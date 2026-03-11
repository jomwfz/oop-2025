package Task3;

public class Fruit extends Basket {
	private String name;
	private String taste;

	public Fruit(String name, String taste) {
		this.name = name;
		this.taste = taste;
	}

	public String getName() {
		return name;
	}

	public String getTaste() {
		return taste;
	}
}