package Lesson_4.Lesson_4_task1;

public class User {
	protected String name;
	protected int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		if (this instanceof Student) {
			return getScore();
		} else {
			return 0;
		}
	}
}
