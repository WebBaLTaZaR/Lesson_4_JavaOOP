package Lesson_4.Lesson_4_task1;

import java.util.List;

public interface UserView<T extends User> {
	/**
	 * @param students
	 */
	public void sendOnConsole(List<T> users);
}
