public class PetApp {

	public static void main(String[] args) {
		Pet[] pets = new Pet[5];
		pets[0] = new Cat("Luna", "Persians");
		pets[1] = new Bird("Milo", "Yellow");
		pets[2] = new Cat("Lucy", "Siamese");
		pets[3] = new Bird("Lily", "White");
		pets[4] = new Cat("Cleo", "British");

		// Your code - instanceof
		System.out.println("No    Name       Pedigree   Color      Speak      Sleep      Fly");
		for (int i = 0; i < 5; i++) {
			if (pets[i] instanceof Cat) {
				Cat s = (Cat) pets[i];
				System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s %-10s", i + 1, s.getName(), s.getPedigree(), "-",
						s.speak(), s.sleep(), "-");
			}
			if (pets[i] instanceof Bird) {
				Bird s = (Bird) pets[i];
				System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s %-10s", i + 1, s.getName(), "-", s.getColor(),
						s.speak(), "-", s.fly());
			}
			System.out.println();
		}
	}
}
