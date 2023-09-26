package Lesson_4.Lesson_4_task1.Model;

public class Teacher extends User {
	private String objectToTeach;
	private int rating;

	public Teacher(String name, int age, String objectToTeach, int rating) {
		super(name, age);
		this.objectToTeach = objectToTeach;
		this.rating = rating;
	}

	public String getObjectToTeach() {
		return objectToTeach;
	}

	public int getRating() {
		return rating;
	}

	public void setObjectToTeach(String objectToTeach) {
		this.objectToTeach = objectToTeach;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Teacher [objectToTeach=" + objectToTeach + ", rating=" + rating + "]";
	}
	//TODO Класс подверждает принцип единственной ответственности, потому как не содержит ничего лишнего.
}
