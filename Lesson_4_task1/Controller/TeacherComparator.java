package Lesson_4.Lesson_4_task1.Controller;

import java.util.Comparator;

import Lesson_4.Lesson_4_task1.Model.Teacher;

public class TeacherComparator<T extends Teacher> implements Comparator<T> {

	@Override
	public int compare(T t1, T t2) {
		return t1.getRating() - t2.getRating();
	}

}
