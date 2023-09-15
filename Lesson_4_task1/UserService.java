package Lesson_4.Lesson_4_task1;

import java.util.List;

public interface UserService<T> {
	List<T> getAll();

	// void create(String name, int age);
}
