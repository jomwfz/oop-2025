public class MultipleChoice {
	public static void main(String[] args) {

		// Data
		char[][] students = {
				{ 'B', 'E', 'E', 'C', 'E', 'B', 'C', 'C', 'E', 'E', 'E', 'C', 'A', 'D', 'D', 'D', 'D', 'A', 'B', 'B' },
				{ 'B', 'B', 'E', 'C', 'B', 'E', 'E', 'B', 'C', 'E', 'D', 'A', 'D', 'E', 'E', 'E', 'E', 'C', 'C', 'C' },
				{ 'B', 'B', 'A', 'D', 'E', 'E', 'E', 'C', 'C', 'C', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'E', 'A', 'A' },
				{ 'A', 'C', 'D', 'E', 'B', 'C', 'A', 'A', 'C', 'C', 'C', 'B', 'C', 'D', 'C', 'E', 'D', 'D', 'D', 'E' },
				{ 'B', 'B', 'B', 'C', 'E', 'E', 'C', 'E', 'B', 'B', 'D', 'D', 'A', 'A', 'C', 'D', 'B', 'D', 'D', 'E' } };

		char[] answers = { 'B', 'B', 'E', 'C', 'E', 'E', 'C', 'C', 'C', 'C', 'D', 'C', 'A', 'D', 'C', 'E', 'D', 'D',
				'D', 'E' };

		// Variable
		int score = 0;

		// Report
		System.out.println("Name      Score  Result");
		System.out.println("-----------------------");

		// Process
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students[i].length; j++) {
				if (students[i][j] == answers[j]) {
					score++;
				}
			}
			if (score >= 10) {
				System.out.printf("Student %d   %3d   Pass\n", i + 1, score);
			} else {
				System.out.printf("Student %d   %3d   Fail\n", i + 1, score);
			}
			score = 0;
		}
		System.out.println("-----------------------");
	}
}
