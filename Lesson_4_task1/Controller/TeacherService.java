package Lesson_4.Lesson_4_task1.Controller;

import java.util.ArrayList;
import java.util.List;

import Lesson_4.Lesson_4_task1.Model.Teacher;

public class TeacherService implements UserService<Teacher> {
	private List<Teacher> teachers;

	public TeacherService() {
		this.teachers = new ArrayList<>();
	}

	@Override
	public List<Teacher> getAll() {
		return teachers;
	}

	public void create(String name, int age, String objectToTeach, int rating) {
		Teacher teacher = new Teacher(name, age, objectToTeach, rating);
		teachers.add(teacher);
	}
}