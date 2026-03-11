public class Student extends Person {
	protected String id;
	
	public Student() {
		super();
	}
	
	public Student(String name, String id) {
		super(name);
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String toString() {
		return super.toString() + " Student [id=" + id + "]";
	}
}
