public class ComputeGrade {
	public static void main(String[] args) {
		// Variable
		int score = 0;
		String grade = "";

		// Input
		score = 64;
		// score = 101;
		// score = 80;
		// score = 75;
		// score = 70;
		// score = 60;
		// score = 50;
		// score = 45;
		// score = 40;
		// score = 39;

		// Process
		if (score < 0 || score > 100) {
			System.out.printf("Invalid score: %d\n", score);
			System.exit(-1);
		} else if (score >= 80) {
			grade = "A";
		} else if (score >= 75) {
			grade = "B+";
		} else if (score >= 70) {
			grade = "B";
		} else if (score >= 60) {
			grade = "C+";
		} else if (score >= 50) {
			grade = "C";
		} else if (score >= 45) {
			grade = "D+";
		} else if (score >= 40) {
			grade = "D";
		} else
			grade = "E";

		// Output
		System.out.printf("Score: %5d, Grade: %5s \n", score, grade);
	}
}
