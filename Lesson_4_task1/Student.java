package Lesson_4.Lesson_4_task1;

public class Student extends User {
	private int score;

	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student { " +
				" name: " + name +
				", age: " + age +
				", score: " + score + " }";
	}
}
