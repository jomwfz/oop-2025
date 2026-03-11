import java.util.Arrays;

public class Course {

	// Variables
	private int size = 8;

	private int lastIndex;
	private String name;
	private Student[] stds;

	// Constructors
	public Course() {
		super();
	}

	public Course(String name) {
		this.name = name;
		lastIndex = 0;
		stds = new Student[size];
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Inspect
	public String toString() {
		return "Course [lastIndex=" + lastIndex + ", name=" + name + ", stds=" + Arrays.toString(stds) + "]";
	}

	// insert
	public boolean insert(Student std) {
		int index = searchIndex(std.getId());
		if (index == -1) {
			stds[lastIndex] = std;
			lastIndex++;
			return true;
		}
		return false;
	}

	// update
	public boolean update(String id, int score) {
		int index = searchIndex(id);
		if (index != -1) {
			stds[index].setScore(score);
			return true;
		}
		return false;

	}

	// delete
	public boolean delete(String id) {
		int index = searchIndex(id);
		if (index != -1) {
			for (int i = index; i < lastIndex - 1; i++) {
				stds[i] = stds[i + 1];
			}
			stds[lastIndex - 1] = null;
			lastIndex--;
			return true;
		}
		return false;
	}

	// search
	public Student search(String id) {
		int index = searchIndex(id);
		return (index != -1) ? stds[index] : null;
	}

	// searchMin
	public Student searchMin() {
		int minScore = min();
		for (int i = 0; i < lastIndex; i++) {
			if (stds[i].getScore() == minScore)
				return stds[i];
		}
		return null;
	}

	// searchMax
	public Student searchMax() {
		int maxScore = max();
		for (int i = 0; i < lastIndex; i++) {
			if (stds[i].getScore() == maxScore)
				return stds[i];
		}
		return null;
	}

	// Report
	public void report() {
		System.out.println("Id              Score      Grade");
		System.out.println("---------------------------------");
		for (int i = 0; i < lastIndex; i++) {
			System.out.printf("%-15s %-10d %-5s\n", stds[i].getId(), stds[i].getScore(), stds[i].computeGrade());
		}
		System.out.println("---------------------------------");
		System.out.printf("Min                %d\n", min());
		System.out.printf("Max                %d\n", max());
		System.out.printf("Avg             %.2f\n", avg());
	}

	// searchIndex
	private int searchIndex(String id) {
		for (int i = 0; i < lastIndex; i++) {
			if (stds[i].getId().equals(id))
				return i;
		}
		return -1;
	}

	// min
	private int min() {
		int min = stds[0].getScore();
		for (int i = 0; i < lastIndex; i++) {
			min = stds[i].getScore() < min ? stds[i].getScore() : min;
		}
		return min;
	}

	// max
	private int max() {
		int max = stds[0].getScore();
		for (int i = 0; i < lastIndex; i++) {
			max = stds[i].getScore() > max ? stds[i].getScore() : max;
		}
		return max;
	}

	// avg
	private double avg() {
		if (lastIndex == 0)
			return 0.0;
		double sum = 0;
		for (int i = 0; i < lastIndex; i++) {
			sum += stds[i].getScore();
		}
		return sum / lastIndex;
	}
}
