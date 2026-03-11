public class Student {

	// Variables
	private String id;
	private int score;

	// Constructors
	public Student() {
		super();
	}

	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}

	// Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = (score >= 0) && (score <= 100) ? score : 0;
	}

	// Inspects
	public String toString() {
		return "Student [id=" + id + ", score=" + score + "]";
	}

	// Methods
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

	public void report() {
		System.out.printf("Id:    %10s\n", id);
		System.out.printf("Score: %10d\n", score);
		System.out.printf("Grade: %10s\n", computeGrade());
	}
}
