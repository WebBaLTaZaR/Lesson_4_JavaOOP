package Lesson_4.Lesson_4_task1.View;

import java.util.List;

import Lesson_4.Lesson_4_task1.Model.User;

public interface UserView<T extends User> {
	/**
	 * @param students
	 */
	public void sendOnConsole(List<T> users);
}// TODO Классы StudentView и TeacherView подтверждают принцип разделения интерфейсов и принцип инверсии зависимостей, потому как имплементируются от одного UserView и не зависят друг от друга.
