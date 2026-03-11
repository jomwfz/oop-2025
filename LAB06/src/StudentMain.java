public class StudentMain {

	public static void main(String[] args) {

		// Constructor: Your id, name, score
		Student s1 = new Student();
		Student s2 = new Student("1234567890", "Somchai Rakdee", 78);

		// Inspect
		System.out.println(s1);
		System.out.println(s2);

		// s1 Set
		s1.setId("1234567890");
		s1.setName("Somchai Rakdee");
		s1.setScore(78);
		System.out.println(s1);

		// s1 Get
		System.out.printf("Id:    %s\n", s1.getId());
		System.out.printf("Name:  %s\n", s1.getName());
		System.out.printf("Score: %d\n", s1.getScore());

		// s1 Method
		System.out.printf("Grade: %s\n", s1.computeGrade());

		// Equals
		System.out.printf("s1 equals s2: %b\n", s1.equals(s2));

	}

}
