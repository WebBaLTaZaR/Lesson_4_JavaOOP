package Lesson_4.Lesson_4_task1;

import java.util.List;

public class TeacherView<T extends User> implements UserView<T> {

	/**
	 * @param teachers
	 */
	@Override
	public void sendOnConsole(List<T> teachers) {
		for (T user : teachers) {
			System.out.println(user);
		}
	}

}