package Task3;

public class BasketMain {
	public static void main(String[] args) {
		Basket basket = new Basket();
		Fruit apple = new Fruit("Apple", "Sweet");
		Fruit grape = new Fruit("Grape", "Juicy");
		Fruit orange = new Fruit("Orange", "Sour");
		basket.addFruit(apple);
		basket.addFruit(grape);
		basket.addFruit(orange);
		System.out.println("Search Apple : " + basket.searchFruit("Apple"));
		System.out.println("Search Mango : " + basket.searchFruit("Mango"));
		basket.printFruit();
	}
}
