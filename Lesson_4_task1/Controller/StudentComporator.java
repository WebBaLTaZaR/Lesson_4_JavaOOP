package Lesson_4.Lesson_4_task1.Controller;

import java.util.Comparator;

import Lesson_4.Lesson_4_task1.Model.Student;

public class StudentComporator<T extends Student> implements Comparator<T> {

	@Override
	public int compare(T s1, T s2) {
		return s1.getAge() - s2.getAge();
	}

}
