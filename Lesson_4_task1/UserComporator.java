package Lesson_4.Lesson_4_task1;

import java.util.Comparator;

public class UserComporator<T extends User> implements Comparator<T> {

	@Override
	public int compare(T s1, T s2) {
		return s1.getAge() - s2.getAge();
	}

}
