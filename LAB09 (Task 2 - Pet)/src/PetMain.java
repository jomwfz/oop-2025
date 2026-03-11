public class PetMain {

	public static void main(String[] args) {
		Pet p = new Pet("Name");
		System.out.println(p);
		p.setName("Lucy");
		System.out.printf("Name:     %s\n", p.getName());
		System.out.printf("Speak:    %s\n", p.speak());

		Cat c = new Cat("Name", "Pedigree");
		System.out.println(c);
		c.setName("Milo");
		c.setPedigree("Persians");
		System.out.printf("Name:     %s\n", c.getName());
		System.out.printf("Pedigree: %s\n", c.getPedigree());
		System.out.printf("Sleep:    %s\n", c.sleep());
		System.out.printf("Speak     %s\n", c.speak());

		Bird b = new Bird("Name", "Color");
		System.out.println(b);
		b.setName("Candy");
		b.setColor("Yellow");
		System.out.printf("Name:     %s\n", b.getName());
		System.out.printf("Color:    %s\n", b.getColor());
		System.out.printf("Fly:      %s\n", b.fly());
		System.out.printf("Speak     %s\n", b.speak());
	}

}
