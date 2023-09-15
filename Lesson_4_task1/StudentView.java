package Lesson_4.Lesson_4_task1;

import java.util.List;

public class StudentView<T extends User> implements UserView<T> {

	/**
	 * @param students
	 */
	@Override
	public void sendOnConsole(List<T> students) {
		for (T user : students) {
			System.out.println(user);
		}
	}

}