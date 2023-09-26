package Lesson_4.Lesson_4_task1.View;

import java.util.List;

import Lesson_4.Lesson_4_task1.Model.User;

public class TeacherView<T extends User> implements UserView<T> {

	/**
	 * @param teachers
	 */
	@Override
	public void sendOnConsole(List<T> teachers) {
		for (T user : teachers) {
			System.out.println(user);
		}// TODO Классы StudentView и TeacherView подтверждают принцип разделения интерфейсов и принцип инверсии зависимостей, потому как имплементируются от одного UserView и не зависят друг от друга.
	}

}