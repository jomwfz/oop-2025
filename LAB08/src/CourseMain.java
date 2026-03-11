public class CourseMain {

	public static void main(String[] args) {

		// Create course
		Course java = new Course("Java");
		System.out.println(java);

		// Insert: Success
		Student s = new Student("001", 65);
		System.out.println("Insert:     " + java.insert(s));

		System.out.println("Insert:     " + java.insert(new Student("002", 55)));
		System.out.println("Insert:     " + java.insert(new Student("005", 85)));
		System.out.println("Insert:     " + java.insert(new Student("004", 75)));
		System.out.println("Insert:     " + java.insert(new Student("003", 35)));
		System.out.println(java);

		// Insert: Duplicate
		System.out.println("Insert:     " + java.insert(new Student("001", 99)));

		// Update: Success
		System.out.println("Update:    " + java.update("002", 20));
		// Update: not found
		System.out.println("Update:    " + java.update("020", 99));
		System.out.println(java);

		// Delete: Success
		System.out.println("Delete:   " + java.delete("003"));
		// Delete: not found
		System.out.println("Delete:   " + java.delete("003"));
		System.out.println(java);

		// Insert: Success
		System.out.println("Insert:     " + java.insert(new Student("007", 77)));
		System.out.println("Insert:     " + java.insert(new Student("006", 66)));
		System.out.println(java);

		// Search: Success
		System.out.println("Search:   " + "002");
		System.out.println(java.search("002"));

		// id - not found
		System.out.println("Search:   " + "020");
		System.out.println(java.search("020"));

		// Min Score
		System.out.println("Min score:");
		System.out.println("--------------------");
		s = java.searchMin();
		s.report();
		System.out.println("--------------------");

		// Max Score
		System.out.println("Max score:");
		System.out.println("--------------------");
		s = java.searchMax();
		s.report();
		System.out.println("--------------------");

		// Report
		System.out.println("Grade Report: ");
		java.report();
	}

}
