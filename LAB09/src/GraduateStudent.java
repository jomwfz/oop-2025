public class GraduateStudent extends Student {
	private String thesis;
	
	public GraduateStudent() {
		super();
	}

	public GraduateStudent(String name, String id, String thesis) {
		super(name, id);
		this.thesis = thesis;
	}
	
	public String getThesis() {
		return thesis;
	}

	public void setThesis(String thesis) {
		this.thesis = thesis;
	}
	
	public String toString() {
		return super.toString() + " GraduateStudent [thesis=" + thesis + "]";
	}
}
