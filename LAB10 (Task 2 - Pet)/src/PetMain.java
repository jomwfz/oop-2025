public class PetMain {
	public static void main(String[] args) {
//		Pet p = new Pet("Milo");
//		System.out.println(p);
//		p.setName("Lucy");
//		System.out.printf("Name:   %s\n", p.getName());
		
	    Cat c = new Cat("Name", "Pedigree"); 
	    System.out.println(c); 
	    c.setName("Milo"); 
	    c.setPedigree("Persians"); 
	    System.out.printf("Name:     %s\n", c.getName()); 
	    System.out.printf("Pedigree: %s\n", c.getPedigree());
	    System.out.printf("Speak     %s\n", c.speak()); 
	    System.out.printf("Scratch:  %s\n", c.scratch()); 
	    
	    Bird b = new Bird("Name", "Color"); 
	    System.out.println(b); 
	    b.setName("Candy"); 
	    b.setColor("Yellow"); 
	    System.out.printf("Name:     %s\n", b.getName()); 
	    System.out.printf("Color:    %s\n", b.getColor());
	    System.out.printf("Speak     %s\n", b.speak()); 
	    System.out.printf("Fly:      %s\n", b.fly()); 

	    Duck d = new Duck("Name", 1); 
	    System.out.println(d); 
	    d.setName("Jojo");
	    d.setAge(2);
	    System.out.printf("Name:     %s\n", d.getName()); 
	    System.out.printf("Age:      %d\n", d.getAge());
	    System.out.printf("Speak     %s\n", d.speak()); 
	    System.out.printf("Fly:      %s\n", d.fly());
	    System.out.printf("Swim:     %s\n", d.swim());
	}
}
