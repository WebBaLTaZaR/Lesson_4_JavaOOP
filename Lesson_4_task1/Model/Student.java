package Lesson_4.Lesson_4_task1.Model;

public class Student extends User {
	private int score;

	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}

	@Override
	public int getScore() {
		return score; // TODO Класс getScore, прописанный, как в родителе, так и переопределенный,
						// TODO только в Студенте подтверждает ПРИНЦИП LISCOV.
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [score=" + score + "]";
	}
	//TODO Класс подверждает принцип единственной ответственности, потому как не содержит ничего лишнего.
}
