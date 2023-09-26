package Lesson_4.Lesson_4_task1.View;

import java.util.List;

import Lesson_4.Lesson_4_task1.Model.User;

public class StudentView<T extends User> implements UserView<T> {

	/**
	 * @param students
	 */
	@Override
	public void sendOnConsole(List<T> students) {
		for (T user : students) {
			System.out.println(user);
		}// TODO Классы StudentView и TeacherView подтверждают принцип разделения интерфейсов и принцип инверсии зависимостей, потому как имплементируются от одного UserView и не зависят друг от друга.
	}

}