package Lesson_4.Lesson_4_task1;

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

	public String toString() {
		return "{ Teacher " + " name: " +
				name + ", age: " +
				age + ", objectToTeach: " +
				objectToTeach + "rating: " +
				rating + " }";
	}
}
