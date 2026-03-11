public class CourseApp {
	public static void main(String[] args) {
		Course myCourse = new Course("Java Programming");
		System.out.println("--- Create Course ---");
		System.out.println(myCourse);

		myCourse.insert(new Student("67101", 85));
		myCourse.insert(new Student("67102", 45));
		myCourse.insert(new Student("67103", 72));
		myCourse.insert(new Student("67104", 58));
		myCourse.insert(new Student("67105", 30));

		System.out.println("\n--- After Insertion ---");
		System.out.println(myCourse);

		System.out.println("\nUpdate ID 67102 Score to 75: " + myCourse.update("67102", 75));

		System.out.println("Delete ID 67104: " + myCourse.delete("67104"));

		System.out.println("\n--- Search Student ID 67101 ---");
		Student s = myCourse.search("67101");
		if (s != null) {
			s.report();
		} else {
			System.out.println("Student not found!");
		}

		System.out.println("\n--- Final Course Grade Report ---");
		myCourse.report();
	}
}