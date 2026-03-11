public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person("Person");
		System.out.println(p);
		p.setName("Somchai");
		System.out.println("Name:     " + p.getName());

		Employee e = new Employee("Employee", 0.0);
		System.out.println(e);
		e.setName("Somboon");
		e.setSalary(12000.0);
		System.out.println("Name:     " + e.getName());
		System.out.println("Salary:   " + e.getSalary());

		Student s = new Student("Student", "1000");
		System.out.println(s);
		s.setName("Somrak");
		s.setId("1001");
		System.out.println("Name:     " + s.getName());
		System.out.println("Id:       " + s.getId());

		GraduateStudent g = new GraduateStudent("GraduateStudent", "2000", "Later");
		System.out.println(g);
		g.setName("Somjai");
		g.setId("2001");
		g.setThesis("AI for Student");
		System.out.println("Name:     " + g.getName());
		System.out.println("Id:       " + g.getId());
		System.out.println("Thesis:   " + g.getThesis());
	}

}
