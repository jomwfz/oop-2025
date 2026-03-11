public class Employee extends Person {
	private double salary;

	public Employee() {
		super();
	}

	public Employee(String name, double salary) {
		super(name);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return super.toString() + " Employee [salary=" + salary + "]";
	}
}
