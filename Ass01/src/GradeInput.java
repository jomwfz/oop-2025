import java.util.Scanner;

public class GradeInput {
	public static void main(String[] args) {

		// Variable
		int work = 0, midterm = 0, finalScore = 0, total = 0;
		String grade = "";

		// Input
		try (Scanner kb = new Scanner(System.in)) {
			// Test: 0 <= work <= 25
			System.out.printf("%-9s", "Work:");
			work = kb.nextInt();
			if (work < 0 || work > 25) {
				System.out.println("Invalid work: " + work);
				kb.close();
				return;
			}

			// Test: 0 <= midterm <= 35
			System.out.printf("%-9s", "Midterm:");
			midterm = kb.nextInt();
			if (midterm < 0 || midterm > 35) {
				System.out.println("Invalid midterm: " + midterm);
				kb.close();
				return;
			}

			// Test: 0 <= final <= 40
			System.out.printf("%-9s", "Final:");
			finalScore = kb.nextInt();
			if (finalScore < 0 || finalScore > 40) {
				System.out.println("Invalid final: " + finalScore);
				kb.close();
				return;
			}
		}

		// Process
		total = work + midterm + finalScore;

		if (total >= 80)
			grade = "A";
		else if (total >= 75)
			grade = "B+";
		else if (total >= 70)
			grade = "B";
		else if (total >= 60)
			grade = "C+";
		else if (total >= 50)
			grade = "C";
		else if (total >= 45)
			grade = "D+";
		else if (total >= 40)
			grade = "D";
		else
			grade = "E";

		// Output
		System.out.println("\nGrade: " + grade);
		System.out.println("--------------------");
		System.out.printf("%-17s %d \n", "Work:", work);
		System.out.printf("%-17s %d \n", "Midterm:", midterm);
		System.out.printf("%-17s %d \n", "Final:", finalScore);
		System.out.println("--------------------");
		System.out.printf("%-17s %d \n", "Total:", total);
	}

}
