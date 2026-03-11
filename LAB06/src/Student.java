public class Student {
	// var
	private String id;
	private String name;
	private int score;

	// constructor
	public Student() {
		super();
	}

	public Student(String id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	// method
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setScore(int score) {
		this.score = score >= 0 ? score : 0;
	}

	public int getScore() {
		return score;
	}

	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}

	// equals
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return (id == other.getId()) && (name == other.getName()) && (score == other.getScore());
	}

	// compute
	public String computeGrade() {
		String grade = "E";
		if (score >= 80)
			grade = "A";
		else if (score >= 75)
			grade = "B+";
		else if (score >= 70)
			grade = "B";
		else if (score >= 60)
			grade = "C+";
		else if (score >= 50)
			grade = "C";
		else if (score >= 45)
			grade = "D+";
		else if (score >= 40)
			grade = "D";
		return grade;
	}
}
