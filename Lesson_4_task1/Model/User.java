package Lesson_4.Lesson_4_task1.Model;

public abstract class User {
	private String name;
	private int age;

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

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	//TODO Класс подверждает принцип единственной ответственности, потому как не содержит ничего лишнего.
	//TODO Класс закрыт для модификаций из-за приватных полей и открыт для расширения из-за наличия наследников, которые расширяют его функционал
}
