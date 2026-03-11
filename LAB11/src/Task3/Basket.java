package Task3;

public class Basket {
	private Fruit[] fruits;
	private int last;

	public Basket() {
		fruits = new Fruit[5];
		last = 0;
	}

	public void addFruit(Fruit fruit) {
		if (last < fruits.length) {
			fruits[last] = fruit;
			last++;
		}
	}

	public boolean searchFruit(String name) {
		for (int i = 0; i < last; i++) {
			if (name == fruits[i].getName())
				return true;
		}
		return false;
	}

	public void printFruit() {
		System.out.println("No\tFruit\tTaste");
		for (int i = 0; i < last; i++) {
			System.out.printf("%d\t%s\t%s\n", i + 1, fruits[i].getName(), fruits[i].getTaste());
		}
	}
}
