package Lesson_4.Lesson_4_task1.Controller;

import java.util.ArrayList;
import java.util.List;

import Lesson_4.Lesson_4_task1.Model.Student;

public class StudentService implements UserService<Student> {
	private List<Student> students;

	public StudentService() {
		this.students = new ArrayList<>();
	}

	@Override
	public List<Student> getAll() {
		return students;
	}

	public void create(String name, int age, int score) {
		Student student = new Student(name, age, score);
		students.add(student);
	}

}
